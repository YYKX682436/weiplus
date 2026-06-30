package tv5;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    public static tv5.b f422366m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f422367n;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f422368a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f422369b;

    /* renamed from: c, reason: collision with root package name */
    public final pv5.c f422370c;

    /* renamed from: d, reason: collision with root package name */
    public final rv5.c f422371d;

    /* renamed from: e, reason: collision with root package name */
    public final rv5.d f422372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f422373f;

    /* renamed from: g, reason: collision with root package name */
    public final nv5.a f422374g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f422375h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f422376i;

    /* renamed from: j, reason: collision with root package name */
    public int f422377j;

    /* renamed from: k, reason: collision with root package name */
    public tv5.d f422378k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f422379l = false;

    public b(android.content.Context context, int i17, rv5.c cVar, rv5.d dVar, pv5.c cVar2, java.io.File file, java.io.File file2, java.io.File file3, nv5.a aVar, boolean z17, boolean z18, boolean z19, tv5.a aVar2) {
        this.f422368a = context;
        this.f422370c = cVar2;
        this.f422371d = cVar;
        this.f422372e = dVar;
        this.f422377j = i17;
        this.f422369b = file;
        this.f422373f = file2;
        this.f422374g = aVar;
        this.f422375h = z17;
        this.f422376i = z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:6:0x0009, B:10:0x0010, B:12:0x0021, B:15:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x005d, B:20:0x0042, B:22:0x0081, B:23:0x0088, B:25:0x0089), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:6:0x0009, B:10:0x0010, B:12:0x0021, B:15:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x005d, B:20:0x0042, B:22:0x0081, B:23:0x0088, B:25:0x0089), top: B:5:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tv5.b b(android.content.Context r17) {
        /*
            r0 = r17
            boolean r1 = tv5.b.f422367n
            if (r1 == 0) goto L90
            java.lang.Class<tv5.b> r15 = tv5.b.class
            monitor-enter(r15)
            tv5.b r1 = tv5.b.f422366m     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L89
            r10 = 0
            if (r0 == 0) goto L81
            boolean r11 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isInMainProcess(r17)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = uv5.a.f431469a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getProcessName(r17)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = uv5.a.a(r17)     // Catch: java.lang.Throwable -> L8d
            r3 = 0
            if (r2 == 0) goto L2e
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L28
            goto L2e
        L28:
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L8d
            r12 = r1
            goto L2f
        L2e:
            r12 = r3
        L2f:
            java.io.File r7 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r17)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "Tinker.Tinker"
            if (r7 != 0) goto L42
            java.lang.String r2 = "patchDirectory is null!"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8d
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L8d
            r1 = 0
            r8 = r1
            r9 = r8
            goto L5d
        L42:
            java.lang.String r2 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L8d
            java.io.File r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L8d
            java.io.File r3 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "tinker patch directory: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L8d
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(r1, r4, r5)     // Catch: java.lang.Throwable -> L8d
            r8 = r2
            r9 = r3
        L5d:
            r3 = 15
            rv5.a r4 = new rv5.a     // Catch: java.lang.Throwable -> L8d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            rv5.b r5 = new rv5.b     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            pv5.b r6 = new pv5.b     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8d
            tv5.b r16 = new tv5.b     // Catch: java.lang.Throwable -> L8d
            boolean r13 = r1.booleanValue()     // Catch: java.lang.Throwable -> L8d
            r14 = 0
            r1 = r16
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8d
            tv5.b.f422366m = r16     // Catch: java.lang.Throwable -> L8d
            goto L89
        L81:
            com.tencent.tinker.loader.TinkerRuntimeException r0 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "Context must not be null."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L89:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8d
            tv5.b r0 = tv5.b.f422366m
            return r0
        L8d:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8d
            throw r0
        L90:
            com.tencent.tinker.loader.TinkerRuntimeException r0 = new com.tencent.tinker.loader.TinkerRuntimeException
            java.lang.String r1 = "you must install tinker before get tinker sInstance"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tv5.b.b(android.content.Context):tv5.b");
    }

    public void a(java.io.File file) {
        java.io.File file2 = this.f422369b;
        if (file2 == null || file == null || !file.exists()) {
            return;
        }
        java.lang.String patchVersionDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(file));
        if (file2 == null || patchVersionDirectory == null) {
            return;
        }
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(file2.getAbsolutePath() + "/" + patchVersionDirectory);
    }
}
