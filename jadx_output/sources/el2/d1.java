package el2;

/* loaded from: classes3.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f253773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f253775f;

    public d1(android.view.View view, el2.i1 i1Var, float f17) {
        this.f253773d = view;
        this.f253774e = i1Var;
        this.f253775f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator duration = this.f253773d.animate().setDuration(this.f253774e.f253824s);
        float f17 = this.f253775f;
        duration.scaleX(f17).scaleY(f17).start();
    }
}
