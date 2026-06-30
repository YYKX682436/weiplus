package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class n7 implements com.tencent.mm.ui.tools.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210603a;

    public n7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210603a = newCountryCodeUI;
    }

    @Override // com.tencent.mm.ui.tools.q
    public void L(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210603a;
        newCountryCodeUI.f210120n = searchText;
        if (newCountryCodeUI.A) {
            if (searchText.length() == 0) {
                android.view.View view = newCountryCodeUI.B;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar = newCountryCodeUI.f210115f;
                if (newCountryCodeAlphabetScrollBar != null) {
                    newCountryCodeAlphabetScrollBar.setVisibility(0);
                }
            } else {
                android.view.View view2 = newCountryCodeUI.B;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI$createActionBarSearchCallback$1", "onSearchTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar2 = newCountryCodeUI.f210115f;
                if (newCountryCodeAlphabetScrollBar2 != null) {
                    newCountryCodeAlphabetScrollBar2.setVisibility(8);
                }
            }
        }
        newCountryCodeUI.V6();
    }

    @Override // com.tencent.mm.ui.tools.q
    public void v() {
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210603a;
        com.tencent.mm.ui.tools.k7 k7Var = newCountryCodeUI.f210132z;
        if (k7Var != null) {
            k7Var.setSearchContent("");
        }
        newCountryCodeUI.f210120n = "";
        newCountryCodeUI.V6();
    }

    @Override // com.tencent.mm.ui.tools.q
    public void w() {
    }

    @Override // com.tencent.mm.ui.tools.q
    public void x() {
    }
}
