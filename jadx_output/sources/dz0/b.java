package dz0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.hz f244772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f244773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bw5.hz hzVar, com.tencent.mm.protobuf.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244772e = hzVar;
        this.f244773f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.b(this.f244772e, this.f244773f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244771d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f244771d = 1;
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            bw5.ug ugVar = new bw5.ug();
            ugVar.f33885d = this.f244772e;
            boolean[] zArr = ugVar.f33887f;
            zArr[2] = true;
            ugVar.f33886e = this.f244773f;
            zArr[3] = true;
            lVar.f70664a = ugVar;
            lVar.f70665b = new bw5.vg();
            lVar.f70667d = 18979;
            lVar.f70666c = "/cgi-bin/micromsg-bin/findergettranscriberesult";
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            iVar.p(lVar.a());
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.b()) {
            return (bw5.vg) fVar.f70618d;
        }
        return null;
    }
}
