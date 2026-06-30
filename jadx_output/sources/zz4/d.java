package zz4;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f477712a = new java.util.concurrent.ConcurrentHashMap();

    public d(zz4.a aVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, long j17) {
        zz4.c cVar = (zz4.c) ((java.util.concurrent.ConcurrentHashMap) this.f477712a).remove(com.tencent.mm.sdk.platformtools.w2.a(str + str2));
        if (cVar != null) {
            int i17 = cVar.f477710a - 1;
            cVar.f477710a = i17;
            long j18 = cVar.f477711b + j17;
            cVar.f477711b = j18;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.BatchUpdateReporter", "batch update size: %s", java.lang.Long.valueOf(j18));
                jj0.a.a().b(1, "", java.lang.String.valueOf(cVar.f477711b), 0L);
            }
        }
    }
}
