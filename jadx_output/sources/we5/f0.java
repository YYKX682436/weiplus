package we5;

/* loaded from: classes9.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        super(1);
        this.f445331d = f9Var;
        this.f445332e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.ao.b(this.f445331d, it, this.f445332e, java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
