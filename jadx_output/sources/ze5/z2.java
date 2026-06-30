package ze5;

/* loaded from: classes9.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f472342d = dVar;
        this.f472343e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.y2 it = (ze5.y2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sb5.e0 e0Var = (sb5.e0) this.f472342d.f460708c.a(sb5.e0.class);
        com.tencent.mm.storage.f9 f9Var = this.f472343e;
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).m0(f9Var);
        }
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).p0(f9Var);
        }
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).n0(f9Var);
        }
        return jz5.f0.f302826a;
    }
}
