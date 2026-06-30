package f16;

/* loaded from: classes16.dex */
public final class c1 extends f16.e {

    /* renamed from: a, reason: collision with root package name */
    public final p06.a f258708a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258709b;

    /* renamed from: c, reason: collision with root package name */
    public final a16.l f258710c;

    /* renamed from: d, reason: collision with root package name */
    public final x06.c f258711d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258712e;

    public /* synthetic */ c1(p06.a aVar, boolean z17, a16.l lVar, x06.c cVar, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, z17, lVar, cVar, (i17 & 16) != 0 ? false : z18);
    }

    public n16.e e(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        f26.z0 z0Var = f26.z2.f259242a;
        o06.j i17 = ((f26.o0) iVar).w0().i();
        o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
        if (gVar != null) {
            return r16.i.g(gVar);
        }
        return null;
    }

    public c1(p06.a aVar, boolean z17, a16.l containerContext, x06.c containerApplicabilityType, boolean z18) {
        kotlin.jvm.internal.o.g(containerContext, "containerContext");
        kotlin.jvm.internal.o.g(containerApplicabilityType, "containerApplicabilityType");
        this.f258708a = aVar;
        this.f258709b = z17;
        this.f258710c = containerContext;
        this.f258711d = containerApplicabilityType;
        this.f258712e = z18;
    }
}
