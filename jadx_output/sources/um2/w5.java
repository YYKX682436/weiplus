package um2;

/* loaded from: classes3.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(um2.x5 x5Var) {
        super(0);
        this.f429009d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f429009d;
        ((we2.s) x5Var.c(we2.s.class)).O6();
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = x5Var.f429071s;
        if (mgVar != null) {
            mgVar.K0(0);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = x5Var.f429071s;
        if (mgVar2 != null) {
            java.util.List list = ((mm2.x4) x5Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            android.view.ViewGroup viewGroup = mgVar2.f365323d;
            viewGroup.getVisibility();
            viewGroup.getAlpha();
            viewGroup.isShown();
            mgVar2.C1().getVisibility();
            mgVar2.C1().isShown();
            list.size();
            mgVar2.D.getItemCount();
            mgVar2.C1().getChildCount();
            mgVar2.T1(list, false, false, java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
