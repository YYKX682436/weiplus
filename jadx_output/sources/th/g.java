package th;

/* loaded from: classes12.dex */
public class g implements android.widget.PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ th.h f419248a;

    public g(th.h hVar) {
        this.f419248a = hVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String charSequence = menuItem.getTitle().toString();
        charSequence.getClass();
        boolean equals = charSequence.equals("Close");
        th.h hVar = this.f419248a;
        if (equals) {
            hVar.f419250e.f419264b.postDelayed(new th.f(this), 200L);
        } else if (charSequence.equals("Expand")) {
            android.view.View findViewById = hVar.f419250e.f419267e.findViewById(com.tencent.mm.R.id.hyl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = hVar.f419250e.f419267e.findViewById(com.tencent.mm.R.id.hmq);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return false;
    }
}
