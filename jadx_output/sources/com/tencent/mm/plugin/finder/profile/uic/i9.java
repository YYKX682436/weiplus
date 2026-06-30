package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123791d;

    public i9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123791d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123791d;
        if (obVar.b7().f130821q.getVisibility() == 0) {
            boolean z17 = obVar.b7().f130822r;
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            if (z17) {
                android.app.Activity context = obVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "description_fold", 1, null, false, null, 56, null);
            } else {
                android.app.Activity context2 = obVar.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar2 != null ? nyVar2.V6() : null, "description_unfold", 1, null, false, null, 56, null);
            }
            obVar.b7().setExpand(!obVar.b7().f130822r);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
