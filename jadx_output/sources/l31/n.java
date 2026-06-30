package l31;

/* loaded from: classes9.dex */
public final class n extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f315373e;

    /* renamed from: f, reason: collision with root package name */
    public final l31.k f315374f;

    /* renamed from: g, reason: collision with root package name */
    public f31.f f315375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k31.a aVar, java.util.List bizUsernameList, l31.k kVar) {
        super("");
        kotlin.jvm.internal.o.g(bizUsernameList, "bizUsernameList");
        this.f315373e = bizUsernameList;
        this.f315374f = kVar;
    }

    @Override // l31.b
    public void a() {
        this.f315316d = true;
        f31.f fVar = this.f315375g;
        if (fVar != null) {
            f31.b.f259269a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.m mVar = new l31.m(this);
        java.util.List bizUsernameList = this.f315373e;
        kotlin.jvm.internal.o.g(bizUsernameList, "bizUsernameList");
        f31.f fVar = new f31.f("", 7);
        fVar.f259277f = mVar;
        ((java.util.ArrayList) fVar.f259285n).addAll(bizUsernameList);
        this.f315375g = fVar;
        c(fVar);
    }
}
