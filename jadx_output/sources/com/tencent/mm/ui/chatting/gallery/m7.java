package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class m7 implements android.view.View.OnClickListener {
    public m7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$66", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$66", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
