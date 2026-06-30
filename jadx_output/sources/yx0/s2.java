package yx0;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467631d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467632e;

    /* renamed from: f, reason: collision with root package name */
    public int f467633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467634g = str;
        this.f467635h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.s2(this.f467634g, this.f467635h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467633f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f467634g;
            this.f467631d = str;
            java.lang.String str2 = this.f467635h;
            this.f467632e = str2;
            this.f467633f = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c(str);
            java.util.LinkedList linkedList = qVar.f217548e;
            if (linkedList != null) {
                linkedList.add(str2);
            }
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new yx0.r2(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
