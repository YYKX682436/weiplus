package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a2 f126378d = new com.tencent.mm.plugin.finder.storage.a2();

    public a2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI.f109483w;
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/FinderConfig$ENTER_POI_MANAGER_UI$2$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/storage/FinderConfig$ENTER_POI_MANAGER_UI$2$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
