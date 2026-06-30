package ji;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ji.q f299881a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.q f299882b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f299883c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f299884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f299885e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.r f299886f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f299887g;

    public h(boolean z17, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner iBackgroundStatefulOwner, long j17, long j18, long j19, int i17, yz5.r rVar, yz5.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        boolean z18 = (i18 & 1) != 0 ? true : z17;
        com.tencent.matrix.lifecycle.IBackgroundStatefulOwner bgStatefulOwner = (i18 & 2) != 0 ? com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE : iBackgroundStatefulOwner;
        long millis = (i18 & 4) != 0 ? java.util.concurrent.TimeUnit.MINUTES.toMillis(3L) : j17;
        int i19 = i18 & 8;
        long j27 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        long j28 = i19 != 0 ? Long.MAX_VALUE : j18;
        j27 = (i18 & 16) == 0 ? j19 : j27;
        int i27 = (i18 & 32) != 0 ? 3 : i17;
        yz5.r callback = (i18 & 64) != 0 ? ji.f.f299879d : rVar;
        yz5.a extraPssFactory = (i18 & 128) != 0 ? ji.g.f299880d : aVar;
        kotlin.jvm.internal.o.g(bgStatefulOwner, "bgStatefulOwner");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(extraPssFactory, "extraPssFactory");
        this.f299883c = z18;
        this.f299884d = bgStatefulOwner;
        this.f299885e = millis;
        this.f299886f = callback;
        this.f299887g = extraPssFactory;
        this.f299881a = new ji.q(j28, i27, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L));
        this.f299882b = new ji.q(j27, i27, 0L);
    }

    public java.lang.String toString() {
        return "AppBgSumPssMonitorConfig(enable=" + this.f299883c + ", bgStatefulOwner=" + this.f299884d + ", checkInterval=" + this.f299885e + ", callback=" + this.f299886f.getClass().getName() + ", thresholdKB=" + this.f299881a + ", extraPssFactory=" + this.f299887g.getClass().getName() + ')';
    }
}
