package qf2;

/* loaded from: classes.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f362585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.g0 g0Var, java.lang.String str) {
        super(2, continuation);
        this.f362584d = hVar;
        this.f362585e = g0Var;
        this.f362586f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.t0(this.f362584d, continuation, this.f362585e, this.f362586f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.t0 t0Var = (qf2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.jc2 jc2Var = (r45.jc2) ((xg2.i) this.f362584d).f454393b;
        java.lang.Integer num = new java.lang.Integer(jc2Var.getInteger(1));
        if (!java.lang.Boolean.valueOf(num.intValue() > 0).booleanValue()) {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 30;
        kotlin.jvm.internal.g0 g0Var = this.f362585e;
        g0Var.f310121d = intValue * 1000;
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "repeatNotifySEISync success, source: " + this.f362586f + " nextDelayTime: " + g0Var.f310121d + " next_regular_req_delay_time_s: " + jc2Var.getInteger(1));
        return jz5.f0.f302826a;
    }
}
