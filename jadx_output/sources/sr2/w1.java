package sr2;

/* loaded from: classes10.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gd1 f411774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sr2.y2 y2Var, r45.gd1 gd1Var) {
        super(2);
        this.f411773d = y2Var;
        this.f411774e = gd1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        r45.dd1 dd1Var = (r45.dd1) obj;
        r45.dd1 dd1Var2 = (r45.dd1) obj2;
        if (dd1Var == null || (str = dd1Var.getString(3)) == null) {
            str = "";
        }
        java.lang.String string = dd1Var2 != null ? dd1Var2.getString(3) : null;
        java.lang.String str2 = string != null ? string : "";
        sr2.y2 y2Var = this.f411773d;
        y2Var.f411813t = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (dd1Var2 != null) {
            java.util.LinkedList list = dd1Var2.getList(4);
            kotlin.jvm.internal.o.f(list, "getLbs_response_list(...)");
            arrayList.addAll(list);
        }
        if (dd1Var != null) {
            java.util.LinkedList list2 = dd1Var.getList(4);
            kotlin.jvm.internal.o.f(list2, "getLbs_response_list(...)");
            arrayList.addAll(list2);
        }
        r45.gd1 curLocation = this.f411774e;
        kotlin.jvm.internal.o.g(curLocation, "curLocation");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        loop0: while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                r45.hd1 hd1Var = (r45.hd1) it.next();
                if (((r45.ad1) hd1Var.getCustom(6)) != null) {
                    r45.ad1 ad1Var = (r45.ad1) hd1Var.getCustom(6);
                    if (ad1Var != null && ad1Var.getInteger(1) == 1) {
                        z17 = true;
                    }
                } else {
                    java.lang.String string2 = hd1Var.getString(0);
                    if (!(string2 == null || string2.length() == 0)) {
                        r45.c64 c64Var = new r45.c64();
                        c64Var.f371310d = hd1Var.getString(0);
                        c64Var.f371311e = hd1Var.getString(1);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.du5 du5Var = new r45.du5();
                        du5Var.c(hd1Var.getString(3));
                        linkedList.add(du5Var);
                        c64Var.f371316m = linkedList;
                        if (z17) {
                            c64Var.A = y2Var.f411813t;
                            c64Var.f371328y = y2Var.f411811r != null ? r10.getFloat(0) : 0.0d;
                            c64Var.f371329z = y2Var.f411811r != null ? r10.getFloat(1) : 0.0d;
                        } else {
                            c64Var.A = str;
                            c64Var.f371328y = curLocation.getFloat(0);
                            c64Var.f371329z = curLocation.getFloat(1);
                        }
                        arrayList2.add(c64Var);
                    }
                }
            }
            break loop0;
        }
        if (arrayList2.isEmpty() || y2Var.U6() || y2Var.R6()) {
            ya2.p1 p1Var = y2Var.f411800d;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var).e();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGetLbsList] success，list=");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                r45.c64 c64Var2 = (r45.c64) it6.next();
                arrayList3.add(c64Var2.f371310d + '-' + c64Var2.f371311e);
            }
            sb6.append(arrayList3);
            com.tencent.mars.xlog.Log.i("PostLocationUIC", sb6.toString());
            ya2.p1 p1Var2 = y2Var.f411800d;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).e();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                y2Var.f411802f.add(new so2.d2((r45.c64) it7.next()));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = y2Var.f411801e;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("lbsRecyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = y2Var.f411801e;
            if (wxRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("lbsRecyclerView");
                throw null;
            }
            wxRecyclerView2.setVisibility(0);
        }
        if (y2Var.U6()) {
            ya2.p1 p1Var3 = y2Var.f411800d;
            if (p1Var3 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var3).a().setLocationName(y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.m1a));
        } else if (y2Var.R6() && y2Var.X6()) {
            ya2.p1 p1Var4 = y2Var.f411800d;
            if (p1Var4 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var4).a().setLocationRightTips(y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.m1_));
        }
        return jz5.f0.f302826a;
    }
}
