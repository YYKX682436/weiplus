package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class le implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f201937d;

    public le(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f201937d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f201937d;
        wl5.x xVar = textPreviewUI.f198330i;
        if (xVar == null) {
            textPreviewUI.finish();
        } else if (xVar.M && xVar.N) {
            textPreviewUI.finish();
        } else {
            com.tencent.mm.ui.chatting.TextPreviewUI.X6(textPreviewUI);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
