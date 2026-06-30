package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class ma extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<com.tencent.mm.storage.oa> {
    public ma(n75.b bVar) {
        super(bVar);
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.na.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.na.class);
        }
        com.tencent.mm.storage.na naVar = (com.tencent.mm.storage.na) a17;
        naVar.getClass();
        naVar.O6(gm0.j1.u().h() + "ServiceNotifyDB-1.db");
    }

    public int X6() {
        int i17 = 0;
        try {
            l75.k0 Q4 = this.f193147g.Q4();
            if (Q4 != null) {
                i17 = Q4.delete("ServiceNotifyAggregationMsg", null, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ServiceNotifyAggregationMsgStorage", "clearData failed: " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "clearData delete count: " + i17);
        return i17;
    }

    public int Y6() {
        p75.n0 n0Var = dm.da.f236423n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.da.f236424o.h());
        p75.i0 g17 = dm.da.f236423n.g(linkedList);
        g17.f352657d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return g17.a().m(this.f193147g.Q4());
    }

    public int Z6() {
        p75.n0 n0Var = dm.da.f236423n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.da.f236424o.h());
        p75.m g17 = dm.da.f236426q.g(1, 1);
        p75.i0 g18 = dm.da.f236423n.g(linkedList);
        g18.f352657d = g17;
        g18.d(linkedList2);
        g18.b(linkedList3);
        return g18.a().m(this.f193147g.Q4());
    }

    public final java.lang.String a7(java.lang.String str, java.lang.String str2) {
        int indexOf;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "getDeleteItemNewClusterNote: weappMsgId " + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || (indexOf = str.indexOf(str2)) <= -1) {
            return str;
        }
        int length = str2.length() + indexOf + 1;
        boolean z17 = length >= str.length();
        if (indexOf > 1) {
            if (z17) {
                indexOf--;
            }
            str3 = str.substring(0, indexOf);
        } else {
            str3 = "";
        }
        if (!z17) {
            str3 = str3 + str.substring(length);
        }
        com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "getDeleteItemNewClusterNote: " + str3);
        return str3;
    }

    public java.util.List b7(int i17, int i18) {
        p75.n0 n0Var = dm.da.f236423n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.j0 j0Var = new p75.j0(i17, i18);
        linkedList2.add(dm.da.f236424o.u());
        p75.i0 g17 = dm.da.f236423n.g(linkedList);
        g17.f352657d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f352667a, j0Var.f352668b);
        return g17.a().k(this.f193147g.Q4(), com.tencent.mm.storage.oa.class);
    }
}
