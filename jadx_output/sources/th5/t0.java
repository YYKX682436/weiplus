package th5;

/* loaded from: classes12.dex */
public final class t0 implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f419460a;

    /* renamed from: b, reason: collision with root package name */
    public final mf3.p f419461b;

    public t0(mf3.k mediaInfo, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f419460a = mediaInfo;
        this.f419461b = apiCenter;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        th5.b bVar;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        th5.v0 v0Var = th5.v0.f419470a;
        mf3.p pVar = this.f419461b;
        mf3.k kVar = this.f419460a;
        if (ordinal == 0) {
            zf3.a aVar = (zf3.a) pVar.c(zf3.a.class);
            if (aVar != null) {
                zf3.a.Y5(aVar, kVar, null, 2, null);
            }
            bVar = kVar instanceof th5.b ? (th5.b) kVar : null;
            if (bVar != null) {
                v0Var.a(bVar.f419344c, bVar.f419342a, bVar.f419343b, th5.a.f419335g, th5.e.f419367f);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
        if (fVar != null) {
            fVar.S2(kVar);
        }
        bVar = kVar instanceof th5.b ? (th5.b) kVar : null;
        if (bVar != null) {
            v0Var.a(bVar.f419344c, bVar.f419342a, bVar.f419343b, th5.a.f419336h, th5.e.f419367f);
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        zf3.a aVar;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (th5.s0.f419458a[type.ordinal()] != 2 || (aVar = (zf3.a) this.f419461b.c(zf3.a.class)) == null) {
            return;
        }
        aVar.z4(this.f419460a, userName);
    }
}
