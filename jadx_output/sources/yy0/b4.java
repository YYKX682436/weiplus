package yy0;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yy0.m7 m7Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468027d = m7Var;
        this.f468028e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.b4(this.f468027d, this.f468028e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.b4 b4Var = (yy0.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468027d.f468225d, "notifyMCSelectClipTitleTextStyleID: textStyleID=" + this.f468028e);
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468027d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.H0(this.f468028e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468027d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
