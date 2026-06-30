package qp1;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile qp1.d f365725a;

    public static final void a() {
        qp1.d dVar = f365725a;
        wu5.c cVar = dVar != null ? dVar.f365715b : null;
        if (cVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAutoCollapse taskId: ");
        qp1.d dVar2 = f365725a;
        sb6.append(dVar2 != null ? java.lang.Long.valueOf(dVar2.f365714a) : null);
        sb6.append(", isDone: ");
        sb6.append(cVar.isDone());
        sb6.append(", isCancelled: ");
        sb6.append(cVar.isCancelled());
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseHelper", sb6.toString());
        if (!cVar.isDone() && !cVar.isCancelled()) {
            cVar.cancel(false);
        }
        f365725a = null;
    }
}
