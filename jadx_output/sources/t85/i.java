package t85;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t85.j f416472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t85.j jVar) {
        super(2);
        this.f416472d = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String type = (java.lang.String) obj;
        java.lang.String path = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        t85.f fVar = new t85.f();
        t85.j jVar = this.f416472d;
        java.lang.String str = jVar.f416474a;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        fVar.f416465a = str;
        fVar.f416466b = jVar.f416475b;
        fVar.f416467c = type;
        fVar.f416468d = path;
        return fVar;
    }
}
