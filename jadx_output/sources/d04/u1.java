package d04;

/* loaded from: classes8.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f225516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d04.w1 f225517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f225519h;

    public u1(int i17, byte[] bArr, d04.w1 w1Var, int i18, android.widget.ImageView imageView) {
        this.f225515d = i17;
        this.f225516e = bArr;
        this.f225517f = w1Var;
        this.f225518g = i18;
        this.f225519h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.System.currentTimeMillis();
        int i17 = this.f225515d;
        android.graphics.Bitmap bitmap = null;
        if (i17 == 1 || i17 == 3) {
            byte[] bArr = this.f225516e;
            int i18 = this.f225517f.f225538h;
            bitmap = com.tencent.mm.sdk.platformtools.x.I(bArr, i18 * 2, i18 * 2, null);
        } else if (i17 == 2) {
            byte[] bArr2 = this.f225516e;
            int i19 = this.f225517f.f225538h;
            bitmap = com.tencent.mm.sdk.platformtools.x.I(bArr2, i19, i19, null);
        }
        java.lang.System.currentTimeMillis();
        if (bitmap != null) {
            bitmap.getAllocationByteCount();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new d04.t1(bitmap, this.f225518g, this.f225519h));
    }
}
