package g95;

/* loaded from: classes5.dex */
public final class z implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p((java.lang.String) obj2);
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        java.lang.Long valueOf = java.lang.Long.valueOf(p17 != null ? p17.w0() : Long.MAX_VALUE);
        com.tencent.mm.storage.l4 p18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p((java.lang.String) obj);
        if (p18 != null) {
            j17 = p18.w0();
        }
        return mz5.a.b(valueOf, java.lang.Long.valueOf(j17));
    }
}
