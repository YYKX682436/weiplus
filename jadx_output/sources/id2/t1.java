package id2;

/* loaded from: classes3.dex */
public final class t1 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f290802b;

    public t1(id2.v1 v1Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f290801a = v1Var;
        this.f290802b = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        id2.v1 v1Var = this.f290801a;
        com.tencent.mars.xlog.Log.i(v1Var.f290834d, "[OnResultListener] hasSetResult:" + z17);
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f290802b;
        c0Var.B = null;
        c0Var.f212259t = null;
        c0Var.d();
        android.view.View view = (android.view.View) ((jz5.n) v1Var.f290844q).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View S6 = v1Var.S6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(S6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            java.lang.Integer num = (java.lang.Integer) v1Var.U6().get(obj);
            int intValue = num != null ? num.intValue() : 0;
            java.util.Iterator it = v1Var.I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it.next();
                    if (((r45.s64) obj3).getInteger(0) == intValue) {
                        break;
                    }
                }
            }
            r45.s64 s64Var = (r45.s64) obj3;
            if ((s64Var != null ? s64Var.getLong(1) : com.tencent.wcdb.core.Database.DictDefaultMatchValue) - v1Var.F > v1Var.f290833J) {
                db5.t7.m(v1Var.getActivity(), v1Var.getActivity().getString(com.tencent.mm.R.string.dif, ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(v1Var.f290833J)));
            } else {
                zl2.r4.f473950a.T2(3);
                v1Var.L = intValue;
                v1Var.W6(null);
                id2.v1.R6(v1Var, "showChooseTargetLevelDialog");
            }
        }
        v1Var.W6(null);
    }
}
