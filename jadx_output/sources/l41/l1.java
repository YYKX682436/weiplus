package l41;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l41.l1 f315865d = new l41.l1();

    public l1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", java.lang.Boolean.valueOf(booleanValue));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f302826a;
    }
}
