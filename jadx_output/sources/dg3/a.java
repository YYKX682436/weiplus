package dg3;

/* loaded from: classes3.dex */
public final class a implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f232315a;

    /* renamed from: b, reason: collision with root package name */
    public final mf3.p f232316b;

    public a(mf3.k mediaInfo, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f232315a = mediaInfo;
        this.f232316b = apiCenter;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        ag3.a aVar;
        kotlin.jvm.internal.o.g(type, "type");
        mf3.k kVar = this.f232315a;
        if (kVar == null) {
            return;
        }
        int ordinal = type.ordinal();
        mf3.p pVar = this.f232316b;
        if (ordinal == 0) {
            zf3.a aVar2 = (zf3.a) pVar.c(zf3.a.class);
            if (aVar2 != null) {
                zf3.a.Y5(aVar2, kVar, null, 2, null);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
            if (fVar != null) {
                fVar.S2(kVar);
                return;
            }
            return;
        }
        if (ordinal == 2) {
            yf3.a aVar3 = (yf3.a) pVar.c(yf3.a.class);
            if (aVar3 != null) {
                aVar3.n3(kVar);
                return;
            }
            return;
        }
        if (ordinal == 3) {
            rf3.q qVar = (rf3.q) pVar.a(rf3.q.class);
            if (qVar != null) {
                ((rf3.u) qVar).a0();
                return;
            }
            return;
        }
        if (ordinal == 4) {
            xf3.a aVar4 = (xf3.a) pVar.c(xf3.a.class);
            if (aVar4 != null) {
                ((rh5.b) aVar4).V6(kVar);
                return;
            }
            return;
        }
        if (ordinal != 5) {
            if (ordinal == 10 && (aVar = (ag3.a) pVar.c(ag3.a.class)) != null) {
                ((xc5.l1) aVar).V6(kVar);
                return;
            }
            return;
        }
        eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
        if (bVar != null) {
            ((eg3.g) bVar).T();
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(userName, "userName");
        zf3.a aVar = (zf3.a) this.f232316b.c(zf3.a.class);
        if (aVar != null) {
            aVar.z4(this.f232315a, userName);
        }
    }
}
