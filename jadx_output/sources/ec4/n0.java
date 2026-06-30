package ec4;

/* loaded from: classes.dex */
public final class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.q0 f251178d;

    public n0(ec4.q0 q0Var) {
        this.f251178d = q0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1");
        kotlin.jvm.internal.o.g(it, "it");
        ec4.q0 q0Var = this.f251178d;
        db5.e1.n(q0Var.getActivity(), com.tencent.mm.R.string.jgs, com.tencent.mm.R.string.f490573yv, new ec4.l0(q0Var), ec4.m0.f251175d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1");
        return true;
    }
}
