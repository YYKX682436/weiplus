package kd2;

/* loaded from: classes10.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f306728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f306729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f306730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f306731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kd2.p1 p1Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.storage.FeedData feedData, long j17, boolean z17) {
        super(0);
        this.f306727d = p1Var;
        this.f306728e = finderItem;
        this.f306729f = feedData;
        this.f306730g = j17;
        this.f306731h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        kd2.q0 q0Var;
        r45.yj4 yj4Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.yj4 yj4Var2;
        r45.rz0 rz0Var;
        kd2.p1 p1Var = this.f306727d;
        if (p1Var.u()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f306728e;
            r45.dm2 object_extend = finderItem.getFinderObject().getObject_extend();
            int integer = (object_extend == null || (rz0Var = (r45.rz0) object_extend.getCustom(38)) == null) ? 0 : rz0Var.getInteger(0);
            java.lang.String str2 = kd2.v1.f306853a;
            kd2.q0 q0Var2 = p1Var.f306787x;
            r45.qt2 qt2Var = q0Var2 != null ? q0Var2.f306803d : null;
            com.tencent.mm.plugin.finder.storage.FeedData nextFeedData = this.f306729f;
            kotlin.jvm.internal.o.g(nextFeedData, "nextFeedData");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(nextFeedData.getId()));
            java.lang.String sessionBuffer = nextFeedData.getSessionBuffer();
            if (sessionBuffer == null) {
                sessionBuffer = "";
            }
            lVarArr[1] = new jz5.l("session_buffer", sessionBuffer);
            lVarArr[2] = new jz5.l("last_completed_feedid", pm0.v.u(this.f306730g));
            lVarArr[3] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(integer));
            if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
                str = "";
            }
            lVarArr[4] = new jz5.l("source_contextid", str);
            lVarArr[5] = new jz5.l("source_commentscene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : "");
            lVarArr[6] = new jz5.l("float_frame_sessionid", kd2.v1.f306853a);
            ((cy1.a) rVar).yj("float_frame_feed_play_next", null, kz5.c1.k(lVarArr), 1, true);
            long j17 = vn2.u0.f438387a.j(finderItem);
            if (j17 <= 0) {
                r45.no2 playhistory_info = finderItem.getFeedObject().getPlayhistory_info();
                j17 = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
            }
            p1Var.S0();
            ds2.h hVar = ds2.h.f242866a;
            long feedId = nextFeedData.getFeedId();
            r45.mb4 mb4Var = nextFeedData.getMediaList().get(0);
            kotlin.jvm.internal.o.f(mb4Var, "get(...)");
            mn2.g4 c17 = hVar.c(feedId, mb4Var, false);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context);
            p1Var.f306788y = finderThumbPlayerProxy;
            finderThumbPlayerProxy.n(c17, false, nextFeedData);
            kd2.p1.H0(p1Var, finderThumbPlayerProxy, j17, 0.0f, false, false, 12, null);
            kd2.q0 q0Var3 = p1Var.f306787x;
            if (q0Var3 != null) {
                q0Var3.f306806g = nextFeedData;
            }
            if (q0Var3 != null && (yj4Var2 = q0Var3.f306812m) != null) {
                yj4Var2.set(11, finderItem.getFeedObject());
            }
            p1Var.z0(4, nextFeedData, finderThumbPlayerProxy.getF130607n(), null, 0L, 1.0f, false, true, p1Var.G, false);
            p1Var.k0().setMusicCtrlBtnStatus(true);
            if (this.f306731h && (q0Var = p1Var.C) != null && (yj4Var = q0Var.f306812m) != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) yj4Var.getCustom(11)) != null) {
                try {
                    bw5.zc0 zc0Var = new bw5.zc0();
                    zc0Var.d(new bw5.yr().parseFrom(finderObject.toByteArray()));
                    qg3.i0 a17 = qg3.k0.f362826d.a();
                    qg3.h1 a18 = a17 != null ? ((qg3.k0) a17).a() : null;
                    if (a18 != null) {
                        byte[] byteArray = zc0Var.toByteArray();
                        long cppPointer = ((qg3.i1) a18).getCppPointer();
                        kotlin.jvm.internal.o.d(byteArray);
                        urgen.ur_54A4.UR_2D5C.UR_AD3A(cppPointer, byteArray);
                        int i17 = qg3.g1.f362820d;
                        java.lang.String playSessionId = urgen.ur_54A4.UR_6075.UR_BC6E();
                        kd2.q0 q0Var4 = p1Var.C;
                        if (q0Var4 != null) {
                            kotlin.jvm.internal.o.g(playSessionId, "<set-?>");
                            q0Var4.f306815p = playSessionId;
                        }
                        kotlin.jvm.internal.o.g(playSessionId, "playSessionId");
                        urgen.ur_54A4.UR_2D5C.UR_593C(((qg3.i1) a18).getCppPointer(), playSessionId);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("FinderVideoPassive", "updatePlayingFeed ex " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
