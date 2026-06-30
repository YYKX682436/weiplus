package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI f173089d;

    public o0(com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI) {
        this.f173089d = bindGuardianMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI = this.f173089d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(bindGuardianMsgUI, "", bindGuardianMsgUI.getContext().getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        ((android.widget.TextView) bindGuardianMsgUI.findViewById(com.tencent.mm.R.id.dhj)).setVisibility(8);
        int i17 = bindGuardianMsgUI.getIntent().getIntExtra("intent_extra_msg_type", 0) == 102 ? 1 : 0;
        java.lang.String U6 = bindGuardianMsgUI.U6();
        kotlin.jvm.internal.o.d(U6);
        java.lang.String str = (java.lang.String) ((jz5.n) bindGuardianMsgUI.f172825o).getValue();
        kotlin.jvm.internal.o.d(str);
        pq5.g l17 = new vh4.b1(U6, str, i17).l();
        l17.f(bindGuardianMsgUI);
        l17.h(new com.tencent.mm.plugin.teenmode.ui.h0(Q, bindGuardianMsgUI));
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
