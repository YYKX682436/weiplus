package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class zd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f206290d;

    public zd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f206290d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f206290d;
        com.tencent.mm.storage.f9 f9Var = textPreviewUI.f198339u;
        textPreviewUI.getClass();
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
        if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
            db5.e1.t(textPreviewUI.getContext(), textPreviewUI.getResources().getString(com.tencent.mm.R.string.hy8), textPreviewUI.getResources().getString(com.tencent.mm.R.string.hy9), new com.tencent.mm.ui.chatting.wd(textPreviewUI, f9Var));
            c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
        } else {
            pj5.k.f355386a.d(textPreviewUI.getContext(), f9Var, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
