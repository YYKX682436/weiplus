package pk2;

/* loaded from: classes3.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.l7 f355918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.m7 f355919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f355920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f355921g;

    public k7(pk2.l7 l7Var, pk2.m7 m7Var, android.widget.ImageView imageView, int i17) {
        this.f355918d = l7Var;
        this.f355919e = m7Var;
        this.f355920f = imageView;
        this.f355921g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355918d.f355960f = null;
        pk2.m7 m7Var = this.f355919e;
        int i17 = this.f355921g;
        android.widget.ImageView imageView = this.f355920f;
        pk2.j7 j7Var = new pk2.j7(m7Var, i17, imageView);
        m7Var.f356013m = j7Var;
        imageView.postDelayed(j7Var, 1500L);
    }
}
