package wu;

/* loaded from: classes9.dex */
public final class q1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f449616a;

    public q1(q80.d0 d0Var) {
        this.f449616a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailUrlItemConvert", "openLiteApp fail %s.", this.f449616a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailUrlItemConvert", "openLiteApp success %s.", this.f449616a.f360649a);
    }
}
