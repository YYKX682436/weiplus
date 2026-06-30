package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class xd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f206243d;

    public xd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f206243d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.manager.t.a(this.f206243d.f198339u, view.getContext(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.xd$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = com.tencent.mm.ui.chatting.xd.this.f206243d;
                if (textPreviewUI.f198339u != null) {
                    com.tencent.mm.ui.chatting.TextPreviewUI.U6(textPreviewUI, textPreviewUI.getContext(), textPreviewUI.f198327f.toString());
                }
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
