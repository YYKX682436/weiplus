package go0;

/* loaded from: classes14.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f273901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.l lVar, go0.f0 f0Var) {
        super(0);
        this.f273901d = lVar;
        this.f273902e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f0 f0Var = this.f273902e;
        yz5.l lVar = this.f273901d;
        if (lVar != null) {
            ft0.d dVar = f0Var.f273764m;
            lVar.invoke(dVar != null ? dVar.b() : null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCameraPreview  ");
        ft0.d dVar2 = f0Var.f273764m;
        sb6.append(dVar2 != null ? dVar2.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreRender", sb6.toString(), new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
