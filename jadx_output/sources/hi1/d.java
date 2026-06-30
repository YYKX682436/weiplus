package hi1;

/* loaded from: classes7.dex */
public class d implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap[] f281486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hi1.l f281488f;

    public d(android.graphics.Bitmap[] bitmapArr, int i17, hi1.l lVar) {
        this.f281486d = bitmapArr;
        this.f281487e = i17;
        this.f281488f = lVar;
    }

    @Override // l01.u
    public void b() {
        android.graphics.Bitmap decodeResource = bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.miniprogram_default_avatar, null);
        if (decodeResource != null) {
            this.f281486d[this.f281487e] = com.tencent.mm.sdk.platformtools.x.t0(decodeResource, false, decodeResource.getWidth() / 2, false, null);
        } else {
            this.f281486d[this.f281487e] = null;
        }
        int i17 = this.f281487e;
        android.graphics.Bitmap[] bitmapArr = this.f281486d;
        if (i17 == bitmapArr.length - 1) {
            hi1.o.f281500c.f281502b = bitmapArr;
            this.f281488f.a();
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return null;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap[] bitmapArr = this.f281486d;
        int i17 = this.f281487e;
        bitmapArr[i17] = bitmap;
        if (i17 == bitmapArr.length - 1) {
            hi1.o.f281500c.f281502b = bitmapArr;
            this.f281488f.a();
        }
    }
}
