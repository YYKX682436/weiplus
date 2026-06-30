package zh1;

/* loaded from: classes8.dex */
public final class c0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f472867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f472868e;

    public c0(db5.h4 h4Var, zh1.r0 r0Var) {
        this.f472867d = h4Var;
        this.f472868e = r0Var;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onBitmapLoaded, bitmap is null");
        } else {
            this.f472867d.e(new android.graphics.drawable.BitmapDrawable(this.f472868e.d(bitmap)), 0);
        }
    }
}
