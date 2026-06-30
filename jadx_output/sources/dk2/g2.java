package dk2;

/* loaded from: classes3.dex */
public final class g2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f233486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f233488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f233490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f233492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.g f233493i;

    public g2(dk2.r4 r4Var, int i17, com.tencent.mm.plugin.finder.live.plugin.jp jpVar, ek2.i2 i2Var, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, int i18, dk2.g gVar) {
        this.f233485a = r4Var;
        this.f233486b = i17;
        this.f233487c = jpVar;
        this.f233488d = i2Var;
        this.f233489e = str;
        this.f233490f = weakReference;
        this.f233491g = str2;
        this.f233492h = i18;
        this.f233493i = gVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str2 = fVar.f70617c;
        r45.h82 h82Var = (r45.h82) fVar.f70618d;
        dk2.r4 r4Var = this.f233485a;
        java.lang.String str3 = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostGift errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str2);
        sb6.append(", bill_no:");
        sb6.append(h82Var != null ? h82Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        com.tencent.mm.plugin.finder.assist.y8.f102732a.d(this.f233486b);
        if (i18 == 0 || i18 == -200042) {
            android.content.Context context = (android.content.Context) this.f233490f.get();
            if (context != null) {
                com.tencent.mm.protobuf.g byteString = h82Var.getByteString(2);
                byte[] g17 = byteString != null ? byteString.g() : null;
                dk2.r4 r4Var2 = this.f233485a;
                com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233487c;
                java.lang.String str4 = this.f233491g;
                int i19 = this.f233492h;
                dk2.g gVar = this.f233493i;
                ek2.i2 i2Var = this.f233488d;
                dk2.c2 c2Var = new dk2.c2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                dk2.e2 e2Var = new dk2.e2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                dk2.f2 f2Var = new dk2.f2(r4Var2, jpVar, str4, i19, gVar, i2Var);
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, "[WeCoin] sessionID:" + this.f233489e + " consumeGift:" + g17);
                pr4.l lVar = new pr4.l(1, (androidx.fragment.app.FragmentActivity) context, c2Var, e2Var, f2Var);
                if (g17 == null) {
                    g17 = new byte[0];
                }
                lVar.f358026g = g17;
                ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
                new ls4.u(lVar).f();
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.jp jpVar2 = this.f233487c;
            if (jpVar2 != null) {
                str = str2;
                com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar2, false, i18, com.tencent.mm.plugin.finder.live.plugin.ip.f113001e, null, null, 0, null, str2, this.f233488d, 16, null);
            } else {
                str = str2;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(22129, 1, this.f233489e, "", 1, 3, java.lang.Integer.valueOf(i18), str);
            g0Var.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 80L);
        }
        return jz5.f0.f302826a;
    }
}
