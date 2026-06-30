package com.tencent.mm.view.ratio;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.view.ratio.RatioLayout f213706a;

    public com.tencent.mm.view.ratio.RatioLayout a() {
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f213706a;
        if (ratioLayout != null) {
            return ratioLayout;
        }
        kotlin.jvm.internal.o.o("layout");
        throw null;
    }

    public void b() {
        hn5.c adapter = a().getAdapter();
        int a17 = adapter.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        for (int i18 = 0; i18 < a17; i18++) {
            hn5.b e17 = adapter.e(i18);
            arrayList.add(adapter.c(i18, adapter.b(i18)));
            arrayList2.add(e17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiAreaLayoutManager", "addView index:" + i18 + " layoutInfo:" + e17);
        }
        a().removeAllViews();
        if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiAreaLayoutManager", "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) next;
            if (view.getParent() != null) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            adapter.g(i17, view);
            com.tencent.mm.view.ratio.RatioLayout a18 = a();
            com.tencent.mm.view.ratio.RatioLayout.LayoutParams layoutParams = new com.tencent.mm.view.ratio.RatioLayout.LayoutParams(-1, -1);
            layoutParams.f213705a = (hn5.b) arrayList2.get(i17);
            a18.addView(view, layoutParams);
            i17 = i19;
        }
    }
}
