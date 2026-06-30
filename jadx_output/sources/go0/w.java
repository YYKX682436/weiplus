package go0;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xeffect.IWeJsonMessageCallback f273889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(go0.f0 f0Var, com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback) {
        super(0);
        this.f273888d = f0Var;
        this.f273889e = iWeJsonMessageCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f273888d.f273767p;
        if (f1Var != null) {
            com.tencent.mm.xeffect.IWeJsonMessageCallback iWeJsonMessageCallback = this.f273889e;
            f1Var.H = iWeJsonMessageCallback;
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null) {
                t1Var.f273862i = iWeJsonMessageCallback;
                go0.a aVar = t1Var.f273856c;
                if (aVar != null && (d0Var = aVar.f273730f) != null) {
                    ((p05.l4) d0Var).E(iWeJsonMessageCallback);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
