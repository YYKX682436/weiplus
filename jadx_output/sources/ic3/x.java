package ic3;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        super(1);
        this.f290424d = magicAdServiceDemoActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290424d;
        if (mVar != null) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ 结果: 未拦截（拿到广告）\n说明: 元宝未安装，放行\naid: " + mVar.f454753a);
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "🚫 结果: 已拦截（无广告数据）\n说明: 元宝已安装，触发拦截");
        }
        return jz5.f0.f302826a;
    }
}
