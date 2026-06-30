package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class o extends kotlinx.coroutines.p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.o f310621e = new kotlinx.coroutines.scheduling.o();

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        kotlinx.coroutines.scheduling.e eVar = kotlinx.coroutines.scheduling.e.f310609f;
        eVar.f310611e.b(runnable, kotlinx.coroutines.scheduling.n.f310620g, false);
    }

    @Override // kotlinx.coroutines.p0
    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        kotlinx.coroutines.scheduling.e eVar = kotlinx.coroutines.scheduling.e.f310609f;
        eVar.f310611e.b(runnable, kotlinx.coroutines.scheduling.n.f310620g, true);
    }
}
