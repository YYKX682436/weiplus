package k82;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final k82.c f304887a = new k82.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f304888b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static k82.a f304889c;

    public final void a(long j17, long j18, java.lang.String snsLocalId, java.lang.String snsServerId, boolean z17) {
        kotlin.jvm.internal.o.g(snsLocalId, "snsLocalId");
        kotlin.jvm.internal.o.g(snsServerId, "snsServerId");
        k82.b bVar = (k82.b) f304888b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f304879i = z17;
            if (j18 >= 0) {
                bVar.f304884n = j18;
            }
            bVar.f304885o = snsLocalId;
            bVar.f304886p = snsServerId;
            return;
        }
        com.tencent.mars.xlog.Log.e("FavEnterReporter", "appendNoteInfo: localId not found, localId=" + j17 + ", msgId=" + j18 + ", snsLocalId=" + snsLocalId + ", snsServerId=" + snsServerId);
    }

    public final void b(long j17) {
        k82.b bVar = (k82.b) f304888b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f304878h = true;
            return;
        }
        com.tencent.mars.xlog.Log.e("FavEnterReporter", "enterFlutterNote: localId not found, localId=" + j17);
    }

    public final void c(long j17, long j18, int i17, int i18, int i19) {
        java.util.HashMap hashMap = f304888b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        k82.b bVar = new k82.b(j17, j18, i17, i18);
        bVar.f304875e = i19;
        hashMap.put(valueOf, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if ((r15.f304886p.length() > 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        if (kotlin.jvm.internal.o.b(r15, ".md") != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(k82.b r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k82.c.d(k82.b):void");
    }

    public final void e(long j17, int i17) {
        k82.b bVar = (k82.b) f304888b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f304882l = i17;
            bVar.f304883m = false;
            bVar.f304877g = java.lang.System.currentTimeMillis();
            d(bVar);
            return;
        }
        com.tencent.mars.xlog.Log.e("FavEnterReporter", "reportEnterFail: localId not found, localId=" + j17 + ", failReason=" + i17);
    }

    public final void f(long j17) {
        k82.b bVar = (k82.b) f304888b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f304883m = true;
            bVar.f304877g = java.lang.System.currentTimeMillis();
            d(bVar);
        } else {
            com.tencent.mars.xlog.Log.e("FavEnterReporter", "reportEnterSuccess: localId not found, localId=" + j17);
        }
    }
}
