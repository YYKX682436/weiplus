package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class df implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f123629e;

    public df(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, com.google.android.material.tabs.TabLayout tabLayout) {
        this.f123628d = finderProfileTabUIC;
        this.f123629e = tabLayout;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        if (iVar == null || !(iVar.f343778a instanceof zx2.i)) {
            return;
        }
        zx2.z e76 = this.f123628d.e7();
        android.content.Context context = this.f123629e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object obj = iVar.f343778a;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        e76.b(context, (zx2.i) obj);
        java.lang.Object obj2 = iVar.f343778a;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
        android.view.View view = iVar.f343783f;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((zx2.i) obj2).d(false, (android.view.ViewGroup) view);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar != null) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123628d;
            zx2.z e76 = finderProfileTabUIC.e7();
            android.content.Context context = this.f123629e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object obj = iVar.f343778a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            e76.a(context, (zx2.i) obj);
            java.lang.Object obj2 = iVar.f343778a;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            android.view.View view = iVar.f343783f;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((zx2.i) obj2).d(true, (android.view.ViewGroup) view);
            java.lang.Object obj3 = iVar.f343778a;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
            int indexOf = finderProfileTabUIC.f7().indexOf((zx2.i) obj3);
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
            if (indexOf != -1) {
                finderProfileTabUIC.u7(indexOf);
            }
        }
    }
}
