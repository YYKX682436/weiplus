package vy0;

/* loaded from: classes5.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f441409b;

    public d(yz5.l lVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f441408a = lVar;
        this.f441409b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "requestPermission deny");
        this.f441408a.invoke(java.lang.Boolean.FALSE);
        vy0.c cVar = vy0.c.f441407a;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f441409b;
        z2Var.l(cVar);
        z2Var.B();
    }
}
