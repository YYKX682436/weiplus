package vt3;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f439983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f439985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list, int i17, boolean z17) {
        super(0);
        this.f439983d = list;
        this.f439984e = i17;
        this.f439985f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
        if (mJAssetInfoStatistics != null) {
            mJAssetInfoStatistics.a(this.f439983d, this.f439984e, this.f439985f);
        }
        return jz5.f0.f302826a;
    }
}
