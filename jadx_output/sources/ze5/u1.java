package ze5;

/* loaded from: classes9.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.m f472218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f472221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z01.m mVar, rd5.d dVar, yb5.d dVar2, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f472218d = mVar;
        this.f472219e = dVar;
        this.f472220f = dVar2;
        this.f472221g = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView chattingMsgSourceView;
        ze5.g1 holder = (ze5.g1) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(this.f472219e, this.f472220f.D(), holder, null);
        z01.m mVar = this.f472218d;
        mVar.C = erVar;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFileMvvmView chattingFileMvvmView = holder.f471937f;
        if (chattingFileMvvmView != null) {
            chattingFileMvvmView.setViewModel(mVar);
        }
        if (!te5.e2.e((ot0.q) this.f472221g.f310123d) && (chattingMsgSourceView = holder.f471938g) != null) {
            chattingMsgSourceView.setViewModel(mVar.f469105s);
        }
        return jz5.f0.f302826a;
    }
}
