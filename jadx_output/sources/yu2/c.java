package yu2;

/* loaded from: classes2.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI f465847d;

    public c(com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
        this.f465847d = finderSampleDynamicTabUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI activity = this.f465847d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(yu2.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.n7((com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17, 3, 0, 2, null);
    }
}
