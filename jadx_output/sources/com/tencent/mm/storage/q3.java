package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public final class q3 extends com.tencent.mm.sdk.platformtools.r2 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f195237i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f195238j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.n3 f195239k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.storage.n3 n3Var, com.tencent.mm.sdk.platformtools.o4 o4Var, java.lang.String str, java.lang.String str2, int i17) {
        super(i17);
        this.f195239k = n3Var;
        this.f195237i = o4Var;
        this.f195238j = "SELECT * FROM " + str + " WHERE " + str2 + "=?;";
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0081, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // com.tencent.mm.sdk.platformtools.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.tencent.mm.storage.n3.f195145s
            long r2 = r0 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 <= 0) goto L27
            com.tencent.mm.storage.n3.f195145s = r0
            j62.e r0 = j62.e.g()
            java.lang.String r1 = "clicfg_confstg_use_mmkv"
            java.lang.String r2 = "1"
            java.lang.String r0 = r0.j(r1, r2, r3, r3)
            java.lang.String r1 = "0"
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ r3
            com.tencent.mm.storage.n3.f195144r = r0
        L27:
            boolean r0 = com.tencent.mm.storage.n3.f195144r
            boolean r1 = r7 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto L42
            int[] r1 = com.tencent.mm.storage.n3.f195141o
            r4 = r7
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = java.util.Arrays.binarySearch(r1, r4)
            if (r1 < 0) goto L42
            java.lang.Object r1 = r6.t(r7)
            goto L84
        L42:
            if (r0 == 0) goto L77
            java.lang.Object r1 = r6.u(r7)
            if (r1 != 0) goto L85
            java.lang.Object r1 = r6.t(r7)
            if (r1 != 0) goto L51
            goto L52
        L51:
            r3 = r2
        L52:
            com.tencent.mm.storage.n3 r2 = r6.f195239k
            monitor-enter(r2)
            boolean r4 = r7 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L64
            com.tencent.mm.storage.n3 r4 = r6.f195239k     // Catch: java.lang.Throwable -> L74
            java.util.HashMap r4 = r4.f195153i     // Catch: java.lang.Throwable -> L74
            r5 = r7
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L74
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L74
            goto L72
        L64:
            boolean r4 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L72
            com.tencent.mm.storage.n3 r4 = r6.f195239k     // Catch: java.lang.Throwable -> L74
            java.util.HashMap r4 = r4.f195154j     // Catch: java.lang.Throwable -> L74
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L74
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            goto L85
        L74:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r7
        L77:
            java.lang.Object r1 = r6.t(r7)
            if (r1 != 0) goto L84
            java.lang.Object r1 = r6.u(r7)
            if (r1 == 0) goto L84
            goto L85
        L84:
            r3 = r2
        L85:
            if (r3 == 0) goto L8a
            java.lang.String r2 = " {MMKV | "
            goto L8c
        L8a:
            java.lang.String r2 = " {DB | "
        L8c:
            if (r0 == 0) goto L91
            java.lang.String r0 = "MMKV}"
            goto L93
        L91:
            java.lang.String r0 = "DB}"
        L93:
            java.lang.String r0 = r2.concat(r0)
            if (r1 != 0) goto Lb7
            java.lang.String r1 = "MicroMsg.ConfigStorage"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "GET: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = " => (DELETED)"
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r7)
            java.lang.Object r7 = com.tencent.mm.storage.n3.f195142p
            return r7
        Lb7:
            java.lang.String r2 = "MicroMsg.ConfigStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "GET: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = " => "
            r3.append(r7)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r7 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.q3.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Float] */
    public final java.lang.Object t(java.lang.Object obj) {
        try {
            android.database.Cursor f17 = this.f195239k.f195150f.f(this.f195238j, new java.lang.String[]{obj.toString()}, 2);
            try {
                if (!f17.moveToFirst()) {
                    f17.close();
                    return null;
                }
                int i17 = f17.getInt(1);
                java.lang.String string = f17.getString(2);
                jx3.f.INSTANCE.t(418, 12);
                if (string != com.tencent.mm.storage.n3.f195142p) {
                    try {
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    switch (i17) {
                        case 1:
                            string = java.lang.Integer.valueOf(string);
                            break;
                        case 2:
                            string = java.lang.Long.valueOf(string);
                            break;
                        case 3:
                            f17.close();
                            return string;
                        case 4:
                            string = java.lang.Boolean.valueOf(string);
                            break;
                        case 5:
                            string = java.lang.Float.valueOf(string);
                            break;
                        case 6:
                            string = java.lang.Double.valueOf(string);
                            break;
                    }
                    f17.close();
                    return string;
                }
                string = null;
                f17.close();
                return string;
            } finally {
            }
        } catch (java.lang.RuntimeException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigStorage", e18, "Failed to query UserInfo, id: " + obj, new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.Object u(java.lang.Object obj) {
        java.lang.String obj2 = obj.toString();
        byte[] j17 = this.f195237i.j(obj2);
        if (j17 != null) {
            jx3.f.INSTANCE.t(418, 11);
        }
        if (j17 != null) {
            if (j17.length == 0) {
                return com.tencent.mm.storage.n3.f195142p;
            }
            try {
                boolean z17 = true;
                switch (j17[0]) {
                    case 1:
                        return java.lang.Integer.valueOf(java.nio.ByteBuffer.wrap(j17, 1, 4).getInt());
                    case 2:
                        return java.lang.Long.valueOf(java.nio.ByteBuffer.wrap(j17, 1, 8).getLong());
                    case 3:
                        return new java.lang.String(j17, 1, j17.length - 1);
                    case 4:
                        if (j17[1] == 0) {
                            z17 = false;
                        }
                        return java.lang.Boolean.valueOf(z17);
                    case 5:
                        return java.lang.Float.valueOf(java.nio.ByteBuffer.wrap(j17, 1, 4).getFloat());
                    case 6:
                        return java.lang.Double.valueOf(java.nio.ByteBuffer.wrap(j17, 1, 8).getDouble());
                    default:
                        throw new java.lang.NumberFormatException("Invalid type");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfigStorage", "Unable to parse value, key: %s, type: %d, message: %s", obj2, java.lang.Byte.valueOf(j17[0]), e17.getMessage());
            }
        }
        return null;
    }
}
