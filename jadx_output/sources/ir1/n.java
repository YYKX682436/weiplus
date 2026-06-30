package ir1;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f294019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d04 f294020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI, r45.d04 d04Var) {
        super(0);
        this.f294019d = bizFansBlackListUI;
        this.f294020e = d04Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI = this.f294019d;
        bizFansBlackListUI.f93935g.remove(this.f294020e);
        java.util.ArrayList infoList = bizFansBlackListUI.f93935g;
        bizFansBlackListUI.W6();
        ir1.d dVar = bizFansBlackListUI.f93934f;
        dVar.getClass();
        kotlin.jvm.internal.o.g(infoList, "infoList");
        java.util.ArrayList arrayList = dVar.f293950e;
        arrayList.clear();
        arrayList.addAll(infoList);
        dVar.notifyDataSetChanged();
        androidx.appcompat.app.AppCompatActivity context = bizFansBlackListUI.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = bizFansBlackListUI.getContext().getText(com.tencent.mm.R.string.n4x);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
