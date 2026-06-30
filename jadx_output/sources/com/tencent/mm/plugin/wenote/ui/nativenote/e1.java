package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.g1 f188199d;

    public e1(com.tencent.mm.plugin.wenote.ui.nativenote.g1 g1Var) {
        this.f188199d = g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            com.tencent.mm.plugin.wenote.ui.nativenote.g1 r2 = r1.f188199d
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r2.f188208e
            hz4.t r3 = r0.K1
            androidx.appcompat.app.AppCompatActivity r4 = r0.getContext()
            android.graphics.Bitmap r5 = r2.f188207d
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r2.f188208e
            boolean r6 = r0.f188162x1
            r3.getClass()
            java.lang.String r0 = "jpg"
            java.lang.String r0 = q75.c.a(r0)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r10 = 14811(0x39db, float:2.0755E-41)
            java.lang.String r11 = ""
            java.lang.String r12 = "MicroMsg.WNNoteLongPic"
            if (r5 == 0) goto L50
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L31
            r14 = 100
            com.tencent.mm.sdk.platformtools.x.D0(r5, r14, r13, r0, r9)     // Catch: java.lang.Exception -> L31
            goto L68
        L31:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r7]
            com.tencent.mars.xlog.Log.printErrStackTrace(r12, r0, r11, r13)
            java.lang.String r0 = "save image fail, saveBitmapToImage is null"
            com.tencent.mars.xlog.Log.e(r12, r0)
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r12 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r12 = new java.lang.Object[]{r8, r8, r8, r12, r13}
            r0.d(r10, r12)
            goto L67
        L50:
            java.lang.String r0 = "save image fail, bigBitmap is null"
            com.tencent.mars.xlog.Log.e(r12, r0)
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r12 = new java.lang.Object[]{r8, r8, r8, r12, r13}
            r0.d(r10, r12)
        L67:
            r0 = r11
        L68:
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r11 != 0) goto L71
            q75.c.f(r0, r4)
        L71:
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r11 = com.tencent.mm.vfs.z7.a(r0)
            r4.<init>(r11)
            boolean r11 = r4.m()
            if (r11 == 0) goto Ld1
            long r11 = r4.C()
            r13 = 1024(0x400, double:5.06E-321)
            long r11 = r11 / r13
            if (r5 == 0) goto L95
            int r7 = r5.getWidth()
            int r4 = r5.getHeight()
            r5.recycle()
            goto L96
        L95:
            r4 = r7
        L96:
            r45.xp0 r5 = new r45.xp0
            r5.<init>()
            java.lang.String r0 = com.tencent.mm.vfs.w6.p(r0)
            r5.f390305d = r0
            hz4.e r0 = new hz4.e
            r14 = 0
            r15 = 2
            java.lang.String r3 = r3.f286454a
            r17 = 0
            r13 = r0
            r16 = r3
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            com.tencent.mm.modelbase.r1 r3 = c01.d9.e()
            r3.g(r0)
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r8, r6}
            r0.d(r10, r3)
        Ld1:
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r2.f188208e
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = r2.f188208e
            androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
            java.lang.String r3 = q75.c.e()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4 = 2131759718(0x7f101266, float:1.9150436E38)
            java.lang.String r2 = r2.getString(r4, r3)
            android.widget.Toast r0 = dp.a.makeText(r0, r2, r9)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.ui.nativenote.e1.run():void");
    }
}
