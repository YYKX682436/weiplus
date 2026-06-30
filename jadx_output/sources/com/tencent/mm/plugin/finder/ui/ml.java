package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ml implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f129528d;

    public ml(com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI) {
        this.f129528d = mMFinderUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.finder.ui.MMFinderUI activity = this.f129528d;
        try {
            kotlin.jvm.internal.o.g(activity, "activity");
            java.util.List h76 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).h7();
            if ((h76.isEmpty() ^ true ? h76 : null) == null) {
                int i17 = com.tencent.mm.plugin.finder.ui.MMFinderUI.f128804s;
                com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "[onScreenShot] extStats is empty");
            } else if (((java.lang.Boolean) ((jz5.n) activity.f128806e).getValue()).booleanValue()) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                androidx.appcompat.app.AppCompatActivity context = activity.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                new bq.m1(0, h76, xy2.c.d(context)).l().q(new cq.m0(null, null));
            } else {
                androidx.appcompat.app.AppCompatActivity context2 = activity.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                gm0.j1.d().g(new db2.i6(0, h76, xy2.c.d(context2)));
            }
        } catch (java.lang.Throwable th6) {
            int i18 = com.tencent.mm.plugin.finder.ui.MMFinderUI.f128804s;
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.MMFinderUI", th6, "onScreenShot", new java.lang.Object[0]);
        }
        com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent mMFinderUIScreenShotEvent = new com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent();
        am.ij ijVar = mMFinderUIScreenShotEvent.f54485g;
        ijVar.getClass();
        ijVar.f6955a = j17;
        mMFinderUIScreenShotEvent.e();
    }
}
