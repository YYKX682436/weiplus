package yy0;

/* loaded from: classes5.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(yy0.m7 m7Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468128d = m7Var;
        this.f468129e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.h4(this.f468128d, this.f468129e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.h4 h4Var = (yy0.h4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468128d.f468225d, "notifyMCSelectVoiceChangeRoleID: roleID=" + this.f468129e);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468128d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.N0(this.f468129e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468128d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
