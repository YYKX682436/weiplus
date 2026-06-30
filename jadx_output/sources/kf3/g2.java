package kf3;

/* loaded from: classes.dex */
public class g2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI f307352d;

    public g2(com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI) {
        this.f307352d = massSendSelectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "Click Next Btn");
        com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI = this.f307352d;
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) ((java.util.LinkedList) massSendSelectContactUI.E).toArray(new java.lang.String[0]));
        if (P1 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendSelectContactUI", "no choosed anyone");
            return false;
        }
        P1.remove(c01.z1.r());
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(P1, ";");
        android.content.Intent intent = new android.content.Intent(massSendSelectContactUI, (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.class);
        intent.putExtra("mass_send_contact_list", c17);
        com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI2 = this.f307352d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(massSendSelectContactUI2, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        massSendSelectContactUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(massSendSelectContactUI2, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
