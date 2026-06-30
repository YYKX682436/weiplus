package g63;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f269115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g63.j jVar, java.util.List list) {
        super(0);
        this.f269115d = jVar;
        this.f269116e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g63.j jVar = this.f269115d;
        int size = jVar.f269130g.size();
        jVar.f269130g.clear();
        jVar.notifyItemRangeRemoved(0, size);
        java.util.List data = this.f269116e;
        kotlin.jvm.internal.o.g(data, "data");
        pm0.v.X(new g63.i(jVar, data));
        return jz5.f0.f302826a;
    }
}
