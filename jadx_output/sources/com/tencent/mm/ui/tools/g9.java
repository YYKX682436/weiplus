package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper f210442d;

    public g9(com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper) {
        this.f210442d = searchViewNotRealTimeHelper;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = this.f210442d;
        com.tencent.mm.ui.tools.i9 i9Var = searchViewNotRealTimeHelper.f210147h;
        if (i9Var != null) {
            i9Var.getClass();
        }
        com.tencent.mm.ui.tools.p pVar = searchViewNotRealTimeHelper.f210148i;
        if (pVar != null) {
            pVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
