package yu2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI f465848d;

    public d(com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
        this.f465848d = finderSampleDynamicTabUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI activity = this.f465848d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.n7((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17, 0, 0, 2, null);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.n7((yu2.a) zVar.a(activity).a(yu2.a.class), r2.f7().size() - 1, 0, 2, null);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.n7((yu2.a) zVar.a(activity).a(yu2.a.class), r0.f7().size() - 1, 0, 2, null);
    }
}
