package eb2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.p f250712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f250714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(eb2.p pVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f250712d = pVar;
        this.f250713e = str;
        this.f250714f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resultList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resultList, "resultList");
        this.f250712d.f250838a.remove(this.f250713e);
        this.f250714f.invoke(kz5.n0.X(resultList));
        return jz5.f0.f302826a;
    }
}
