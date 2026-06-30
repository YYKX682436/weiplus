package eb2;

/* loaded from: classes10.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb2.p f250755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f250756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f250758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f250759e;

    public g(eb2.p pVar, java.util.LinkedList linkedList, java.util.List list, int i17, yz5.l lVar) {
        this.f250755a = pVar;
        this.f250756b = linkedList;
        this.f250757c = list;
        this.f250758d = i17;
        this.f250759e = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        eb2.p pVar = this.f250755a;
        kotlin.jvm.internal.o.d(fVar);
        eb2.p.a(pVar, fVar, this.f250756b, this.f250757c, this.f250758d, this.f250759e);
        return jz5.f0.f302826a;
    }
}
