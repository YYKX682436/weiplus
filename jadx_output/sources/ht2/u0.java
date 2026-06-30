package ht2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f284911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.q6 f284913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.widget.ImageView imageView, ht2.y0 y0Var, zy2.q6 q6Var) {
        super(2);
        this.f284911d = imageView;
        this.f284912e = y0Var;
        this.f284913f = q6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(url, "url");
        android.widget.ImageView imageView = this.f284911d;
        if (bitmap != null) {
            imageView.setAlpha(0.8f);
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap));
        } else {
            imageView.setAlpha(1.0f);
            this.f284912e.qj(imageView, this.f284913f);
        }
        return jz5.f0.f302826a;
    }
}
