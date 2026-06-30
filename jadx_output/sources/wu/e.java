package wu;

/* loaded from: classes9.dex */
public final class e implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f449559a;

    public e(q80.d0 d0Var) {
        this.f449559a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailAskShareItemConvert", "openLiteApp fail %s.", this.f449559a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailAskShareItemConvert", "openLiteApp success %s.", this.f449559a.f360649a);
    }
}
