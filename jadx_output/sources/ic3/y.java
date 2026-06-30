package ic3;

/* loaded from: classes12.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290425d;

    public y(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290425d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290425d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        wj.t0 t0Var = magicAdServiceDemoActivity.f147851e;
        magicAdServiceDemoActivity.f147851e = wj.t0.N;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "策略: NotInstalled（未安装才展示广告）\n装了元宝 → 拦截（不拉广告）\n没装元宝 → 放行（正常拉广告）\n检测包名: com.tencent.hunyuan.app.chat");
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Vi(magicAdServiceDemoActivity.f147851e, magicAdServiceDemoActivity.f147856m, new ic3.x(magicAdServiceDemoActivity));
        magicAdServiceDemoActivity.f147851e = t0Var;
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
