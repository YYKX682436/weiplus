package gp2;

/* loaded from: classes10.dex */
public final class l implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f274238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f274239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274240d;

    public l(gp2.l0 l0Var, int i17, long j17, android.view.View view) {
        this.f274237a = l0Var;
        this.f274238b = i17;
        this.f274239c = j17;
        this.f274240d = view;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        kotlin.jvm.internal.o.g(info, "info");
        gp2.l0 l0Var = this.f274237a;
        java.lang.String t17 = l0Var.t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoPlay pos:");
        int i17 = this.f274238b;
        sb6.append(i17);
        sb6.append(" liveId=");
        sb6.append(this.f274239c);
        sb6.append(" charge_live liveFreeTimeManager callback freeTomeToWatch=");
        sb6.append(info.getInteger(1));
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        if (info.getInteger(1) <= 0) {
            l0Var.L(i17);
            l0Var.h(i17, this.f274240d);
        }
    }
}
