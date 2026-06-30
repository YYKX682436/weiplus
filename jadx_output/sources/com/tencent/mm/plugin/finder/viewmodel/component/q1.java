package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f135645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f135646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f135647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var, java.lang.Object obj, int i17) {
        super(0);
        this.f135645d = f2Var;
        this.f135646e = obj;
        this.f135647f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = this.f135645d;
            java.lang.Object item = this.f135646e;
            kotlin.jvm.internal.o.f(item, "$item");
            com.tencent.mm.plugin.finder.viewmodel.component.f2.O6(f2Var, (so2.u1) item, this.f135647f);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAddHistoryUIC", "addOrUpdateHistory: addToTaskbar, ", th6);
        }
        return jz5.f0.f302826a;
    }
}
