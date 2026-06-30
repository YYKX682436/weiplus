package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class q9 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129726d;

    public q9(com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI) {
        this.f129726d = finderLiveShareProductUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.finder.ui.p9(this.f129726d), 200L);
    }
}
