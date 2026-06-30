package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200832d;

    public c5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200832d = imageGalleryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sy3.c cVar = this.f200832d.f200639n3;
        if (cVar != null && !((kz3.l) cVar).c()) {
            this.f200832d.g7();
        }
        com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
        am.r1 r1Var = cancelScanTranslationEvent.f54027g;
        r1Var.f7757a = 1;
        r1Var.f7758b = this.f200832d.J2;
        am.r1 r1Var2 = cancelScanTranslationEvent.f54027g;
        this.f200832d.x2();
        r1Var2.getClass();
        cancelScanTranslationEvent.e();
        this.f200832d.y7(false);
        this.f200832d.J2 = 0;
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
