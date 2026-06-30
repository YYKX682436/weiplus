package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class z9 extends l75.n0 implements st0.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f196407f = {l75.n0.getCreateSQLs(st0.g.A, "NotifyMessageRecord")};

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f196408g = false;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f196409d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f196410e;

    public z9(l75.k0 k0Var) {
        super(k0Var, st0.g.A, "NotifyMessageRecord", null);
        this.f196409d = k0Var;
        this.f196410e = te5.s1.f418747a.a();
    }

    public int D0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM NotifyMessageRecord WHERE talker = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        android.database.Cursor B = this.f196409d.B(sb6.toString(), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public int J0(java.lang.String str, long j17, long j18) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM NotifyMessageRecord WHERE talker = '");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        java.lang.String str3 = "";
        if (j17 > 0) {
            str2 = " AND createTime >= " + j17;
        } else {
            str2 = "";
        }
        sb6.append(str2);
        if (j18 > 0) {
            str3 = " AND createTime <= " + j18;
        }
        sb6.append(str3);
        android.database.Cursor B = this.f196409d.B(sb6.toString(), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public android.database.Cursor L0(java.lang.String str) {
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT WX_CONTACT.nickname, NOTIFY_RECORD.talker, COUNT(NOTIFY_RECORD.msgId) FROM NotifyMessageRecord AS NOTIFY_RECORD LEFT JOIN rcontact AS WX_CONTACT ON NOTIFY_RECORD.talker = WX_CONTACT.username WHERE NOTIFY_RECORD.talker != 'notifymessage'");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                sb6.append(" AND WX_CONTACT.nickname LIKE '%");
                sb6.append(str);
                sb6.append("%'");
            }
            if (this.f196410e) {
                sb6.append(" AND NOTIFY_RECORD.is_special_talker != 1");
            }
            sb6.append(" GROUP BY NOTIFY_RECORD.talker");
            android.database.Cursor B = this.f196409d.B(sb6.toString(), null);
            if (B != null) {
                B.moveToFirst();
                return B;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e17.toString());
        }
        return null;
    }

    public java.lang.String P0(com.tencent.mm.storage.f9 f9Var) {
        if (this.f196410e) {
            java.util.Map c17 = cm5.k.c(f9Var);
            int type = f9Var.getType();
            java.lang.String str = type == 721420337 ? "offline_scan_result" : "";
            if (android.text.TextUtils.isEmpty(str)) {
                str = cm5.k.a(type, c17, false);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyMessageRecordStorage", "not template message, can't find username field from content");
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 != null ? str2 : "";
    }

    public boolean W0(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        st0.g gVar = new st0.g();
        gVar.field_msgId = f9Var.getMsgId();
        gVar.field_talker = f9Var.Q0();
        if (this.f196410e) {
            cm5.j.c(gVar, f9Var);
        }
        gVar.field_createTime = f9Var.getCreateTime();
        gVar.field_digest = str;
        return super.insert(gVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(4:2|3|4|5)|(10:7|(1:9)|10|11|(5:13|(1:15)|(1:17)|18|19)|22|(0)|(0)|18|19)|26|(0)|10|11|(0)|22|(0)|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getNotifyMessageRecordCount] exception %s", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #1 {Exception -> 0x004a, blocks: (B:11:0x0036, B:13:0x0045), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b1() {
        /*
            r7 = this;
            l75.k0 r0 = r7.f196409d
            java.lang.String r1 = "MicroMsg.NotifyMessageRecordStorage"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "notifymessage"
            com.tencent.mm.sdk.platformtools.t8.n(r4)     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = "SELECT COUNT(*) FROM message WHERE talker = 'notifymessage'"
            android.database.Cursor r4 = r0.B(r4, r2)     // Catch: java.lang.Exception -> L21
            r4.moveToFirst()     // Catch: java.lang.Exception -> L1f
            boolean r5 = r4.moveToLast()     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L30
            int r5 = r4.getInt(r3)     // Catch: java.lang.Exception -> L1f
            goto L31
        L1f:
            r5 = move-exception
            goto L23
        L21:
            r5 = move-exception
            r4 = r2
        L23:
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "dz[getNotifyMessageCount] exception %s"
            com.tencent.mars.xlog.Log.w(r1, r6, r5)
        L30:
            r5 = r3
        L31:
            if (r4 == 0) goto L36
            r4.close()
        L36:
            java.lang.String r4 = "SELECT COUNT(*) FROM NotifyMessageRecord"
            android.database.Cursor r2 = r0.B(r4, r2)     // Catch: java.lang.Exception -> L4a
            r2.moveToFirst()     // Catch: java.lang.Exception -> L4a
            boolean r0 = r2.moveToLast()     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L58
            int r0 = r2.getInt(r3)     // Catch: java.lang.Exception -> L4a
            goto L59
        L4a:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "dz[getNotifyMessageRecordCount] exception %s"
            com.tencent.mars.xlog.Log.w(r1, r4, r0)
        L58:
            r0 = r3
        L59:
            if (r2 == 0) goto L5e
            r2.close()
        L5e:
            if (r5 == r0) goto L61
            r3 = 1
        L61:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "need sync record: %b"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.z9.b1():boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(2:7|8)|(12:10|(1:12)|(3:13|(1:15)|16)|19|20|(1:22)|23|24|25|26|27|28)|37|(1:39)|40|24|25|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[deleteUnreachableRecord] exception %s", r0.toString());
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[syncMsgNotInRecord] exception %s", r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d1() {
        /*
            r11 = this;
            boolean r0 = com.tencent.mm.storage.z9.f196408g
            r1 = 0
            java.lang.String r2 = "MicroMsg.NotifyMessageRecordStorage"
            if (r0 == 0) goto Ld
            java.lang.String r0 = "sync is running"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r1
        Ld:
            java.lang.String r0 = "syncRecord"
            com.tencent.mars.xlog.Log.i(r2, r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0 = 1
            com.tencent.mm.storage.z9.f196408g = r0
            l75.k0 r5 = r11.f196409d
            java.lang.String r6 = "notifymessage"
            java.lang.String r7 = "sync msg not in record start"
            com.tencent.mars.xlog.Log.i(r2, r7)
            r7 = 0
            com.tencent.mm.sdk.platformtools.t8.n(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r8 = "SELECT * FROM message AS MESSAGE LEFT JOIN (SELECT msgId AS NOTIFY_RECORD_msgId FROM NotifyMessageRecord) AS NOTIFY_RECORD ON MESSAGE.msgId = NOTIFY_RECORD.NOTIFY_RECORD_msgId WHERE MESSAGE.talker = 'notifymessage' AND NOTIFY_RECORD.NOTIFY_RECORD_msgId IS NULL"
            android.database.Cursor r7 = r5.B(r8, r7)     // Catch: java.lang.Exception -> L72
            if (r7 == 0) goto L66
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Exception -> L72
            if (r8 != 0) goto L37
            goto L66
        L37:
            com.tencent.mm.storage.f9 r8 = new com.tencent.mm.storage.f9     // Catch: java.lang.Exception -> L72
            r8.<init>()     // Catch: java.lang.Exception -> L72
            r8.convertFrom(r7)     // Catch: java.lang.Exception -> L72
            dm.m8 r8 = r11.f1(r8)     // Catch: java.lang.Exception -> L72
            st0.g r8 = (st0.g) r8     // Catch: java.lang.Exception -> L72
            if (r8 == 0) goto L4a
            r11.insertNotify(r8, r1)     // Catch: java.lang.Exception -> L72
        L4a:
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Exception -> L72
            if (r8 != 0) goto L37
            java.lang.String r8 = "sync row: %d"
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L63
            int r10 = r7.getCount()     // Catch: java.lang.Exception -> L63
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L63
            r9[r1] = r10     // Catch: java.lang.Exception -> L63
            com.tencent.mars.xlog.Log.i(r2, r8, r9)     // Catch: java.lang.Exception -> L63
            r9 = r0
            goto L81
        L63:
            r8 = move-exception
            r9 = r0
            goto L74
        L66:
            java.lang.String r8 = "sync with no record"
            com.tencent.mars.xlog.Log.i(r2, r8)     // Catch: java.lang.Exception -> L72
            if (r7 == 0) goto L70
            r7.close()     // Catch: java.lang.Exception -> L72
        L70:
            r9 = r0
            goto L8b
        L72:
            r8 = move-exception
            r9 = r1
        L74:
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r10 = "dz[syncMsgNotInRecord] exception %s"
            com.tencent.mars.xlog.Log.w(r2, r10, r8)
        L81:
            if (r7 == 0) goto L86
            r7.close()
        L86:
            java.lang.String r7 = "sync msg not in record finish"
            com.tencent.mars.xlog.Log.i(r2, r7)
        L8b:
            java.lang.String r7 = "delete unreachable record start"
            com.tencent.mars.xlog.Log.i(r2, r7)
            com.tencent.mm.sdk.platformtools.t8.n(r6)     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "NotifyMessageRecord"
            java.lang.String r7 = "DELETE FROM NotifyMessageRecord WHERE msgId IN (SELECT NotifyMessageRecord.msgId FROM NotifyMessageRecord LEFT JOIN message ON NotifyMessageRecord.msgId = message.msgId WHERE message.talker IS NULL OR message.talker != 'notifymessage')"
            r5.A(r6, r7)     // Catch: java.lang.Exception -> L9b
            goto Laa
        L9b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = "dz[deleteUnreachableRecord] exception %s"
            com.tencent.mars.xlog.Log.w(r2, r5, r0)
            r0 = r1
        Laa:
            java.lang.String r5 = "delete unreachable record finish"
            com.tencent.mars.xlog.Log.i(r2, r5)
            r0 = r0 & r9
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "handle msg info done, cost: %d"
            com.tencent.mars.xlog.Log.i(r2, r4, r3)
            com.tencent.mm.storage.z9.f196408g = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.z9.d1():boolean");
    }

    public dm.m8 f1(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyMessageRecordStorage", "translate origin msgInfo to target record, origin msgInfo is null");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyMessageRecordStorage", "talker is null");
            return null;
        }
        java.lang.String P0 = P0(f9Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyMessageRecordStorage", "username is null or nil");
        }
        st0.g gVar = new st0.g();
        gVar.field_msgId = f9Var.getMsgId();
        gVar.field_createTime = f9Var.getCreateTime();
        gVar.field_talker = P0;
        if (this.f196410e) {
            cm5.j.c(gVar, f9Var);
        }
        gVar.field_digest = z0(f9Var);
        return gVar;
    }

    public boolean i1(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        st0.g gVar = new st0.g();
        gVar.field_msgId = f9Var.getMsgId();
        gVar.field_talker = f9Var.Q0();
        if (this.f196410e) {
            cm5.j.c(gVar, f9Var);
        }
        gVar.field_createTime = f9Var.getCreateTime();
        gVar.field_digest = str;
        return super.update(gVar, new java.lang.String[0]);
    }

    public boolean y0(com.tencent.mm.storage.f9 f9Var) {
        st0.g gVar = new st0.g();
        gVar.field_msgId = f9Var.getMsgId();
        return super.delete(gVar, new java.lang.String[0]);
    }

    public java.lang.String z0(com.tencent.mm.storage.f9 f9Var) {
        if (this.f196410e) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.List list = cm5.k.f43440a;
            java.lang.String str = null;
            if (f9Var != null) {
                str = ((cm5.f) cm5.k.f43441b).a(android.text.TextUtils.isEmpty(f9Var.j()) ? null : com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null), f9Var.getType(), context);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return qm.a0.d(f9Var, new com.tencent.mm.pointers.PString(), new com.tencent.mm.pointers.PString(), new com.tencent.mm.pointers.PInt(), false);
    }
}
