package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159550d;

    public f4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159550d = translationResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/TranslationResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f58317e = 7L;
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159550d;
        galleryTranslateReportStruct.f58318f = translationResultUI.f159471g;
        galleryTranslateReportStruct.q(translationResultUI.f159472h);
        galleryTranslateReportStruct.p(translationResultUI.f159473i);
        galleryTranslateReportStruct.k();
        java.lang.String str = translationResultUI.f159474m.field_resultFile;
        translationResultUI.getClass();
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(translationResultUI, str, new com.tencent.mm.plugin.scanner.ui.j4(translationResultUI));
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
