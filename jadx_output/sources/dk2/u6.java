package dk2;

/* loaded from: classes3.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.u6 f234171a = new dk2.u6();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Runnable f234172b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f234173c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f234174d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f234175e;

    /* renamed from: f, reason: collision with root package name */
    public static long f234176f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.protocal.protobuf.FinderObject f234177g;

    /* renamed from: h, reason: collision with root package name */
    public static r45.hc1 f234178h;

    /* renamed from: i, reason: collision with root package name */
    public static byte[] f234179i;

    /* renamed from: j, reason: collision with root package name */
    public static long f234180j;

    static {
        ae2.in inVar = ae2.in.f3688a;
        f234173c = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3852q3).getValue()).r()).intValue();
        f234174d = new com.tencent.mm.sdk.platformtools.b4("FinderLiveFeedFlowReporter::Timer", (com.tencent.mm.sdk.platformtools.a4) new dk2.t6(), false);
        f234175e = jz5.h.b(dk2.o6.f233837d);
    }

    public final boolean a(android.content.Context context) {
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        boolean z17 = true;
        if (mMActivity != null && !mMActivity.isStopped() && !mMActivity.isFinishing()) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[checkIfBackground] isBackGround = " + z17);
        return z17;
    }

    public final void b(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.hc1 hc1Var, r45.qt2 qt2Var, long j17, boolean z17, byte[] bArr) {
        byte[] bArr2;
        if (a(context) && !z17) {
            e(context, finderObject, qt2Var, true);
            return;
        }
        if (bArr == null) {
            com.tencent.mm.protobuf.g byteString = hc1Var.getByteString(1);
            bArr2 = byteString != null ? byteString.g() : null;
        } else {
            bArr2 = bArr;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getLiveMsg]， liveid = ");
        r45.nw1 nw1Var = (r45.nw1) hc1Var.getCustom(3);
        sb6.append(nw1Var != null ? nw1Var.getLong(0) : -1L);
        sb6.append(", offLine = ");
        sb6.append(z17);
        sb6.append(", delay = ");
        sb6.append(j17);
        sb6.append(", usingCookie = ");
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        sb6.append(new com.tencent.mm.protobuf.g(bArr3, 0, bArr3.length).i());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
        if (pm0.v.z(hc1Var.getInteger(47), 32)) {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) f234175e).getValue()).postDelayed(new dk2.m6(context, z17, finderObject, qt2Var, hc1Var, bArr2), j17);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "svr said not need getMsg");
        }
    }

    public final void c(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var) {
        java.lang.String str;
        dk2.x4 x4Var;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        if (liveInfo == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[jonLiveInternal]， liveid = " + liveInfo.getLong(0));
        long j17 = liveInfo.getLong(0);
        java.lang.String e17 = xy2.c.e(context);
        long id6 = finderObject.getId();
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        java.lang.String sessionBuffer = finderObject.getSessionBuffer();
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        java.lang.String str2 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        if (nVar == null || (x4Var = nVar.f309155g) == null || (str = x4Var.f234332z) == null) {
            str = "";
        }
        new ek2.e0(j17, null, e17, id6, 2, objectNonceId, string, sessionBuffer, null, 0, qt2Var, 3, null, str2, str, 0, null, null, 0L, 0, null, null, null, false, 0, 33526528, null).l().K(new dk2.p6(liveInfo, finderObject, context, qt2Var));
    }

    public final void d(r45.hc1 hc1Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String str;
        r45.nw1 nw1Var;
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        r45.nw1 nw1Var2;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct finderAudienceActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct();
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        int i17 = 0;
        long j17 = (hc1Var == null || (nw1Var2 = (r45.nw1) hc1Var.getCustom(3)) == null) ? 0L : nw1Var2.getLong(0);
        ((m30.m) rVar).getClass();
        finderAudienceActionLogStruct.f56487d = finderAudienceActionLogStruct.b("LiveID", b52.b.q(j17), true);
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        long id6 = finderObject.getId();
        ((m30.m) rVar2).getClass();
        finderAudienceActionLogStruct.f56488e = finderAudienceActionLogStruct.b("FeedID", b52.b.q(id6), true);
        finderAudienceActionLogStruct.f56489f = finderAudienceActionLogStruct.b("UserName", finderObject.getUsername(), true);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (str = objectDesc.getDescription()) == null) {
            str = "";
        }
        finderAudienceActionLogStruct.f56490g = finderAudienceActionLogStruct.b("Topic", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c), true);
        finderAudienceActionLogStruct.f56491h = finderAudienceActionLogStruct.b("CommentScene", "", true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderAudienceActionLogStruct.f56493j = finderAudienceActionLogStruct.b("ContextId", b17, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderAudienceActionLogStruct.f56494k = finderAudienceActionLogStruct.b("ClickTabContextId", c17, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderAudienceActionLogStruct.f56495l = finderAudienceActionLogStruct.b("SessionID", Ri, true);
        cl0.g gVar = new cl0.g();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> likeList = finderObject.getLikeList();
        if (!(!(likeList == null || likeList.isEmpty()))) {
            likeList = null;
        }
        if (likeList == null) {
            r45.dm2 object_extend = finderObject.getObject_extend();
            likeList = (object_extend == null || (pm2Var = (r45.pm2) object_extend.getCustom(12)) == null || (wm2Var = (r45.wm2) pm2Var.getCustom(10)) == null) ? null : wm2Var.getList(3);
        }
        if (likeList != null) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> linkedList = likeList.isEmpty() ^ true ? likeList : null;
            if (linkedList != null) {
                gVar.h("friend_wx_username", kz5.n0.g0(linkedList, "#", null, null, 0, null, dk2.q6.f233943d, 30, null));
            }
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderAudienceActionLogStruct.D = finderAudienceActionLogStruct.b("chnl_extra", r26.i0.t(gVar2, ",", ";", false), true);
        finderAudienceActionLogStruct.f56496m = finderAudienceActionLogStruct.b("SessionBuffer", finderObject.getSessionBuffer(), true);
        finderAudienceActionLogStruct.f56498o = currentTimeMillis;
        if (hc1Var != null && (nw1Var = (r45.nw1) hc1Var.getCustom(3)) != null) {
            i17 = nw1Var.getInteger(4);
        }
        long j18 = currentTimeMillis - i17;
        if (j18 <= 0) {
            j18 = 0;
        }
        finderAudienceActionLogStruct.f56499p = j18;
        ml2.v1 v1Var = ml2.v1.f328140e;
        finderAudienceActionLogStruct.f56502s = 1L;
        finderAudienceActionLogStruct.f56503t = currentTimeMillis;
        ml2.b4 b4Var = ml2.b4.f327224e;
        finderAudienceActionLogStruct.f56504u = ce1.f.CTRL_INDEX;
        finderAudienceActionLogStruct.f56506w = 0L;
        ml2.t3 t3Var = ml2.t3.f328015e;
        finderAudienceActionLogStruct.f56507x = 1;
        finderAudienceActionLogStruct.G = finderAudienceActionLogStruct.b("CouponId", "", true);
        finderAudienceActionLogStruct.H = finderAudienceActionLogStruct.b("switch_extra", ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
        finderAudienceActionLogStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "reportJoinLive, liveId=" + finderAudienceActionLogStruct.f56487d + ", feedId=" + finderAudienceActionLogStruct.f56488e + ", username=" + finderAudienceActionLogStruct.f56489f + ", topic=" + finderAudienceActionLogStruct.f56490g + ", commentScene=" + finderAudienceActionLogStruct.f56491h + ", isPrivate=" + finderAudienceActionLogStruct.f56492i + ", contextId=" + finderAudienceActionLogStruct.f56493j + ", clickTabContextId=" + finderAudienceActionLogStruct.f56494k + ", sessionId=" + finderAudienceActionLogStruct.f56495l + ", sessionBuffer=" + finderAudienceActionLogStruct.f56496m + ", shopPermit=" + finderAudienceActionLogStruct.f56497n + ", enterSessionId=" + finderAudienceActionLogStruct.f56498o + ", liveTime=" + finderAudienceActionLogStruct.f56499p + ", floatDuration=" + finderAudienceActionLogStruct.f56501r + ", fullDuration=" + finderAudienceActionLogStruct.f56500q + ", enterStatus=" + finderAudienceActionLogStruct.f56502s + ", actionTS=" + finderAudienceActionLogStruct.f56503t + ", action=" + finderAudienceActionLogStruct.f56504u + ", enterIconType=" + finderAudienceActionLogStruct.f56506w + ", pageType=" + finderAudienceActionLogStruct.f56507x + ", adData=" + finderAudienceActionLogStruct.f56508y + ", scenenote=" + finderAudienceActionLogStruct.f56509z + ", identityType=" + finderAudienceActionLogStruct.A + ", request_id=" + finderAudienceActionLogStruct.B + ", actionStyle=" + finderAudienceActionLogStruct.F + ", actionResult=" + finderAudienceActionLogStruct.f56505v + ", couponId=" + finderAudienceActionLogStruct.G + ", chnlExtra=" + finderAudienceActionLogStruct.D);
    }

    public final void e(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var, boolean z17) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "stopPlayLiveOnFeedFlow, needOffLineMsg = " + z17);
        f234172b = null;
        f234174d.d();
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) f234175e).getValue()).removeCallbacksAndMessages(null);
        if (z17) {
            r45.hc1 hc1Var = f234178h;
            if (hc1Var != null) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = finderObject == null ? f234177g : finderObject;
                f0Var = jz5.f0.f302826a;
                if (finderObject2 != null) {
                    byte[] bArr = f234179i;
                    dk2.u6 u6Var = f234171a;
                    f234177g = null;
                    f234178h = null;
                    f234176f = 0L;
                    f234180j = 0L;
                    f234179i = null;
                    u6Var.b(context, finderObject2, hc1Var, qt2Var, 0L, true, bArr);
                    f0Var2 = f0Var;
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no finderObject, return");
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[stopPlayLiveOnFeedFlow] no joinlive resp, no need offline");
            }
        }
        f234177g = null;
        f234178h = null;
        f234176f = 0L;
        f234180j = 0L;
        f234179i = null;
    }
}
