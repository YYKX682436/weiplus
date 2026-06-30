package q12;

/* loaded from: classes12.dex */
public class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        if (r2.moveToFirst() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        r0.add(r2.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r2.moveToNext() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (r2 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        gm0.j1.n().f273288b.g(new z12.z(r0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(boolean r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.s.b(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x016b, code lost:
    
        if (r12 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018d, code lost:
    
        if (r11.size() <= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018f, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji uploadEmojiList:%d", java.lang.Integer.valueOf(r11.size()));
        r0 = new java.util.ArrayList();
        r1 = r11.size();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        if (r12 >= r1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        r0.add(new b22.c((java.lang.String) r11.get(r12)));
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji upload Emoji:%s", r11.get(r12));
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cc, code lost:
    
        r1 = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01da, code lost:
    
        if (r1.f97635f != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dc, code lost:
    
        r1.f97635f = new java.util.Vector();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e7, code lost:
    
        if (r0.size() <= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e9, code lost:
    
        r8 = r0.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ee, code lost:
    
        if (r11 >= r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
    
        r12 = (com.tencent.mm.plugin.emoji.sync.l) r0.get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f6, code lost:
    
        if (r12 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01fe, code lost:
    
        if (r1.f97635f.contains(r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0200, code lost:
    
        r1.f97635f.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0215, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0206, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0218, code lost:
    
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023b, code lost:
    
        gm0.j1.u().c().w(348166, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPostTaskListener", "no things need to upload.");
        gm0.j1.u().c().w(348165, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0186, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r12.moveToFirst() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        r11.add(r12.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0166, code lost:
    
        if (r12.moveToNext() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0184, code lost:
    
        if (r12 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b7  */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r18) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.s.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
