package ze5;

/* loaded from: classes9.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.m f472078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f472081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(z01.m mVar, rd5.d dVar, yb5.d dVar2, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f472078d = mVar;
        this.f472079e = dVar;
        this.f472080f = dVar2;
        this.f472081g = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.chatting.mvvmview.widget.ChattingMsgSourceView chattingMsgSourceView;
        ze5.g1 holder = (ze5.g1) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(this.f472079e, this.f472080f.D(), holder, null);
        z01.m mVar = this.f472078d;
        mVar.C = erVar;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFileMvvmView chattingFileMvvmView = holder.f471937f;
        if (chattingFileMvvmView != null) {
            chattingFileMvvmView.setViewModel(mVar);
        }
        if (!te5.e2.e((ot0.q) this.f472081g.f310123d) && (chattingMsgSourceView = holder.f471938g) != null) {
            chattingMsgSourceView.setViewModel(mVar.f469105s);
        }
        return jz5.f0.f302826a;
    }
}
