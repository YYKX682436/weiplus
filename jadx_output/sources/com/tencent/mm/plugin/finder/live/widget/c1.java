package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h1 f117932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f117933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f117934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f117935h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.finder.live.widget.h1 h1Var, byte[] bArr, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117932e = h1Var;
        this.f117933f = bArr;
        this.f117934g = j17;
        this.f117935h = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.c1(this.f117932e, this.f117933f, this.f117934g, this.f117935h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117931d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(this.f117933f);
            long j17 = this.f117934g;
            long j18 = this.f117935h;
            this.f117931d = 1;
            int i18 = com.tencent.mm.plugin.finder.live.widget.h1.f118490y;
            com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f117932e;
            h1Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mars.xlog.Log.i(h1Var.f118491h, "join,liveId:" + j17);
            new ke2.h(2, b17, j17, j18, null).l().K(new com.tencent.mm.plugin.finder.live.widget.g1(nVar));
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
