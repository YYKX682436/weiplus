package ic3;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290410d;

    public l(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290410d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290410d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        java.lang.String str2 = magicAdServiceDemoActivity.f147852f;
        if (str2 == null) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 请先获取广告信息（用于拿到 aid）");
            java.lang.String str3 = magicAdServiceDemoActivity.f147850d;
            yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "综合测试-上报流程\n1. reportAd(Expose)\n2. reportAd(ExposeEnd)\n3. reportNotShow\n\n请查看 logcat 日志");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        java.lang.String str4 = magicAdServiceDemoActivity.f147850d;
        wj.j0 j0Var = (wj.j0) iVar;
        j0Var.mj(str2, wj.w0.f446541d, null);
        new android.os.Handler(magicAdServiceDemoActivity.getMainLooper()).postDelayed(new ic3.k(magicAdServiceDemoActivity, j0Var, str2), 1000L);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
