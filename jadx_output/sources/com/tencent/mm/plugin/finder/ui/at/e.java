package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class e implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.l f128880d;

    public e(com.tencent.mm.plugin.finder.ui.at.l lVar) {
        this.f128880d = lVar;
    }

    @Override // db5.o9
    public final void Q0(java.lang.String str) {
        com.tencent.mm.plugin.finder.ui.at.l lVar = this.f128880d;
        if (!kotlin.jvm.internal.o.b(lVar.f128895z, str)) {
            kotlin.jvm.internal.o.d(str);
            lVar.f128895z = str;
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, "🔍");
        jz5.g gVar = lVar.f128894y;
        if (b17) {
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        java.util.Iterator it = lVar.R().f152065o.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.ui.at.t tVar = (com.tencent.mm.plugin.finder.ui.at.t) next;
            if (kotlin.jvm.internal.o.b(tVar.f128908n, str) && tVar.f128906i) {
                com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager2 = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(wxLinearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                wxLinearLayoutManager2.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(wxLinearLayoutManager2, "com/tencent/mm/plugin/finder/ui/at/BaseFinderAtSomeoneDialog$initContentView$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            i17 = i18;
        }
    }
}
