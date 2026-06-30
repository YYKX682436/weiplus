package l01;

/* loaded from: classes7.dex */
public abstract class w implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f314788d;

    /* renamed from: e, reason: collision with root package name */
    public final l01.b f314789e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f314791g = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f314790f = "ImageView";

    public w(android.widget.ImageView imageView, l01.b bVar, java.lang.String str, l01.e0 e0Var, l01.c cVar) {
        this.f314788d = new java.lang.ref.WeakReference(imageView);
        this.f314789e = bVar;
    }

    @Override // l01.u
    public void b() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f314788d.get();
        if (imageView != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f314789e.f314741c).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        }
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f314790f;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        java.lang.ref.WeakReference weakReference = this.f314788d;
        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
        if (imageView != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f314789e.f314741c).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) weakReference.get();
        this.f314791g = true;
        if (imageView2 != null) {
            if (!com.tencent.mm.sdk.platformtools.u3.e()) {
                com.tencent.mm.sdk.platformtools.Log.a("Luggage.AppBrandSimpleImageLoader", "onBitmapLoaded invoke in non-main thread!!!", new java.lang.Object[0]);
            }
            imageView2.setImageDrawable(new l01.p0(imageView2.getResources(), bitmap));
        }
    }
}
