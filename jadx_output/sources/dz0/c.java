package dz0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fz f244787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f244788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f244789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw5.fz fzVar, boolean z17, java.util.List list, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244787e = fzVar;
        this.f244788f = z17;
        this.f244789g = list;
        this.f244790h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.c(this.f244787e, this.f244788f, this.f244789g, this.f244790h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244786d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f244786d = 1;
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            bw5.sz szVar = new bw5.sz();
            szVar.f33177d = this.f244787e;
            boolean[] zArr = szVar.f33181h;
            zArr[2] = true;
            szVar.f33178e = this.f244788f;
            zArr[3] = true;
            szVar.f33179f = new java.util.LinkedList(this.f244789g);
            zArr[4] = true;
            szVar.f33180g = this.f244790h;
            zArr[5] = true;
            lVar.f70664a = szVar;
            lVar.f70665b = new bw5.tz();
            lVar.f70667d = 8337;
            lVar.f70666c = "/cgi-bin/micromsg-bin/findertranscribe";
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
            return (bw5.tz) fVar.f70618d;
        }
        return null;
    }
}
