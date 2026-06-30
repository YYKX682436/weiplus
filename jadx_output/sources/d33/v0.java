package d33;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f226290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f226291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f226292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, int i17, int i18, yz5.p pVar) {
        super(0);
        this.f226288d = imageView;
        this.f226289e = bitmap;
        this.f226290f = i17;
        this.f226291g = i18;
        this.f226292h = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f226288d;
        imageView.setImageBitmap(this.f226289e);
        int i17 = this.f226290f;
        int i18 = this.f226291g;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        this.f226292h.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return jz5.f0.f302826a;
    }
}
