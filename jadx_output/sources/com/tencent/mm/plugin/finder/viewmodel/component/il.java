package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class il implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134757e;

    public il(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC, int i17) {
        this.f134756d = finderHomeUIC;
        this.f134757e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f134756d;
        androidx.appcompat.app.AppCompatActivity activity = finderHomeUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int i17 = this.f134757e;
        ((com.tencent.mm.plugin.finder.viewmodel.component.bl) a17).n7(finderHomeUIC.W6(i17));
        finderHomeUIC.f133576p.onPageSelected(finderHomeUIC.W6(i17));
        finderHomeUIC.R6();
    }
}
