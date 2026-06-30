package si1;

/* loaded from: classes7.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f408279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.d9 f408280e;

    public o1(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, com.tencent.mm.sdk.platformtools.d9 d9Var) {
        this.f408279d = d0Var;
        this.f408280e = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f408279d;
        android.content.Context context = d0Var.getContext();
        if (context == null || d0Var.getDialogContainer() == null) {
            return;
        }
        fl1.b bVar = new fl1.b(context);
        com.tencent.mm.sdk.platformtools.d9 d9Var = this.f408280e;
        bVar.setTitle(d9Var.f192537a);
        bVar.t(d9Var.f192538b);
        java.lang.String str = d9Var.f192540d;
        if (!(str == null || str.length() == 0)) {
            bVar.w(d9Var.f192540d, true, d9Var.f192542f);
        }
        bVar.A(d9Var.f192539c, true, d9Var.f192541e);
        bVar.setOnDismissListener(new si1.n1(d9Var));
        fl1.g2 dialogContainer = d0Var.getDialogContainer();
        kotlin.jvm.internal.o.d(dialogContainer);
        dialogContainer.c(bVar);
    }
}
