package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class a3 extends dm.x1 {

    /* renamed from: e2, reason: collision with root package name */
    public static final l75.e0 f193742e2 = dm.x1.initAutoDBInfo(com.tencent.mm.storage.a3.class);

    /* renamed from: a2, reason: collision with root package name */
    public final mo.a f193743a2;

    /* renamed from: b2, reason: collision with root package name */
    public mo.a f193744b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.util.List f193745c2;

    /* renamed from: d2, reason: collision with root package name */
    public final java.util.Map f193746d2;

    public a3() {
        mo.a aVar = new mo.a();
        this.f193743a2 = aVar;
        this.f193744b2 = aVar;
        this.f193745c2 = new java.util.LinkedList();
        this.f193746d2 = new java.util.concurrent.ConcurrentHashMap();
    }

    public static int T0(java.lang.String str) {
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        } catch (java.lang.Exception unused) {
            if (str == null) {
                return 0;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "parserInt error ".concat(str));
            return 0;
        }
    }

    public static java.util.List a1(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return linkedList;
        }
        for (java.lang.String str2 : str.split(";")) {
            linkedList.add(str2);
        }
        return linkedList;
    }

    public java.util.List A0() {
        java.util.List list = this.f193745c2;
        if (list == null || list.size() == 0) {
            this.f193745c2 = a1(this.field_memberlist);
        }
        return this.f193745c2;
    }

    public int D0() {
        if (I0(this.f193744b2)) {
            t0();
        }
        return this.f193744b2.f330245m;
    }

    public mo.a F0() {
        if (I0(this.f193744b2)) {
            t0();
        }
        return this.f193744b2;
    }

    public boolean G0(java.lang.String str) {
        mo.b v07 = v0(str);
        return (v07 == null || (v07.f330249f & 2048) == 0) ? false : true;
    }

    public final boolean I0(mo.a aVar) {
        return this.f193743a2.computeSize() == aVar.computeSize();
    }

    public boolean J0() {
        int i17 = this.field_openIMRoomMigrateStatus;
        return i17 == 3 || i17 == 4;
    }

    public boolean L0(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.field_roomowner) && this.field_roomowner.equals(str);
    }

    public boolean P0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_roomowner)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        if (((rv1.f) gm0.j1.s(rv1.f.class)) != null) {
            return (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).b(this.field_chatroomname) && G0(r17)) || this.field_roomowner.equals(r17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "service is null");
        return false;
    }

    public boolean Q0() {
        if (I0(this.f193744b2)) {
            t0();
        }
        mo.a aVar = this.f193744b2;
        return aVar.f330245m < aVar.f330246n;
    }

    public void R0(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.Map map;
        if (I0(this.f193744b2)) {
            t0();
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f193746d2;
            if (!hasNext) {
                break;
            }
            r45.wy wyVar = (r45.wy) it.next();
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(wyVar.f389565d)) {
                mo.b bVar = (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(wyVar.f389565d);
                bVar.f330248e = wyVar.f389567f;
                bVar.f330249f = wyVar.f389570i;
                bVar.f330250g = wyVar.f389571m;
            } else if (list2 != null && list2.contains(wyVar.f389565d)) {
                mo.b bVar2 = new mo.b();
                java.lang.String str2 = wyVar.f389565d;
                bVar2.f330247d = str2;
                bVar2.f330250g = wyVar.f389571m;
                bVar2.f330249f = wyVar.f389570i;
                bVar2.f330248e = wyVar.f389567f;
                ((java.util.concurrent.ConcurrentHashMap) map).put(str2, bVar2);
            }
        }
        this.f193744b2.f330239d.clear();
        for (java.lang.String str3 : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            if (list2 == null || list2.contains(str3)) {
                mo.b bVar3 = (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str3);
                if (list3 != null) {
                    if (list3.contains(str3)) {
                        bVar3.f330249f |= 2048;
                    } else {
                        bVar3.f330249f &= -2049;
                    }
                }
                this.f193744b2.f330239d.add(bVar3);
            }
        }
        Z0(str, this.f193744b2, false);
    }

    public com.tencent.mm.storage.a3 U0(java.util.List list) {
        java.lang.String str = "";
        if (list != null && list.size() != 0) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                str = str + ((java.lang.String) list.get(i17));
                if (i17 < list.size() - 1) {
                    str = str + ";";
                }
            }
        }
        this.field_memberlist = str;
        return this;
    }

    public void W0(int i17) {
        if (I0(this.f193744b2)) {
            t0();
        }
        mo.a aVar = this.f193744b2;
        aVar.f330245m = i17;
        try {
            this.field_roomdata = aVar.toByteArray();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public com.tencent.mm.storage.a3 Y0(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        mo.a aVar = new mo.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            int indexOf = str2.indexOf(60);
            if (indexOf > 0) {
                str2 = str2.substring(indexOf);
            }
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "RoomData", null);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "parse RoomData failed");
                aVar = null;
            } else {
                int i17 = 0;
                while (true) {
                    try {
                        mo.b bVar = new mo.b();
                        if (i17 == 0) {
                            str3 = ".RoomData.Member.$UserName";
                            str4 = ".RoomData.Member.DisplayName";
                            str5 = ".RoomData.Member.Flag";
                        } else if (i17 != 0) {
                            str3 = ".RoomData.Member" + i17 + ".$UserName";
                            str4 = ".RoomData.Member" + i17 + ".DisplayName";
                            str5 = ".RoomData.Member" + i17 + ".Flag";
                        } else {
                            str3 = null;
                            str4 = null;
                            str5 = null;
                        }
                        java.lang.String str7 = (java.lang.String) d17.get(str3);
                        str6 = "";
                        if (str7 == null) {
                            str7 = "";
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                            break;
                        }
                        bVar.f330247d = str7;
                        java.lang.String str8 = (java.lang.String) d17.get(str4);
                        if (str8 != null) {
                            str6 = str8;
                        }
                        bVar.f330248e = str6;
                        bVar.f330249f = T0((java.lang.String) d17.get(str5));
                        aVar.f330239d.add(bVar);
                        i17++;
                    } catch (java.lang.Exception unused) {
                    }
                }
                aVar.f330241f = T0((java.lang.String) d17.get(".RoomData.Type"));
                aVar.f330242g = T0((java.lang.String) d17.get(".RoomData.Status"));
                aVar.f330243h = T0((java.lang.String) d17.get(".RoomData.MaxCount"));
                java.lang.String str9 = (java.lang.String) d17.get(".RoomData.ExtInfo.Upgrader");
                if (str9 != null) {
                    str6 = str9;
                }
                aVar.f330244i = str6;
            }
        }
        Z0(str, aVar, false);
        return this;
    }

    public com.tencent.mm.storage.a3 Z0(java.lang.String str, mo.a aVar, boolean z17) {
        int i17;
        this.field_modifytime = java.lang.System.currentTimeMillis();
        if (!z17) {
            java.util.Iterator it = aVar.f330239d.iterator();
            mo.b bVar = null;
            while (it.hasNext()) {
                mo.b bVar2 = (mo.b) it.next();
                java.lang.String str2 = bVar2.f330247d;
                if (str2 != null && str2.equals(str)) {
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                this.field_selfDisplayName = bVar.f330248e;
                i17 = bVar.f330249f;
                this.field_isShowname = i17 & 1;
            } else {
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomMember", "displayName[%s] roomFlag[%d] flag[%d]", this.field_selfDisplayName, java.lang.Integer.valueOf(this.field_chatroomdataflag), java.lang.Integer.valueOf(i17));
            int i18 = (i17 & 2) | (aVar.f330240e & (-3));
            aVar.f330240e = i18;
            this.field_chatroomdataflag = i18;
        }
        try {
            this.field_roomdata = aVar.toByteArray();
            this.f193744b2 = aVar;
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        u0(aVar);
        return this;
    }

    @Override // dm.x1, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
    }

    @Override // dm.x1, l75.f0
    public l75.e0 getDBInfo() {
        return f193742e2;
    }

    public final void t0() {
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.field_roomdata)) {
            return;
        }
        try {
            this.f193744b2 = (mo.a) new mo.a().parseFrom(this.field_roomdata);
        } catch (java.lang.Exception unused) {
            this.f193744b2 = new mo.a();
        }
        u0(this.f193744b2);
    }

    public final void u0(mo.a aVar) {
        java.lang.String str;
        if (this.field_roomdata == null) {
            aVar = new mo.a();
        }
        java.util.Iterator it = aVar.f330239d.iterator();
        while (it.hasNext()) {
            mo.b bVar = (mo.b) it.next();
            if (bVar != null && (str = bVar.f330247d) != null) {
                ((java.util.concurrent.ConcurrentHashMap) this.f193746d2).put(str, bVar);
            }
        }
    }

    public mo.b v0(java.lang.String str) {
        java.util.Map map = this.f193746d2;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomMember", "getChatroomData hashMap is null!");
            return null;
        }
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            t0();
        }
        return (mo.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
    }

    public int w0() {
        if (I0(this.f193744b2)) {
            t0();
        }
        return this.f193744b2.f330243h;
    }

    public int y0() {
        if (I0(this.f193744b2)) {
            t0();
        }
        return this.f193744b2.f330241f;
    }

    public java.lang.String z0(java.lang.String str) {
        mo.b v07 = v0(str);
        if (v07 == null) {
            return "";
        }
        java.lang.String str2 = v07.f330248e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }
}
