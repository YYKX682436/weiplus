package dx0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ex0.a0 f244434a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f244435b;

    /* renamed from: c, reason: collision with root package name */
    public final dx0.a f244436c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f244437d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f244438e;

    public g(ex0.a0 timelineVM, android.util.Size thumbnailSize, dx0.a coverThumbnailProviderCallback, kotlinx.coroutines.y0 mainScope) {
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(thumbnailSize, "thumbnailSize");
        kotlin.jvm.internal.o.g(coverThumbnailProviderCallback, "coverThumbnailProviderCallback");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        this.f244434a = timelineVM;
        this.f244435b = thumbnailSize;
        this.f244436c = coverThumbnailProviderCallback;
        this.f244437d = mainScope;
        this.f244438e = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:20)(5:21|(1:23)(1:34)|24|(1:26)(1:33)|(2:28|(2:30|(1:32))))|12|13)|11|12|13))|36|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dx0.g r8, com.tencent.maas.base.MJID r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof dx0.d
            if (r0 == 0) goto L16
            r0 = r10
            dx0.d r0 = (dx0.d) r0
            int r1 = r0.f244427f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f244427f = r1
            goto L1b
        L16:
            dx0.d r0 = new dx0.d
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f244425d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f244427f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L42
            goto L42
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.ResultKt.throwOnFailure(r10)
            ex0.a0 r10 = r8.f244434a
            com.tencent.maas.moviecomposing.o0 r2 = r10.p(r9)
            if (r2 == 0) goto L44
            r8.b(r9)
        L42:
            r1 = r3
            goto L85
        L44:
            ex0.v r10 = r10.f257097g
            ex0.r r10 = r10.g(r9)
            r2 = 0
            if (r10 == 0) goto L50
            com.tencent.maas.moviecomposing.segments.Segment r10 = r10.f257167a
            goto L51
        L50:
            r10 = r2
        L51:
            boolean r5 = r10 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r5 == 0) goto L58
            com.tencent.maas.moviecomposing.segments.ClipSegment r10 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r10
            goto L59
        L58:
            r10 = r2
        L59:
            if (r10 != 0) goto L5c
            goto L42
        L5c:
            ug.m r5 = ug.m.ImageClip
            ug.m r6 = ug.m.VideoClip
            ug.m r7 = ug.m.MovieClip
            ug.m[] r5 = new ug.m[]{r5, r6, r7}
            ug.m r6 = r10.C()
            java.lang.String r7 = "getSegmentType(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            boolean r5 = kz5.z.G(r5, r6)
            if (r5 != 0) goto L76
            goto L42
        L76:
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310570c     // Catch: java.lang.Exception -> L42
            dx0.e r6 = new dx0.e     // Catch: java.lang.Exception -> L42
            r6.<init>(r10, r8, r9, r2)     // Catch: java.lang.Exception -> L42
            r0.f244427f = r4     // Catch: java.lang.Exception -> L42
            java.lang.Object r8 = kotlinx.coroutines.l.g(r5, r6, r0)     // Catch: java.lang.Exception -> L42
            if (r8 != r1) goto L42
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.g.a(dx0.g, com.tencent.maas.base.MJID, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.maas.moviecomposing.o0 p17 = this.f244434a.p(segmentID);
        if (p17 == null) {
            kotlinx.coroutines.l.d(this.f244437d, null, null, new dx0.b(this, segmentID, null), 3, null);
        } else {
            p17.d(e(segmentID), new dx0.c(this, segmentID));
        }
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        android.util.Size size = this.f244435b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height == 0 || width == 0) {
            return null;
        }
        try {
            int width2 = (width - size.getWidth()) / 2;
            if (width2 < 0) {
                width2 = 0;
            }
            int height2 = (height - size.getHeight()) / 2;
            if (height2 < 0) {
                height2 = 0;
            }
            int width3 = size.getWidth();
            int height3 = size.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height3));
            arrayList.add(java.lang.Integer.valueOf(width3));
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(width2));
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJCoverThumbnailProvider", "getCenterCropBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJCoverThumbnailProvider", "getCenterCropBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCoverThumbnailProvider", "getCenterCropBitmap: ", e17);
            return null;
        }
    }

    public final dx0.p d(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        if (this.f244434a.h(segmentID)) {
            return (dx0.p) this.f244438e.get(segmentID);
        }
        return null;
    }

    public final com.tencent.maas.model.time.MJTimeRange e(com.tencent.maas.base.MJID mjid) {
        com.tencent.maas.model.time.MJTimeRange m17;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.ZeroTime, com.tencent.maas.model.time.MJTime.fromSeconds(1.0d));
        ex0.r K = this.f244434a.K(mjid);
        return K == null ? mJTimeRange : (K.f257169c == ug.m.ImageClip || (m17 = K.m()) == null) ? mJTimeRange : new com.tencent.maas.model.time.MJTimeRange(m17.getStartTime(), com.tencent.maas.model.time.MJTime.fromSeconds(1.0d));
    }

    public final void f(com.tencent.maas.base.MJID segmentID) {
        java.lang.String str;
        ug.m mVar;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f244438e;
        if (concurrentHashMap.containsKey(segmentID)) {
            dx0.p pVar = (dx0.p) concurrentHashMap.get(segmentID);
            if ((pVar != null ? pVar.f244467a : null) != null) {
                return;
            }
        }
        ex0.a0 a0Var = this.f244434a;
        ex0.r K = a0Var.K(segmentID);
        com.tencent.maas.moviecomposing.segments.Segment segment = K != null ? K.f257167a : null;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
        if (clipSegment != null) {
            com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
            str = D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.E0(clipSegment, D) : "";
        } else {
            str = null;
        }
        java.lang.String str2 = str != null ? str : "";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            ex0.r K2 = a0Var.K(segmentID);
            if (K2 == null || (mVar = K2.f257169c) == null) {
                mVar = ug.m.None;
            }
            if (mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) {
                if (str2.length() > 0) {
                    kotlinx.coroutines.l.d(this.f244437d, kotlinx.coroutines.q1.f310570c, null, new dx0.f(this, segmentID, str2, null), 2, null);
                }
            }
        }
    }
}
