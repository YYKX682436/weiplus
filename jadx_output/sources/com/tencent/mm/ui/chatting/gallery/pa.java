package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201274d;

    public pa(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201274d = taVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201274d;
        if (taVar.f201424b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryViewHolder", "%d video wait play on click, play video %d", java.lang.Integer.valueOf(taVar.hashCode()), java.lang.Integer.valueOf(taVar.f201425c));
            int i17 = taVar.f201425c;
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = taVar.f201424b;
            k1Var.f201098p.A(k1Var.y(i17), i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
