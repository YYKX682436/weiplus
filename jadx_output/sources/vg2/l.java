package vg2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f436536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f436537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ce2.i iVar, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436536e = iVar;
        this.f436537f = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vg2.l(this.f436536e, this.f436537f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vg2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436535d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rj.j c17 = nn2.d.f338671a.c();
            java.lang.String w07 = this.f436536e.w0();
            if (w07 == null) {
                w07 = "";
            }
            this.f436535d = 1;
            obj = rj.j.c(c17, w07, null, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        org.libpag.PAGFile pAGFile = (org.libpag.PAGFile) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (pAGFile == null) {
            return f0Var;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f436537f;
        mMPAGView.post(new vg2.k(pAGFile, mMPAGView));
        return f0Var;
    }
}
