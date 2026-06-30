package ic3;

/* loaded from: classes12.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290418d;

    public r(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290418d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290418d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        java.util.Objects.toString(magicAdServiceDemoActivity.f147851e);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "preload ad: " + magicAdServiceDemoActivity.f147851e);
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).ij(magicAdServiceDemoActivity.f147851e);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
