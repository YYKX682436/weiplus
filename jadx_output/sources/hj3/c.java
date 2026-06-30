package hj3;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f281601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj3.c f281603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jj3.c cVar, hj3.m mVar, oj3.c cVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281601e = cVar;
        this.f281602f = mVar;
        this.f281603g = cVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hj3.c(this.f281601e, this.f281602f, this.f281603g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281600d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jj3.d a17 = this.f281601e.a();
            if (a17 == null) {
                return null;
            }
            mj3.d dVar = this.f281602f.f281648f;
            android.util.Size drawSize = a17.getSize();
            oj3.c cVar = this.f281603g;
            kotlin.jvm.internal.o.g(cVar, "<this>");
            kotlin.jvm.internal.o.g(drawSize, "drawSize");
            mj3.e eVar = new mj3.e(cVar.f345805b, drawSize, cVar.f345806c);
            this.f281600d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (mj3.f) obj;
    }
}
