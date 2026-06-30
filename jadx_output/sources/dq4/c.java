package dq4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final dq4.c f242369a = new dq4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final float f242370b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_finder_full_screen_inside_radio, 1.7777778f);

    public final float a(android.content.Context context, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_finder_jumpe_check_gop_size
            h62.d r0 = (h62.d) r0
            r2 = 1
            boolean r0 = r0.fj(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getGOPSize path:"
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r3 = " enable:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.FinderEditUtil"
            com.tencent.mars.xlog.Log.i(r3, r1)
            boolean r1 = com.tencent.mm.vfs.w6.j(r9)
            r4 = 0
            if (r1 != 0) goto L3b
            if (r0 == 0) goto L3b
            return r4
        L3b:
            gp.c r0 = new gp.c
            r0.<init>()
            r0.k(r9)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            int r1 = r0.d()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            r5 = r4
        L48:
            if (r5 >= r1) goto L70
            android.media.MediaFormat r6 = r0.e(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            java.lang.String r7 = "getTrackFormat(...)"
            kotlin.jvm.internal.o.f(r6, r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            java.lang.String r7 = "mime"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            java.lang.String r7 = "video"
            if (r6 == 0) goto L66
            boolean r6 = r26.n0.B(r6, r7, r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            if (r6 != r2) goto L66
            r6 = r2
            goto L67
        L66:
            r6 = r4
        L67:
            if (r6 == 0) goto L6d
            r0.i(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            goto L70
        L6d:
            int r5 = r5 + 1
            goto L48
        L70:
            r1 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9c
            r5 = r4
        L78:
            int r6 = r0.f(r1, r4)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> L97
            if (r6 <= 0) goto L91
            android.media.MediaExtractor r6 = r0.f274162a     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> L97
            int r6 = r6.getSampleFlags()     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> L97
            if (r6 != r2) goto L8b
            if (r5 <= 0) goto L8b
            int r5 = r5 + 1
            goto L91
        L8b:
            int r5 = r5 + 1
            r0.a()     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> L97
            goto L78
        L91:
            r0.g()
            goto La0
        L95:
            r4 = r5
            goto L9c
        L97:
            r9 = move-exception
            r0.g()
            throw r9
        L9c:
            r0.g()
            r5 = r4
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "path:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = "  gop:"
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dq4.c.b(java.lang.String):int");
    }

    public final float c() {
        boolean z17 = false;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_video_3_4_ratio_enable, 0);
        int i17 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_VIDEO_RATIO_3_4_INT_SYNC", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoCropLocalConfig", "init, isEnable43RatioVideo:" + Ni + ", localConfig:" + i17);
        if (i17 == 0 ? Ni == 1 : i17 == 1) {
            z17 = true;
        }
        return z17 ? 1.3333334f : 1.1666666f;
    }

    public final void d(java.lang.String source, java.lang.String dst) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dst, "dst");
        ((d60.e0) ((e60.l1) i95.n0.c(e60.l1.class))).getClass();
        z23.i.f469747a.a(source, dst);
    }

    public final void e(long j17, int i17, android.graphics.Bitmap bitmap, java.lang.String path) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.sdk.platformtools.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, path, false);
        for (int i18 = 0; j17 > 0 && com.tencent.mm.vfs.w6.k(path) > j17 && i17 > 0 && i18 <= 5; i18++) {
            i17 -= 5;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, path, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderEditUtil", "makePhotoSizeConformity  maxSize:" + j17 + "  compressQuality:" + i17 + " size:" + com.tencent.mm.vfs.w6.j(path));
    }

    public final void f(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        view.post(new dq4.b(view));
    }
}
