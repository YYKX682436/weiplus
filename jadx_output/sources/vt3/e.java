package vt3;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f439991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.nio.ByteBuffer byteBuffer) {
        super(0);
        this.f439991d = byteBuffer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
        if (mJAssetInfoStatistics != null) {
            mJAssetInfoStatistics.b(this.f439991d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jsonString: ");
        com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics2 = vt3.l.f440006b;
        sb6.append(mJAssetInfoStatistics2 != null ? mJAssetInfoStatistics2.g() : null);
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", sb6.toString());
        return jz5.f0.f302826a;
    }
}
