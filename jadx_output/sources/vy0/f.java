package vy0;

/* loaded from: classes5.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f441413c;

    public f(java.lang.String str, yz5.l lVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f441411a = str;
        this.f441412b = lVar;
        this.f441413c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "requestPermission ok");
        vy0.g.f441414a.b().putBoolean(this.f441411a + "_enabled", true);
        this.f441412b.invoke(java.lang.Boolean.TRUE);
        vy0.e eVar = vy0.e.f441410a;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f441413c;
        z2Var.l(eVar);
        z2Var.B();
    }
}
