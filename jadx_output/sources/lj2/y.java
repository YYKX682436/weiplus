package lj2;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f318966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lj2.c0 c0Var, yz5.a aVar) {
        super(0);
        this.f318965d = c0Var;
        this.f318966e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lj2.c0 c0Var = this.f318965d;
        boolean z17 = c0Var.f318837h;
        android.view.View view = c0Var.f318830a;
        c0Var.c().f318947a.animate().translationX(z17 ? -view.getWidth() : view.getWidth()).setInterpolator(new android.view.animation.AccelerateInterpolator()).setListener(new lj2.x(this.f318966e, c0Var)).start();
        return jz5.f0.f302826a;
    }
}
