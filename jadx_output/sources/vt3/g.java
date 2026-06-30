package vt3;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f439992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17) {
        super(0);
        this.f439992d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
        if (mJAssetInfoStatistics != null) {
            mJAssetInfoStatistics.d(this.f439992d);
        }
        return jz5.f0.f302826a;
    }
}
