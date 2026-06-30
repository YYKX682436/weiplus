package d04;

/* loaded from: classes8.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f225433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d04.i2 f225434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f225436h;

    public h2(int i17, byte[] bArr, d04.i2 i2Var, int i18, android.widget.ImageView imageView) {
        this.f225432d = i17;
        this.f225433e = bArr;
        this.f225434f = i2Var;
        this.f225435g = i18;
        this.f225436h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.System.currentTimeMillis();
        int i17 = this.f225432d;
        android.graphics.Bitmap bitmap = null;
        if (i17 == 1 || i17 == 3) {
            byte[] bArr = this.f225433e;
            int i18 = this.f225434f.f225442e;
            bitmap = com.tencent.mm.sdk.platformtools.x.I(bArr, i18 * 2, i18 * 2, null);
        } else if (i17 == 2) {
            byte[] bArr2 = this.f225433e;
            int i19 = this.f225434f.f225442e;
            bitmap = com.tencent.mm.sdk.platformtools.x.I(bArr2, i19, i19, null);
        }
        java.lang.System.currentTimeMillis();
        if (bitmap != null) {
            bitmap.getAllocationByteCount();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new d04.g2(bitmap, this.f225435g, this.f225436h));
    }
}
