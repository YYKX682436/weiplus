package fa1;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f260670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f260671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager f260672f;

    public a0(com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager wAGameMISSignatureManager, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, long j17) {
        this.f260672f = wAGameMISSignatureManager;
        this.f260670d = tVar;
        this.f260671e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.r x07;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var;
        com.tencent.mm.plugin.appbrand.jsruntime.t tVar = this.f260670d;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var2 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var2 != null) {
            this.f260672f.nativeBindTo(this.f260671e, l0Var2.L(), l0Var2.G(), l0Var2.z(), 0);
        }
        com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var = (com.tencent.mm.plugin.appbrand.jsruntime.j0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.j0.class);
        if (j0Var == null || (x07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) j0Var).x0(2)) == null || (l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) x07.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)) == null) {
            return;
        }
        this.f260672f.nativeBindTo(this.f260671e, 0L, l0Var.G(), 0L, 1);
    }
}
