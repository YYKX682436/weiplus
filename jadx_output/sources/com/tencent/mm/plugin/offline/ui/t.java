package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f152713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f152714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152717h;

    public t(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, java.lang.Runnable runnable, java.lang.Runnable runnable2, android.view.View view, android.view.View view2) {
        this.f152717h = offlineAlertView;
        this.f152713d = runnable;
        this.f152714e = runnable2;
        this.f152715f = view;
        this.f152716g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.f152717h;
        android.widget.TextView textView = (android.widget.TextView) offlineAlertView.f152474e.findViewById(com.tencent.mm.R.id.h5h);
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.offline.ui.q(this));
        }
        android.widget.TextView textView2 = (android.widget.TextView) offlineAlertView.f152474e.findViewById(com.tencent.mm.R.id.nxl);
        if (textView2 != null) {
            com.tencent.mm.wallet_core.ui.r1.w0(textView2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.krt), 0, textView2.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.offline.ui.r(this), true), offlineAlertView.f152474e.getContext());
        }
        android.view.View view = this.f152715f;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getMeasuredHeight()));
        android.view.View view2 = this.f152716g;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        if (view2.getMeasuredHeight() > view.getHeight()) {
            layoutParams.height = view2.getMeasuredHeight();
            view2.setLayoutParams(layoutParams);
        } else if (view.getHeight() > 0) {
            layoutParams.height = view.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        offlineAlertView.f152476g = false;
        com.tencent.mm.plugin.offline.ui.z zVar = offlineAlertView.f152477h;
        if (zVar != null) {
            ((com.tencent.mm.plugin.offline.ui.q1) zVar).a();
        }
    }
}
