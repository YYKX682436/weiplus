package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class e implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.h f131948a;

    public e(com.tencent.mm.plugin.finder.view.h hVar) {
        this.f131948a = hVar;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "overScrollBy: deltaX：" + i17 + " deltaY：" + i18 + " scrollX：" + i19 + " scrollY:" + i27 + "  scrollRangeX:" + i28 + " scrollRangeY:" + i29 + " maxOverScrollX:" + i37 + " maxOverScrollY:" + i38 + " isTouchEvent:" + z17);
        return false;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "onScrollChanged l:" + i17 + ", t:" + i18 + "  oldl:" + i19 + " oldt:" + i27);
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.mars.xlog.Log.i("Finder.AnnounceWebViewDialogHelper", "onOverScrolled: scrollX:" + i17 + " scrollY:" + i18 + " clampedX:" + z17 + " clampedY:" + z18);
        com.tencent.mm.plugin.finder.view.h hVar = this.f131948a;
        if (z18 && i18 < 200) {
            hVar.f132191a.setAllowVerticalIntercept(true);
        } else {
            if (!z17 || i17 >= 100) {
                return;
            }
            hVar.f132191a.setAllowHorizontalIntercept(true);
        }
    }
}
