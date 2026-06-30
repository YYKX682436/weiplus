package pj5;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj5.l f355388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.d0 f355390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView f355391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pj5.l lVar, in5.s0 s0Var, z01.d0 d0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView chattingScheduleMsgMvvmView) {
        super(1);
        this.f355388d = lVar;
        this.f355389e = s0Var;
        this.f355390f = d0Var;
        this.f355391g = chattingScheduleMsgMvvmView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm3.t0 b17;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        long longValue = ((java.lang.Number) obj).longValue();
        pj5.l lVar = (pj5.l) this.f355388d.y0();
        lVar.f355387d.f379677f = (int) (longValue / 1000);
        androidx.recyclerview.widget.RecyclerView o17 = this.f355389e.o();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = o17 instanceof com.tencent.mm.view.recyclerview.WxRecyclerView ? (com.tencent.mm.view.recyclerview.WxRecyclerView) o17 : null;
        if (wxRecyclerView != null && (b17 = xm3.u0.b(wxRecyclerView)) != null && (mvvmList = b17.I) != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, lVar, false, 2, null);
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
        z01.d0 d0Var = this.f355390f;
        d0Var.f468989g = valueOf;
        this.f355391g.setViewModel(d0Var);
        return jz5.f0.f302826a;
    }
}
