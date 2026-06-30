package ic3;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f290411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f290413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity, wj.t0 t0Var) {
        super(1);
        this.f290411d = j17;
        this.f290412e = magicAdServiceDemoActivity;
        this.f290413f = t0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f290411d;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290412e;
        if (mVar == null) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ 结果: 被拦截（返回空广告数据）\n说明: 元宝已安装，触发拦截\n耗时: " + currentTimeMillis + "ms\n\n请查看日志验证：\n1. GetAdInfo result=Reject(4)\n2. ClientIntercept(15) KV（value=reason）");
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 结果: 未拦截（获取到广告）\n说明: 元宝未安装，放行\n耗时: " + currentTimeMillis + "ms\naid: " + mVar.f454753a);
        }
        wj.t0 t0Var = this.f290413f;
        magicAdServiceDemoActivity.f147851e = t0Var;
        java.util.Objects.toString(t0Var);
        return jz5.f0.f302826a;
    }
}
