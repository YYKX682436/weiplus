package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174173d;

    public p9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174173d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174173d;
        if (textStatusEditActivity.S1 == com.tencent.mm.plugin.textstatus.ui.f8.f173869e) {
            com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = textStatusEditActivity.f173576e;
            if (emojiPanelInputComponent != null && emojiPanelInputComponent.getVisibility() == 0) {
                com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent2 = textStatusEditActivity.f173576e;
                if (emojiPanelInputComponent2 != null) {
                    emojiPanelInputComponent2.setVisibility(4);
                }
                textStatusEditActivity.J2(false, 0);
                textStatusEditActivity.hideVKB();
            } else {
                textStatusEditActivity.showVKB();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
