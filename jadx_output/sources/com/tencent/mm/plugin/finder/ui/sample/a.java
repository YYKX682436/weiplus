package com.tencent.mm.plugin.finder.ui.sample;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI f129801d;

    public a(com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
        this.f129801d = finderSampleDynamicTabUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI activity = this.f129801d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        zx2.k kVar = new zx2.k("A1");
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment.f129263n = 201;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17, 1, kVar, finderSampleTabFragment, false, 8, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        zx2.k kVar2 = new zx2.k("A2");
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment2.f129263n = 202;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a18, 2, kVar2, finderSampleTabFragment2, false, 8, null);
    }
}
