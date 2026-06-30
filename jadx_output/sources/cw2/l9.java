package cw2;

/* loaded from: classes10.dex */
public final class l9 implements ek4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.m9 f223848a;

    public l9(cw2.m9 m9Var) {
        this.f223848a = m9Var;
    }

    @Override // ek4.a
    public void a(java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(mediaId, jArr);
        cw2.k9 k9Var = (cw2.k9) this.f223848a.f223874b.get(mediaId);
        if (k9Var != null) {
            k9Var.f223810c++;
            k9Var.f223811d = jArr[0];
        }
    }

    @Override // ek4.a
    public void b(java.lang.String mediaId, int i17, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        cw2.k9 k9Var = (cw2.k9) this.f223848a.f223874b.get(mediaId);
        if (k9Var != null) {
            k9Var.f223809b++;
        }
    }

    @Override // ek4.a
    public void c(java.lang.String mediaId, int i17, dn.o oVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        cw2.m9 m9Var = this.f223848a;
        if (m9Var.f223874b.size() > 50) {
            java.util.concurrent.ConcurrentSkipListMap concurrentSkipListMap = m9Var.f223874b;
            concurrentSkipListMap.remove(concurrentSkipListMap.firstKey());
        }
        cw2.k9 k9Var = (cw2.k9) m9Var.f223874b.get(mediaId);
        if (k9Var != null) {
            k9Var.f223808a++;
        } else {
            m9Var.f223874b.put(mediaId, new cw2.k9(1, 0, 0, 0L));
        }
    }

    @Override // ek4.a
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        cw2.k9 k9Var = (cw2.k9) this.f223848a.f223874b.get(mediaId);
        if (k9Var != null) {
            k9Var.f223811d = j17;
        }
    }
}
