package vp4;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.p f439054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vp4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439054d = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.n(this.f439054d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vp4.n nVar = (vp4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ru3.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vp4.p pVar = this.f439054d;
        ru3.f fVar2 = pVar.f439066g;
        if (fVar2 != null) {
            fVar2.a();
        }
        android.content.Context context = pVar.f439065f;
        if (context != null && (fVar = pVar.f439066g) != null) {
            kotlin.jvm.internal.o.d(context);
            fVar.b(context, false, com.tencent.mm.R.string.i1q, vp4.m.f439053d);
        }
        return jz5.f0.f302826a;
    }
}
