package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class o7 extends l75.n0 implements l75.q0, xg3.y {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195201f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.m7.f195126y0, "fmessage_conversation")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f195202g = {"CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195203d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f195204e;

    public o7(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.m7.f195126y0, "fmessage_conversation", f195202g);
        this.f195204e = new com.tencent.mm.storage.n7(this);
        this.f195203d = k0Var;
    }

    public static long J0() {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.tencent.mm.repairer.config.friend.RepairerConfigAddFriendExpiredTime()) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r3.delete("fmessage_conversation", "talker = ?", new java.lang.String[]{r11}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r3.delete("fmessage_conversation", "fmsgSysRowId = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0(long r9, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            com.tencent.mm.sdk.platformtools.z3 r1 = new com.tencent.mm.sdk.platformtools.z3
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r11, r1}
            java.lang.String r1 = "MicroMsg.FMessageConversationStorage"
            java.lang.String r2 = "deleteByTalker rowId: %d, talker: %s, stack = %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r11)
            java.lang.String r2 = "fmessage_conversation"
            l75.k0 r3 = r8.f195203d
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L3d
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3c
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r6 = "fmsgSysRowId = ?"
            int r0 = r3.delete(r2, r6, r0)
            if (r0 <= 0) goto L3a
        L38:
            r0 = r4
            goto L4b
        L3a:
            r0 = r5
            goto L4b
        L3c:
            return r5
        L3d:
            java.lang.String r0 = "talker = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}
            int r0 = r3.delete(r2, r0, r6)
            if (r0 <= 0) goto L3a
            goto L38
        L4b:
            if (r0 == 0) goto L5e
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r11}
            java.lang.String r10 = "deleteByTalker success, rowId: %d, talker: %s"
            com.tencent.mars.xlog.Log.i(r1, r10, r9)
            r8.doNotify(r11)
            return r4
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.o7.D0(long, java.lang.String):boolean");
    }

    public com.tencent.mm.storage.m7 L0(java.lang.String str) {
        com.tencent.mm.storage.m7 m7Var = null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
            return null;
        }
        android.database.Cursor f17 = this.f195203d.f("select * from fmessage_conversation  where encryptTalker=" + d95.b0.O(str), null, 2);
        if (f17.moveToFirst()) {
            m7Var = new com.tencent.mm.storage.m7();
            m7Var.convertFrom(f17);
        }
        f17.close();
        return m7Var;
    }

    public com.tencent.mm.storage.m7 P0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
            return null;
        }
        com.tencent.mm.storage.m7 m7Var = new com.tencent.mm.storage.m7();
        m7Var.field_talker = str;
        if (super.get(m7Var, new java.lang.String[0])) {
            return m7Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = ".concat(str));
        return null;
    }

    public int W0() {
        android.database.Cursor f17 = this.f195203d.f(java.lang.String.format("select count(*) from %s where %s = 1 and %s < 2", "fmessage_conversation", "isNew", "fmsgIsSend"), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public int b1() {
        p75.n0 n0Var = dm.e3.f236595y;
        p75.d dVar = dm.e3.f236596z;
        p75.i0 h17 = n0Var.h(dVar.h());
        p75.y yVar = (p75.y) dm.e3.B.i(1).c(new p75.z0(dVar.z()));
        yVar.f(dm.e3.D.x(2));
        yVar.f(dm.e3.E.q(1));
        yVar.f(dm.e3.C.i(30));
        h17.f352657d = yVar;
        p75.l0 a17 = h17.a();
        android.database.Cursor B = this.f195203d.B(a17.f352636a, a17.f352637b);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public java.util.List d1(int i17) {
        p75.i0 i18 = dm.e3.f236595y.i();
        p75.y yVar = (p75.y) dm.e3.B.i(1).c(new p75.z0(dm.e3.f236596z.z()));
        yVar.f(dm.e3.D.x(2));
        yVar.f(dm.e3.E.q(1));
        yVar.f(dm.e3.C.i(30));
        i18.f352657d = yVar;
        i18.e(dm.e3.A.u());
        i18.c(i17, 0);
        return i18.a().k(this.f195203d, com.tencent.mm.storage.m7.class);
    }

    public boolean f1(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        com.tencent.mm.storage.m7 P0 = P0(str);
        if (P0 == null || !str.equals(P0.field_talker)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = ".concat(str));
            return false;
        }
        P0.field_fmsgIsHasShowSelfQRCode = 1;
        return super.update(P0, new java.lang.String[0]);
    }

    @Override // l75.n0
    public android.database.Cursor getAll() {
        return this.f195203d.B("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
    }

    @Override // l75.n0
    public int getCount() {
        android.database.Cursor f17 = this.f195203d.f("select count(*) from fmessage_conversation", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public boolean i1(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        com.tencent.mm.storage.m7 P0 = P0(str);
        if (P0 == null || !str.equals(P0.field_talker)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = ".concat(str));
            return false;
        }
        P0.field_isNew = 0;
        P0.field_fmsgIsHasShowSelfQRCode = 1;
        return super.update(P0, new java.lang.String[0]);
    }

    public boolean k1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
            return false;
        }
        com.tencent.mm.storage.m7 P0 = P0(str);
        if (P0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = ".concat(str));
            return false;
        }
        if (i17 == P0.field_state) {
            return true;
        }
        P0.field_state = i17;
        P0.field_lastModifiedTime = c01.id.c();
        if (!super.update(P0, new java.lang.String[0])) {
            return false;
        }
        doNotify(str);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0215, code lost:
    
        if (r0.field_type == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b8  */
    @Override // l75.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotifyChange(java.lang.String r20, l75.w0 r21) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.o7.onNotifyChange(java.lang.String, l75.w0):void");
    }

    public boolean y0() {
        if (this.f195203d.A("fmessage_conversation", "update fmessage_conversation set isNew = 0")) {
            doNotify();
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
        return false;
    }

    public boolean z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker fail, encryptTalker is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker() called with: encryptTalker = [%s]", str);
        if (!(this.f195203d.delete("fmessage_conversation", "encryptTalker = ?", new java.lang.String[]{str}) > 0)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker success, encryptTalker: %s", str);
        doNotify(str);
        return true;
    }
}
