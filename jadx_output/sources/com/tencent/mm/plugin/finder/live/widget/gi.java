package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ri f118446d;

    public gi(com.tencent.mm.plugin.finder.live.widget.ri riVar) {
        this.f118446d = riVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.widget.ki modifyBottomPage;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        modifyBottomPage = this.f118446d.getModifyBottomPage();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = modifyBottomPage.f211798d;
        if (y1Var != null) {
            y1Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
