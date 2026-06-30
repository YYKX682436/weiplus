package t23;

/* loaded from: classes10.dex */
public class e extends t23.f implements java.util.Comparator {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.ContentResolver f415138h = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();

    /* renamed from: i, reason: collision with root package name */
    public final t23.r1 f415139i = new t23.r1();

    /* renamed from: m, reason: collision with root package name */
    public final t23.s2 f415140m = new t23.s2();

    /* JADX WARN: Can't wrap try/catch for region: R(5:(15:(11:9|(14:159|160|161|162|163|164|(2:157|158)(1:14)|(1:16)|(1:18)|(1:20)|48|49|50|(6:(1:52)(1:151)|(5:(4:55|56|57|(1:59))(1:149)|60|(1:65)|(1:71)|(10:73|74|(1:76)(1:(1:105)(2:106|(1:108)(2:(1:110)(1:112)|111)))|77|78|79|(2:81|(3:83|84|(6:87|(1:89)|(1:91)|(1:93)|(1:95)|96)(1:86)))(1:98)|97|84|(0)(0))(1:116))(1:150)|142|(1:65)|(1:71)|(0)(0)))|12|(0)(0)|(0)|(0)|(0)|48|49|50|(7:(0)(0)|(0)(0)|142|(0)|(0)|(0)(0)|86))|159|160|161|162|163|164|(0)(0)|(0)|(0)|(0)|48|49|50|(7:(0)(0)|(0)(0)|142|(0)|(0)|(0)(0)|86))|174|175|176|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c8, code lost:
    
        r21 = r3;
        r8 = r4;
        r9 = r5;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d6, code lost:
    
        if (r29 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d8, code lost:
    
        r15.size();
        r29.u5(r15, r30, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0310, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0312, code lost:
    
        com.tencent.mars.xlog.Log.i(r4, "[queryMediaItemsInAlbum] albumName:%s type:%s result size:%s ticket:%s cost:%s", r27, java.lang.Integer.valueOf(r28), java.lang.Integer.valueOf(r15.size()), java.lang.Long.valueOf(r30), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0315, code lost:
    
        if (r14 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0317, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x031a, code lost:
    
        if (r8 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x031c, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x031f, code lost:
    
        if (r9 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0321, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0324, code lost:
    
        if (r21 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0326, code lost:
    
        r21.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0329, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0344, code lost:
    
        r2 = r8;
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x032e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032f, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00df, code lost:
    
        r14 = r1;
        r4 = "MicroMsg.AllMediaQuery";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c8 A[EDGE_INSN: B:116:0x02c8->B:117:0x02c8 BREAK  A[LOOP:0: B:51:0x01d9->B:86:0x02ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ab A[Catch: all -> 0x0197, Exception -> 0x019f, TryCatch #10 {Exception -> 0x019f, blocks: (B:158:0x018e, B:16:0x01ab, B:18:0x01b0, B:20:0x01ba), top: B:157:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b0 A[Catch: all -> 0x0197, Exception -> 0x019f, TryCatch #10 {Exception -> 0x019f, blocks: (B:158:0x018e, B:16:0x01ab, B:18:0x01b0, B:20:0x01ba), top: B:157:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ba A[Catch: all -> 0x0197, Exception -> 0x019f, TRY_LEAVE, TryCatch #10 {Exception -> 0x019f, blocks: (B:158:0x018e, B:16:0x01ab, B:18:0x01b0, B:20:0x01ba), top: B:157:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ad A[LOOP:0: B:51:0x01d9->B:86:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList a(java.lang.String r27, int r28, t23.m1 r29, long r30) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.e.a(java.lang.String, int, t23.m1, long):java.util.LinkedList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0251, code lost:
    
        if (r0.moveToFirst() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0253, code lost:
    
        r15.getClass();
        r4 = c(r0, 1, "bucket_display_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025b, code lost:
    
        if (r4 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025d, code lost:
    
        r3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) r2.get(r4.f138418g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0265, code lost:
    
        if (r3 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0267, code lost:
    
        r4.f138417f += r3.f138417f;
        r2.remove(r4.f138418g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0273, code lost:
    
        r6.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027a, code lost:
    
        if (r0.moveToNext() != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (r3.moveToFirst() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        r15.getClass();
        r0 = c(r3, 1, "bucket_display_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        r4 = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) r6.get(r0.f138418g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0137, code lost:
    
        if (r4 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        r6.put(r0.f138418g, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        r0.f138417f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
    
        if (((int) ((r0.f138420i.f138435m - r4.f138420i.f138435m) / 1000)) <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        r6.put(r0.f138418g, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015e, code lost:
    
        if (r3.moveToNext() != false) goto L163;
     */
    @Override // t23.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList b() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.e.b():java.util.LinkedList");
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).f138435m, ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj2).f138435m);
    }

    @Override // t23.f
    public boolean i() {
        t23.s2 s2Var = this.f415140m;
        if (s2Var == null) {
            return false;
        }
        return s2Var.f415265i;
    }
}
