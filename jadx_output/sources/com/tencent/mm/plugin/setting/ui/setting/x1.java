package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg f161721d;

    public x1(com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f161721d = previewLastHdHeadImg;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg = this.f161721d;
        dp.a.makeText(previewLastHdHeadImg.getContext(), previewLastHdHeadImg.getContext().getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
