package ia2;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f289974d = str;
        this.f289975e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderFlutterPOIActivity", "Failed to prefetch poi stream. poiID:" + this.f289974d + ", poiName:" + this.f289975e);
        return jz5.f0.f302826a;
    }
}
