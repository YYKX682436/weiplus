package er1;

/* loaded from: classes9.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f256006e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f256007d;

    static {
        l75.e0 e0Var = er1.a.f256005y;
        f256006e = new java.lang.String[]{l75.n0.getCreateSQLs(er1.a.f256005y, "BizContactConversationMassSend")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, er1.a.f256005y, "BizContactConversationMassSend", dm.b1.f235793o);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = er1.a.f256005y;
        this.f256007d = db6;
    }

    public final java.lang.String D0(java.lang.String str) {
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (m07 <= 0) {
            return "";
        }
        return " createTime > " + m07 + " AND ";
    }

    public final long J0(java.lang.String talker, long j17, int i17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizContactConversationMassSendStorage", "error target inc count");
            return j17;
        }
        java.lang.String y07 = y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.lang.String concat = y07.concat(" AND createTime > ?");
        com.tencent.mm.sdk.platformtools.t8.n(talker);
        android.database.Cursor B = this.f256007d.B("SELECT createTime FROM BizContactConversationMassSend WHERE " + concat + " ORDER BY createTime ASC LIMIT " + i17, new java.lang.String[]{talker, java.lang.String.valueOf(j17)});
        if (B != null) {
            try {
                if (B.moveToLast()) {
                    j17 = B.getLong(0);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizContactConversationMassSendStorage", "get result fail, no data found");
                }
                vz5.b.a(B, null);
            } finally {
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizContactConversationMassSendStorage", "get inc msg create time error, cursor is null");
        }
        return j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int L0(java.lang.String r8, long r9, long r11) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.BizContactConversationMassSendStorage"
            java.lang.String r1 = "talker"
            kotlin.jvm.internal.o.g(r8, r1)
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r5 = r9
            r9 = r11
            r11 = r5
        Lf:
            r1 = 0
            java.lang.String r2 = r7.y0(r1)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.D0(r8)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " AND talker = ?"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L46
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.D0(r8)
            r2.append(r3)
            java.lang.String r3 = "talker = ?"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L46:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " AND createTime >= ? AND createTime <= ?"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.mm.sdk.platformtools.t8.n(r8)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r10}
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "SELECT COUNT(msgId) FROM BizContactConversationMassSend WHERE "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            l75.k0 r10 = r7.f256007d     // Catch: java.lang.Exception -> La0
            android.database.Cursor r8 = r10.B(r9, r8)     // Catch: java.lang.Exception -> La0
            if (r8 == 0) goto L9a
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L87
            int r9 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L93
            goto L8d
        L87:
            java.lang.String r9 = "getFilteredMessageCountCreateRange no data found"
            com.tencent.mars.xlog.Log.w(r0, r9)     // Catch: java.lang.Throwable -> L93
            r9 = r1
        L8d:
            r10 = 0
            vz5.b.a(r8, r10)     // Catch: java.lang.Exception -> La0
            r1 = r9
            goto Lb6
        L93:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L95
        L95:
            r10 = move-exception
            vz5.b.a(r8, r9)     // Catch: java.lang.Exception -> La0
            throw r10     // Catch: java.lang.Exception -> La0
        L9a:
            java.lang.String r8 = "getFilteredMessageCountCreateRange error, cursor is null"
            com.tencent.mars.xlog.Log.w(r0, r8)     // Catch: java.lang.Exception -> La0
            goto Lb6
        La0:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "getFilteredMessageCountCreateRange error: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.mars.xlog.Log.e(r0, r8)
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.b.L0(java.lang.String, long, long):int");
    }

    public final java.util.List P0(java.lang.String talker, int i17, long j17, long j18) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.lang.String y07 = y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.sdk.platformtools.t8.n(talker);
        arrayList.add(talker);
        java.lang.String concat = y07.concat(" AND createTime >= ?");
        arrayList.add(java.lang.String.valueOf(j18));
        if (j17 > 0) {
            concat = concat + " AND createTime > ?";
            arrayList.add(java.lang.String.valueOf(j17));
        }
        android.database.Cursor B = this.f256007d.B("SELECT msgId FROM BizContactConversationMassSend WHERE " + concat + " ORDER BY createTime ASC LIMIT " + i17, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        if (B == null) {
            return kz5.p0.f313996d;
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (B.moveToNext()) {
                arrayList2.add(java.lang.Long.valueOf(B.getLong(0)));
            }
            vz5.b.a(B, null);
            return arrayList2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final long W0(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker = '");
        com.tencent.mm.sdk.platformtools.t8.n(talker);
        sb6.append(talker);
        sb6.append('\'');
        java.lang.String sb7 = sb6.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (j17 > 0) {
            sb7 = sb7 + " AND createTime > ?";
            arrayList.add(java.lang.String.valueOf(j17));
        }
        android.database.Cursor f17 = this.f256007d.f("SELECT createTime FROM BizContactConversationMassSend WHERE " + sb7 + " ORDER BY createTime ASC LIMIT 1", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), 2);
        if (f17 != null) {
            try {
                r0 = f17.moveToFirst() ? f17.getLong(0) : -1L;
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return r0;
    }

    public final int b1(java.lang.String talker, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.sdk.platformtools.t8.n(talker);
        arrayList.add(talker);
        if (j17 > 0) {
            arrayList.add(java.lang.String.valueOf(j17));
            str = "talker = ? AND createTime > ?";
        } else {
            str = "talker = ?";
        }
        try {
            android.database.Cursor B = this.f256007d.B("SELECT COUNT(*) FROM BizContactConversationMassSend WHERE " + str, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            if (B == null) {
                return 0;
            }
            try {
                int i17 = B.moveToFirst() ? B.getInt(0) : 0;
                vz5.b.a(B, null);
                return i17;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactConversationMassSendStorage", "getTotalMessageCount error: " + e17.getMessage());
            return 0;
        }
    }

    public final java.lang.String y0(boolean z17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if ((c01.s0.a() & 8) != 0) {
            if ((c01.s0.a() & 16) != 0) {
                arrayList2.add(1);
            }
        }
        if ((c01.s0.a() & 8) != 0) {
            if ((c01.s0.a() & 32) != 0) {
                arrayList2.add(2);
            }
        }
        if (!arrayList2.isEmpty()) {
            str = "massSendType IN (" + kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null) + ')';
        } else {
            str = null;
        }
        if (str != null) {
            arrayList.add("(" + str + " AND clusterType = 3 AND scene IN (0, 2, -1))");
        }
        if ((c01.s0.a() & 64) != 0) {
            arrayList.add("scene = 9");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.lang.String str2 = "NOT ((" + kz5.n0.g0(arrayList, " OR ", null, null, 0, null, null, 62, null) + "))";
        if (!z17) {
            return str2;
        }
        return str2 + " AND talker = ?";
    }

    public final int z0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizContactConversationMassSendStorage", "clearAll");
        try {
            int delete = this.f256007d.delete("BizContactConversationMassSend", null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizContactConversationMassSendStorage", "clearAll: successfully cleared " + delete + " messages from new table");
            return delete;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactConversationMassSendStorage", "clearAll: failed to clear new table", e17);
            return 0;
        }
    }
}
