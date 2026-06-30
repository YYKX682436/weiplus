package ia2;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2) {
        super(2);
        this.f289972d = str;
        this.f289973e = str2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "Succeed to prefetch poi stream. poiID:" + this.f289972d + ", poiName:" + this.f289973e);
        return jz5.f0.f302826a;
    }
}
