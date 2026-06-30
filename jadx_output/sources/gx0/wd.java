package gx0;

/* loaded from: classes5.dex */
public final class wd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277134d = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.wd(this.f277134d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.wd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.bf bfVar = this.f277134d;
        if (bfVar.m7()) {
            return kotlinx.coroutines.l.e(bfVar.f276252s, new gx0.vd(bfVar, null));
        }
        bfVar.L = false;
        return java.lang.Boolean.FALSE;
    }
}
