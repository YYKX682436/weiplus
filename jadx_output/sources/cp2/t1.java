package cp2;

/* loaded from: classes8.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f220916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.u1 f220917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, cp2.u1 u1Var) {
        super(0);
        this.f220916d = finderItem;
        this.f220917e = u1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp2.s1 s1Var = new cp2.s1(this.f220916d, this.f220917e);
        xs5.a aVar = new xs5.a(0L, null, null, null, null, null, null, 127, null);
        xs5.c.f456417b = aVar;
        s1Var.invoke(aVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCurrentTestRedDot currentRedDotData: ");
        xs5.a aVar2 = xs5.c.f456417b;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        sb6.append(aVar2);
        com.tencent.mars.xlog.Log.i("NearbyRedDotGenerate", sb6.toString());
        return jz5.f0.f302826a;
    }
}
