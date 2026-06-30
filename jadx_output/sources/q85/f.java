package q85;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.g f360800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q85.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360800d = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q85.f(this.f360800d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        q85.f fVar = (q85.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        q85.g gVar = this.f360800d;
        pk4.d dVar = gVar.f360807i;
        if (dVar != null) {
            if (dVar != null) {
                dVar.setVideoCallback(null);
            }
            pk4.d dVar2 = gVar.f360807i;
            if (dVar2 != null) {
                dVar2.stop();
            }
            java.util.List list = q85.g.f360801o;
            pk4.d dVar3 = gVar.f360807i;
            kotlin.jvm.internal.o.d(dVar3);
            list.add(dVar3);
            com.tencent.mars.xlog.Log.i("MiscroMsg.PlayerState", "onForgotten recycler :" + list.size() + ' ');
        }
        return jz5.f0.f302826a;
    }
}
