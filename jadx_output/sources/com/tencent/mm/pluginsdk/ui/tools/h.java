package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191664d;

    public h(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191664d = appChooserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f191664d.finish();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
