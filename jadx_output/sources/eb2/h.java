package eb2;

/* loaded from: classes10.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb2.p f250761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f250762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f250764d;

    public h(eb2.p pVar, java.util.LinkedList linkedList, java.util.List list, yz5.l lVar) {
        this.f250761a = pVar;
        this.f250762b = linkedList;
        this.f250763c = list;
        this.f250764d = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        eb2.p pVar = this.f250761a;
        kotlin.jvm.internal.o.d(fVar);
        eb2.p.a(pVar, fVar, this.f250762b, this.f250763c, 4, this.f250764d);
        return jz5.f0.f302826a;
    }
}
