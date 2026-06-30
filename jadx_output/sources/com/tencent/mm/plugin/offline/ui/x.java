package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f152754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f152755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f152756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflineAlertView f152757g;

    public x(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f152757g = offlineAlertView;
        this.f152754d = textView;
        this.f152755e = imageView;
        this.f152756f = imageView2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f152754d.getLineCount() > 1) {
            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = this.f152757g;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.h(offlineAlertView.getContext(), com.tencent.mm.R.dimen.f479688cn), i65.a.h(offlineAlertView.getContext(), com.tencent.mm.R.dimen.f479688cn));
            int b17 = i65.a.b(offlineAlertView.getContext(), 2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = b17;
            this.f152755e.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i65.a.h(offlineAlertView.getContext(), com.tencent.mm.R.dimen.f479738dv), i65.a.h(offlineAlertView.getContext(), com.tencent.mm.R.dimen.f479688cn));
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = b17;
            this.f152756f.setLayoutParams(layoutParams2);
        }
    }
}
