package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.uic.r f162012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.setting.ui.setting_new.uic.r rVar) {
        super(1);
        this.f162012d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r24.d state = (r24.d) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof r24.c)) {
            r24.c cVar = (r24.c) dVar;
            com.tencent.mm.plugin.setting.ui.setting_new.uic.r rVar = this.f162012d;
            ((java.util.ArrayList) rVar.f162015g).clear();
            java.util.List list = rVar.f162015g;
            ((java.util.ArrayList) list).addAll(cVar.f368850c);
            rVar.U6(new c24.b(list, rVar.getActivity()));
            java.lang.String str = cVar.f368849b;
            rVar.f162013e = str;
            rVar.f162014f = cVar.f368851d;
            jz5.l[] lVarArr = new jz5.l[4];
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("search_word", str);
            lVarArr[1] = new jz5.l("setting_sessionid", u24.n.b());
            java.lang.String str2 = rVar.f162014f;
            lVarArr[2] = new jz5.l("search_query_id", str2 != null ? str2 : "");
            lVarArr[3] = new jz5.l("ui_version", 2);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.Integer REPORT_RULE = b24.a.f17394a;
            kotlin.jvm.internal.o.f(REPORT_RULE, "REPORT_RULE");
            ((cy1.a) rVar2).Ej("setting_search_query_end", l17, REPORT_RULE.intValue());
            if (((java.util.ArrayList) list).isEmpty()) {
                android.view.View findViewById = rVar.findViewById(com.tencent.mm.R.id.t86);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "showEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "showEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById2 = rVar.findViewById(com.tencent.mm.R.id.t86);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "hideEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting_new/uic/SearchListUIC", "hideEmptyText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
