package ic3;

/* loaded from: classes12.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290420d;

    public t(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290420d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290420d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        java.lang.String str2 = magicAdServiceDemoActivity.f147852f;
        if (str2 != null) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "ad feedback");
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).aj(str2);
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.T6(magicAdServiceDemoActivity);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(magicAdServiceDemoActivity.f147850d, "aid not found");
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "adInfo is empty");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
