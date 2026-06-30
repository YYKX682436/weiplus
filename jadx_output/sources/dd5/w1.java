package dd5;

/* loaded from: classes9.dex */
public final class w1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f229324a;

    public w1(q80.d0 d0Var) {
        this.f229324a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTypeLiteApp", "openLiteApp fail %s.", this.f229324a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTypeLiteApp", "openLiteApp success %s.", this.f229324a.f360649a);
    }
}
