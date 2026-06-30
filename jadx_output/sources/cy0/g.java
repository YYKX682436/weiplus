package cy0;

/* loaded from: classes15.dex */
public final class g extends wo0.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ip0.a reqValue, cy0.c configuration) {
        super(reqValue, configuration);
        kotlin.jvm.internal.o.g(reqValue, "reqValue");
        kotlin.jvm.internal.o.g(configuration, "configuration");
    }

    @Override // vo0.b
    public void b(android.widget.ImageView imageView, boolean z17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
    }

    @Override // vo0.b
    public void c(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        com.tencent.mm.plugin.gif.k kVar = drawable instanceof com.tencent.mm.plugin.gif.k ? (com.tencent.mm.plugin.gif.k) drawable : null;
        if (kVar != null) {
            kVar.stop();
        }
        if (this.f447882m == null) {
            this.f447882m = new cy0.f(new cp0.n(imageView, this.f447870a));
        }
        f();
    }
}
