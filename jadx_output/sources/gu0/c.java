package gu0;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275637d;

    public c(hu0.a0 a0Var) {
        this.f275637d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f275637d;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onEditPanelCloseStart");
        a0Var.f285014m = hu0.p.f285048g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a0Var.f285015n);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        a0Var.V6(a0Var.f285016o, 0.0f, valueOf != null ? valueOf.intValue() : a0Var.R6());
    }
}
