package uf5;

/* loaded from: classes8.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI f427271d;

    public l1(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI) {
        this.f427271d = selectPrivacyContactsFromRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427271d;
        j75.f stateCenter = selectPrivacyContactsFromRangeUI.getStateCenter();
        if (stateCenter != null && ((uf5.l) stateCenter.getState()).f427266e) {
            stateCenter.B3(new uf5.y0());
            return true;
        }
        selectPrivacyContactsFromRangeUI.hideVKB();
        selectPrivacyContactsFromRangeUI.finish();
        return false;
    }
}
