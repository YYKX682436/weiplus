package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class y2 implements com.tencent.mm.ui.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.k3 f212572a;

    public y2(com.tencent.mm.ui.k3 k3Var) {
        this.f212572a = k3Var;
    }

    @Override // com.tencent.mm.ui.g3
    public void a() {
        boolean z17;
        android.util.SparseArray[] sparseArrayArr;
        android.database.Cursor B;
        android.util.SparseArray[] n17;
        com.tencent.mm.ui.k3 k3Var = this.f212572a;
        java.util.HashMap hashMap = k3Var.f209020g;
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.e(k3Var.f209017d, "events is null");
            return;
        }
        for (com.tencent.mm.ui.e3 e3Var : hashMap.values()) {
            if (e3Var == null || e3Var.f208362b == 5) {
                if (e3Var == null) {
                }
            }
            z17 = false;
        }
        z17 = true;
        if (z17) {
            java.util.HashSet hashSet = new java.util.HashSet(k3Var.f209020g.size());
            java.util.Iterator it = k3Var.f209020g.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.tencent.mm.ui.e3) it.next()).f208361a);
            }
            com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor all event is delete, event:%s", java.lang.Integer.valueOf(k3Var.f209020g.size()));
            k3Var.f209019f.f250438a.t(hashSet.toArray(), null);
        } else if (k3Var.f209020g.containsKey(null)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k3Var.m(k3Var.h(k3Var.f()), true, false);
            com.tencent.mars.xlog.Log.i(k3Var.f209017d, "cache unuseful,reset cursor,last : %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.ui.f3 f3Var = k3Var.f209019f;
            if (f3Var == null || (n17 = f3Var.f250438a.n1()) == null) {
                sparseArrayArr = null;
            } else {
                int length = n17.length;
                sparseArrayArr = new android.util.SparseArray[length];
                for (int i17 = 0; i17 < length; i17++) {
                    sparseArrayArr[i17] = new android.util.SparseArray();
                    for (int i18 = 0; i18 < n17[i17].size(); i18++) {
                        sparseArrayArr[i17].put(i18, n17[i17].get(i18));
                    }
                }
            }
            new java.util.HashSet(k3Var.f209020g.values());
            com.tencent.mm.ui.contact.e eVar = (com.tencent.mm.ui.contact.e) k3Var;
            android.util.SparseArray[] sparseArrayArr2 = new android.util.SparseArray[sparseArrayArr.length];
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("weixin");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
            java.util.List list = eVar.f206674x;
            boolean u17 = eVar.u();
            com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) q17;
            java.lang.String str = "select username from rcontact " + k4Var.I(eVar.f206672v, eVar.f206673w, list) + k4Var.N(linkedList) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
            l75.k0 k0Var = k4Var.f195071d;
            if (u17) {
                e95.h[] hVarArr = new e95.h[2];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select username from rcontact ");
                sb6.append(k4Var.F(list, eVar.f206671J));
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
                sb6.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
                android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 4);
                android.database.Cursor f18 = k0Var.f(str, null, 4);
                if ((f17 instanceof e95.h) && (f18 instanceof e95.h)) {
                    hVarArr[0] = (e95.h) f17;
                    hVarArr[1] = (e95.h) f18;
                    B = new e95.j(hVarArr);
                } else {
                    B = d95.d.a();
                }
            } else {
                B = k0Var.B(str, null);
            }
            if (B instanceof e95.j) {
                e95.h[] hVarArr2 = ((e95.j) B).f250423f;
                int length2 = hVarArr2.length;
                for (int i19 = 0; i19 < length2; i19++) {
                    hVarArr2[i19].u1(5000);
                    sparseArrayArr2[i19] = new android.util.SparseArray();
                    int i27 = 0;
                    while (hVarArr2[i19].moveToNext()) {
                        sparseArrayArr2[i19].put(i27, hVarArr2[i19].getString(0));
                        i27++;
                    }
                }
                eVar.H = hVarArr2[0].getCount();
            } else {
                int i28 = 0;
                sparseArrayArr2[0] = new android.util.SparseArray();
                int i29 = 0;
                while (B.moveToNext()) {
                    sparseArrayArr2[i28].put(i29, B.getString(i28));
                    i29++;
                    i28 = 0;
                }
            }
            B.close();
            java.lang.System.currentTimeMillis();
            int length3 = sparseArrayArr.length;
            if (length3 > 1) {
                for (int i37 = 0; i37 < length3; i37++) {
                    com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(sparseArrayArr[i37].size()), java.lang.Integer.valueOf(sparseArrayArr2[i37].size()));
                }
            } else {
                com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), java.lang.Integer.valueOf(sparseArrayArr[0].size()), java.lang.Integer.valueOf(sparseArrayArr2[0].size()));
            }
            for (com.tencent.mm.ui.e3 e3Var2 : k3Var.f209020g.values()) {
                if (e3Var2 != null) {
                    java.lang.Object obj = e3Var2.f208361a;
                    java.lang.Object obj2 = e3Var2.f208363c;
                    if (obj2 != null) {
                        com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor notify cache update : key : %s ", obj);
                    }
                    k3Var.f209019f.f250438a.t(obj, (e95.a) obj2);
                } else {
                    com.tencent.mars.xlog.Log.e(k3Var.f209017d, "newcursor event is null ! ");
                }
            }
            android.util.SparseArray[] n18 = k3Var.f209019f.f250438a.n1();
            for (int i38 = 0; i38 < n18.length; i38++) {
                n18[i38].clear();
                for (int i39 = 0; i39 < sparseArrayArr2[i38].size(); i39++) {
                    n18[i38].put(i39, sparseArrayArr2[i38].get(i39));
                }
            }
            com.tencent.mars.xlog.Log.i(k3Var.f209017d, "newcursor after resort new pos size:%d, event:%s", java.lang.Integer.valueOf(k3Var.f209019f.f250438a.n1()[0].size()), java.lang.Integer.valueOf(k3Var.f209020g.size()));
        }
        k3Var.f209020g.clear();
    }
}
