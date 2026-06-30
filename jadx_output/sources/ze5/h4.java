package ze5;

/* loaded from: classes9.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.y f471963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f471964g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(rd5.d dVar, yb5.d dVar2, z01.y yVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        super(1);
        this.f471961d = dVar;
        this.f471962e = dVar2;
        this.f471963f = yVar;
        this.f471964g = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.b4 it = (ze5.b4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView chattingNoteMvvmView = it.f471837b;
        yb5.d dVar = this.f471962e;
        if (chattingNoteMvvmView != null) {
            chattingNoteMvvmView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f471961d, dVar.D(), it, dVar.x()));
        }
        com.tencent.mm.ui.chatting.viewitems.a0 a0Var = this.f471964g;
        com.tencent.mm.ui.chatting.viewitems.r0 w17 = a0Var.w(dVar);
        z01.y yVar = this.f471963f;
        yVar.f469189i = w17;
        yVar.f469190m = a0Var.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        yVar.f469191n = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView chattingNoteMvvmView2 = it.f471837b;
        if (chattingNoteMvvmView2 != null) {
            chattingNoteMvvmView2.setViewModel(yVar);
        }
        return jz5.f0.f302826a;
    }
}
