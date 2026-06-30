package u5;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424712d;

    /* renamed from: e, reason: collision with root package name */
    public int f424713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u5.s f424714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u5.f f424715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u5.s sVar, u5.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424714f = sVar;
        this.f424715g = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u5.l(this.f424714f, this.f424715g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        u5.s sVar;
        java.lang.Object hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424713e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u5.s sVar2 = this.f424714f;
            r5.j jVar = (r5.j) ((n0.q4) sVar2.f424737w).getValue();
            u5.f fVar = this.f424715g;
            c6.j jVar2 = fVar.f424704b;
            android.content.Context context = jVar2.f38829a;
            jVar2.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            c6.h hVar2 = new c6.h(jVar2, context);
            hVar2.f38806d = new u5.r(sVar2);
            hVar2.H = null;
            hVar2.I = null;
            hVar2.f38802J = null;
            c6.d dVar = jVar2.G;
            if (dVar.f38786b == null) {
                long j17 = d1.k.f225642c;
                long j18 = fVar.f424705c;
                if (j18 != j17) {
                    hVar2.f38817o = new d6.e(new coil.size.PixelSize(a06.d.b(d1.k.d(j18)), a06.d.b(d1.k.b(j18))));
                    hVar2.H = null;
                    hVar2.I = null;
                    hVar2.f38802J = null;
                } else {
                    hVar2.f38817o = new d6.e(coil.size.OriginalSize.f43911d);
                    hVar2.H = null;
                    hVar2.I = null;
                    hVar2.f38802J = null;
                }
            }
            if (dVar.f38787c == null) {
                hVar2.f38818p = d6.g.FILL;
            }
            if (dVar.f38790f != d6.d.EXACT) {
                hVar2.f38821s = d6.d.INEXACT;
            }
            c6.j a17 = hVar2.a();
            this.f424712d = sVar2;
            this.f424713e = 1;
            r5.p pVar = (r5.p) jVar;
            pVar.getClass();
            e6.b bVar = a17.f38831c;
            if (bVar instanceof e6.c) {
                a6.c0 b17 = h6.d.b(((coil.target.ImageViewTarget) ((e6.c) bVar)).f43914d);
                oz5.i iVar = getContext().get(kotlinx.coroutines.q2.f310571d);
                kotlin.jvm.internal.o.d(iVar);
                b17.a((kotlinx.coroutines.r2) iVar);
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, new r5.l(pVar, a17, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            sVar = sVar2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (u5.s) this.f424712d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c6.l lVar = (c6.l) obj;
        if (lVar instanceof c6.q) {
            c6.q qVar = (c6.q) lVar;
            hVar = new u5.j(u5.x.b(qVar.f38863a), qVar);
        } else {
            if (!(lVar instanceof c6.f)) {
                throw new jz5.j();
            }
            android.graphics.drawable.Drawable a18 = lVar.a();
            hVar = new u5.h(a18 != null ? u5.x.b(a18) : null, (c6.f) lVar);
        }
        ((n0.q4) sVar.f424735u).setValue(hVar);
        return jz5.f0.f302826a;
    }
}
