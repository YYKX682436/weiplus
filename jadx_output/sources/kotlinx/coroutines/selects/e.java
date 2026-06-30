package kotlinx.coroutines.selects;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.selects.f f310633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f310634e;

    public e(kotlinx.coroutines.selects.f fVar, yz5.l lVar) {
        this.f310633d = fVar;
        this.f310634e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kotlin.coroutines.Continuation<jz5.f0> bVar;
        kotlinx.coroutines.selects.f fVar = this.f310633d;
        if (fVar.B()) {
            yz5.l lVar = this.f310634e;
            try {
                kotlin.jvm.internal.o.g(lVar, "<this>");
                if (lVar instanceof qz5.a) {
                    bVar = ((qz5.a) lVar).create(fVar);
                } else {
                    oz5.l context = fVar.getContext();
                    bVar = context == oz5.m.f350329d ? new pz5.b(fVar, lVar) : new pz5.c(fVar, context, lVar);
                }
                kotlin.coroutines.Continuation b17 = pz5.f.b(bVar);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.internal.i.b(b17, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), null, 2, null);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                fVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
                throw th6;
            }
        }
    }
}
