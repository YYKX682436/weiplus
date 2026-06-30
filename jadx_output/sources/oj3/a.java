package oj3;

/* loaded from: classes14.dex */
public final class a implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f345796a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f345797b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345798c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ThreadLocal f345799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ThreadLocal f345800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ThreadLocal f345801f;

    public a() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_use_new_yuv_buffer, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkUtils", "uploadUseYuvBuffer: " + z17);
        this.f345797b = z17;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_upload_disable_finish_call, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkUtils", "disableUploadFinishCall: " + z18);
        this.f345798c = z18 ^ true;
        this.f345799d = new java.lang.ThreadLocal();
        this.f345800e = new java.lang.ThreadLocal();
        this.f345801f = new java.lang.ThreadLocal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if ((r3 != null ? r3.capacity() : 0) < r2.length) goto L38;
     */
    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(oj3.b r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj3.a.c(oj3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:30:0x0088, B:32:0x008c), top: B:29:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:3:0x0010, B:5:0x0015, B:7:0x001b, B:9:0x0021, B:10:0x0031, B:12:0x0036, B:14:0x003d, B:16:0x0043, B:19:0x004b, B:20:0x005b, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0084), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.nio.ByteBuffer r16, oj3.b r17) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r16.clear()
            mj3.g r10 = r1.f345803b
            nj3.e r11 = r1.f345804c
            java.util.concurrent.locks.ReentrantLock r12 = r11.f337901e
            r12.lock()
            boolean r1 = r11.f337900d     // Catch: java.lang.Throwable -> L95
            r13 = 0
            if (r1 == 0) goto L1e
            nj3.d r1 = r11.f337897a     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f337895b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L1e
            is0.c r1 = r1.f337894a     // Catch: java.lang.Throwable -> L95
            goto L1f
        L1e:
            r1 = r13
        L1f:
            if (r1 == 0) goto L31
            int r2 = r10.f327050a     // Catch: java.lang.Throwable -> L95
            int r3 = r10.f327051b     // Catch: java.lang.Throwable -> L95
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L31:
            int r1 = r10.f327050a     // Catch: java.lang.Throwable -> L95
            int r14 = r10.f327051b
            int r1 = r1 * r14
            r0.position(r1)     // Catch: java.lang.Throwable -> L95
            boolean r1 = r11.f337900d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L46
            nj3.d r1 = r11.f337898b     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f337895b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L46
            is0.c r1 = r1.f337894a     // Catch: java.lang.Throwable -> L95
            goto L47
        L46:
            r1 = r13
        L47:
            int r10 = r10.f327050a
            if (r1 == 0) goto L5b
            int r2 = r10 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L5b:
            int r1 = r10 * r14
            int r1 = r1 * 5
            int r1 = r1 / 4
            r0.position(r1)     // Catch: java.lang.Throwable -> L95
            boolean r1 = r11.f337900d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L71
            nj3.d r1 = r11.f337899c     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.f337895b     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L71
            is0.c r1 = r1.f337894a     // Catch: java.lang.Throwable -> L95
            goto L72
        L71:
            r1 = r13
        L72:
            if (r1 == 0) goto L84
            int r2 = r10 / 2
            int r3 = r14 / 2
            r4 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r5 = r16
            is0.c.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L95
        L84:
            r16.clear()     // Catch: java.lang.Throwable -> L95
            r1 = r15
            boolean r0 = r1.f345798c     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8f
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Throwable -> L93
        L8f:
            r12.unlock()
            return
        L93:
            r0 = move-exception
            goto L97
        L95:
            r0 = move-exception
            r1 = r15
        L97:
            r12.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oj3.a.e(java.nio.ByteBuffer, oj3.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[Catch: all -> 0x0147, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9 A[Catch: all -> 0x0147, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {all -> 0x0147, blocks: (B:7:0x0034, B:9:0x003a, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:18:0x006c, B:20:0x0074, B:25:0x0093, B:27:0x0099, B:29:0x00b4, B:31:0x00ba, B:33:0x00c0, B:35:0x00d1, B:37:0x00d9, B:42:0x00fa, B:44:0x0102, B:46:0x011f, B:48:0x0125, B:51:0x012a, B:52:0x0139, B:54:0x0140, B:59:0x00e7, B:60:0x0082), top: B:6:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.nio.ByteBuffer r18, oj3.b r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj3.a.f(java.nio.ByteBuffer, oj3.b):void");
    }
}
