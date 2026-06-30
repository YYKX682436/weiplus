package id2;

/* loaded from: classes.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290483d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.a5(this.f290483d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.a5 a5Var = (id2.a5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveRemindRestric", "getLiveExtraInfo fail: " + ((xg2.a) ((xg2.b) this.f290483d).f454381b));
        return jz5.f0.f302826a;
    }
}
