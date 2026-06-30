package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class kd implements so2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sd f129431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129432b;

    public kd(com.tencent.mm.plugin.finder.ui.sd sdVar, java.lang.String str) {
        this.f129431a = sdVar;
        this.f129432b = str;
    }

    @Override // so2.k5
    public void a(java.lang.String coverUrl, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        com.tencent.mm.plugin.finder.ui.sd sdVar = this.f129431a;
        az2.f fVar = sdVar.f129804b;
        if (fVar != null) {
            fVar.b();
        }
        java.lang.String str2 = this.f129432b;
        if (str2 == null) {
            str2 = "";
        }
        sdVar.getClass();
        com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent = new com.tencent.mm.autogen.events.FinderFeedUiActionEvent();
        am.fb fbVar = finderFeedUiActionEvent.f54275g;
        fbVar.f6664b = 50000;
        fbVar.f6668f = str2;
        fbVar.f6667e = i17;
        finderFeedUiActionEvent.e();
        if (i18 == 0) {
            pm0.v.X(com.tencent.mm.plugin.finder.ui.jd.f129395d);
            db5.t7.h(sdVar.f129803a, sdVar.b(com.tencent.mm.R.string.eon));
            return;
        }
        if (i18 != -5000 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = sdVar.b(com.tencent.mm.R.string.f9c);
        } else {
            kotlin.jvm.internal.o.d(str);
        }
        db5.t7.g(sdVar.f129803a, str);
    }
}
