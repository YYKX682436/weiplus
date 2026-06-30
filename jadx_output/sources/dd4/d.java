package dd4;

/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.ui.widget.dialog.k0 {

    /* renamed from: q2, reason: collision with root package name */
    public final android.content.Context f228979q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f228980r2;

    /* renamed from: s2, reason: collision with root package name */
    public ik4.p f228981s2;

    /* renamed from: t2, reason: collision with root package name */
    public xc4.p f228982t2;

    /* renamed from: u2, reason: collision with root package name */
    public android.view.View.OnLongClickListener f228983u2;

    /* renamed from: v2, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f228984v2;

    /* renamed from: w2, reason: collision with root package name */
    public r45.jj4 f228985w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, 1, true);
        kotlin.jvm.internal.o.g(context, "context");
        this.f228979q2 = context;
        n(false);
        this.V1 = true;
        this.U1 = true;
        android.widget.LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.U.removeAllViews();
            this.U.setGravity(17);
            android.view.View inflate = android.view.LayoutInflater.from(this.f211870m).inflate(com.tencent.mm.R.layout.f489272by3, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
            textView.setText("视频Debug面板");
            textView.setGravity(81);
            if (this.f211857e2) {
                textView.setTextColor(this.f211870m.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            this.U.addView(inflate, -1, -2);
        }
        this.f211872n = dd4.a.f228967d;
        this.f211881s = new dd4.b(this);
    }

    @Override // com.tencent.mm.ui.widget.dialog.k0
    public void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
        android.view.Window window = this.f211864i.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        super.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
    }
}
