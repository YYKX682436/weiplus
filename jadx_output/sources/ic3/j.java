package ic3;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.i f290406e;

    public j(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity, xj.i iVar) {
        this.f290405d = magicAdServiceDemoActivity;
        this.f290406e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290405d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        ((wj.j0) this.f290406e).oj(magicAdServiceDemoActivity.f147851e, "test_comprehensive_report");
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ 上报流程测试完成\n\n请查看日志验证：\n1. Expose(6) KV\n2. ExposeEnd(16) KV（value=时长 ms）\n3. NotShow(19) KV（value=0, extra=原因）");
        java.lang.String str2 = magicAdServiceDemoActivity.f147850d;
    }
}
