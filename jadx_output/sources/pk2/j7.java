package pk2;

/* loaded from: classes3.dex */
public final class j7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.m7 f355880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f355882f;

    public j7(pk2.m7 m7Var, int i17, android.widget.ImageView imageView) {
        this.f355880d = m7Var;
        this.f355881e = i17;
        this.f355882f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f355880d.getAdapterPosition() != this.f355881e) {
            return;
        }
        android.widget.ImageView imageView = this.f355882f;
        imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new pk2.i7(imageView)).start();
    }
}
