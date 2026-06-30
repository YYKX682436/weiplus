package iq0;

/* loaded from: classes7.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000d, code lost:
    
        if (((iq0.c) iq0.c.f293643f.remove(r2.f293647d)) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(iq0.c r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto Lf
            java.util.Map r0 = iq0.c.f293643f     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r2.f293647d     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L18
            iq0.c r2 = (iq0.c) r2     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L16
        Lf:
            java.lang.String r2 = "MicroMsg.MagicCardStarterHandle"
            java.lang.String r0 = "destroyHandle"
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r1)
            return
        L18:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: iq0.b.a(iq0.c):void");
    }

    public final synchronized iq0.c b(java.lang.String bizName, java.lang.String instanceKey, boolean z17) {
        iq0.c cVar;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceKey, "instanceKey");
        java.lang.String concat = bizName.concat(instanceKey);
        java.util.Map map = iq0.c.f293643f;
        cVar = (iq0.c) ((java.util.LinkedHashMap) map).get(concat);
        if (cVar == null) {
            cVar = new iq0.c(bizName, instanceKey, z17, null);
            map.put(concat, cVar);
        }
        return cVar;
    }
}
