package ec4;

/* loaded from: classes.dex */
public final class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.q0 f251174d;

    public l0(ec4.q0 q0Var) {
        this.f251174d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$1");
        androidx.appcompat.app.AppCompatActivity activity = this.f251174d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((ec4.d0) pf5.z.f353948a.a(activity).a(ec4.d0.class)).V6(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$1");
    }
}
