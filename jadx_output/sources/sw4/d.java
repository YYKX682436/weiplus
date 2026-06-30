package sw4;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI f413483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f413484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI, android.graphics.Bitmap bitmap) {
        super(1);
        this.f413483d = gaussianBlurProxyUI;
        this.f413484e = bitmap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.luggage.ipc.GaussianBlurProxyUI gaussianBlurProxyUI = this.f413483d;
        gaussianBlurProxyUI.getWindow().getDecorView().setBackground(new android.graphics.drawable.BitmapDrawable(gaussianBlurProxyUI.getContext().getResources(), (android.graphics.Bitmap) obj));
        this.f413484e.recycle();
        return jz5.f0.f302826a;
    }
}
