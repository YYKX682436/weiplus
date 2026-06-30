package cp0;

/* loaded from: classes15.dex */
public class d extends cp0.m {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f220741b;

    public d(cp0.n nVar) {
        super(nVar);
        this.f220741b = true;
    }

    @Override // cp0.f
    public int c() {
        return this.f220745a.f220761c;
    }

    @Override // cp0.f
    public void d(cp0.n nVar, vo0.h hVar) {
        if (nVar == null || hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.ImageViewShowTarget", "[ViewShowTarget] should show default view or options is null.");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) nVar.b();
        if (imageView != null && this.f220741b) {
            android.graphics.drawable.Drawable drawable = hVar.f438490t;
            int i17 = hVar.f438488r;
            if (!(i17 > 0 || drawable != null)) {
                imageView.setImageBitmap(null);
            } else if (i17 == 0) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setImageResource(i17);
            }
        }
    }

    @Override // cp0.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(android.graphics.Bitmap bitmap, cp0.n nVar) {
        android.widget.ImageView imageView = (android.widget.ImageView) nVar.b();
        java.lang.Object obj = nVar.f220760b.f293573a;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Loader.ImageViewShowTarget", "[onResourceReadyUI]  imageView is null");
            return true;
        }
        imageView.setImageMatrix(null);
        if (obj instanceof ip0.d) {
            imageView.addOnLayoutChangeListener(new cp0.c(this, obj, imageView));
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    public d(cp0.n nVar, boolean z17) {
        super(nVar);
        this.f220741b = true;
        this.f220741b = z17;
    }
}
