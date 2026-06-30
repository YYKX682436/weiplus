package rk4;

/* loaded from: classes5.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(yz5.l lVar) {
        super(1);
        this.f396952d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.ting.TingWecoinSubscribeResult wecoinSubscribeResult = (com.tencent.pigeon.ting.TingWecoinSubscribeResult) obj;
        kotlin.jvm.internal.o.g(wecoinSubscribeResult, "wecoinSubscribeResult");
        this.f396952d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(wecoinSubscribeResult)));
        return jz5.f0.f302826a;
    }
}
