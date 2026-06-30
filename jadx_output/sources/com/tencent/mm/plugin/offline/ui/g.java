package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f152619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f152620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f152621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f152622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152623h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.widget.CheckBox checkBox, android.view.View.OnClickListener onClickListener, android.view.ViewGroup viewGroup, android.widget.Button button) {
        super(false);
        this.f152623h = offlineAlertView;
        this.f152619d = checkBox;
        this.f152620e = onClickListener;
        this.f152621f = viewGroup;
        this.f152622g = button;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        if (this.f152619d.isChecked()) {
            this.f152620e.onClick(view);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22805, 2);
            return;
        }
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.f152623h;
        int dimensionPixelOffset = offlineAlertView.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.f152621f, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22805, 1);
        this.f152622g.announceForAccessibility(offlineAlertView.getContext().getString(com.tencent.mm.R.string.kke));
    }
}
