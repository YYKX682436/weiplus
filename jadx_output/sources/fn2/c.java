package fn2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f264228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264229b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f264230c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f264231d;

    public c(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f264228a = view;
        this.f264229b = i17;
    }

    public final void a() {
        this.f264231d = true;
        android.animation.AnimatorSet animatorSet = this.f264230c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f264230c = null;
        this.f264228a.setBackgroundColor(this.f264229b);
    }
}
