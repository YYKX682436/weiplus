package n04;

/* loaded from: classes9.dex */
public class i implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f333916a;

    public i(q80.d0 d0Var) {
        this.f333916a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("FTSFeatureDataItemClickHandler", "openLiteApp fail %s.", this.f333916a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FTSFeatureDataItemClickHandler", "openLiteApp success %s.", this.f333916a.f360649a);
    }
}
