package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.q f207073d;

    public p(com.tencent.mm.ui.contact.q qVar) {
        this.f207073d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.q qVar = this.f207073d;
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = qVar.f207124d;
        addressUIFragment.f206307o.setAdapter((android.widget.ListAdapter) addressUIFragment.f206309q);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "post to first init finish");
        android.view.View findViewById = qVar.f207124d.findViewById(com.tencent.mm.R.id.imk);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.startAnimation(android.view.animation.AnimationUtils.loadAnimation(qVar.f207124d.getContext(), com.tencent.mm.R.anim.f477784bd));
            qVar.f207124d.N.a();
        }
    }
}
