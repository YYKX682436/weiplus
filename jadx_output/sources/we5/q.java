package we5;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        super(1);
        this.f445376d = f9Var;
        this.f445377e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.ao.b(this.f445376d, it, this.f445377e, java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
