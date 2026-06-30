package g73;

/* loaded from: classes15.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.d0 f269262d = new g73.d0();

    public d0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "onQBFileDestroy");
        g73.o0.f269319o = false;
        com.tencent.mm.plugin.handoff.model.HandOff handOff = g73.o0.f269313f;
        if (handOff != null) {
            g73.o0.f269311d.a9(handOff);
            g73.o0.f269313f = null;
        }
        return jz5.f0.f302826a;
    }
}
