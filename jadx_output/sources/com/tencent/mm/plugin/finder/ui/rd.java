package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class rd implements so2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sd f129776a;

    public rd(com.tencent.mm.plugin.finder.ui.sd sdVar) {
        this.f129776a = sdVar;
    }

    @Override // so2.k5
    public void a(java.lang.String coverUrl, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        com.tencent.mm.plugin.finder.ui.sd sdVar = this.f129776a;
        az2.f fVar = sdVar.f129804b;
        if (fVar != null) {
            fVar.b();
        }
        if (i18 != 0) {
            if (i18 != -5000 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = sdVar.b(com.tencent.mm.R.string.f9c);
            } else {
                kotlin.jvm.internal.o.d(str);
            }
            db5.t7.g(sdVar.f129803a, str);
        } else {
            pm0.v.X(com.tencent.mm.plugin.finder.ui.qd.f129733d);
        }
        sdVar.getClass();
        com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent = new com.tencent.mm.autogen.events.FinderFeedUiActionEvent();
        am.fb fbVar = finderFeedUiActionEvent.f54275g;
        fbVar.f6664b = 50001;
        fbVar.f6668f = "";
        fbVar.f6667e = 0;
        finderFeedUiActionEvent.e();
    }
}
