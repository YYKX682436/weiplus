package er;

/* loaded from: classes12.dex */
public final class b extends er.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f255925q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f255925q = emojiInfo.getMd5() + "_cover";
    }

    @Override // er.f
    public java.lang.String e() {
        return this.f255925q;
    }

    @Override // er.f
    public void f(boolean z17) {
        super.f(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverTask", "IEmojiLoadTask onResult , " + this.f255930f.getMd5());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r4.getHeight() > 120) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r4 == null) goto L27;
     */
    @Override // er.f, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r14 = this;
            super.run()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IEmojiLoadTask run , "
            r0.<init>(r1)
            com.tencent.mm.api.IEmojiInfo r1 = r14.f255930f
            java.lang.String r2 = r1.getMd5()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.EmojiCoverTask"
            com.tencent.mars.xlog.Log.i(r2, r0)
            cr.g r0 = new cr.g
            r0.<init>()
            com.tencent.mm.storage.emotion.EmojiInfo r1 = (com.tencent.mm.storage.emotion.EmojiInfo) r1
            er.a r2 = new er.a
            r2.<init>(r14)
            ar.c r3 = ar.c.f13356a
            java.lang.String r4 = r1.getMd5()
            android.graphics.Bitmap r4 = r3.a(r4)
            r5 = 1
            if (r4 == 0) goto L37
            goto Lbe
        L37:
            java.lang.String r6 = r1.field_groupId
            java.lang.String r7 = "17"
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            r7 = 0
            if (r6 != 0) goto L80
            java.lang.String r6 = r1.getMd5()
            boolean r6 = n22.m.n(r6)
            if (r6 == 0) goto L4d
            goto L80
        L4d:
            java.lang.String r6 = r1.h0()
            boolean r6 = com.tencent.mm.vfs.w6.j(r6)
            if (r6 == 0) goto Lb3
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r6 = 120(0x78, float:1.68E-43)
            r4.outWidth = r6
            r4.outHeight = r6
            java.lang.String r8 = r1.h0()
            android.graphics.Bitmap r4 = com.tencent.mm.sdk.platformtools.x.J(r8, r4)
            if (r4 != 0) goto L6d
            goto Lbd
        L6d:
            int r8 = r4.getWidth()
            if (r8 > r6) goto L79
            int r8 = r4.getHeight()
            if (r8 <= r6) goto Lb3
        L79:
            android.graphics.Bitmap r4 = com.tencent.mm.sdk.platformtools.x.S(r4, r6, r6, r7, r5)
            if (r4 != 0) goto Lb3
            goto Lbd
        L80:
            java.lang.String r8 = r1.getName()
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r6 != 0) goto Lb3
            kotlin.jvm.internal.o.d(r8)
            java.lang.String r4 = "."
            java.lang.String[] r9 = new java.lang.String[]{r4}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r4 = r26.n0.f0(r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.x2.f193072b
            java.lang.String r9 = "drawable"
            int r4 = r6.getIdentifier(r4, r9, r8)
            android.graphics.Bitmap r4 = com.tencent.mm.graphics.e.e(r6, r4)
        Lb3:
            if (r4 == 0) goto Lbd
            java.lang.String r6 = r1.getMd5()
            r3.b(r6, r4)
            goto Lbe
        Lbd:
            r5 = r7
        Lbe:
            if (r5 == 0) goto Lc6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.invoke(r0)
            goto Le2
        Lc6:
            boolean r3 = com.tencent.mm.sdk.platformtools.x2.n()
            if (r3 == 0) goto Ldf
            qk.x6 r3 = r1.m1()
            qk.x6 r4 = qk.x6.STATUS_SUCCESS
            if (r3 != r4) goto Ldf
            cr.k r3 = new cr.k
            cr.e r4 = new cr.e
            r4.<init>(r2, r0, r1)
            r3.<init>(r1, r4)
            goto Le2
        Ldf:
            r0.a(r1, r2)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er.b.run():void");
    }
}
