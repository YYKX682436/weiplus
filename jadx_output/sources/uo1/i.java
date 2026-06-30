package uo1;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f429566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f429567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f429569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f429570i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f429571m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f429572n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.f0 f0Var, android.widget.LinearLayout linearLayout, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, kotlin.jvm.internal.g0 g0Var, android.widget.TextView textView, android.app.Activity activity, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3) {
        super(0);
        this.f429565d = f0Var;
        this.f429566e = linearLayout;
        this.f429567f = mMSwitchBtn;
        this.f429568g = g0Var;
        this.f429569h = textView;
        this.f429570i = activity;
        this.f429571m = mMSwitchBtn2;
        this.f429572n = mMSwitchBtn3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.f0 f0Var = this.f429565d;
        int i17 = f0Var.f310116d & 1;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f429567f;
        android.widget.LinearLayout linearLayout = this.f429566e;
        if (i17 != 0) {
            linearLayout.setVisibility(0);
            mMSwitchBtn.setCheck(true);
        } else {
            linearLayout.setVisibility(8);
            mMSwitchBtn.setCheck(false);
        }
        kotlin.jvm.internal.g0 g0Var = this.f429568g;
        long j17 = g0Var.f310121d;
        android.widget.TextView textView = this.f429569h;
        if (j17 > 0) {
            textView.setVisibility(0);
            textView.setText(this.f429570i.getString(com.tencent.mm.R.string.mxx, fo1.r.a(g0Var.f310121d)));
        } else {
            textView.setVisibility(8);
        }
        this.f429571m.setCheck((f0Var.f310116d & 2) != 0);
        this.f429572n.setCheck((f0Var.f310116d & 4) != 0);
        return jz5.f0.f302826a;
    }
}
