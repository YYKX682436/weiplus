package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207096d;

    public p7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207096d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMAddressUI", "post to first init finish");
        com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f207096d;
        android.view.View findViewById = openIMAddressUIFragment.findViewById(com.tencent.mm.R.id.imk);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.startAnimation(android.view.animation.AnimationUtils.loadAnimation(openIMAddressUIFragment.getContext(), com.tencent.mm.R.anim.f477784bd));
        }
    }
}
