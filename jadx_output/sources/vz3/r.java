package vz3;

/* loaded from: classes15.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vz3.r f441708d = new vz3.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        vz3.t tVar = vz3.t.f441710a;
        zs5.a0 type = (zs5.a0) ((jz5.n) vz3.t.f441711b).getValue();
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            obj = dz3.i.G;
            kotlin.jvm.internal.o.d(obj);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            obj = new vz3.q();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsQueueDispatcher", "ScanGoodsQueueDispatcher.impl: ".concat(obj.getClass().getSimpleName()));
        return obj;
    }
}
