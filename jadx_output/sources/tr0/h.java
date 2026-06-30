package tr0;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f421305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f421307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(byte[] bArr, tr0.t tVar, wo.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421305e = bArr;
        this.f421306f = tVar;
        this.f421307g = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr0.h(this.f421305e, this.f421306f, this.f421307g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421304d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        byte[] data = this.f421305e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (data != null) {
                kotlin.jvm.internal.o.f(data, "$data");
                if (!(data.length == 0)) {
                    nr0.x xVar = this.f421306f.f411434h;
                    if (xVar != null) {
                        kotlin.jvm.internal.o.f(data, "$data");
                        this.f421304d = 1;
                        oz5.n nVar = new oz5.n(pz5.f.b(this));
                        or0.c.f347429a.b();
                        xVar.l(new nr0.g(xVar, data, nVar, null));
                        java.lang.Object a17 = nVar.a();
                        if (a17 != aVar) {
                            a17 = f0Var;
                        }
                        if (a17 == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera1Impl", "onPreviewFrame, frame data is null!!");
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.f421307g.a(data);
        return f0Var;
    }
}
