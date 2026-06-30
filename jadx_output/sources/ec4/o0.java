package ec4;

/* loaded from: classes.dex */
public final class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.q0 f251179d;

    public o0(ec4.q0 q0Var) {
        this.f251179d = q0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$2");
        kotlin.jvm.internal.o.g(it, "it");
        androidx.appcompat.app.AppCompatActivity activity = this.f251179d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((ec4.d0) pf5.z.f353948a.a(activity).a(ec4.d0.class)).V6(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$2");
        return true;
    }
}
