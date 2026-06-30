package yx;

/* loaded from: classes3.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467048d;

    /* renamed from: e, reason: collision with root package name */
    public int f467049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467050f = context;
        this.f467051g = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx.m(this.f467050f, this.f467051g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yx.m mVar;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f467049e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mVar = this;
            i17 = 1;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i19 = this.f467048d;
            kotlin.ResultKt.throwOnFailure(obj);
            i17 = i19;
            mVar = this;
        }
        while (true) {
            int i27 = i17 + 1;
            java.lang.String str = "";
            for (int i28 = 0; i28 < i17 % 4; i28++) {
                str = str + '.';
            }
            java.lang.String string = mVar.f467050f.getString(com.tencent.mm.R.string.ngu, str);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            mVar.f467051g.setValue(string);
            mVar.f467048d = i27;
            mVar.f467049e = 1;
            if (kotlinx.coroutines.k1.b(500L, mVar) == aVar) {
                return aVar;
            }
            i17 = i27;
        }
    }
}
