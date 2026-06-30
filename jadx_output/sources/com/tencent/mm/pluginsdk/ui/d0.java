package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.BioHelperUI f190779d;

    public d0(com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI) {
        this.f190779d = bioHelperUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/BioHelperUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI = this.f190779d;
        bioHelperUI.f189764m.g(bioHelperUI);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/BioHelperUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
