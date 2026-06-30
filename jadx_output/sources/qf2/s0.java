package qf2;

/* loaded from: classes.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f362567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, kotlin.jvm.internal.g0 g0Var) {
        super(2, continuation);
        this.f362565d = hVar;
        this.f362566e = str;
        this.f362567f = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.s0(this.f362565d, continuation, this.f362566e, this.f362567f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.s0 s0Var = (qf2.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "repeatNotifySEISync source: " + this.f362566e + " fail: " + ((xg2.a) ((xg2.b) this.f362565d).f454381b));
        this.f362567f.f310121d = 30000L;
        return jz5.f0.f302826a;
    }
}
