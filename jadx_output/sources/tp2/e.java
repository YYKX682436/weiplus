package tp2;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f421136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f421136d = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tp2.d dVar = new tp2.d(this.f421136d);
        xs5.a aVar = new xs5.a(0L, null, null, null, null, null, null, 127, null);
        xs5.c.f456417b = aVar;
        dVar.invoke(aVar);
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
