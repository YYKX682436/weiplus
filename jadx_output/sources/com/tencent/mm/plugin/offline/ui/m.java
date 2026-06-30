package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152671f;

    public m(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.view.View view, android.view.View view2) {
        this.f152671f = offlineAlertView;
        this.f152669d = view;
        this.f152670e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f152669d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getHeight());
        android.view.View view2 = this.f152670e;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", valueOf, java.lang.Integer.valueOf(view2.getMeasuredHeight()));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        if (view2.getMeasuredHeight() > view.getHeight()) {
            layoutParams.height = view2.getMeasuredHeight();
            view2.setLayoutParams(layoutParams);
        } else if (view.getHeight() > 0) {
            layoutParams.height = view.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.offline.ui.z zVar = this.f152671f.f152477h;
        if (zVar != null) {
            ((com.tencent.mm.plugin.offline.ui.q1) zVar).a();
        }
    }
}
