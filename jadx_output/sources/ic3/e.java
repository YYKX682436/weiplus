package ic3;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        super(1);
        this.f290397d = magicAdServiceDemoActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290397d;
        if (mVar != null) {
            java.lang.String str = mVar.f454753a;
            magicAdServiceDemoActivity.f147852f = str;
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ Preload 流程测试完成\naid: " + str + "\n\n请查看日志验证：\n1. PreloadTrigger\n2. PullStart（preload 触发）\n3. PreloadSuccess\n4. GetAdInfo（getAdInfo 复用 CGI，无重复 PullStart）");
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ Preload 流程测试失败\nCGI 可能失败，请查看日志");
            com.tencent.mars.xlog.Log.e(magicAdServiceDemoActivity.f147850d, "[综合测试-Preload] ⚠️ 失败");
        }
        return jz5.f0.f302826a;
    }
}
