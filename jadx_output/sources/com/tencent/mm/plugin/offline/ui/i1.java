package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class i1 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI f152645e;

    public i1(com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI offlinePayShortcutGuideUI) {
        this.f152645e = offlinePayShortcutGuideUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI.f152485q;
        com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI offlinePayShortcutGuideUI = this.f152645e;
        offlinePayShortcutGuideUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "onFaqClick");
        yo3.b.b("offlinePayShortcutGuideFaqClick", 1);
        com.tencent.mm.wallet_core.ui.r1.V(offlinePayShortcutGuideUI, "https://kf.qq.com/touch/sappfaq/260310VvqYbi260310e6rqEF.html", false);
    }
}
