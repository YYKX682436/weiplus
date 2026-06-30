package we5;

/* loaded from: classes9.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.n0 f445326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(we5.n0 n0Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f445326d = n0Var;
        this.f445327e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f445326d.Z(it, this.f445327e.P0() < 2, true);
        return jz5.f0.f302826a;
    }
}
