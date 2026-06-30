package rk4;

/* loaded from: classes9.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yz5.l lVar) {
        super(1);
        this.f396555d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.s1 asyncResultUR = (bw5.s1) obj;
        kotlin.jvm.internal.o.g(asyncResultUR, "asyncResultUR");
        long j17 = asyncResultUR.f32745d;
        java.lang.String str = asyncResultUR.f32748g[2] ? asyncResultUR.f32746e : "";
        kotlin.jvm.internal.o.f(str, "getErrorMessage(...)");
        this.f396555d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(j17, str, asyncResultUR.initialProtobufBytes()))));
        return jz5.f0.f302826a;
    }
}
