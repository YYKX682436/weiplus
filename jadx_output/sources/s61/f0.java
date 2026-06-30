package s61;

/* loaded from: classes8.dex */
public class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f403344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f403345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s61.i0 f403347g;

    public f0(s61.i0 i0Var, java.util.HashMap hashMap, android.net.Uri uri, java.lang.String str) {
        this.f403347g = i0Var;
        this.f403344d = hashMap;
        this.f403345e = uri;
        this.f403346f = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        android.content.Intent intent = new android.content.Intent();
        java.util.HashMap hashMap = this.f403344d;
        intent.setComponent(new android.content.ComponentName(((android.content.pm.ResolveInfo) hashMap.get(str)).activityInfo.packageName, ((android.content.pm.ResolveInfo) hashMap.get(str)).activityInfo.name));
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(this.f403345e);
        intent.putExtra("sms_body", this.f403346f);
        com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI = this.f403347g.f403358d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inviteFriendUI, arrayList.toArray(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        inviteFriendUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(inviteFriendUI, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
