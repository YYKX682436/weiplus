package nw0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw0.a f340764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw0.h f340765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw0.b f340766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kw0.a aVar, nw0.h hVar, kw0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340764e = aVar;
        this.f340765f = hVar;
        this.f340766g = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nw0.e(this.f340764e, this.f340765f, this.f340766g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nw0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340763d;
        kw0.b bVar = this.f340766g;
        nw0.h hVar = this.f340765f;
        kw0.a aVar2 = this.f340764e;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zu0.i iVar = aVar2.f312789b;
            hVar.getClass();
            int i18 = bVar.f312794d;
            kw0.e eVar = (kw0.e) hVar.b(bVar).f475673a;
            java.util.Iterator it = eVar.f312801a.iterator();
            int i19 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                mJMaterialInfo = aVar2.f312788a;
                if (!hasNext) {
                    i19 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((kw0.a) it.next()).f312788a.f48224b, mJMaterialInfo.f48224b)) {
                    break;
                }
                i19++;
            }
            kw0.j jVar = kw0.j.f312807a;
            java.util.List infoList = eVar.f312801a;
            kotlin.jvm.internal.o.g(infoList, "infoList");
            zu0.h hVar2 = new zu0.h(new kw0.e(infoList, i19, jVar));
            kw0.b bVar2 = kw0.b.f312791e;
            androidx.lifecycle.j0 j0Var = hVar.f340770d;
            androidx.lifecycle.j0 j0Var2 = hVar.f340769c;
            if (i18 == 3) {
                j0Var2.setValue(hVar2);
            } else if (i18 == 2) {
                j0Var.setValue(hVar2);
            }
            if (iVar == zu0.i.f475674d) {
                zu0.h d17 = fv0.e.d(hVar.b(bVar), aVar2, zu0.i.f475675e, false);
                int i27 = bVar.f312794d;
                if (i27 == 3) {
                    j0Var2.setValue(d17);
                } else if (i27 == 2) {
                    j0Var.setValue(d17);
                }
                java.lang.String str = mJMaterialInfo.f48224b;
                kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
                z17 = true;
                this.f340763d = 1;
                if (hVar.f340767a.S6(str, this) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        hVar.getClass();
        int i28 = bVar.f312794d;
        zu0.h d18 = fv0.e.d(hVar.b(bVar), aVar2, zu0.i.f475676f, z17);
        kw0.b bVar3 = kw0.b.f312791e;
        if (i28 == 3) {
            hVar.f340769c.setValue(d18);
        } else if (i28 == 2) {
            hVar.f340770d.setValue(d18);
        }
        return jz5.f0.f302826a;
    }
}
