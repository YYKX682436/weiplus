package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI f129794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI finderHomeAffinityUI, int i17) {
        super(0);
        this.f129794d = finderHomeAffinityUI;
        this.f129795e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI.f128581e;
        int i17 = com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.D;
        com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI finderHomeAffinityUI = this.f129794d;
        android.view.View contentView = finderHomeAffinityUI.getContentView();
        kotlin.jvm.internal.o.f(contentView, "access$getContentView(...)");
        com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI.f128581e = com.tencent.mm.sdk.platformtools.x.b0(contentView);
        com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI finderHomeAffinityUI2 = this.f129794d;
        android.content.Intent intent = new android.content.Intent(finderHomeAffinityUI, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI.class);
        intent.addFlags(268435456);
        intent.putExtra("KEY_ROUTER_LAUNCHER", this.f129795e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderHomeAffinityUI2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finderHomeAffinityUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(finderHomeAffinityUI2, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finderHomeAffinityUI.overridePendingTransition(0, 0);
        return jz5.f0.f302826a;
    }
}
