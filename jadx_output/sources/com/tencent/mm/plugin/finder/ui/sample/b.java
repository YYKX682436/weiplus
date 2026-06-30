package com.tencent.mm.plugin.finder.ui.sample;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI f129802d;

    public b(com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
        this.f129802d = finderSampleDynamicTabUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI activity = this.f129802d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        zx2.k kVar = new zx2.k("B1");
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment.f129263n = 301;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17, kVar, finderSampleTabFragment, false, 4, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        zx2.k kVar2 = new zx2.k("B2");
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment2.f129263n = 302;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a18, kVar2, finderSampleTabFragment2, false, 4, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        zx2.k kVar3 = new zx2.k("B3");
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment3 = new com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment3.f129263n = 303;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a19, kVar3, finderSampleTabFragment3, false, 4, null);
    }
}
