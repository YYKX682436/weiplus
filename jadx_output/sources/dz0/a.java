package dz0;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244765d;

    public a(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.a(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new dz0.a((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244765d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f244765d = 1;
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new bw5.sg();
            lVar.f70665b = new bw5.tg();
            lVar.f70667d = 20785;
            lVar.f70666c = "/cgi-bin/micromsg-bin/findergettranscribeparam";
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            iVar.p(lVar.a());
            b17 = rm0.h.b(iVar, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        if (!fVar.b()) {
            return new vu0.x(null, 0, 0, 0, 15, null);
        }
        int i18 = ((bw5.tg) fVar.f70618d).f33421d;
        bw5.gz gzVar = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? null : bw5.gz.M4a : bw5.gz.Aac : bw5.gz.Silk : bw5.gz.Wav : bw5.gz.Pcm;
        kotlin.jvm.internal.o.f(gzVar, "forNumber(...)");
        int ordinal = gzVar.ordinal();
        tu0.a aVar2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? tu0.a.f422070e : tu0.a.f422072g : tu0.a.f422071f : tu0.a.f422070e;
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        return new vu0.x(aVar2, 0, ((bw5.tg) fVar2).f33422e, ((bw5.tg) fVar2).f33423f, 2, null);
    }
}
