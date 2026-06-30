package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154543d;

    public s3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154543d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.o oVar = ((com.tencent.mm.plugin.profile.ui.tab.y4) ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154543d.f154549c).f154603a.f154458m).f154702a.X;
        if (oVar != null) {
            oVar.d(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
