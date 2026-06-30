package qp1;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long f365746a;

    /* renamed from: b, reason: collision with root package name */
    public long f365747b;

    /* renamed from: c, reason: collision with root package name */
    public long f365748c;

    /* renamed from: d, reason: collision with root package name */
    public long f365749d;

    /* renamed from: e, reason: collision with root package name */
    public long f365750e;

    /* renamed from: f, reason: collision with root package name */
    public long f365751f;

    /* renamed from: g, reason: collision with root package name */
    public long f365752g;

    /* renamed from: h, reason: collision with root package name */
    public long f365753h;

    /* renamed from: i, reason: collision with root package name */
    public gp1.w f365754i;

    public void a(gp1.w action, java.lang.Long l17) {
        boolean z17;
        kotlin.jvm.internal.o.g(action, "action");
        long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
        gp1.w wVar = this.f365754i;
        boolean z18 = true;
        if (wVar == null && action == gp1.w.f274186d) {
            this.f365747b = longValue;
            z17 = true;
        } else {
            z17 = false;
        }
        gp1.w wVar2 = gp1.w.f274187e;
        if (action != wVar2) {
            gp1.w wVar3 = gp1.w.f274189g;
            if (action != wVar3) {
                gp1.w wVar4 = gp1.w.f274191i;
                if (action == wVar4) {
                    if (wVar != wVar4) {
                        this.f365753h = longValue;
                        z17 = true;
                    }
                } else if (action == gp1.w.f274193n) {
                    long j17 = this.f365747b;
                    if (j17 != 0) {
                        this.f365746a = longValue - j17;
                    }
                    z17 = true;
                }
            } else if (wVar != wVar3) {
                this.f365752g = longValue;
                z17 = true;
            }
        } else if (wVar != wVar2) {
            this.f365751f = longValue;
            z17 = true;
        }
        if (wVar == wVar2) {
            if (action == gp1.w.f274188f || action == gp1.w.f274193n) {
                long j18 = this.f365751f;
                if (j18 != 0) {
                    this.f365750e += longValue - j18;
                }
            }
            z18 = z17;
        } else if (wVar == gp1.w.f274189g) {
            if (action == gp1.w.f274190h || action == gp1.w.f274193n) {
                long j19 = this.f365752g;
                if (j19 != 0) {
                    this.f365748c += longValue - j19;
                }
            }
            z18 = z17;
        } else {
            if (wVar == gp1.w.f274191i && (action == gp1.w.f274192m || action == gp1.w.f274193n)) {
                long j27 = this.f365753h;
                if (j27 != 0) {
                    this.f365749d += longValue - j27;
                }
            }
            z18 = z17;
        }
        java.util.Objects.toString(wVar);
        action.toString();
        if (z18) {
            this.f365754i = action;
        }
        if (action == gp1.w.f274186d || action == gp1.w.f274193n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallTimeCollector", "onAction action: " + action + ", currentTimestamp: " + longValue);
        }
    }
}
