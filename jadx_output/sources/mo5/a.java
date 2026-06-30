package mo5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final mo5.a f330424d = new mo5.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.ScreenProjectSendManager", "onScreenFrame: sendVideo failed, ret=" + intValue);
        }
        return jz5.f0.f302826a;
    }
}
