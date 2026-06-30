package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.t4 f201357e;

    public s4(com.tencent.mm.ui.chatting.gallery.t4 t4Var, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201357e = t4Var;
        this.f201356d = taVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201356d;
        taVar.c();
        taVar.f201428f.c(this.f201357e.f200886d.f201092g.getContext(), true);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
