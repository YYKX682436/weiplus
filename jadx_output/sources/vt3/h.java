package vt3;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f439993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list, int i17) {
        super(0);
        this.f439993d = list;
        this.f439994e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
        if (mJAssetInfoStatistics != null) {
            mJAssetInfoStatistics.e(this.f439993d, this.f439994e);
        }
        return jz5.f0.f302826a;
    }
}
