package z85;

/* loaded from: classes12.dex */
public class x extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470827e = {l75.n0.getCreateSQLs(z85.w.f470826p, "GetEmotionListCache")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470828d;

    public x(l75.k0 k0Var) {
        super(k0Var, z85.w.f470826p, "GetEmotionListCache", null);
        this.f470828d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        return r2;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0053: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:20:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.x66 D0() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            l75.k0 r3 = r11.f470828d     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r4 = "GetEmotionListCache"
            r5 = 0
            java.lang.String r6 = "reqType=?"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r8 = "Smiley_panel_req_type"
            r7[r0] = r8     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.E(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            if (r3 == 0) goto L33
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            if (r4 == 0) goto L33
            z85.w r4 = new z85.w     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            r4.<init>(r3)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            r45.x66 r5 = new r45.x66     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            r5.<init>()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            byte[] r4 = r4.field_cache     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            r5.parseFrom(r4)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L52
            r2 = r5
            goto L33
        L31:
            r4 = move-exception
            goto L3d
        L33:
            if (r3 == 0) goto L51
        L35:
            r3.close()
            goto L51
        L39:
            r0 = move-exception
            goto L54
        L3b:
            r4 = move-exception
            r3 = r2
        L3d:
            java.lang.String r5 = "MicroMsg.emoji.Storage"
            java.lang.String r6 = "exception:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.z3.c(r4)     // Catch: java.lang.Throwable -> L52
            r1[r0] = r4     // Catch: java.lang.Throwable -> L52
            com.tencent.mars.xlog.Log.e(r5, r6, r1)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L51
            goto L35
        L51:
            return r2
        L52:
            r0 = move-exception
            r2 = r3
        L54:
            if (r2 == 0) goto L59
            r2.close()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.x.D0():r45.x66");
    }

    public boolean J0(int i17, r45.we3 we3Var) {
        if (we3Var == null) {
            return false;
        }
        try {
            this.f470828d.delete("GetEmotionListCache", "reqType=?", new java.lang.String[]{java.lang.String.valueOf(i17)});
            return insert(new z85.w(i17 + "", we3Var.toByteArray()));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.Storage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    public boolean L0(r45.x66 x66Var) {
        if (x66Var == null) {
            return false;
        }
        try {
            this.f470828d.delete("GetEmotionListCache", "reqType=?", new java.lang.String[]{"Smiley_panel_req_type"});
            return insert(new z85.w("Smiley_panel_req_type", x66Var.toByteArray()));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.Storage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    public byte[] y0(java.lang.String str) {
        android.database.Cursor E = this.f470828d.E("GetEmotionListCache", null, "reqType=?", new java.lang.String[]{str}, null, null, null);
        if (E != null) {
            r0 = E.moveToFirst() ? new z85.w(E).field_cache : null;
            E.close();
        }
        return r0;
    }

    public r45.we3 z0(int i17) {
        android.database.Cursor D = this.f470828d.D("GetEmotionListCache", null, "reqType=?", new java.lang.String[]{java.lang.String.valueOf(i17)}, null, null, null, 2);
        r45.we3 we3Var = null;
        if (D != null && D.moveToFirst()) {
            z85.w wVar = new z85.w(D);
            try {
                r45.we3 we3Var2 = new r45.we3();
                we3Var2.parseFrom(wVar.field_cache);
                we3Var = we3Var2;
            } catch (java.io.IOException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.Storage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        if (D != null) {
            D.close();
        }
        return we3Var;
    }
}
