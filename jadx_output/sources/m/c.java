package m;

/* loaded from: classes16.dex */
public final class c extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ we0.u0 M;
    public final /* synthetic */ java.util.Map N;
    public final /* synthetic */ android.content.Context P;
    public final /* synthetic */ android.os.Bundle Q;
    public final /* synthetic */ android.os.ResultReceiver R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(we0.u0 u0Var, java.util.Map map, android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.M = u0Var;
        this.N = map;
        this.P = context;
        this.Q = bundle;
        this.R = resultReceiver;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m.c(this.M, this.N, this.P, this.Q, this.R, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.L;
        we0.u0 u0Var = this.M;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(u0Var.f445169d, "openFlutterPublishPage: launch failed, err=" + th6.getMessage());
            android.os.ResultReceiver resultReceiver = this.R;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map map = this.N;
            this.L = 1;
            obj = we0.u0.a(u0Var, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Context context = this.P;
        com.tencent.mm.flutter.ui.FlutterPageStyle b17 = we0.u0.b(u0Var);
        android.os.Bundle bundle = this.Q;
        this.L = 2;
        if (pi0.l1.v((pi0.l1) obj, context, b17, com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity.class, null, bundle, this, 8, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
