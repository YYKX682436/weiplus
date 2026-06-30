package ic3;

/* loaded from: classes12.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290416d;

    public p(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290416d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290416d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        java.lang.String str2 = magicAdServiceDemoActivity.f147852f;
        if (str2 != null) {
            i95.m c17 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, str2, wj.w0.f446542e, null, 4, null);
        }
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.T6(magicAdServiceDemoActivity);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
