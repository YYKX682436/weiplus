package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f206268d;

    public yd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f206268d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.CharSequence charSequence;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.chatting.TextPreviewUI.H;
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f206268d;
        textPreviewUI.getClass();
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        if (textPreviewUI.f198339u != null && (charSequence = textPreviewUI.f198327f) != null) {
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, charSequence.toString(), 1);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = textPreviewUI;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null) {
                jq0Var.e(textPreviewUI.f198339u.Q0());
                jq0Var.j(c01.z1.r());
                doFavoriteEvent.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
