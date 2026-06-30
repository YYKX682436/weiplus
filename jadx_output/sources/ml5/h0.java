package ml5;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.RoundCropLayout f328425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f328426e;

    public h0(com.tencent.mm.ui.widget.cropview.RoundCropLayout roundCropLayout, android.graphics.Bitmap bitmap) {
        this.f328425d = roundCropLayout;
        this.f328426e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f328425d.setBitmap(this.f328426e);
    }
}
