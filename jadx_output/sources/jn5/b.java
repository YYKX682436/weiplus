package jn5;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f300832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f300833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view, int i17, jn5.i iVar, androidx.recyclerview.widget.k3 k3Var) {
        super(1);
        this.f300830d = view;
        this.f300831e = i17;
        this.f300832f = iVar;
        this.f300833g = k3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = this.f300830d;
        if (view != null) {
            view.setTranslationY(intValue - this.f300831e);
            android.view.ViewPropertyAnimator animate = view.animate();
            android.view.ViewPropertyAnimator alpha = animate.translationY(0.0f).alpha(1.0f);
            jn5.i iVar = this.f300832f;
            alpha.setDuration(iVar.f12168c).setInterpolator(iVar.f300858u).setListener(new jn5.a(iVar, this.f300833g, view, animate)).start();
        }
        return jz5.f0.f302826a;
    }
}
