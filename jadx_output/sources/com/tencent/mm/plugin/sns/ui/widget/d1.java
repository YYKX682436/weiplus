package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f171111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView f171112e;

    public d1(com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView, int[] iArr) {
        this.f171112e = snsAvatarImageView;
        this.f171111d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView$1");
        int[] iArr = new int[2];
        com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView = this.f171112e;
        android.view.View contentView = snsAvatarImageView.f170841q.getContentView();
        contentView.getLocationOnScreen(iArr);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.qqi);
        findViewById.measure(0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = ((this.f171111d[0] + (snsAvatarImageView.getWidth() / 2)) - iArr[0]) - (findViewById.getMeasuredWidth() / 2);
        findViewById.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView$1");
    }
}
