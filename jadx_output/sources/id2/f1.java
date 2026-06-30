package id2;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(id2.v1 v1Var, java.lang.String str) {
        super(1);
        this.f290561d = v1Var;
        this.f290562e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object obj2;
        r45.s64 s64Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        id2.v1 v1Var = this.f290561d;
        android.view.View view = (android.view.View) ((jz5.n) v1Var.f290846s).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = 0;
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGetUpLevelProductRequest, errType=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errCode=");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = v1Var.f290834d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (fVar != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            android.view.View view2 = (android.view.View) ((jz5.n) v1Var.f290849v).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v1Var.T6().setVisibility(0);
            ((android.widget.TextView) ((jz5.n) v1Var.f290839i).getValue()).setEnabled(true);
            r45.qa1 qa1Var = (r45.qa1) fVar.f70618d;
            if (qa1Var == null) {
                return null;
            }
            v1Var.V6(true);
            android.view.View view3 = (android.view.View) ((jz5.n) v1Var.f290847t).getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$refreshGiftPkg$2", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i(str, "FinderGetUpLevelProductRequest, resp=" + pm0.b0.g(qa1Var));
            java.util.LinkedList list = qa1Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getItem_list(...)");
            v1Var.D = list;
            java.util.LinkedList list2 = qa1Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getProduct_meta_list(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = v1Var.E;
                if (!hasNext) {
                    break;
                }
                r45.kv1 kv1Var = (r45.kv1) it.next();
                java.lang.String string = kv1Var.getString(0);
                if (string != null) {
                    linkedHashMap.put(string, kv1Var);
                }
            }
            v1Var.F = qa1Var.getLong(3);
            java.util.LinkedList linkedList = v1Var.D;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : linkedList) {
                if (((r45.n30) obj3).getInteger(1) > 0) {
                    arrayList4.add(obj3);
                }
            }
            java.util.Iterator it6 = arrayList4.iterator();
            long j17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                r45.n30 n30Var = (r45.n30) it6.next();
                java.lang.String string2 = n30Var.getString(i17);
                r45.kv1 kv1Var2 = (r45.kv1) linkedHashMap.get(string2 != null ? string2 : "");
                if (kv1Var2 != null) {
                    com.tencent.mars.xlog.Log.i(str, "pkg_gift = " + kv1Var2.getString(8) + ", price = " + kv1Var2.getFloat(9) + ", count =" + n30Var.getInteger(1));
                }
                j17 += n30Var.getInteger(1) * (kv1Var2 != null ? kv1Var2.getFloat(9) : 0.0f);
                i17 = 0;
            }
            ((android.widget.TextView) ((jz5.n) v1Var.f290838h).getValue()).setText(java.lang.String.valueOf(j17));
            v1Var.H = j17;
            java.util.LinkedList list3 = qa1Var.getList(4);
            kotlin.jvm.internal.o.f(list3, "getLevel_config_list(...)");
            v1Var.I = list3;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("");
            for (r45.s64 s64Var2 : v1Var.I) {
                sb8.append("level(" + s64Var2.getInteger(0) + ")-coin(" + s64Var2.getLong(1) + ")\n");
            }
            com.tencent.mars.xlog.Log.i(str, "[levelConfigList] " + ((java.lang.Object) sb8));
            v1Var.f290833J = qa1Var.getLong(5);
            v1Var.K = qa1Var.getLong(6);
            long j18 = v1Var.F + j17;
            com.tencent.mars.xlog.Log.i(str, "targetConsumedCoin = " + j18 + ", giftTotalCoin = " + j17 + ", consumedCoin = " + v1Var.F);
            if (j18 <= ((r45.s64) kz5.n0.X(v1Var.I)).getLong(1)) {
                s64Var = (r45.s64) kz5.n0.X(v1Var.I);
            } else {
                java.util.LinkedList linkedList2 = v1Var.I;
                java.util.ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listIterator.previous();
                    if (j18 > ((r45.s64) obj2).getLong(1)) {
                        break;
                    }
                }
                s64Var = (r45.s64) obj2;
                if (s64Var == null) {
                    s64Var = (r45.s64) kz5.n0.i0(v1Var.I);
                }
            }
            com.tencent.mars.xlog.Log.i(str, "mTargetLevel = " + v1Var.L + ", svr told level = " + s64Var.getInteger(0));
            if (v1Var.L < s64Var.getInteger(0)) {
                v1Var.L = s64Var.getInteger(0);
                v1Var.W6(null);
            }
            ((id2.q) ((jz5.n) v1Var.B).getValue()).x();
        } else {
            java.lang.String str2 = fVar != null ? fVar.f70617c : null;
            if (str2 == null) {
                str2 = v1Var.getActivity().getString(com.tencent.mm.R.string.f491562dj4);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            }
            db5.t7.m(v1Var.getActivity(), str2);
            if (kotlin.jvm.internal.o.b(this.f290562e, "initView")) {
                v1Var.getActivity().finish();
            }
        }
        return f0Var;
    }
}
