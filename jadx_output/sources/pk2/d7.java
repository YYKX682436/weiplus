package pk2;

/* loaded from: classes3.dex */
public final class d7 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.f7 f355655d;

    public d7(pk2.f7 f7Var) {
        this.f355655d = f7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        b92.d1 d1Var = (b92.d1) ((c61.zb) i95.n0.c(c61.zb.class));
        pk2.f7 f7Var = this.f355655d;
        d1Var.mj(f7Var);
        com.tencent.mm.ui.widget.dialog.c1 c1Var = f7Var.f355745q2;
        if (c1Var != null) {
            c1Var.onDismiss();
        }
        com.tencent.mm.ui.widget.dialog.g.b(f7Var.f211864i);
    }
}
