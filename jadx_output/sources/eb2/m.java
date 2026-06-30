package eb2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.p f250819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f250821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(eb2.p pVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f250819d = pVar;
        this.f250820e = str;
        this.f250821f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resultList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resultList, "resultList");
        this.f250819d.f250838a.remove(this.f250820e);
        java.lang.Object obj2 = (zy2.dc) kz5.n0.Z(resultList);
        if (obj2 == null) {
            obj2 = new ya2.b2();
        }
        this.f250821f.invoke(obj2);
        return jz5.f0.f302826a;
    }
}
