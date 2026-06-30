package qb2;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r f361269d;

    public q(qb2.r rVar) {
        this.f361269d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb2.r rVar = this.f361269d;
        rVar.toString();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23049, rVar.f361272a, rVar.f361273b, java.lang.Long.valueOf(rVar.f361274c), rVar.f361275d, java.lang.Long.valueOf(rVar.f361276e));
    }
}
