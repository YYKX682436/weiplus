package dm3;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f241738e;

    public t(java.lang.String str, android.widget.ImageView imageView) {
        this.f241737d = str;
        this.f241738e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k70.g0 g0Var = (k70.g0) i95.n0.c(k70.g0.class);
        ((j70.e) g0Var).Ui(this.f241737d, new dm3.s(this.f241738e));
    }
}
