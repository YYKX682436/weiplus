package dk2;

/* loaded from: classes3.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f233183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(java.util.LinkedList linkedList, java.lang.String str, ce2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233183e = linkedList;
        this.f233184f = str;
        this.f233185g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.a7(this.f233183e, this.f233184f, this.f233185g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.a7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233182d;
        java.lang.String str = this.f233184f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.u7 u7Var = dk2.u7.f234181a;
            this.f233182d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new dk2.s7(this.f233183e, str, this.f233185g, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ce2.i iVar = (ce2.i) dk2.u7.f234185e.get(str);
        if (!booleanValue || iVar == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + str + " failed, succ:" + booleanValue + ", lastestGiftInfo:" + iVar);
        } else {
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().replace(iVar);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + str + " succ");
        }
        return jz5.f0.f302826a;
    }
}
