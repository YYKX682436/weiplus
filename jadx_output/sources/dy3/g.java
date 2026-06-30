package dy3;

/* loaded from: classes.dex */
public final class g implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f244579d;

    public g(dy3.n nVar) {
        this.f244579d = nVar;
    }

    @Override // db5.o9
    public final void Q0(java.lang.String str) {
        dy3.n nVar = this.f244579d;
        if (!kotlin.jvm.internal.o.b(nVar.A, str)) {
            kotlin.jvm.internal.o.d(str);
            nVar.A = str;
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, "🔍");
        jz5.g gVar = nVar.f244594z;
        if (b17) {
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        java.util.Iterator it = nVar.K().f152065o.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dy3.p pVar = (dy3.p) next;
            if (kotlin.jvm.internal.o.b(pVar.f244601m, str) && pVar.f244599h) {
                com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager2 = (com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(wxLinearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                wxLinearLayoutManager2.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(wxLinearLayoutManager2, "com/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneDialog$initContentView$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            i17 = i18;
        }
    }
}
