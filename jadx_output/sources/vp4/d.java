package vp4;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.j f439015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vp4.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439015d = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.d(this.f439015d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vp4.d dVar = (vp4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ru3.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vp4.j jVar = this.f439015d;
        android.content.Context context = jVar.f439040f;
        if (context != null && (fVar = jVar.f439041g) != null) {
            kotlin.jvm.internal.o.d(context);
            fVar.b(context, false, com.tencent.mm.R.string.i1q, vp4.c.f439014d);
        }
        return jz5.f0.f302826a;
    }
}
