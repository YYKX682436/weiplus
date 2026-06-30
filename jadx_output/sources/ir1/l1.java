package ir1;

/* loaded from: classes3.dex */
public final class l1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f294016d;

    /* renamed from: e, reason: collision with root package name */
    public final ir1.m1 f294017e;

    public l1(java.util.ArrayList compositionList, ir1.m1 privateMsgScopeChooseCallback) {
        kotlin.jvm.internal.o.g(compositionList, "compositionList");
        kotlin.jvm.internal.o.g(privateMsgScopeChooseCallback, "privateMsgScopeChooseCallback");
        this.f294016d = compositionList;
        this.f294017e = privateMsgScopeChooseCallback;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f294016d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ir1.n1 viewHolderLongClick = (ir1.n1) k3Var;
        kotlin.jvm.internal.o.g(viewHolderLongClick, "viewHolderLongClick");
        java.lang.Object obj = this.f294016d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ir1.j2 j2Var = (ir1.j2) obj;
        viewHolderLongClick.f294025g = j2Var;
        viewHolderLongClick.f294023e.setText(j2Var.f294009b);
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI bizFansPrivateMsgScopeSettingUI = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI) viewHolderLongClick.f294022d;
        bizFansPrivateMsgScopeSettingUI.getClass();
        java.lang.Integer num = bizFansPrivateMsgScopeSettingUI.f93956f;
        viewHolderLongClick.f294024f.setVisibility(num != null && num.intValue() == j2Var.f294008a ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.dzl, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ir1.n1(inflate, this.f294017e);
    }
}
