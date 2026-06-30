package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes10.dex */
public class p0 implements al5.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.VideoActivity f176976a;

    public p0(com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity) {
        this.f176976a = videoActivity;
    }

    @Override // al5.e3
    public void a(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity = this.f176976a;
            db5.f.c(videoActivity, null);
            videoActivity.getSwipeBackLayout().d(true);
        }
    }

    @Override // al5.e3
    public void b(int i17, int i18, int i19, int i27, float f17) {
    }

    @Override // al5.e3
    public void c() {
        com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity = this.f176976a;
        videoActivity.getSwipeBackLayout().setNeedRequestActivityTranslucent(true);
        videoActivity.getSwipeBackLayout().d(false);
        db5.f.b(videoActivity);
    }
}
