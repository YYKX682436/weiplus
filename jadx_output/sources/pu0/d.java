package pu0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pu0.e f358412d;

    public d(pu0.e eVar) {
        this.f358412d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pu0.e eVar = this.f358412d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            synchronized (eVar.f358414b) {
                gp.d dVar = eVar.f358413a;
                if (dVar != null) {
                    dVar.release();
                }
                eVar.f358413a = null;
            }
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
