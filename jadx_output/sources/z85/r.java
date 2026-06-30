package z85;

/* loaded from: classes4.dex */
public class r extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470818e = {l75.n0.getCreateSQLs(z85.q.f470817p, "EmotionDesignerInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470819d;

    public r(l75.k0 k0Var) {
        super(k0Var, z85.q.f470817p, "EmotionDesignerInfo", null);
        this.f470819d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.ee3 y0(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r13)
            java.lang.String r1 = "MicroMsg.emoji.EmotionDesignerInfo"
            r2 = 0
            if (r0 == 0) goto Lf
            java.lang.String r13 = "getDesignerSimpleInfoResponseByID failed. Designer ID is null."
            com.tencent.mars.xlog.Log.w(r1, r13)
            return r2
        Lf:
            java.lang.String r0 = "content"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            java.lang.String r6 = "designerIDAndType=? "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r13 = 0
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r7 = new java.lang.String[]{r0}
            l75.k0 r3 = r12.f470819d     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r4 = "EmotionDesignerInfo"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r0 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            if (r0 == 0) goto L4f
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            if (r3 == 0) goto L4f
            r45.ee3 r3 = new r45.ee3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            byte[] r4 = r0.getBlob(r13)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r3.parseFrom(r4)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r2 = r3
            goto L4f
        L4d:
            r3 = move-exception
            goto L59
        L4f:
            if (r0 == 0) goto L6a
        L51:
            r0.close()
            goto L6a
        L55:
            r13 = move-exception
            goto L6d
        L57:
            r3 = move-exception
            r0 = r2
        L59:
            java.lang.String r4 = "exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.z3.c(r3)     // Catch: java.lang.Throwable -> L6b
            r5[r13] = r3     // Catch: java.lang.Throwable -> L6b
            com.tencent.mars.xlog.Log.e(r1, r4, r5)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6a
            goto L51
        L6a:
            return r2
        L6b:
            r13 = move-exception
            r2 = r0
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.r.y0(java.lang.String):r45.ee3");
    }

    public void z0(java.lang.String str, r45.ee3 ee3Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ee3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
            return;
        }
        try {
            z85.q qVar = new z85.q();
            qVar.field_designerIDAndType = str + 0;
            qVar.field_content = ee3Var.toByteArray();
            android.content.ContentValues convertTo = qVar.convertTo();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(0);
            if (this.f470819d.m("EmotionDesignerInfo", "designerIDAndType", convertTo) > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", str);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", str);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
