package pu0;

/* loaded from: classes5.dex */
public final class b implements pu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f358409a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.ASRProcessor f358410b;

    public b(com.tencent.mm.sdk.platformtools.o4 mmkey) {
        kotlin.jvm.internal.o.g(mmkey, "mmkey");
        this.f358409a = mmkey;
    }

    @Override // pu0.a
    public synchronized void a() {
        com.tencent.maas.moviecomposing.ASRProcessor aSRProcessor = this.f358410b;
        if (aSRProcessor != null) {
            aSRProcessor.e();
        }
        com.tencent.maas.moviecomposing.ASRProcessor aSRProcessor2 = this.f358410b;
        if (aSRProcessor2 != null) {
            aSRProcessor2.d();
        }
        this.f358410b = null;
    }

    public final java.util.HashMap b(com.tencent.mm.vfs.r6 r6Var, java.util.List list) {
        com.tencent.mm.vfs.r6[] G;
        java.lang.Object obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                java.lang.String name = r6Var2.getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                if (!r26.n0.B(name, "__MACOSX", false)) {
                    if (r6Var2.y()) {
                        hashMap.putAll(b(r6Var2, list));
                    } else if (r6Var2.A()) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            java.lang.String name2 = r6Var2.getName();
                            kotlin.jvm.internal.o.f(name2, "getName(...)");
                            if (r26.i0.y(name2, (java.lang.String) obj, false)) {
                                break;
                            }
                        }
                        java.lang.String str = (java.lang.String) obj;
                        if (str != null) {
                            hashMap.put(str, r6Var2);
                        }
                        r6Var2.getName();
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.moviecomposing.ASRProcessor c() {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu0.b.c():com.tencent.maas.moviecomposing.ASRProcessor");
    }

    public synchronized java.lang.Boolean d(java.nio.ByteBuffer t17) {
        java.lang.Object m521constructorimpl;
        com.tencent.maas.moviecomposing.ASRSegmentationInfo aSRSegmentationInfo;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange;
        kotlin.jvm.internal.o.g(t17, "t");
        com.tencent.maas.moviecomposing.ASRProcessor aSRProcessor = this.f358410b;
        java.lang.Boolean valueOf = aSRProcessor != null ? java.lang.Boolean.valueOf(aSRProcessor.b()) : null;
        com.tencent.mars.xlog.Log.i("SubtitleLocalARSApi", "process: isResourcesReady " + valueOf);
        if (!kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            return java.lang.Boolean.FALSE;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.maas.moviecomposing.ASRProcessor aSRProcessor2 = this.f358410b;
            boolean z17 = false;
            if (aSRProcessor2 != null && (aSRSegmentationInfo = (com.tencent.maas.moviecomposing.ASRSegmentationInfo) kz5.z.O(aSRProcessor2.c(t17))) != null && (mJTimeRange = aSRSegmentationInfo.f48361a) != null && mJTimeRange.isValid()) {
                z17 = true;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("SubtitleLocalARSApi", "SubtitleLocalARSApi process: ", m524exceptionOrNullimpl);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = bool;
        }
        return (java.lang.Boolean) m521constructorimpl;
    }
}
