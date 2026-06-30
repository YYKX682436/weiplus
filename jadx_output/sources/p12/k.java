package p12;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j2 f351035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.CircularProgressBar f351036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.flow.j2 j2Var, com.tencent.mm.plugin.emoji.editor.widgets.CircularProgressBar circularProgressBar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351035e = j2Var;
        this.f351036f = circularProgressBar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p12.k(this.f351035e, this.f351036f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((p12.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f351034d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p12.j jVar = new p12.j(this.f351036f);
            this.f351034d = 1;
            if (((kotlinx.coroutines.flow.h3) this.f351035e).a(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
