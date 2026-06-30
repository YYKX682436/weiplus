package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123591d;

    public cb(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123591d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123591d;
        try {
            androidx.appcompat.app.AppCompatActivity activity = obVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC finderProfileUiStyleUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class);
            java.lang.String username = obVar.getUsername();
            finderProfileUiStyleUIC.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            finderProfileUiStyleUIC.P6(username, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderProfileHeaderUIC", e17, "", new java.lang.Object[0]);
        }
    }
}
