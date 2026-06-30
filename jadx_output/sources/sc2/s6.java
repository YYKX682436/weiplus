package sc2;

/* loaded from: classes2.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f406242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f406245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f406247i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406248m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f406249n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(xc2.p0 p0Var, ad2.h hVar, sc2.v6 v6Var, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, android.view.View view, sc2.r7 r7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406243e = p0Var;
        this.f406244f = hVar;
        this.f406245g = v6Var;
        this.f406246h = str;
        this.f406247i = finderJumpInfo;
        this.f406248m = view;
        this.f406249n = r7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.s6(this.f406243e, this.f406244f, this.f406245g, this.f406246h, this.f406247i, this.f406248m, this.f406249n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.s6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f406242d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xc2.p0 p0Var = this.f406243e;
            xc2.o0 o0Var = p0Var.f453246h;
            boolean z17 = false;
            if (o0Var != null && !o0Var.a()) {
                z17 = true;
            }
            if (!z17 && !this.f406244f.m(p0Var)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache.iconUrl=");
                xc2.o0 o0Var2 = p0Var.f453246h;
                sb6.append(o0Var2 != null ? o0Var2.f453221c : null);
                sb6.append(" cache.title=");
                xc2.o0 o0Var3 = p0Var.f453246h;
                sb6.append((java.lang.Object) (o0Var3 != null ? o0Var3.f453219a : null));
                sb6.append("cache.desc=");
                xc2.o0 o0Var4 = p0Var.f453246h;
                sb6.append((java.lang.Object) (o0Var4 != null ? o0Var4.f453220b : null));
                sb6.append(" info.wording=");
                sb6.append(this.f406247i.getWording());
                this.f406245g.a("onChanged", this.f406246h, sb6.toString());
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            sc2.r6 r6Var = new sc2.r6(this.f406244f, this.f406245g, this.f406248m, this.f406243e, this.f406249n, null);
            this.f406242d = 1;
            if (kotlinx.coroutines.l.g(g3Var, r6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
