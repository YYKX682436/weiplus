package hr3;

/* loaded from: classes.dex */
public final class nf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f283839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(java.lang.String str, hr3.pf pfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283840e = str;
        this.f283841f = pfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.nf(this.f283840e, this.f283841f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.nf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283839d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f283840e;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "showWithLocalPath() err file not exist");
                return f0Var;
            }
            hr3.pf pfVar = this.f283841f;
            android.graphics.Bitmap a18 = com.tencent.mm.sdk.platformtools.j.a(str, i65.a.g(pfVar.getActivity()));
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "showWithLocalPath() decode bitmap = " + a18);
            if (a18 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "showWithLocalPath() decode bitmap is null");
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            hr3.mf mfVar = new hr3.mf(pfVar, a18, str, null);
            this.f283839d = 1;
            if (kotlinx.coroutines.l.g(g3Var, mfVar, this) == aVar) {
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
