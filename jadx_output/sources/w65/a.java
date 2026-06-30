package w65;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.c f443340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.ref.WeakReference weakReference, w65.c cVar, java.lang.String str, int i17) {
        super(0);
        this.f443339d = weakReference;
        this.f443340e = cVar;
        this.f443341f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f443339d.get();
        if (imageView != null) {
            ((f80.b) this.f443340e).getClass();
            java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.h9z);
            f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
            if (kotlin.jvm.internal.o.b(bVar != null ? bVar.f260077h : null, this.f443341f)) {
                imageView.setTag(com.tencent.mm.R.id.h9z, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
