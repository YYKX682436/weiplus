package we5;

/* loaded from: classes9.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.storage.f9 f9Var, kotlin.jvm.internal.h0 h0Var, yb5.d dVar) {
        super(1);
        this.f445397d = f9Var;
        this.f445398e = h0Var;
        this.f445399f = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.bo.d(this.f445397d, (com.tencent.mm.storage.z3) this.f445398e.f310123d, it, this.f445399f);
        return jz5.f0.f302826a;
    }
}
