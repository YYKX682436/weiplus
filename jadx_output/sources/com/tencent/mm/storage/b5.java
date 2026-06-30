package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z4 f193771d;

    public b5(com.tencent.mm.storage.z4 z4Var) {
        this.f193771d = z4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0184, code lost:
    
        r8 = new java.util.ArrayList();
        r9 = new java.lang.StringBuilder("(");
        r0 = r0.iterator();
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0199, code lost:
    
        if (r0.hasNext() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r5 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019b, code lost:
    
        r14 = (java.lang.String) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a1, code lost:
    
        if (r13 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a3, code lost:
    
        r9.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a8, code lost:
    
        r9.append("'");
        r9.append(r14);
        r9.append("'");
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b5, code lost:
    
        r9.append(')');
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c9, code lost:
    
        r4 = r7.f470805d.f("select * from EmojiInfoDesc where md5 in " + ((java.lang.Object) r9), null, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cf, code lost:
    
        if (r4 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f5, code lost:
    
        if (r4 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f7, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d5, code lost:
    
        if (r4.moveToFirst() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d7, code lost:
    
        r0 = new z85.j();
        r0.convertFrom(r4);
        r8.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e6, code lost:
    
        if (r4.moveToNext() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0093, code lost:
    
        if (com.tencent.mm.storage.h5.f195006d.wi() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        r10.f196399h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01fc, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfoDescStorage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0099, code lost:
    
        r0 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_custom_emoji_partial_match_numbers, 0);
        r10.f196399h = r0;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "tryInit matchNumbers=%d", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x008a, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        r10.f196393b = com.tencent.mm.sdk.platformtools.m2.d().toLowerCase();
        r5 = com.tencent.mm.storage.n5.f().b().W0().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0088, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00da, code lost:
    
        if (r5.hasNext() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        r7 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r5.next();
        r0 = com.tencent.mm.storage.n5.f().a();
        r8 = r7.field_productID;
        r0.getClass();
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        r6 = r0.f470805d.f("select * from EmojiInfoDesc where groupId = '" + r8 + "'", null, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0135, code lost:
    
        if (r6 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        if (r6.moveToFirst() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r0 = new z85.j();
        r0.convertFrom(r6);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
    
        if (r6.moveToNext() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfoDescStorage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        r5 = com.tencent.mm.storage.n5.f().c().o1(true);
        r0 = kz5.n0.l0(kz5.n0.U(r5, new com.tencent.mm.storage.z4$$a()), new com.tencent.mm.storage.z4$$b());
        r7 = com.tencent.mm.storage.n5.f().a();
        r7.getClass();
        r0 = (java.util.ArrayList) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017b, code lost:
    
        if (r0.isEmpty() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0353  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.b5.run():void");
    }

    public java.lang.String toString() {
        return super.toString() + "|newinit";
    }
}
