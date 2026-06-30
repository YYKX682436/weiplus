package dx0;

/* loaded from: classes5.dex */
public final class m implements com.tencent.maas.moviecomposing.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dx0.n f244453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dx0.r f244454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f244455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.layout.OffsetRange f244456d;

    public m(dx0.n nVar, dx0.r rVar, com.tencent.maas.base.MJID mjid, com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        this.f244453a = nVar;
        this.f244454b = rVar;
        this.f244455c = mjid;
        this.f244456d = offsetRange;
    }

    @Override // com.tencent.maas.moviecomposing.l0
    public final void a(com.tencent.maas.moviecomposing.m0 task, int i17, com.tencent.maas.moviecomposing.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange;
        kotlin.jvm.internal.o.g(task, "task");
        dx0.n nVar = this.f244453a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f244465i;
        dx0.r rVar = this.f244454b;
        boolean containsKey = concurrentHashMap.containsKey(rVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = nVar.f244465i;
        if (containsKey) {
            if ((n0Var != null ? n0Var.f48514a : null) != null) {
                dx0.q qVar = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar != null) {
                    qVar.f244469a = task;
                }
                android.graphics.Bitmap bitmap3 = n0Var.f48514a;
                kotlin.jvm.internal.o.f(bitmap3, "bitmap");
                android.graphics.Bitmap b17 = dx0.o.b(bitmap3, nVar.b());
                dx0.q qVar2 = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar2 != null) {
                    qVar2.f244471c = new dx0.p(b17, n0Var.f48516c);
                }
                dx0.q qVar3 = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar3 != null) {
                    qVar3.f244472d = n0Var.f48515b;
                }
                com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f244456d;
                kotlin.jvm.internal.o.f(offsetRange, "$offsetRange");
                fy0.h hVar = (fy0.h) nVar.f244457a;
                hVar.getClass();
                com.tencent.maas.base.MJID segmentID = this.f244455c;
                kotlin.jvm.internal.o.g(segmentID, "segmentID");
                hVar.f267186a.f(segmentID, offsetRange);
            }
        }
        task.toString();
        dx0.q qVar4 = (dx0.q) concurrentHashMap2.get(rVar);
        if (qVar4 != null && (mJTimeRange = qVar4.f244470b) != null) {
            dx0.o.c(mJTimeRange);
        }
        if (n0Var != null && (bitmap2 = n0Var.f48514a) != null) {
            bitmap2.getWidth();
        }
        if (n0Var == null || (bitmap = n0Var.f48514a) == null) {
            return;
        }
        bitmap.getHeight();
    }
}
