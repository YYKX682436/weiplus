package ur2;

/* loaded from: classes10.dex */
public final class l extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f430401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430402e;

    public l(int i17, ur2.o oVar) {
        this.f430401d = i17;
        this.f430402e = oVar;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        ur2.o oVar = this.f430402e;
        int i17 = ((int) (this.f430401d * f17)) + oVar.f430413m;
        android.view.View view = oVar.f430416p;
        view.setPadding(view.getPaddingLeft(), oVar.f430416p.getPaddingTop(), oVar.f430416p.getPaddingRight(), i17);
    }
}
