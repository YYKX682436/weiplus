package y20;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq.f f459019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f459020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qq.f fVar, com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        super(1);
        this.f459019d = fVar;
        this.f459020e = ecsTestUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object newValue) {
        kotlin.jvm.internal.o.g(newValue, "newValue");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Switch value changed: ");
        qq.f fVar = this.f459019d;
        qq.g gVar = (qq.g) fVar;
        sb6.append(gVar.f365868b);
        sb6.append(" = ");
        sb6.append(newValue);
        com.tencent.mars.xlog.Log.i("EcsTestUI", sb6.toString());
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f459020e;
        int indexOf = ecsTestUI.m.indexOf(fVar);
        java.util.List V0 = kz5.n0.V0(ecsTestUI.m);
        java.lang.String title = gVar.f365867a;
        kotlin.jvm.internal.o.g(title, "title");
        java.lang.String key = gVar.f365868b;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.List options = gVar.f365869c;
        kotlin.jvm.internal.o.g(options, "options");
        java.lang.Object defaultValue = gVar.f365870d;
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        java.lang.String storageKey = gVar.f365871e;
        kotlin.jvm.internal.o.g(storageKey, "storageKey");
        ((java.util.ArrayList) V0).set(indexOf, new qq.g(title, key, options, defaultValue, storageKey));
        ecsTestUI.m = V0;
        y20.n nVar = ecsTestUI.h;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }
}
