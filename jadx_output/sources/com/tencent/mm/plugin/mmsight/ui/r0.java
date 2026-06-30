package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f149409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI f149410e;

    public r0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI mMSightRecordViewTestUI, android.widget.TextView textView) {
        this.f149410e = mMSightRecordViewTestUI;
        this.f149409d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f149409d;
        textView.setText("");
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI mMSightRecordViewTestUI = this.f149410e;
        textView.append(java.lang.String.format("picture size: %s, ratio: %s\n", mMSightRecordViewTestUI.f149214d.getPictureSize(), java.lang.Float.valueOf(java.lang.Math.min(mMSightRecordViewTestUI.f149214d.getPictureSize().x, mMSightRecordViewTestUI.f149214d.getPictureSize().y) / java.lang.Math.max(mMSightRecordViewTestUI.f149214d.getPictureSize().x, mMSightRecordViewTestUI.f149214d.getPictureSize().y))));
        textView.append(java.lang.String.format("video size: %s, ratio: %s\n", mMSightRecordViewTestUI.f149214d.getVideoSize(), java.lang.Float.valueOf(java.lang.Math.min(mMSightRecordViewTestUI.f149214d.getVideoSize().x, mMSightRecordViewTestUI.f149214d.getVideoSize().y) / java.lang.Math.max(mMSightRecordViewTestUI.f149214d.getVideoSize().x, mMSightRecordViewTestUI.f149214d.getVideoSize().y))));
        textView.append(java.lang.String.format("preview size limit: %s\n", java.lang.Integer.valueOf(mMSightRecordViewTestUI.f149215e)));
        textView.append(java.lang.String.format("display ratio: %s\n", java.lang.Float.valueOf(mMSightRecordViewTestUI.f149216f)));
        textView.append(java.lang.String.format("view size: %s, ratio: %s\n", new android.graphics.Point(mMSightRecordViewTestUI.f149214d.getWidth(), mMSightRecordViewTestUI.f149214d.getHeight()), java.lang.Float.valueOf(mMSightRecordViewTestUI.f149214d.getWidth() / mMSightRecordViewTestUI.f149214d.getHeight())));
    }
}
