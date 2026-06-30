package eb2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.p f250725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f250727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(eb2.p pVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f250725d = pVar;
        this.f250726e = str;
        this.f250727f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resultList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resultList, "resultList");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f250725d.f250838a;
        kotlin.jvm.internal.m0.c(concurrentHashMap).remove(this.f250726e);
        java.lang.Object obj2 = (zy2.dc) kz5.n0.Z(resultList);
        if (obj2 == null) {
            obj2 = new ya2.b2();
        }
        this.f250727f.invoke(obj2);
        return jz5.f0.f302826a;
    }
}
