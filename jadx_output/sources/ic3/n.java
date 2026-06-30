package ic3;

/* loaded from: classes12.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290414d;

    public n(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290414d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290414d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        wj.t0 t0Var = magicAdServiceDemoActivity.f147851e;
        wj.t0 t0Var2 = wj.t0.N;
        magicAdServiceDemoActivity.f147851e = t0Var2;
        java.util.Objects.toString(t0Var2);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "综合测试-拦截流程\n1. 使用测试 posId（NotInstalled 策略）\n2. 调用 getAdInfoAsync\n3. 验证拦截行为\n\n请查看 logcat 日志");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        wj.j0 j0Var = (wj.j0) iVar;
        j0Var.Vi(t0Var2, magicAdServiceDemoActivity.f147856m, new ic3.m(java.lang.System.currentTimeMillis(), magicAdServiceDemoActivity, t0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
