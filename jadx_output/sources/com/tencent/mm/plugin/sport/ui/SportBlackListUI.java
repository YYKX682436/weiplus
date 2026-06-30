package com.tencent.mm.plugin.sport.ui;

/* loaded from: classes11.dex */
public class SportBlackListUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference f171830d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f171831e;

    /* renamed from: f, reason: collision with root package name */
    public final r35.d2 f171832f = new we4.b(this);

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494961cr;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList P1;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 0 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        ((java.util.ArrayList) this.f171831e).addAll(P1);
        this.f171830d.Q(this.f171831e);
        lz.f fVar = this.f171830d.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.h();
        }
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            c01.e2.w0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n((java.lang.String) it.next(), true));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(39);
        java.util.List a17 = k35.c.a();
        if (this.f171831e == null) {
            this.f171831e = new java.util.ArrayList();
        }
        android.database.Cursor x17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x("@werun.black.android", "", null);
        while (x17.moveToNext()) {
            java.lang.String string = x17.getString(x17.getColumnIndex(dm.i4.COL_USERNAME));
            if (!((java.util.ArrayList) a17).contains(string)) {
                ((java.util.ArrayList) this.f171831e).add(string);
            }
        }
        x17.close();
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = (com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("black_contact_list_pref");
        this.f171830d = contactListExpandPreference;
        contactListExpandPreference.R(getPreferenceScreen(), this.f171830d.f197780q);
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = this.f171830d;
        contactListExpandPreference2.T(true);
        contactListExpandPreference2.V(true);
        this.f171830d.Q(this.f171831e);
        this.f171830d.Z(this.f171832f);
        this.f171830d.G(com.tencent.mm.R.string.c5m);
        setMMTitle(getString(com.tencent.mm.R.string.c48));
        setBackBtn(new we4.a(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }
}
