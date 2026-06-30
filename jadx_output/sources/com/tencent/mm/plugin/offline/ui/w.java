package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152746f;

    public w(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.view.View view, android.view.View view2) {
        this.f152746f = offlineAlertView;
        this.f152744d = view;
        this.f152745e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f152744d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "showFirstPostTip: qrCodeView.getHeight %s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getMeasuredHeight()));
        android.view.View view2 = this.f152745e;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        int height = view.getHeight();
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.f152746f;
        if (height > 0) {
            if (view2.getHeight() > view.getHeight()) {
                offlineAlertView.requestLayout();
            } else {
                layoutParams.height = view.getHeight();
                view2.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.offline.ui.z zVar = offlineAlertView.f152477h;
        if (zVar != null) {
            ((com.tencent.mm.plugin.offline.ui.q1) zVar).a();
        }
    }
}
