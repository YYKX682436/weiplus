package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.z f192003d;

    public y(com.tencent.mm.pluginsdk.ui.tools.z zVar) {
        this.f192003d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultNotSetItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f192003d.f192017e;
        appChooserUI.f191343q = appChooserUI.f191337i;
        appChooserUI.f191340o.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultNotSetItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
