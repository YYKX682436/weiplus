package ic3;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        super(1);
        this.f290403d = magicAdServiceDemoActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290403d;
        if (mVar != null) {
            java.lang.String str = mVar.f454753a;
            boolean D = r26.n0.D(str, "123456", false, 2, null);
            magicAdServiceDemoActivity.f147852f = str;
            if (D) {
                com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ Fallback 注入成功\naid: " + str + "\nhintText: " + mVar.f454754b + "\n\n请查看日志验证：\n1. GetAdInfo result=Fallback(7)\n2. extra 包含 use_fallback\n3. Expose/ExposeEnd/Click 上报包含 use_fallback");
            } else {
                com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 返回的是真广告（非 fallback）\n可能 CGI 成功返回了广告\naid: ".concat(str));
            }
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 未返回广告（fallback 也未注入）\n可能 useFallback 配置不完整");
            com.tencent.mars.xlog.Log.e(magicAdServiceDemoActivity.f147850d, "[综合测试-Fallback] ⚠️ 未返回广告");
        }
        return jz5.f0.f302826a;
    }
}
