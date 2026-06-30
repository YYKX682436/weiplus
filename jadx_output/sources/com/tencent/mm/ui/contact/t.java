package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207186d;

    public t(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207186d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.Y;
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f207186d;
        com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) addressUIFragment.getContext();
        if (launcherUI == null || launcherUI.f7().f196925e == 1) {
            android.widget.ListView listView = addressUIFragment.f206307o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(listView);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.contact.j(addressUIFragment), 300L);
        }
    }
}
