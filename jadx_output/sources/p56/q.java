package p56;

/* loaded from: classes16.dex */
public abstract class q {

    /* renamed from: d, reason: collision with root package name */
    public static final long f352102d = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public abstract p56.p createWorker();

    public long now() {
        return java.lang.System.currentTimeMillis();
    }

    public <S extends p56.q & p56.s> S when(r56.e eVar) {
        return new t56.l0(eVar, this);
    }
}
