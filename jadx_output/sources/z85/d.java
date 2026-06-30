package z85;

/* loaded from: classes12.dex */
public class d extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470787f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.emotion.EmojiGroupInfo.M1, "EmojiGroupInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470788d;

    /* renamed from: e, reason: collision with root package name */
    public z85.e f470789e;

    public d(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.emotion.EmojiGroupInfo.M1, "EmojiGroupInfo", null);
        this.f470788d = k0Var;
    }

    public static final java.lang.String C1(int i17) {
        return " ( type = '" + i17 + "' ) ";
    }

    public static final java.lang.String P0() {
        return " ( " + C1(2) + " and  ( status = '7' )  ) ";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Check GroupId Exist Faild."
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r2 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            if (r1 == 0) goto L10
            java.lang.String r1 = "product id is null."
            com.tencent.mars.xlog.Log.e(r2, r1)
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "select count(*) from EmojiGroupInfo where productID = '"
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r7 = "' AND  ( status = '7' )  AND ( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) "
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            r3 = 0
            l75.k0 r4 = r6.f470788d     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r5 = 2
            android.database.Cursor r1 = r4.f(r7, r1, r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r1 == 0) goto L40
            boolean r7 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r7 == 0) goto L40
            int r7 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r7 <= 0) goto L3c
            r3 = 1
        L3c:
            r1.close()
            return r3
        L40:
            if (r1 == 0) goto L5e
            goto L5b
        L43:
            r7 = move-exception
            goto L5f
        L45:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L43
            r4.append(r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L43
            com.tencent.mars.xlog.Log.e(r2, r7)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L5e
        L5b:
            r1.close()
        L5e:
            return r3
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.D0(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r2 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int J0() {
        /*
            r7 = this;
            java.lang.String r0 = "Check GroupId Exist Faild."
            java.lang.String r1 = "select  count(*) from EmojiInfo where catalog=?"
            r2 = 0
            r3 = 0
            l75.k0 r4 = r7.f470788d     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.String r6 = "81"
            r5[r3] = r6     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r6 = 2
            android.database.Cursor r2 = r4.f(r1, r5, r6)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r2 == 0) goto L21
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            if (r1 == 0) goto L21
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
        L21:
            if (r2 == 0) goto L42
        L23:
            r2.close()
            goto L42
        L27:
            r0 = move-exception
            goto L43
        L29:
            r1 = move-exception
            java.lang.String r4 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r5.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L27
            com.tencent.mars.xlog.Log.e(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L42
            goto L23
        L42:
            return r3
        L43:
            if (r2 == 0) goto L48
            r2.close()
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.J0():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r11 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r4.field_count == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r4.field_count = r7;
        r0.p("EmojiGroupInfo", r4.convertTo(), "productID=?", new java.lang.String[]{r4.field_productID});
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r11 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K1() {
        /*
            r14 = this;
            l75.k0 r0 = r14.f470788d
            if (r0 == 0) goto L15
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r1 = r0.F(r1)
            goto L17
        L15:
            r1 = -1
        L17:
            java.util.ArrayList r3 = r14.W0()
            boolean r4 = r3.isEmpty()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto Lb4
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r3.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r4 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r4
            if (r4 == 0) goto L27
            java.lang.String r7 = r4.field_productID
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r7 != 0) goto L27
            java.lang.String r7 = r4.field_productID
            java.lang.String r8 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.String r9 = "[countProductId]Count ProductId fail."
            java.lang.System.currentTimeMillis()
            java.lang.String r10 = "select count(*) from EmojiInfo where groupId= ? and temp=?"
            java.lang.String r11 = "0"
            java.lang.String[] r7 = new java.lang.String[]{r7, r11}
            r11 = 0
            r12 = 2
            android.database.Cursor r11 = r0.f(r10, r7, r12)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r11 == 0) goto L62
            boolean r7 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r7 == 0) goto L62
            int r7 = r11.getInt(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L63
        L62:
            r7 = r6
        L63:
            if (r11 == 0) goto L91
            goto L8e
        L66:
            r0 = move-exception
            goto Lae
        L68:
            r7 = move-exception
            java.lang.String r10 = "exception:%s"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L66
            boolean r13 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L66
            java.lang.String r13 = com.tencent.mm.sdk.platformtools.z3.c(r7)     // Catch: java.lang.Throwable -> L66
            r12[r6] = r13     // Catch: java.lang.Throwable -> L66
            com.tencent.mars.xlog.Log.e(r8, r10, r12)     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L66
            r10.append(r7)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L66
            com.tencent.mars.xlog.Log.e(r8, r7)     // Catch: java.lang.Throwable -> L66
            r7 = r6
            if (r11 == 0) goto L91
        L8e:
            r11.close()
        L91:
            java.lang.System.currentTimeMillis()
            int r8 = r4.field_count
            if (r8 == r7) goto L27
            r4.field_count = r7
            android.content.ContentValues r7 = r4.convertTo()
            java.lang.String r4 = r4.field_productID
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r8 = "EmojiGroupInfo"
            java.lang.String r9 = "productID=?"
            r0.p(r8, r7, r9, r4)
            goto L27
        Lae:
            if (r11 == 0) goto Lb3
            r11.close()
        Lb3:
            throw r0
        Lb4:
            r3 = -1
            if (r0 == 0) goto Lc0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r0 = r0.w(r1)
            goto Lc1
        Lc0:
            r0 = r3
        Lc1:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.b(r5)
            java.lang.String r2 = "event_update_group"
            r14.z1(r2, r6, r1)
            if (r0 <= r3) goto Lcf
            goto Ld0
        Lcf:
            r5 = r6
        Ld0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.K1():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L0(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L4c
            java.lang.String r0 = "com.tencent.xin.emoticon.tusiji"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L12
            java.lang.String r7 = "17"
        L12:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = r6.f1(r7, r1)     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L19
            goto L4c
        L19:
            int r3 = r0.field_type     // Catch: java.lang.Exception -> L34
            r4 = 3
            if (r3 != r4) goto L1f
            goto L4c
        L1f:
            java.lang.String r0 = r0.field_productID     // Catch: java.lang.Exception -> L34
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L34
            l75.k0 r3 = r6.f470788d     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = "EmojiGroupInfo"
            java.lang.String r5 = "productID=?"
            int r0 = r3.delete(r4, r5, r0)     // Catch: java.lang.Exception -> L34
            if (r0 <= 0) goto L4c
            r0 = r1
            goto L4d
        L34:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Delete By ProductId fail."
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            com.tencent.mars.xlog.Log.e(r3, r0)
        L4c:
            r0 = r2
        L4d:
            if (r0 == 0) goto L6b
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.b(r1)
            java.lang.String r3 = "event_update_group"
            r6.z1(r3, r2, r1)
            z85.e r1 = r6.f470789e
            java.lang.String r3 = "delete_group"
            if (r1 == 0) goto L63
            com.tencent.mm.storage.n5 r1 = (com.tencent.mm.storage.n5) r1
            r1.g(r3)
        L63:
            r6.doNotify(r3)
            java.lang.String r1 = "delete_group_v3"
            r6.z1(r1, r2, r7)
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.L0(java.lang.String):boolean");
    }

    public boolean P1(java.util.List list) {
        long j17;
        if (list == null || list.size() <= 0) {
            return false;
        }
        l75.k0 k0Var = this.f470788d;
        if (k0Var != null) {
            j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround updateList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
        } else {
            j17 = -1;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) list.get(i17);
            java.lang.String str = emojiGroupInfo.field_productID;
            replace(emojiGroupInfo);
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        z1("event_update_group", 0, com.tencent.mm.sdk.platformtools.z3.b(true));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        r1.convertFrom(r2);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r2.moveToNext() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList W0() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from EmojiGroupInfo where "
            r1.<init>(r2)
            java.lang.String r2 = P0()
            r1.append(r2)
            java.lang.String r2 = " order by sort ASC,lastUseTime DESC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            l75.k0 r3 = r6.f470788d     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = 2
            android.database.Cursor r2 = r3.f(r1, r2, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r2 == 0) goto L3e
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r1 == 0) goto L3e
        L2d:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r1.convertFrom(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r0.add(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r1 != 0) goto L2d
        L3e:
            if (r2 == 0) goto L64
        L40:
            r2.close()
            goto L64
        L44:
            r0 = move-exception
            goto L65
        L46:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "get all group fail."
            r4.append(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L44
            r4.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L44
            com.tencent.mars.xlog.Log.e(r3, r1)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L64
            goto L40
        L64:
            return r0
        L65:
            if (r2 == 0) goto L6a
            r2.close()
        L6a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.W0():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap b1() {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from EmojiGroupInfo where "
            r1.<init>(r2)
            java.lang.String r2 = P0()
            r1.append(r2)
            java.lang.String r2 = " order by sort ASC,lastUseTime DESC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            l75.k0 r3 = r7.f470788d     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r4 = 2
            android.database.Cursor r2 = r3.f(r1, r2, r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r2 == 0) goto L57
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r1 == 0) goto L57
            com.tencent.mm.storage.f5 r1 = new com.tencent.mm.storage.f5     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r3 = "productID"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r4 = "packName"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
        L40:
            java.lang.String r5 = r2.getString(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r6 = r2.getString(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r1.f193918a = r6     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r6 = 7
            r1.a(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r5 != 0) goto L40
        L57:
            if (r2 == 0) goto L7d
        L59:
            r2.close()
            goto L7d
        L5d:
            r0 = move-exception
            goto L7e
        L5f:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "get download group map failed."
            r4.append(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5d
            r4.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L5d
            com.tencent.mars.xlog.Log.e(r3, r1)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L7d
            goto L59
        L7d:
            return r0
        L7e:
            if (r2 == 0) goto L83
            r2.close()
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.b1():java.util.HashMap");
    }

    public com.tencent.mm.storage.emotion.EmojiGroupInfo d1(java.lang.String str) {
        return f1(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.emotion.EmojiGroupInfo f1(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "get getEmojiGroupInof fail. product id is"
            java.lang.String r1 = "select * from EmojiGroupInfo where productID= ?"
            r2 = 0
            l75.k0 r3 = r7.f470788d     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String[] r4 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r5 = 2
            android.database.Cursor r1 = r3.f(r1, r4, r5)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r1 == 0) goto L2a
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L64
            if (r3 == 0) goto L2a
            com.tencent.mm.storage.emotion.EmojiGroupInfo r3 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L64
            r3.<init>()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L64
            r3.convertFrom(r1)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L64
            r1.close()
            return r3
        L25:
            r4 = move-exception
            goto L36
        L27:
            r4 = move-exception
            r3 = r2
            goto L36
        L2a:
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            r3 = r2
            goto L58
        L31:
            r8 = move-exception
            goto L66
        L33:
            r4 = move-exception
            r1 = r2
            r3 = r1
        L36:
            java.lang.String r5 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r6.append(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = " "
            r6.append(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = r4.getMessage()     // Catch: java.lang.Throwable -> L64
            r6.append(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L64
            com.tencent.mars.xlog.Log.e(r5, r8)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L58
            r1.close()
        L58:
            if (r3 != 0) goto L63
            if (r9 == 0) goto L5d
            return r2
        L5d:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r8 = new com.tencent.mm.storage.emotion.EmojiGroupInfo
            r8.<init>()
            return r8
        L63:
            return r3
        L64:
            r8 = move-exception
            r2 = r1
        L66:
            if (r2 == 0) goto L6b
            r2.close()
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.f1(java.lang.String, boolean):com.tencent.mm.storage.emotion.EmojiGroupInfo");
    }

    @Override // l75.n0
    public java.lang.String getTableName() {
        return "EmojiGroupInfo";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (r1.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r6 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        r6.convertFrom(r1);
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r6.field_productID, java.lang.String.valueOf(17)) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        r6.field_packName = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491115c00);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList i1(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from EmojiGroupInfo where sync > 0  or "
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " ( "
            r2.<init>(r3)
            r3 = 1
            java.lang.String r3 = C1(r3)
            r2.append(r3)
            java.lang.String r3 = " and ( ( ( flag & 256 ) = 0 )  or ( flag is null ) )  ) "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = " or  ( recommand = '1' )  order by sort ASC,idx ASC,lastUseTime DESC limit "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            l75.k0 r2 = r5.f470788d     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r3 = 2
            android.database.Cursor r1 = r2.f(r6, r1, r3)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r1 == 0) goto L6e
            boolean r6 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r6 == 0) goto L6e
        L44:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r6 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r6.<init>()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r6.convertFrom(r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r0.add(r6)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            java.lang.String r2 = r6.field_productID     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r3 = 17
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.D0(r2, r3)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r2 == 0) goto L68
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r3 = 2131760466(0x7f101552, float:1.9151953E38)
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r6.field_packName = r2     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
        L68:
            boolean r6 = r1.moveToNext()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r6 != 0) goto L44
        L6e:
            if (r1 == 0) goto L94
        L70:
            r1.close()
            goto L94
        L74:
            r6 = move-exception
            goto L95
        L76:
            r6 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "get Panel EmojiGroupInfo."
            r3.append(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L74
            r3.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L74
            com.tencent.mars.xlog.Log.e(r2, r6)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L94
            goto L70
        L94:
            return r0
        L95:
            if (r1 == 0) goto L9a
            r1.close()
        L9a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.i1(int):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r1 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r0.hasNext() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        r2 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r2.field_type != 3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r3.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        r1.convertFrom(r3);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r3.moveToNext() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList k1() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "select * from EmojiGroupInfo where  (type=?  and status=?) or (type=? and flag=?)  order by sort ASC,idx ASC,lastUseTime DESC"
            java.lang.String r2 = "2"
            java.lang.String r3 = "7"
            java.lang.String r4 = "1"
            java.lang.String r5 = "0"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5}
            r3 = 0
            l75.k0 r4 = r6.f470788d     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r5 = 2
            android.database.Cursor r3 = r4.f(r1, r2, r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r3 == 0) goto L35
            boolean r1 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r1 == 0) goto L35
        L24:
            com.tencent.mm.storage.emotion.EmojiGroupInfo r1 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r1.convertFrom(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            boolean r1 = r3.moveToNext()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r1 != 0) goto L24
        L35:
            if (r3 == 0) goto L5a
            goto L57
        L38:
            r0 = move-exception
            goto L7a
        L3a:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "get Panel EmojiGroupInfo."
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L38
            r4.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L38
            com.tencent.mars.xlog.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L5a
        L57:
            r3.close()
        L5a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r2 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r2
            int r3 = r2.field_type
            r4 = 3
            if (r3 != r4) goto L75
            goto L63
        L75:
            r1.add(r2)
            goto L63
        L79:
            return r1
        L7a:
            if (r3 == 0) goto L7f
            r3.close()
        L7f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.k1():java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n1(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.n1(android.content.Context):boolean");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo) {
        if (emojiGroupInfo == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiGroupInfoStorage", "insert assertion!,invalid emojigroup info.");
            return false;
        }
        emojiGroupInfo.field_lastUseTime = java.lang.System.currentTimeMillis();
        emojiGroupInfo.field_sort = 1;
        emojiGroupInfo.field_lastUseTime = java.lang.System.currentTimeMillis();
        emojiGroupInfo.field_flag &= -257;
        boolean replace = replace(emojiGroupInfo);
        if (replace) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            z1("event_update_group", 0, com.tencent.mm.sdk.platformtools.z3.b(true));
        }
        return replace;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0187, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r10.C) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0189, code lost:
    
        r0 = new java.lang.Object[1];
        r9 = r4.field_productID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        if (r9 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0190, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0191, code lost:
    
        r0[0] = r9;
        com.tencent.mars.xlog.Log.w("EmojiGroupInfoStorage", "backend returned ip set key for pid:%s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
    
        r4.field_ipKey = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012f, code lost:
    
        r4.field_packName = r10.f392130f;
        r4.field_type = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f9, code lost:
    
        if (r10.f392128d.equals("com.tencent.xin.emoticon.tusiji") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00fb, code lost:
    
        r4 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r9.get(java.lang.String.valueOf(17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0105, code lost:
    
        if (r4 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0107, code lost:
    
        r4 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x010c, code lost:
    
        r4.field_productID = java.lang.String.valueOf(17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0113, code lost:
    
        r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        r0.field_productID = r10.f392128d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025f, code lost:
    
        r17 = r9;
        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiGroupInfoStorage", "summary is null or product id is null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0272, code lost:
    
        r2 = r9.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0280, code lost:
    
        if (r2.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0282, code lost:
    
        r4 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0288, code lost:
    
        if (r4 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0290, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r4.field_productID) != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029e, code lost:
    
        if (r4.field_productID.equals(java.lang.String.valueOf(18)) == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
    
        if (r4.field_productID.equals(java.lang.String.valueOf(17)) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c7, code lost:
    
        if (r12.contains(r4.field_productID) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", r4.field_productID);
        r13.add(r4.field_productID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b4, code lost:
    
        if (r12.contains("com.tencent.xin.emoticon.tusiji") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b6, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", "com.tencent.xin.emoticon.tusiji");
        r13.add("com.tencent.xin.emoticon.tusiji");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dc, code lost:
    
        if (r13.size() <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02de, code lost:
    
        r0 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e6, code lost:
    
        if (r0.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e8, code lost:
    
        L0((java.lang.String) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02f2, code lost:
    
        r0 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        z1("event_update_group", 0, com.tencent.mm.sdk.platformtools.z3.b(true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x008e, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r12 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0054, code lost:
    
        if (r12.moveToFirst() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0056, code lost:
    
        r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        r0.convertFrom(r12);
        r9.put(r0.field_productID, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0067, code lost:
    
        if (r12.moveToNext() != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x008c, code lost:
    
        if (r12 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r12 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r14 = r27.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary size:%d", java.lang.Integer.valueOf(r14));
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r15 >= r14) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        r10 = (r45.zj0) r2.get(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r10 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r10.f392128d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "summary productID:%s", r10.f392128d);
        r12.add(r10.f392128d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        if (r9.containsKey(r10.f392128d) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        r0 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r9.get(r10.f392128d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        r0.field_productID = r10.f392128d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011c, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0123, code lost:
    
        if (r10.f392128d.equals("com.tencent.xin.emoticon.tusiji") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        r4.field_flag = r8;
        r4.field_packName = "emoji_custom_all";
        r4.field_type = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0136, code lost:
    
        r4.field_packIconUrl = r10.f392129e;
        r4.field_packGrayIconUrl = r10.f392140s;
        r4.field_packCoverUrl = r10.f392136o;
        r4.field_packDesc = r10.f392131g;
        r4.field_packAuthInfo = r10.f392132h;
        r4.field_packPrice = r10.f392133i;
        r4.field_packType = r10.f392134m;
        r4.field_packFlag = r10.f392135n;
        r17 = r9;
        r4.field_packExpire = r10.f392137p;
        r4.field_packTimeStamp = r10.f392139r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0178, code lost:
    
        if (java.lang.Boolean.valueOf(((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Di()).booleanValue() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017a, code lost:
    
        r4.field_ipKey = r10.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019d, code lost:
    
        r4.field_sort = 1;
        r4.field_idx = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a5, code lost:
    
        if (r4.field_sync != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        if (r4.field_status != 7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
    
        if (r4.field_packStatus != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01af, code lost:
    
        r11 = 2;
        r4.field_sync = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b8, code lost:
    
        r0 = r4.field_sync;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (r0 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bc, code lost:
    
        r4.field_status = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        if (r10.f392128d.equals("com.tencent.xin.emoticon.tusiji") != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c8, code lost:
    
        r0 = r10.f392128d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ce, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d0, code lost:
    
        r8 = com.tencent.mm.storage.n5.f().c();
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e9, code lost:
    
        r8 = r8.f470808d.f("select * from EmojiInfo where +groupId = ? and temp=? limit 1 ", new java.lang.String[]{r0, "0"}, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f1, code lost:
    
        if (r8.moveToFirst() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f3, code lost:
    
        h12.b0.b();
        r10 = new com.tencent.mm.storage.emotion.EmojiInfo(h12.b0.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ff, code lost:
    
        r10.convertFrom(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022c, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x022f, code lost:
    
        if (r10 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0235, code lost:
    
        if (r10.E0() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0237, code lost:
    
        r11 = wq.a.f().a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023f, code lost:
    
        if (r11 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0241, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(252, 9, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0256, code lost:
    
        if (r11 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0258, code lost:
    
        r4.field_sync = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0203, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0215, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "getFirstEmojiByGroupId fail." + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022a, code lost:
    
        if (r8 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0208, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024f, code lost:
    
        if (r10 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0251, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0254, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0213, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020f, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0211, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0255, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025b, code lost:
    
        replace(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        r15 = r15 + 1;
        r2 = r27;
        r9 = r17;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
    
        r11 = 2;
        r4.field_sync = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p1(java.util.ArrayList r27) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.d.p1(java.util.ArrayList):void");
    }

    public void u1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart begin");
        com.tencent.mm.storage.emotion.EmojiGroupInfo f17 = f1(java.lang.String.valueOf(18), false);
        if (f17 == null) {
            f17 = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "EmojiGroupInfo:%s", f17.toString());
        }
        f17.field_productID = java.lang.String.valueOf(18);
        f17.field_packName = "emoji_custom_group";
        f17.field_type = 3;
        f17.field_status = 0;
        f17.field_packStatus = 1;
        f17.field_flag = 0;
        replace(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart end");
    }

    public final java.lang.String y0() {
        return C1(1) + " or " + C1(3) + " or " + C1(2) + " or " + C1(256);
    }

    public boolean z0() {
        return ((java.lang.Boolean) gm0.j1.u().c().l(208912, java.lang.Boolean.FALSE)).booleanValue();
    }

    public final void z1(java.lang.String str, int i17, java.lang.Object obj) {
        z85.e eVar = this.f470789e;
        if (eVar != null) {
            ((com.tencent.mm.storage.n5) eVar).g(str);
        }
        doNotify(str, i17, obj);
    }
}
