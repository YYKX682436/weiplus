package w65;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.c f443343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f443345g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.ref.WeakReference weakReference, w65.c cVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        super(0);
        this.f443342d = weakReference;
        this.f443343e = cVar;
        this.f443344f = str;
        this.f443345g = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f443342d.get();
        if (imageView != null) {
            ((f80.b) this.f443343e).getClass();
            java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.h9z);
            f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
            if (kotlin.jvm.internal.o.b(bVar != null ? bVar.f260077h : null, this.f443344f)) {
                imageView.setImageBitmap(this.f443345g);
            }
        }
        return jz5.f0.f302826a;
    }
}
