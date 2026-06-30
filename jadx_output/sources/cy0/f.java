package cy0;

/* loaded from: classes15.dex */
public final class f extends cp0.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cp0.n holder) {
        super(holder);
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // cp0.f
    public boolean b(java.lang.Object obj, cp0.n viewWeakHolder) {
        com.tencent.mm.plugin.gif.k resource = (com.tencent.mm.plugin.gif.k) obj;
        kotlin.jvm.internal.o.g(resource, "resource");
        kotlin.jvm.internal.o.g(viewWeakHolder, "viewWeakHolder");
        android.view.View b17 = viewWeakHolder.b();
        android.widget.ImageView imageView = b17 instanceof android.widget.ImageView ? (android.widget.ImageView) b17 : null;
        if (imageView == null) {
            return false;
        }
        java.lang.Object obj2 = viewWeakHolder.f220760b.f293573a;
        imageView.setImageMatrix(null);
        if (obj2 instanceof ip0.d) {
            imageView.addOnLayoutChangeListener(new cy0.e(obj2, imageView));
        }
        imageView.setImageDrawable(resource);
        resource.start();
        return true;
    }

    @Override // cp0.f
    public int c() {
        return this.f220745a.f220761c;
    }

    @Override // cp0.f
    public void d(cp0.n viewWeakHolder, vo0.h request) {
        kotlin.jvm.internal.o.g(viewWeakHolder, "viewWeakHolder");
        kotlin.jvm.internal.o.g(request, "request");
    }
}
