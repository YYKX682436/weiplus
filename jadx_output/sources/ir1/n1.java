package ir1;

/* loaded from: classes3.dex */
public final class n1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final ir1.m1 f294022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f294023e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f294024f;

    /* renamed from: g, reason: collision with root package name */
    public ir1.j2 f294025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.view.View itemView, ir1.m1 scopeChooseCallback) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(scopeChooseCallback, "scopeChooseCallback");
        this.f294022d = scopeChooseCallback;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.v0v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f294023e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nh8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f294024f = (android.widget.ImageView) findViewById2;
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        ir1.j2 j2Var = this.f294025g;
        sb6.append(j2Var != null ? java.lang.Integer.valueOf(j2Var.f294008a) : null);
        sb6.append(", ");
        ir1.j2 j2Var2 = this.f294025g;
        sb6.append(j2Var2 != null ? j2Var2.f294009b : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFansPrivateMsgScopeSettingUI", sb6.toString());
        ir1.j2 j2Var3 = this.f294025g;
        ir1.m1 m1Var = this.f294022d;
        if (j2Var3 != null) {
            com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI bizFansPrivateMsgScopeSettingUI = (com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI) m1Var;
            bizFansPrivateMsgScopeSettingUI.getClass();
            bizFansPrivateMsgScopeSettingUI.f93956f = java.lang.Integer.valueOf(j2Var3.f294008a);
        }
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI) m1Var).T6().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
