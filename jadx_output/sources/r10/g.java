package r10;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar) {
        super(1);
        this.f368575d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult result = (com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOpenAsyncInfo", "fetchAsyncInfo result: success=" + result.f65851d + ", isTeenMode=" + result.f65852e);
        this.f368575d.invoke(result);
        return jz5.f0.f302826a;
    }
}
