package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f134147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        super(0);
        this.f134147d = appCompatActivity;
        this.f134148e = finderHomeUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.n b17 = this.f134147d.mo133getLifecycle().b();
        kotlin.jvm.internal.o.f(b17, "getCurrentState(...)");
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "FinderElderlyModeChangedEvent received, lifecycleState=" + b17);
        boolean a17 = b17.a(androidx.lifecycle.n.RESUMED);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f134148e;
        if (a17) {
            finderHomeUIC.h7();
            finderHomeUIC.f133568e = false;
        } else {
            finderHomeUIC.f133568e = true;
        }
        return jz5.f0.f302826a;
    }
}
