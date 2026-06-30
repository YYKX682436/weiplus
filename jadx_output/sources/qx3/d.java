package qx3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final qx3.d f367349a = new qx3.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f367350b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static final vx3.i a(long j17) {
        vx3.i iVar;
        java.util.Map cacheRingtoneItem = f367350b;
        kotlin.jvm.internal.o.f(cacheRingtoneItem, "cacheRingtoneItem");
        synchronized (cacheRingtoneItem) {
            iVar = (vx3.i) cacheRingtoneItem.get(java.lang.Long.valueOf(j17));
        }
        return iVar;
    }

    public static final void c(long j17, vx3.i info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map cacheRingtoneItem = f367350b;
        kotlin.jvm.internal.o.f(cacheRingtoneItem, "cacheRingtoneItem");
        synchronized (cacheRingtoneItem) {
            kotlin.jvm.internal.o.f(cacheRingtoneItem, "cacheRingtoneItem");
            cacheRingtoneItem.put(java.lang.Long.valueOf(j17), info);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vx3.i r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx3.d.b(vx3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
