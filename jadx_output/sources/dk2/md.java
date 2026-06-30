package dk2;

/* loaded from: classes.dex */
public final class md extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233770d;

    public md(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.md(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new dk2.md((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233770d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f233770d = 1;
            if (kotlinx.coroutines.k1.b(90000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "GetLiveMsg_TimeOut");
        pm0.z.b(xy2.b.f458155b, "GetLiveMsg_TimeOut", false, null, null, false, false, null, 124, null);
        return jz5.f0.f302826a;
    }
}
