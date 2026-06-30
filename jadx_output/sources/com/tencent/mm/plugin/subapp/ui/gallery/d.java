package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.j f172378d;

    public d(com.tencent.mm.plugin.subapp.ui.gallery.j jVar) {
        this.f172378d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = this.f172378d.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).x7();
        }
        this.f172378d.a();
        com.tencent.mm.plugin.subapp.ui.gallery.i iVar = this.f172378d.f172387e;
        if (iVar != null) {
            java.lang.String str = ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) iVar).f172194g;
        }
        com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
        am.r1 r1Var = cancelScanTranslationEvent.f54027g;
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.f172378d;
        r1Var.f7757a = jVar.f172394l ? 6 : 5;
        r1Var.f7758b = jVar.f172385c;
        cancelScanTranslationEvent.f54027g.getClass();
        cancelScanTranslationEvent.e();
        this.f172378d.e();
        this.f172378d.f172385c = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
