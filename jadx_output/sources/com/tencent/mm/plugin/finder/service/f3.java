package com.tencent.mm.plugin.finder.service;

/* loaded from: classes8.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.service.l3 l3Var) {
        super(0);
        this.f126051d = l3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Set set = this.f126051d.f126133s;
        kotlin.jvm.internal.o.f(set, "access$getEnterFinderActivity$p(...)");
        java.util.Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) it.next();
            if (kotlin.jvm.internal.o.b(appCompatActivity.getClass(), com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class)) {
                appCompatActivity.moveTaskToBack(true);
                break;
            }
        }
        return jz5.f0.f302826a;
    }
}
