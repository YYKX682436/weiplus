package wo0;

/* loaded from: classes15.dex */
public final class b extends wo0.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ip0.a reqValue, yo0.e mImageLoaderConfiguration) {
        super(reqValue, mImageLoaderConfiguration);
        kotlin.jvm.internal.o.g(reqValue, "reqValue");
        kotlin.jvm.internal.o.g(mImageLoaderConfiguration, "mImageLoaderConfiguration");
    }

    @Override // wo0.c, vo0.b
    public void a() {
        if (this.f447882m == null) {
            this.f447882m = new cp0.a();
        }
        f();
    }

    @Override // vo0.b
    public void b(android.widget.ImageView imageView, boolean z17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (this.f447882m == null) {
            this.f447882m = new cp0.d(new cp0.n(imageView, this.f447870a), z17);
        }
        f();
    }

    @Override // vo0.b
    public void c(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (this.f447882m == null) {
            this.f447882m = new cp0.d(new cp0.n(imageView, this.f447870a));
        }
        f();
    }

    public final void i(android.widget.ImageView imageView, yz5.p pVar) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (this.f447882m == null) {
            this.f447882m = new wo0.a(pVar, new cp0.n(imageView));
        }
        f();
    }
}
