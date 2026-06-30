package ql5;

/* loaded from: classes15.dex */
public class b implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ql5.e f364588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql5.d f364589c;

    public b(ql5.d dVar, int i17, ql5.e eVar) {
        this.f364589c = dVar;
        this.f364587a = i17;
        this.f364588b = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ql5.d dVar = this.f364589c;
        dVar.a(this.f364587a).f364606a = false;
        dVar.notifyDataSetChanged();
        this.f364588b.setTag(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
