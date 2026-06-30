package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes8.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout f175433d;

    public h(com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout languageChoiceLayout) {
        this.f175433d = languageChoiceLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout.f175403m;
        com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout languageChoiceLayout = this.f175433d;
        languageChoiceLayout.getClass();
        languageChoiceLayout.a();
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
