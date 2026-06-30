package rw2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f400590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rw2.j jVar) {
        super(2);
        this.f400590d = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk4.v vVar;
        ((java.lang.Number) obj2).intValue();
        rw2.j jVar = this.f400590d;
        com.tencent.mars.xlog.Log.i(jVar.f400607c, "video download complete");
        jVar.f400612h = true;
        if (jVar.f400610f) {
            java.lang.Object obj3 = jVar.f400609e.get(0);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            long j17 = ((rw2.g) obj3).f400596a;
            jVar.f400608d.f400639p = j17;
            if (jVar.f400612h && (vVar = jVar.f400611g) != null) {
                kk4.b.f(vVar, (int) j17, true, null, 4, null);
            }
        } else {
            jVar.c();
        }
        return jz5.f0.f302826a;
    }
}
