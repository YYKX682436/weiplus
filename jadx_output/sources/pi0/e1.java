package pi0;

/* loaded from: classes11.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354559e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.e1(this.f354559e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354558d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.k0 a17 = pi0.k0.f354629c.a(this.f354559e);
            if (a17 == null) {
                return null;
            }
            this.f354558d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            io.flutter.Log.i("MicroMsg.HybridNavPageStateChannel", "onMessageSuspend HybridNavPageState.EngineExit " + a17.f354632b);
            a17.f354631a.send("HybridNavPageState.EngineExit", new pi0.j0("HybridNavPageState.EngineExit", rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (jz5.f0) obj;
    }
}
