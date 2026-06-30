package nl4;

/* loaded from: classes11.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f338227d;

    /* renamed from: e, reason: collision with root package name */
    public int f338228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.kq0 f338229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bw5.kq0 kq0Var, nl4.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f338229f = kq0Var;
        this.f338230g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nl4.q(this.f338229f, this.f338230g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nl4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        bw5.lp0 lp0Var;
        bw5.e70 g18;
        bw5.e70 g19;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f338228e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nl4.r rVar = this.f338230g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.lp0 b17 = this.f338229f.b();
            kotlin.jvm.internal.o.f(b17, "getPlayingItem(...)");
            bw5.v70 d17 = b17.d();
            java.lang.String tid = (d17 == null || (g19 = d17.g()) == null) ? null : g19.getTid();
            java.lang.String str = tid == null ? "" : tid;
            bw5.v70 d18 = b17.d();
            java.lang.String b18 = (d18 == null || (g18 = d18.g()) == null) ? null : g18.b();
            java.lang.String str2 = b18 == null ? "" : b18;
            if (!(str.length() == 0)) {
                if (!(str2.length() == 0)) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                    nl4.p pVar = new nl4.p(this.f338230g, str, str2, b17, null);
                    this.f338227d = b17;
                    this.f338228e = 1;
                    g17 = kotlinx.coroutines.l.g(p0Var, pVar, this);
                    if (g17 == aVar) {
                        return aVar;
                    }
                    lp0Var = b17;
                }
            }
            ll4.a aVar2 = rVar.f338231a;
            if (aVar2 != null) {
                ll4.a.a(aVar2, 12, null, 2, null);
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lp0Var = (bw5.lp0) this.f338227d;
        kotlin.ResultKt.throwOnFailure(obj);
        g17 = obj;
        dk4.a aVar3 = (dk4.a) g17;
        if (aVar3 == null) {
            ll4.a aVar4 = rVar.f338231a;
            if (aVar4 != null) {
                ll4.a.a(aVar4, 12, null, 2, null);
            }
            return f0Var;
        }
        java.lang.String str3 = aVar3.f234481r;
        if (str3 == null || str3.length() == 0) {
            aVar3.f234481r = aVar3.f234465b;
        }
        rVar.f338237g = lp0Var;
        rVar.getClass();
        java.lang.String url = aVar3.f234484u;
        kotlin.jvm.internal.o.f(url, "url");
        aVar3.f234470g *= 1000;
        kk4.v vVar = (kk4.v) rVar.f338240j;
        vVar.B(aVar3);
        rVar.f338232b = aVar3.f234470g;
        vVar.f308585j = true;
        bw5.lp0 lp0Var2 = rVar.f338237g;
        if (lp0Var2 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        long j17 = lp0Var2.c() != null ? r2.f27453e * 1000 : 0L;
        bw5.lp0 lp0Var3 = rVar.f338237g;
        if (lp0Var3 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        bw5.fq0 c17 = lp0Var3.c();
        float f17 = c17 != null ? c17.f27452d : 1.0f;
        com.tencent.mars.xlog.Log.i(rVar.f338242l, "real call startPlay decryptionKey:" + rVar.f338238h);
        rVar.f338235e = false;
        vVar.G(new nl4.l(rVar, j17, f17));
        vVar.c(rVar.f338238h);
        return f0Var;
    }
}
