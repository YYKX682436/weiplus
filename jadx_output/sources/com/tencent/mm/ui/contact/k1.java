package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f206983a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f206984b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f206985c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f206986d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f206987e;

    public void a(java.util.List list) {
        if (this.f206983a != null) {
            if (this.f206984b != null) {
                if (list.contains(c01.z1.r())) {
                    list.remove(c01.z1.r());
                }
                this.f206985c = f(this.f206984b, list);
                return;
            }
            return;
        }
        if (list.contains(c01.z1.r())) {
            list.remove(c01.z1.r());
        }
        com.tencent.mm.ui.contact.j6.a(list);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.ui.contact.j6.f206960b = linkedList;
        linkedList.addAll(list);
        java.util.List b17 = b(list);
        this.f206984b = b17;
        if (((java.util.LinkedList) b17).size() > 0) {
            this.f206983a = c(b17, list, 10);
            this.f206985c = f(this.f206984b, list);
        }
        java.util.List list2 = this.f206983a;
        if (list2 != null && list2.size() < 10 && list.size() > 1) {
            java.util.List b18 = b(list.subList(list.size() - 1, list.size()));
            if (((java.util.LinkedList) b18).size() > 0) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.addAll(this.f206983a);
                linkedList2.addAll(list);
                this.f206983a = c(b18, linkedList2, 10 - this.f206983a.size());
            }
        }
        java.util.List list3 = this.f206983a;
        if (list3 != null) {
            com.tencent.mm.ui.contact.j6.f206961c = list3.subList(0, list3.size() <= 6 ? this.f206983a.size() : 6);
        }
    }

    public final java.util.List b(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list.size() == 0) {
            return linkedList;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = list.iterator();
        java.lang.String str = "select chatroomname,memberlist from chatroom where memberCount < 50 ";
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(" and memberlist like \"%");
            com.tencent.mm.sdk.platformtools.t8.n(str2);
            sb6.append(str2);
            sb6.append("%\" ");
            str = sb6.toString();
        }
        android.database.Cursor B = gm0.j1.u().f273153f.B(str, null);
        while (B.moveToNext()) {
            com.tencent.mm.storage.a3 a3Var = new com.tencent.mm.storage.a3();
            a3Var.convertFrom(B);
            linkedList.add(a3Var);
        }
        B.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRecommendHelper", "getChatroomByMembername cnt:%d time:%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return linkedList;
    }

    public final java.util.List c(java.util.List list, java.util.List list2, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) it.next();
            if (((java.util.HashMap) this.f206987e).get(a3Var.field_chatroomname) != null) {
                boolean L0 = a3Var.L0(r17);
                for (java.lang.String str : a3Var.A0()) {
                    if (hashMap.get(str) != null) {
                        r6 = (L0 ? 2 : 1) + ((java.lang.Integer) hashMap.get(str)).intValue();
                    }
                    hashMap.put(str, java.lang.Integer.valueOf(r6));
                }
            }
        }
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            hashMap.remove((java.lang.String) it6.next());
        }
        hashMap.remove(r17);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.entrySet());
        java.util.Collections.sort(arrayList, new com.tencent.mm.ui.contact.h1(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            linkedList.add((java.lang.String) ((java.util.Map.Entry) it7.next()).getKey());
        }
        if (linkedList.size() <= i17) {
            i17 = linkedList.size();
        }
        return linkedList.subList(0, i17);
    }

    public android.database.Cursor d() {
        gm0.j1.i();
        android.database.Cursor D = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().D();
        java.util.List list = this.f206983a;
        if (list == null || list.size() <= 0) {
            return D;
        }
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.util.List list2 = this.f206983a;
        Bi.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where (type & 1!=0) and type & 32=0   and ( ");
        l75.e0 e0Var = com.tencent.mm.contact.s.G2;
        sb6.append(Bi.P(list2));
        sb6.append(" ) ");
        java.lang.String str = sb6.toString() + " order by case username ";
        for (int i17 = 0; i17 < list2.size(); i17++) {
            str = str + " when '" + ((java.lang.String) list2.get(i17)) + "' then " + i17;
        }
        return Bi.f195071d.B((str + " end ") + " limit 6", null);
    }

    public void e(java.util.List list) {
        if (this.f206987e != null) {
            return;
        }
        this.f206987e = new java.util.HashMap();
        android.database.Cursor r17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().r(list, 0, 200);
        int columnIndex = r17.getColumnIndex(dm.i4.COL_USERNAME);
        int i17 = 1;
        while (r17.moveToNext()) {
            this.f206987e.put(r17.getString(columnIndex), java.lang.Integer.valueOf(i17));
            i17++;
        }
        r17.close();
    }

    public final java.util.List f(java.util.List list, java.util.List list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) it.next();
            java.util.List A0 = a3Var.A0();
            boolean z17 = true;
            if (A0.size() == list2.size() + 1) {
                java.util.Iterator it6 = A0.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it6.next();
                    if (!list2.contains(str) && !c01.z1.J(str)) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    linkedList.add(a3Var);
                }
            }
        }
        return linkedList;
    }

    public final java.util.List g(java.util.List list) {
        if (list == null || list.size() == 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList3.add(((com.tencent.mm.storage.a3) it.next()).field_chatroomname);
        }
        gm0.j1.i();
        android.database.Cursor z17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().z(linkedList3, false);
        java.util.LinkedList<com.tencent.mm.storage.z3> linkedList4 = new java.util.LinkedList();
        while (z17.moveToNext()) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(z17);
            linkedList4.add(z3Var);
        }
        z17.close();
        for (com.tencent.mm.storage.z3 z3Var2 : linkedList4) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var2.P0())) {
                linkedList2.add(z3Var2.d1());
            } else {
                linkedList.add(z3Var2.d1());
            }
        }
        java.util.Collections.sort(linkedList, new com.tencent.mm.ui.contact.i1(this));
        java.util.Collections.sort(linkedList2, new com.tencent.mm.ui.contact.j1(this));
        if (linkedList.size() == 0 && linkedList2.size() > 0) {
            return linkedList2.subList(0, 1);
        }
        if (linkedList2.size() == 0 && linkedList.size() > 0) {
            return linkedList.subList(0, linkedList.size() <= 3 ? linkedList.size() : 3);
        }
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        if (linkedList.size() > 0 && linkedList2.size() > 0) {
            for (int i17 = 0; i17 < linkedList.size() && i17 < 2; i17++) {
                linkedList5.add((java.lang.String) linkedList.get(i17));
            }
            linkedList5.add((java.lang.String) linkedList2.get(0));
        }
        return linkedList5;
    }
}
