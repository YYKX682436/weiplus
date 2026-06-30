package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class a8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f206592d;

    public a8(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f206592d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f206592d;
        android.widget.ListView listView = openIMAddressUIFragment.f206519e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.contact.k7(openIMAddressUIFragment), 300L);
    }
}
