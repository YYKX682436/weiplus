package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.x f191959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.x f191960e;

    public w(com.tencent.mm.pluginsdk.ui.tools.x xVar, com.tencent.mm.pluginsdk.ui.otherway.x xVar2) {
        this.f191960e = xVar;
        this.f191959d = xVar2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191960e.f191972e;
        appChooserUI.f191343q = this.f191959d;
        appChooserUI.f191340o.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
