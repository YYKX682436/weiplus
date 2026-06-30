package ic3;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290404d;

    public i(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290404d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290404d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        if (!magicAdServiceDemoActivity.f147851e.f446527p) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 当前 posId 未配置 useFallback\n请先选择已配置 fallback 的 posId（如 FORWARD_TO_YUANBAO）");
            java.lang.String str2 = magicAdServiceDemoActivity.f147850d;
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "综合测试-Fallback注入\n1. 清缓存\n2. 模拟 CGI 失败（断网或超时）\n3. 验证返回 fallback adInfo\n\n请查看 logcat 日志");
            wj.j0 j0Var = (wj.j0) ((xj.i) i95.n0.c(xj.i.class));
            j0Var.Ni();
            magicAdServiceDemoActivity.f147852f = null;
            j0Var.Vi(magicAdServiceDemoActivity.f147851e, 5000L, new ic3.h(magicAdServiceDemoActivity));
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
