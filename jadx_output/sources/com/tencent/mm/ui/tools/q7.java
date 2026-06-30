package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class q7 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210656d;

    public q7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210656d = newCountryCodeUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView view, int i17, int i18, int i19) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210656d;
        java.util.List list = newCountryCodeUI.f210116g;
        if (!(list == null || ((java.util.ArrayList) list).isEmpty()) && newCountryCodeUI.f210124r != null && newCountryCodeUI.f210125s != null) {
            android.widget.ListView listView = newCountryCodeUI.f210113d;
            int headerViewsCount = i17 - (listView != null ? listView.getHeaderViewsCount() : 0);
            if (headerViewsCount >= 0) {
                java.util.List list2 = newCountryCodeUI.f210116g;
                kotlin.jvm.internal.o.d(list2);
                if (headerViewsCount < ((java.util.ArrayList) list2).size()) {
                    java.util.List list3 = newCountryCodeUI.f210116g;
                    kotlin.jvm.internal.o.d(list3);
                    u11.a aVar = (u11.a) ((java.util.ArrayList) list3).get(headerViewsCount);
                    if (newCountryCodeUI.f210114e == null || (str = java.lang.String.valueOf((char) aVar.f423731e)) == null) {
                        str = "";
                    }
                    if (newCountryCodeUI.A) {
                        android.widget.LinearLayout linearLayout = newCountryCodeUI.f210124r;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                    } else {
                        com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar = newCountryCodeUI.f210115f;
                        if (newCountryCodeAlphabetScrollBar != null) {
                            java.lang.String str2 = newCountryCodeUI.f210130x;
                            if (str2.length() == 0) {
                                str2 = str;
                            }
                            newCountryCodeAlphabetScrollBar.e(str2, true);
                        }
                        if (!kotlin.jvm.internal.o.b(str, newCountryCodeUI.f210126t)) {
                            android.widget.TextView textView = newCountryCodeUI.f210125s;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            newCountryCodeUI.f210126t = str;
                        }
                        android.widget.LinearLayout linearLayout2 = newCountryCodeUI.f210124r;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        if (!kotlin.jvm.internal.o.b(str, newCountryCodeUI.f210130x)) {
                            android.widget.TextView textView2 = newCountryCodeUI.f210125s;
                            if (textView2 != null) {
                                textView2.setTextColor(newCountryCodeUI.getColor(com.tencent.mm.R.color.ahg));
                            }
                            if (newCountryCodeUI.f210129w) {
                                newCountryCodeUI.W6(newCountryCodeUI.f210130x, com.tencent.mm.R.color.Brand_100);
                                newCountryCodeUI.f210129w = false;
                            } else {
                                newCountryCodeUI.W6(newCountryCodeUI.f210130x, com.tencent.mm.R.color.ahg);
                                newCountryCodeUI.f210130x = "";
                            }
                        } else if (newCountryCodeUI.f210129w) {
                            android.widget.TextView textView3 = newCountryCodeUI.f210125s;
                            if (textView3 != null) {
                                textView3.setTextColor(newCountryCodeUI.getColor(com.tencent.mm.R.color.Brand_100));
                            }
                            newCountryCodeUI.f210129w = false;
                        } else {
                            android.widget.TextView textView4 = newCountryCodeUI.f210125s;
                            if (textView4 != null) {
                                textView4.setTextColor(newCountryCodeUI.getColor(com.tencent.mm.R.color.ahg));
                            }
                        }
                    }
                }
            }
            android.widget.LinearLayout linearLayout3 = newCountryCodeUI.f210124r;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar newCountryCodeAlphabetScrollBar2 = newCountryCodeUI.f210115f;
            if (newCountryCodeAlphabetScrollBar2 != null) {
                newCountryCodeAlphabetScrollBar2.e("", false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$createScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
