package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310169b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.f1[] f310170a;
    volatile /* synthetic */ int notCompletedCount;

    public e(kotlinx.coroutines.f1[] f1VarArr) {
        this.f310170a = f1VarArr;
        this.notCompletedCount = f1VarArr.length;
    }

    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.Object[] objArr = this.f310170a;
        int length = objArr.length;
        kotlinx.coroutines.c[] cVarArr = new kotlinx.coroutines.c[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            ((kotlinx.coroutines.c3) obj).start();
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(this, rVar);
            cVar.f310147i = ((kotlinx.coroutines.c3) obj).p(cVar);
            cVarArr[i17] = cVar;
        }
        kotlinx.coroutines.d dVar = new kotlinx.coroutines.d(this, cVarArr);
        for (int i18 = 0; i18 < length; i18++) {
            cVarArr[i18].x(dVar);
        }
        if (rVar.o()) {
            dVar.d();
        } else {
            rVar.m(dVar);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
