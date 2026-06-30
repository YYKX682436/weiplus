package rn2;

/* loaded from: classes15.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f397736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f397737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(rn2.t2 t2Var, gk2.e eVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397735e = t2Var;
        this.f397736f = eVar;
        this.f397737g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.f2(this.f397735e, this.f397736f, this.f397737g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397734d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ld2.i iVar = ld2.i.f318103a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f397735e.f397853e;
            this.f397734d = 1;
            if (iVar.a(mMActivity, this.f397736f, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f397737g);
        android.app.Activity activity = uICallback instanceof android.app.Activity ? (android.app.Activity) uICallback : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}
