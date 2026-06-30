package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg f161681d;

    public w1(com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f161681d = previewLastHdHeadImg;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg = this.f161681d;
        if (!com.tencent.mm.vfs.w6.j(previewLastHdHeadImg.f160169h)) {
            dp.a.makeText(previewLastHdHeadImg.getContext(), previewLastHdHeadImg.getContext().getString(com.tencent.mm.R.string.ipv), 1).show();
            return;
        }
        java.lang.String str = q75.c.d() + "hdImg_" + kk.k.g(previewLastHdHeadImg.f160168g.getBytes()) + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        com.tencent.mm.vfs.w6.c(previewLastHdHeadImg.f160169h, str);
        q75.c.f(str, previewLastHdHeadImg.getContext());
        dp.a.makeText(previewLastHdHeadImg.getContext(), previewLastHdHeadImg.getContext().getString(com.tencent.mm.R.string.frx, q75.c.d()), 1).show();
    }
}
