package xt2;

/* loaded from: classes2.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f456908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(java.lang.String str, xt2.r3 r3Var, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456906e = str;
        this.f456907f = r3Var;
        this.f456908g = view;
        this.f456909h = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.n3(this.f456906e, this.f456907f, this.f456908g, this.f456909h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object h17;
        java.lang.Object h18;
        org.libpag.PAGFile pAGFile;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456905d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f456906e;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveShoppingCartAnimWidget", th6, "playPromotePag error", new java.lang.Object[0]);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            xt2.m3 m3Var = new xt2.m3(this.f456909h, null);
            this.f456905d = 4;
            if (kotlinx.coroutines.l.g(g3Var, m3Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nn2.d dVar = nn2.d.f338671a;
            java.lang.String g17 = ((b51.m) dVar.a()).g(str);
            java.io.File file = new java.io.File(g17);
            if (!file.exists() || file.length() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: cache miss, fallback download, url=" + str);
                rj.j a17 = dVar.a();
                this.f456905d = 2;
                h17 = ((b51.m) a17).h(str, "MicroMsg.FinderLiveShoppingCartAnimWidget", this);
                if (h17 == aVar) {
                    return aVar;
                }
                pAGFile = (org.libpag.PAGFile) h17;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: cache hit, path=" + g17);
                rj.j a18 = dVar.a();
                this.f456905d = 1;
                h18 = ((b51.m) a18).h(str, "MicroMsg.FinderLiveShoppingCartAnimWidget", this);
                if (h18 == aVar) {
                    return aVar;
                }
                pAGFile = (org.libpag.PAGFile) h18;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            h18 = obj;
            pAGFile = (org.libpag.PAGFile) h18;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i17 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            h17 = obj;
            pAGFile = (org.libpag.PAGFile) h17;
        }
        org.libpag.PAGFile pAGFile2 = pAGFile;
        if (pAGFile2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: load failed, url=" + str);
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        xt2.l3 l3Var = new xt2.l3(this.f456907f, this.f456908g, this.f456909h, pAGFile2, this.f456906e, null);
        this.f456905d = 3;
        return kotlinx.coroutines.l.g(g3Var2, l3Var, this) == aVar ? aVar : f0Var;
    }
}
