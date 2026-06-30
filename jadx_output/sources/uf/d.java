package uf;

/* loaded from: classes7.dex */
public final class d implements uf.l {

    /* renamed from: a, reason: collision with root package name */
    public static final uf.d f427013a = new uf.d();

    @Override // uf.l
    public void a(uf.a action, int i17, java.lang.String manufactureName, java.lang.String deviceName, boolean z17) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(manufactureName, "manufactureName");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        com.tencent.mars.xlog.Log.i("MicroMsg.CastContracts", "handleReport, action: " + action + ", deviceCount: " + i17 + ", manufactureName: " + manufactureName + ", deviceName: " + deviceName + ", connectSuccess: " + z17);
    }
}
