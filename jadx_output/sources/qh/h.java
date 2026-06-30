package qh;

/* loaded from: classes12.dex */
public class h implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f363354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f363355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.u f363356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f363357d;

    public h(qh.t tVar, rh.o2 o2Var, wh.n1 n1Var, qh.u uVar, long j17) {
        this.f363354a = o2Var;
        this.f363355b = n1Var;
        this.f363356c = uVar;
        this.f363357d = j17;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f363354a;
        rh.f1 f1Var = (rh.f1) o2Var2.f395484a;
        long longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395484a).f52561g.f395552a).longValue();
        wh.n1 n1Var = this.f363355b;
        double c17 = f1Var.c(n1Var, longValue);
        double c18 = ((rh.f1) o2Var2.f395485b).c(n1Var, ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395485b).f52561g.f395552a).longValue());
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, "%.2f(mAh)/min", java.lang.Double.valueOf((c18 - c17) / this.f363357d));
        qh.u uVar = this.f363356c;
        uVar.h("inc_prc_sip", format);
        uVar.h("cur_prc_sip", java.lang.String.format(locale, "%.2f(mAh)", java.lang.Double.valueOf(c18)));
    }
}
