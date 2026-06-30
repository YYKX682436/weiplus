package mu4;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mu4.h0 f331445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mu4.w f331446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f331447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331449f;

    public t(java.lang.String str, mu4.h0 h0Var, mu4.w wVar, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str2, java.lang.String str3) {
        this.f331444a = str;
        this.f331445b = h0Var;
        this.f331446c = wVar;
        this.f331447d = rVar;
        this.f331448e = str2;
        this.f331449f = str3;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public final void a(java.lang.String str, java.lang.String str2) {
        mu4.w0 t0Var;
        mu4.n nVar = mu4.w.f331452y;
        com.tencent.mars.xlog.Log.e("MicroMsg.WebJsEngine", "JsException[" + this.f331444a + "]:" + str + '\n' + str2);
        mu4.a0 a0Var = new mu4.a0();
        mu4.h0 h0Var = this.f331445b;
        h0Var.a(a0Var);
        mu4.w wVar = this.f331446c;
        mu4.x0 x0Var = ((nu4.b0) wVar).F;
        int ordinal = h0Var.f331421b.ordinal();
        java.lang.String str3 = this.f331449f;
        java.lang.String name = this.f331448e;
        if (ordinal == 0) {
            t0Var = new mu4.t0();
            java.lang.String str4 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str4 != null ? r26.i0.u(str4, ',', '.', false, 4, null) : null);
        } else if (ordinal == 1) {
            t0Var = new mu4.n0();
            java.lang.String str5 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str5 != null ? r26.i0.u(str5, ',', '.', false, 4, null) : null);
        } else if (ordinal != 2) {
            t0Var = new mu4.j0();
        } else {
            t0Var = new mu4.j0();
            java.lang.String str6 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str6 != null ? r26.i0.u(str6, ',', '.', false, 4, null) : null);
        }
        x0Var.a(t0Var);
        int o17 = this.f331447d.o();
        wVar.getClass();
        kotlin.jvm.internal.o.g(name, "name");
        cl0.g gVar = new cl0.g();
        gVar.o(dm.i4.COL_ID, o17);
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
        gVar.h(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str);
        gVar.h("stackTrace", str2);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        lu4.c.u(wVar, "error", gVar2, null, 4, null);
    }
}
