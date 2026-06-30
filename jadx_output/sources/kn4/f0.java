package kn4;

/* loaded from: classes12.dex */
public class f0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public long f309687d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f309688e;

    /* renamed from: f, reason: collision with root package name */
    public long f309689f;

    /* renamed from: g, reason: collision with root package name */
    public long f309690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kn4.g0 f309691h;

    public f0(kn4.g0 g0Var) {
        long j17;
        long j18;
        this.f309691h = g0Var;
        long j19 = 0;
        if (kn4.v.f309758e) {
            j17 = kn4.v.f309755b + (java.lang.System.currentTimeMillis() - kn4.v.f309757d);
        } else {
            j17 = kn4.v.f309755b;
        }
        this.f309688e = j17;
        if (kn4.v.f309758e) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - kn4.v.f309757d;
            long j27 = kn4.v.f309756c;
            if (currentTimeMillis > 0) {
                java.util.Map map = kn4.n0.f309730a;
                if (((java.util.HashMap) map).containsKey(kn4.v.f309759f)) {
                    kotlin.jvm.internal.o.d(((java.util.HashMap) map).get(kn4.v.f309759f));
                    j19 = (long) (((java.lang.Number) r9).longValue() * ((currentTimeMillis / 1000) / 60));
                }
            }
            j18 = j27 + j19;
        } else {
            j18 = kn4.v.f309756c;
        }
        this.f309689f = j18;
        java.util.Map map2 = kn4.q.f309743a;
        this.f309690g = com.tencent.mm.sdk.platformtools.o4.L().p("FileTransportStats_accumulateSize");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0259 A[RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 2711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn4.f0.run():void");
    }
}
