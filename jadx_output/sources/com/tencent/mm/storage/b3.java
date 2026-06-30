package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class b3 extends l75.n0 implements c01.b8 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193768e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.a3.f193742e2, "chatroom")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f193769f = {"CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193770d;

    public b3(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.a3.f193742e2, "chatroom", f193769f);
        this.f193770d = k0Var;
    }

    public java.lang.String D0(java.lang.String str) {
        com.tencent.mm.storage.a3 a3Var;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select memberlist from chatroom where chatroomname='");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = this.f193770d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var = new com.tencent.mm.storage.a3();
            a3Var.convertFrom(f17);
        } else {
            a3Var = null;
        }
        f17.close();
        if (a3Var == null) {
            return null;
        }
        return a3Var.field_memberlist;
    }

    public int J0(java.lang.String str) {
        l75.k0 k0Var = this.f193770d;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select memberCount from chatroom where chatroomname='");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(str);
            sb6.append("'");
            com.tencent.mm.storage.a3 a3Var = null;
            android.database.Cursor f17 = k0Var.f(sb6.toString(), null, 2);
            if (f17.moveToFirst()) {
                a3Var = new com.tencent.mm.storage.a3();
                a3Var.convertFrom(f17);
            }
            f17.close();
            if (a3Var == null) {
                return 0;
            }
            if (a3Var.field_memberCount < 0) {
                java.lang.String D0 = D0(str);
                int length = (D0 != null ? D0.split(";") : new java.lang.String[0]).length;
                a3Var.field_memberCount = length;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update chatroom set memberCount = ");
                sb7.append(length);
                sb7.append(" where chatroomname = '");
                com.tencent.mm.sdk.platformtools.t8.n(str);
                sb7.append(str);
                sb7.append("'");
                k0Var.A("chatroom", sb7.toString());
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomStorage", "[getMemberCount] init field_memberCount! username:%s count:%s", str, java.lang.Integer.valueOf(length));
            }
            return a3Var.field_memberCount;
        } finally {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public java.util.List L0(java.lang.String str) {
        java.lang.String D0 = D0(str);
        if (D0 == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!D0.equals("")) {
            for (java.lang.String str2 : D0.split(";")) {
                linkedList.add(str2);
            }
        }
        return linkedList;
    }

    public java.util.List P0(int i17) {
        p75.n0 n0Var = dm.x1.N;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.x1.Q);
        p75.m c17 = dm.x1.S.j(c01.z1.r()).c(dm.x1.U.x(java.lang.Integer.valueOf(i17)));
        p75.i0 g17 = dm.x1.N.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.List k17 = g17.a().k(this.f193770d, dm.x1.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            arrayList.add(((dm.x1) it.next()).field_chatroomname);
        }
        return arrayList;
    }

    public com.tencent.mm.storage.a3 W0(java.lang.String str) {
        com.tencent.mm.storage.a3 a3Var = new com.tencent.mm.storage.a3();
        a3Var.field_chatroomname = str;
        super.get(a3Var, "chatroomname");
        return a3Var;
    }

    @Override // l75.n0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean replace(com.tencent.mm.storage.a3 a3Var, boolean z17) {
        if (a3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomStorage", "replace error(item == null)");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a3Var.field_chatroomname)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomStorage", "replace error,item.field_chatroomname is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select rowid,chatroomname from chatroom where chatroomname='");
        java.lang.String str = a3Var.field_chatroomname;
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        com.tencent.mm.storage.a3 a3Var2 = null;
        android.database.Cursor f17 = this.f193770d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var2 = new com.tencent.mm.storage.a3();
            a3Var2.convertFrom(f17);
        }
        f17.close();
        if (a3Var2 == null) {
            return insertNotify(a3Var, z17);
        }
        long j17 = a3Var2.systemRowid;
        a3Var.systemRowid = j17;
        return update(j17, a3Var, z17);
    }

    public java.lang.String getDisplayName(java.lang.String str) {
        com.tencent.mm.storage.a3 a3Var;
        iz5.a.g(null, str.length() > 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select displayname from chatroom where chatroomname='");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor f17 = this.f193770d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var = new com.tencent.mm.storage.a3();
            a3Var.convertFrom(f17);
        } else {
            a3Var = null;
        }
        f17.close();
        if (a3Var == null) {
            return null;
        }
        return a3Var.field_displayname;
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) f0Var;
        if (replace(a3Var, true)) {
            doNotify(a3Var.field_chatroomname, 4, a3Var);
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomStorage", "replace error");
        return false;
    }

    public boolean y0(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f193770d.delete("chatroom", "chatroomname=?", new java.lang.String[]{str}) == 0) {
            return false;
        }
        doNotify(str, 5, str);
        return true;
    }

    public com.tencent.mm.storage.a3 z0(java.lang.String str) {
        com.tencent.mm.storage.a3 a3Var = new com.tencent.mm.storage.a3();
        a3Var.field_chatroomname = str;
        if (super.get(a3Var, "chatroomname")) {
            return a3Var;
        }
        return null;
    }
}
