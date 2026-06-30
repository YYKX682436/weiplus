package ec4;

/* loaded from: classes.dex */
public final class q0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f251182d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f251183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251183e = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
        this.f251182d = getIntent().getBooleanExtra("intent_video_is_preview", false);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.dqc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        if (this.f251182d) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).addIconOptionMenu(0, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete, new ec4.n0(this));
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity2).setBackBtn(new ec4.o0(this));
        } else {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity3).hideTitleView();
        }
        findViewById.setOnClickListener(new ec4.p0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
    }
}
