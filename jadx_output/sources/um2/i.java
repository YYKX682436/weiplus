package um2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(um2.x5 x5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428824e = x5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.i(this.f428824e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ad adVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428823d;
        um2.x5 x5Var = this.f428824e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            um2.h hVar = new um2.h(x5Var, null);
            this.f428823d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj().L0(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0));
            zl2.r4.f473950a.f3(x5Var.f19605b, "charge live invalid!");
            fm2.c cVar = x5Var.f19606c;
            if (cVar != null) {
                qo0.c.a(cVar, qo0.b.X4, null, 2, null);
            }
            fm2.c cVar2 = x5Var.f19606c;
            if (cVar2 != null && (adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) cVar2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class)) != null) {
                adVar.v1();
            }
        }
        return jz5.f0.f302826a;
    }
}
