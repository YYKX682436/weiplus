package uf5;

/* loaded from: classes10.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI f427276d;

    public n1(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI) {
        this.f427276d = selectPrivacyContactsFromRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427276d;
        if (selectPrivacyContactsFromRangeUI.E == 16) {
            uf5.j1 j1Var = selectPrivacyContactsFromRangeUI.R;
            java.lang.String stringExtra = selectPrivacyContactsFromRangeUI.getIntent().getStringExtra("privacy_del_tips");
            uf5.m1 m1Var = new uf5.m1(this);
            android.content.Context context = j1Var.f427252a;
            db5.e1.B(context, stringExtra, "", context.getResources().getString(com.tencent.mm.R.string.f489881ec), j1Var.f427252a.getResources().getString(com.tencent.mm.R.string.f490347sg), new uf5.g1(j1Var, m1Var), null, com.tencent.mm.R.color.f478524a5);
            return true;
        }
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.w7(selectPrivacyContactsFromRangeUI);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(selectPrivacyContactsFromRangeUI.C.f427289r, ","));
        selectPrivacyContactsFromRangeUI.setResult(-1, intent);
        selectPrivacyContactsFromRangeUI.finish();
        return true;
    }
}
