package ze5;

/* loaded from: classes15.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f471956d = dVar;
        this.f471957e = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var;
        sb5.d dVar;
        com.tencent.mm.ui.chatting.component.v m07;
        yb5.d dVar2 = this.f471956d;
        if (dVar2 != null && (f9Var = this.f471957e) != null && (dVar = (sb5.d) dVar2.f460708c.a(sb5.d.class)) != null) {
            com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar;
            com.tencent.mm.ui.chatting.component.l s07 = c0Var.s0(f9Var);
            com.tencent.mm.ui.chatting.component.m mVar = (s07 == null || (m07 = c0Var.m0(s07)) == null) ? null : m07.f200101a;
            if (mVar != null) {
                mVar.f199469p = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
