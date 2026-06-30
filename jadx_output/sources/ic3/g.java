package ic3;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290402d;

    public g(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290402d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290402d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "综合测试-Preload流程\n1. 清缓存\n2. preloadAd\n3. getAdInfoAsync（验证去重）\n请查看 logcat 日志");
        wj.j0 j0Var = (wj.j0) ((xj.i) i95.n0.c(xj.i.class));
        j0Var.Ni();
        magicAdServiceDemoActivity.f147852f = null;
        j0Var.ij(magicAdServiceDemoActivity.f147851e);
        new android.os.Handler(magicAdServiceDemoActivity.getMainLooper()).postDelayed(new ic3.f(magicAdServiceDemoActivity, j0Var), 2000L);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
