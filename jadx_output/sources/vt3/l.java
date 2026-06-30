package vt3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.maas.analytics.MJAssetInfoStatistics f440006b;

    /* renamed from: c, reason: collision with root package name */
    public static u26.w f440007c;

    /* renamed from: d, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f440008d;

    /* renamed from: e, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f440009e;

    /* renamed from: a, reason: collision with root package name */
    public static final vt3.l f440005a = new vt3.l();

    /* renamed from: f, reason: collision with root package name */
    public static kotlinx.coroutines.y0 f440010f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vt3.l r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof vt3.k
            if (r0 == 0) goto L16
            r0 = r5
            vt3.k r0 = (vt3.k) r0
            int r1 = r0.f440004f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f440004f = r1
            goto L1b
        L16:
            vt3.k r0 = new vt3.k
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r4 = r0.f440002d
            pz5.a r5 = pz5.a.f359186d
            int r1 = r0.f440004f
            java.lang.String r2 = "AssetInfoStatistics"
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r4)
            goto L60
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.r2 r4 = vt3.l.f440009e
            if (r4 != 0) goto L43
            java.lang.String r4 = "waitReady, initJob is null"
            com.tencent.mars.xlog.Log.e(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L73
        L43:
            boolean r4 = r4.a()
            if (r4 != r3) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto L60
            java.lang.String r4 = "waitReady to join the init job"
            com.tencent.mars.xlog.Log.i(r2, r4)
            kotlinx.coroutines.r2 r4 = vt3.l.f440009e
            if (r4 == 0) goto L60
            r0.f440004f = r3
            java.lang.Object r4 = r4.C(r0)
            if (r4 != r5) goto L60
            goto L73
        L60:
            kotlinx.coroutines.r2 r4 = vt3.l.f440008d
            if (r4 == 0) goto L6c
            com.tencent.maas.analytics.MJAssetInfoStatistics r4 = vt3.l.f440006b
            if (r4 != 0) goto L69
            goto L6c
        L69:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L73
        L6c:
            java.lang.String r4 = "waitReady but isReleased"
            com.tencent.mars.xlog.Log.e(r2, r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vt3.l.a(vt3.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.util.List mediaFilePaths, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(mediaFilePaths, "mediaFilePaths");
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "addMedia, mediaFilePaths: " + mediaFilePaths + ", scene: " + i17 + ", isFinal: " + z17);
        if (mediaFilePaths.isEmpty()) {
            com.tencent.mars.xlog.Log.e("AssetInfoStatistics", "mediaFilePaths is empty");
        } else {
            c(new vt3.a(mediaFilePaths, i17, z17));
        }
    }

    public final void c(yz5.a aVar) {
        synchronized (this) {
            if (f440008d != null) {
                com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "already initialized");
            } else {
                com.tencent.mars.xlog.Log.i("AssetInfoStatistics", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                if (!kotlinx.coroutines.z0.h(f440010f)) {
                    f440010f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
                }
                if (f440007c == null) {
                    f440007c = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
                }
                f440008d = kotlinx.coroutines.l.d(f440010f, null, null, new vt3.c(null), 3, null);
                f440009e = kotlinx.coroutines.l.d(f440010f, null, null, new vt3.d(null), 3, null);
            }
        }
        u26.w wVar = f440007c;
        if (wVar != null) {
            wVar.e(new vt3.b(aVar, null));
        } else {
            com.tencent.mars.xlog.Log.e("AssetInfoStatistics", "taskChannel is null, cannot send task");
        }
    }

    public final synchronized void d() {
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "release");
        if (f440008d == null) {
            com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "isReleased to return");
            return;
        }
        u26.w wVar = f440007c;
        if (wVar != null) {
            wVar.e(new vt3.f(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vt3.i
            if (r0 == 0) goto L13
            r0 = r8
            vt3.i r0 = (vt3.i) r0
            int r1 = r0.f439999h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439999h = r1
            goto L18
        L13:
            vt3.i r0 = new vt3.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f439997f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f439999h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L79
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            java.lang.Object r2 = r0.f439996e
            u26.w r2 = (u26.w) r2
            java.lang.Object r4 = r0.f439995d
            vt3.l r4 = (vt3.l) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L3f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "AssetInfoStatistics"
            java.lang.String r2 = "toBinaryBuffer"
            com.tencent.mars.xlog.Log.i(r8, r2)
            r8 = 0
            r2 = 6
            u26.w r2 = u26.z.a(r8, r5, r5, r2, r5)
            u26.w r8 = vt3.l.f440007c
            if (r8 == 0) goto L68
            vt3.j r6 = new vt3.j
            r6.<init>(r2, r5)
            r0.f439995d = r7
            r0.f439996e = r2
            r0.f439999h = r4
            java.lang.Object r8 = r8.t(r6, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            jz5.f0 r8 = jz5.f0.f302826a
            goto L69
        L68:
            r8 = r5
        L69:
            if (r8 != 0) goto L6c
            return r5
        L6c:
            r0.f439995d = r5
            r0.f439996e = r5
            r0.f439999h = r3
            java.lang.Object r8 = r2.r(r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vt3.l.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
