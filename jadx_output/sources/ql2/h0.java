package ql2;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f364519e;

    public h0(java.lang.String str, android.widget.ImageView imageView) {
        this.f364518d = str;
        this.f364519e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k70.g0 g0Var = (k70.g0) i95.n0.c(k70.g0.class);
        ((j70.e) g0Var).Ui(this.f364518d, new ql2.g0(this.f364519e));
    }
}
