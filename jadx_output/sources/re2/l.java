package re2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.w f394446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(re2.w wVar, java.lang.String str, yz5.l lVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394446e = wVar;
        this.f394447f = str;
        this.f394448g = lVar;
        this.f394449h = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new re2.l(this.f394446e, this.f394447f, this.f394448g, this.f394449h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((re2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394445d;
        java.lang.String str = this.f394447f;
        re2.w wVar = this.f394446e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list = wVar.f394496b;
                this.f394445d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new re2.e(list, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            z17 = ((java.lang.Boolean) obj).booleanValue();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.CoLiveAvatarMerger", "doMerge: renderer threw: " + th6.getMessage());
            z17 = false;
        }
        wVar.f394498d.post(new re2.k(z17, this.f394448g, str, this.f394449h));
        return jz5.f0.f302826a;
    }
}
