package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f152629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f152630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152632g;

    public h(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.widget.TextView textView, android.widget.CheckBox checkBox, android.view.View view) {
        this.f152632g = offlineAlertView;
        this.f152629d = textView;
        this.f152630e = checkBox;
        this.f152631f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f152629d;
        if (textView.getLineCount() > 1) {
            android.widget.CheckBox checkBox = this.f152630e;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) checkBox.getLayoutParams();
            if (layoutParams != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                textView.getLineBounds(0, rect);
                int height = (rect.height() - layoutParams.height) / 2;
                layoutParams.gravity = 48;
                layoutParams.topMargin = height;
                checkBox.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.f152632g;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) offlineAlertView.findViewById(com.tencent.mm.R.id.chq);
        if (linearLayout == null) {
            return;
        }
        android.view.View view = this.f152631f;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "showOpenAlertView: qrCodeView.getHeight%s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(linearLayout.getHeight()));
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (linearLayout.getHeight() > view.getHeight()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflineAlertView", "don't modify alert height");
            layoutParams2.height = linearLayout.getHeight();
            linearLayout.setLayoutParams(layoutParams2);
        } else if (linearLayout.getHeight() > 0) {
            layoutParams2.height = view.getHeight();
            linearLayout.setLayoutParams(layoutParams2);
            android.view.View findViewById = offlineAlertView.findViewById(com.tencent.mm.R.id.f487578p21);
            android.view.View findViewById2 = offlineAlertView.findViewById(com.tencent.mm.R.id.f487579p22);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams3.weight = 67.0f;
            findViewById.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams4.weight = 56.0f;
            findViewById2.setLayoutParams(layoutParams4);
        }
        com.tencent.mm.plugin.offline.ui.z zVar = offlineAlertView.f152477h;
        if (zVar != null) {
            ((com.tencent.mm.plugin.offline.ui.q1) zVar).a();
        }
    }
}
