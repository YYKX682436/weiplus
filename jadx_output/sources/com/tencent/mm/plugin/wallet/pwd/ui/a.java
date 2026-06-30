package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f178970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference f178971e;

    public a(com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference, android.view.View view) {
        this.f178971e = radioBelowSummarytAndIconPreference;
        this.f178970d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference = this.f178971e;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) radioBelowSummarytAndIconPreference.P.getLayoutParams();
        layoutParams.leftMargin = this.f178970d.findViewById(android.R.id.summary).getWidth();
        radioBelowSummarytAndIconPreference.P.setLayoutParams(layoutParams);
    }
}
