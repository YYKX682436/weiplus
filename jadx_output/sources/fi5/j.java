package fi5;

/* loaded from: classes3.dex */
public final class j implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f263081a;

    /* renamed from: b, reason: collision with root package name */
    public final mf3.p f263082b;

    public j(mf3.k mediaInfo, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f263081a = mediaInfo;
        this.f263082b = apiCenter;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        qf3.a aVar;
        kotlin.jvm.internal.o.g(type, "type");
        mf3.k kVar = this.f263081a;
        if (kVar == null) {
            return;
        }
        int ordinal = type.ordinal();
        mf3.p pVar = this.f263082b;
        switch (ordinal) {
            case 0:
                zf3.a aVar2 = (zf3.a) pVar.c(zf3.a.class);
                if (aVar2 != null) {
                    zf3.a.Y5(aVar2, kVar, null, 2, null);
                    return;
                }
                return;
            case 1:
                bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
                if (fVar != null) {
                    fVar.S2(kVar);
                    return;
                }
                return;
            case 2:
                yf3.a aVar3 = (yf3.a) pVar.c(yf3.a.class);
                if (aVar3 != null) {
                    aVar3.n3(kVar);
                    return;
                }
                return;
            case 3:
                rf3.q qVar = (rf3.q) pVar.a(rf3.q.class);
                if (qVar != null) {
                    ((rf3.u) qVar).a0();
                    return;
                }
                return;
            case 4:
                xf3.a aVar4 = (xf3.a) pVar.c(xf3.a.class);
                if (aVar4 != null) {
                    ((rh5.b) aVar4).V6(kVar);
                    return;
                }
                return;
            case 5:
                eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
                if (bVar != null) {
                    ((eg3.g) bVar).T();
                    return;
                }
                return;
            case 6:
                zf3.a aVar5 = (zf3.a) pVar.c(zf3.a.class);
                if (aVar5 != null) {
                    aVar5.I(kVar);
                    return;
                }
                return;
            case 7:
            default:
                return;
            case 8:
                wf3.a aVar6 = (wf3.a) pVar.c(wf3.a.class);
                if (aVar6 != null) {
                    fi5.g gVar = (fi5.g) aVar6;
                    mf3.f fVar2 = gVar.f263080e;
                    int indexOf = fVar2.indexOf(kVar);
                    if (indexOf >= 0) {
                        fVar2.remove(kVar);
                    }
                    qf3.a aVar7 = gVar.f263079d;
                    if (aVar7 != null) {
                        ((lf3.c0) aVar7).X6(fVar2, true);
                    }
                    if (fVar2.isEmpty()) {
                        gVar.getActivity().finish();
                        return;
                    } else {
                        if (indexOf < fVar2.size() || (aVar = gVar.f263079d) == null) {
                            return;
                        }
                        aVar.T3(fVar2.size() - 1);
                        return;
                    }
                }
                return;
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(userName, "userName");
        zf3.a aVar = (zf3.a) this.f263082b.c(zf3.a.class);
        if (aVar != null) {
            aVar.z4(this.f263081a, userName);
        }
    }
}
