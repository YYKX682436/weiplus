package te5;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f418729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f418730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f418731g;

    public r(java.lang.String str, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, l15.c cVar) {
        this.f418728d = str;
        this.f418729e = dVar;
        this.f418730f = f9Var;
        this.f418731g = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        r05.g gVar;
        java.lang.String str3 = this.f418728d;
        yb5.d context = this.f418729e;
        com.tencent.mm.storage.f9 msgInfo = this.f418730f;
        l15.c commonMsg = this.f418731g;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(commonMsg, "commonMsg");
        v05.b k17 = commonMsg.k();
        if (k17 == null || (str = k17.getString(k17.f432315e + 2)) == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        long createTime = msgInfo.getCreateTime();
        java.lang.String x17 = context.x();
        int a17 = c01.h2.a(str3, x17);
        v05.b k18 = commonMsg.k();
        int o17 = (k18 == null || (gVar = (r05.g) k18.getCustom(k18.f432315e + 25)) == null) ? -1 : gVar.o();
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        v05.b k19 = commonMsg.k();
        if (k19 == null || (str2 = k19.getString(k19.f432315e + 2)) == null) {
            str2 = "";
        }
        v05.b k27 = commonMsg.k();
        ((yq1.z) a0Var).c(str2, o17, 1, k27 != null ? k27.getString(k27.f432315e + 11) : null, java.lang.Long.valueOf(msgInfo.I0()), x17, java.lang.Integer.valueOf(a17), str3, java.lang.Long.valueOf(createTime), java.lang.Long.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h(x17)));
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        v05.b k28 = commonMsg.k();
        java.lang.String str4 = (k28 == null || (string4 = k28.getString(k28.f432315e + 2)) == null) ? "" : string4;
        v05.b k29 = commonMsg.k();
        java.lang.String str5 = (k29 == null || (string3 = k29.getString(k29.f368365d + 0)) == null) ? "" : string3;
        v05.b k37 = commonMsg.k();
        java.lang.String str6 = (k37 == null || (string2 = k37.getString(k37.f368365d + 2)) == null) ? "" : string2;
        v05.b k38 = commonMsg.k();
        ((yq1.x0) m0Var).e(str4, 1, str5, str6, (k38 == null || (string = k38.getString(k38.f368365d + 3)) == null) ? "" : string, context.D() ? "groupmessage" : "singlemessage", 2);
        sb5.f fVar = (sb5.f) context.f460708c.a(sb5.f.class);
        if (fVar != null) {
            com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
            if (aVar.B || o17 == -1) {
                return;
            }
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(23)) {
                aVar.B = true;
                ((ku5.t0) ku5.t0.f312615d).B(new te5.q(1));
            }
        }
    }
}
