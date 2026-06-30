package jn5;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f300852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f300854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f300855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, android.view.View view, jn5.i iVar, androidx.recyclerview.widget.k3 k3Var) {
        super(1);
        this.f300852d = i17;
        this.f300853e = view;
        this.f300854f = iVar;
        this.f300855g = k3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue() - this.f300852d;
        android.view.View view = this.f300853e;
        if (view != null) {
            android.view.ViewPropertyAnimator animate = view.animate();
            android.view.ViewPropertyAnimator alpha = animate.translationY(intValue).alpha(0.0f);
            jn5.i iVar = this.f300854f;
            alpha.setDuration(iVar.f12169d).setInterpolator(iVar.f300858u).setListener(new jn5.f(iVar, this.f300855g, animate, view)).start();
        }
        return jz5.f0.f302826a;
    }
}
