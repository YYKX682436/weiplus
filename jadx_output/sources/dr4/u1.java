package dr4;

/* loaded from: classes14.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final dr4.u1 f242749d = new dr4.u1();

    public u1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture;
        dr4.o renderer = (dr4.o) obj;
        kotlin.jvm.internal.o.g(renderer, "renderer");
        if (com.tencent.mm.plugin.voip.model.v2protocal.f176825l2 == null && (surfaceTexture = renderer.f242690p) != null) {
            com.tencent.mm.plugin.voip.model.v2protocal.f176827n2 = surfaceTexture;
            com.tencent.mm.plugin.voip.model.v2protocal.f176826m2 = renderer.f242687m;
            com.tencent.mm.plugin.voip.model.v2protocal.f176825l2 = renderer.f242691q;
        }
        return jz5.f0.f302826a;
    }
}
