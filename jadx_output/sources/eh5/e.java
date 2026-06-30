package eh5;

/* loaded from: classes14.dex */
public final class e implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252958a;

    public e(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        this.f252958a = immersiveBaseActivity;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(insets, "insets");
        com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity = this.f252958a;
        if (immersiveBaseActivity.isPaused()) {
            return n3.g3.f334337b;
        }
        immersiveBaseActivity.f208943r = insets;
        androidx.constraintlayout.widget.ConstraintLayout d17 = immersiveBaseActivity.X6().d();
        kotlin.jvm.internal.o.f(d17, "getImmersiveBaseActivity(...)");
        n3.t1 t1Var = new n3.t1(d17);
        while (t1Var.hasNext()) {
            android.view.View view2 = (android.view.View) t1Var.next();
            if (view2 != immersiveBaseActivity.X6().a()) {
                n3.l1.b(view2, insets);
            }
        }
        immersiveBaseActivity.U6();
        return n3.g3.f334337b;
    }
}
