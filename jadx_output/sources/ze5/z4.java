package ze5;

/* loaded from: classes9.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f472344d = dVar;
        this.f472345e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.t4 holder = (ze5.t4) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        yb5.d dVar = this.f472344d;
        sb5.e0 e0Var = (sb5.e0) dVar.f460708c.a(sb5.e0.class);
        com.tencent.mm.storage.f9 f9Var = this.f472345e;
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).m0(f9Var);
        }
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).p0(f9Var);
        }
        if (e0Var != null) {
            ((com.tencent.mm.ui.chatting.component.f7) e0Var).n0(f9Var);
        }
        com.tencent.mm.ui.chatting.component.c0.f198856r.c(dVar, holder.convertView, f9Var);
        return jz5.f0.f302826a;
    }
}
