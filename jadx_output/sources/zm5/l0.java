package zm5;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.k f474243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c1.k kVar) {
        super(1);
        this.f474243d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryMainUIC", "isShow: " + booleanValue);
        if (!booleanValue) {
            c1.j.a(this.f474243d, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
