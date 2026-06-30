package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class rd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f202650d;

    public rd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f202650d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f202650d;
        wl5.x xVar = textPreviewUI.f198330i;
        if (xVar != null) {
            if (!xVar.M || !xVar.N) {
                com.tencent.mm.ui.chatting.TextPreviewUI.X6(textPreviewUI);
            } else {
                if (textPreviewUI.B) {
                    textPreviewUI.B = false;
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                textPreviewUI.finish();
            }
        } else {
            if (textPreviewUI.B) {
                textPreviewUI.B = false;
                yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            textPreviewUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
