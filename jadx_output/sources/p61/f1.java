package p61;

/* loaded from: classes5.dex */
public class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g1 f352245d;

    public f1(p61.g1 g1Var) {
        this.f352245d = g1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        p61.g1 g1Var = this.f352245d;
        if (itemId == 0) {
            com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = g1Var.f352262e;
            int i18 = com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.f72961y;
            db5.e1.A(bindMContactIntroUI.getContext(), bindMContactIntroUI.getString(com.tencent.mm.R.string.ah6), bindMContactIntroUI.getString(com.tencent.mm.R.string.ah7), bindMContactIntroUI.getString(com.tencent.mm.R.string.f490347sg), bindMContactIntroUI.getString(com.tencent.mm.R.string.f490720ah5), null, new p61.k1(bindMContactIntroUI));
        } else {
            if (itemId != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
            j45.l.j(g1Var.f352262e, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
        }
    }
}
