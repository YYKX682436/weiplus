package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper f210467d;

    public h9(com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper) {
        this.f210467d = searchViewNotRealTimeHelper;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = this.f210467d;
        com.tencent.mm.ui.tools.i9 i9Var = searchViewNotRealTimeHelper.f210147h;
        if (i9Var != null) {
            ((or1.j2) i9Var).a(searchViewNotRealTimeHelper.getSearchContent());
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
