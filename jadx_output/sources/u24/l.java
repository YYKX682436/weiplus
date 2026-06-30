package u24;

/* loaded from: classes.dex */
public final class l implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a24.i f424127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f424128b;

    public l(a24.i iVar, java.util.List list) {
        this.f424127a = iVar;
        this.f424128b = list;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        a24.i item = (a24.i) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(item, "item");
        a24.u b76 = item.b7();
        a24.i iVar = this.f424127a;
        if (kotlin.jvm.internal.o.b(iVar.getClass(), b76.f908a)) {
            if (kotlin.jvm.internal.o.b(iVar, item)) {
                u24.m.f424129a.a(item);
            } else {
                this.f424128b.add(item);
            }
        }
    }
}
