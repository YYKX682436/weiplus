package p52;

/* loaded from: classes15.dex */
public class l implements yj0.d {
    public l(p52.m mVar) {
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
        if (!android.text.TextUtils.isEmpty(str) && str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$") && "onMMMenuItemSelected".equals(str2) && "(Landroid/view/MenuItem;I)V".equals(str3)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsFinderMonitor", "mSnsFinderListener, runOnExit: %b", java.lang.Boolean.valueOf(p52.h.f352018c));
        }
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (android.text.TextUtils.isEmpty(str) || !str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$") || !"onMMMenuItemSelected".equals(str2) || !"(Landroid/view/MenuItem;I)V".equals(str3) || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj2 = objArr[0];
        if (obj2 instanceof android.view.MenuItem) {
            int itemId = ((android.view.MenuItem) obj2).getItemId();
            p52.h.f352018c = itemId == 6;
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsFinderMonitor", "mSnsFinderListener, runOnEnter: itemId=%d, %b", java.lang.Integer.valueOf(itemId), java.lang.Boolean.valueOf(p52.h.f352018c));
        }
    }
}
