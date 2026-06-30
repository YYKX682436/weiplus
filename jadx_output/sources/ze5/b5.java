package ze5;

/* loaded from: classes9.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.b0 f471840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f471841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(rd5.d dVar, yb5.d dVar2, z01.b0 b0Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f471838d = dVar;
        this.f471839e = dVar2;
        this.f471840f = b0Var;
        this.f471841g = a0Var;
        this.f471842h = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.t4 it = (ze5.t4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView chattingRecordMvvmView = it.f472203b;
        yb5.d dVar = this.f471839e;
        if (chattingRecordMvvmView != null) {
            chattingRecordMvvmView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f471838d, dVar.D(), it, dVar.x()));
        }
        com.tencent.mm.ui.chatting.viewitems.h0 h0Var = new com.tencent.mm.ui.chatting.viewitems.h0(dVar, new ze5.a5(dVar, this.f471842h));
        z01.b0 b0Var = this.f471840f;
        b0Var.f468955g = h0Var;
        b0Var.f468956h = this.f471841g.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        b0Var.f468957i = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView chattingRecordMvvmView2 = it.f472203b;
        if (chattingRecordMvvmView2 != null) {
            chattingRecordMvvmView2.setViewModel(b0Var);
        }
        return jz5.f0.f302826a;
    }
}
