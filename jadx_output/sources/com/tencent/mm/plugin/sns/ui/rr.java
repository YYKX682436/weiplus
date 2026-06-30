package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class rr implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f170431a;

    public rr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f170431a = snsTagDetailUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI = this.f170431a;
        java.lang.String c17 = lz.a.c(snsTagDetailUI.f167445f, i17);
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(c17)) {
            db5.e1.i(snsTagDetailUI.getContext(), com.tencent.mm.R.string.i4t, com.tencent.mm.R.string.f490573yv);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            return;
        }
        snsTagDetailUI.Y6(c17);
        if (!(snsTagDetailUI.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(snsTagDetailUI.f167446g, ",")).equals(snsTagDetailUI.f167449m) || snsTagDetailUI.f167447h == 0) {
            snsTagDetailUI.enableOptionMenu(true);
        } else {
            snsTagDetailUI.enableOptionMenu(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.f167442q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI = this.f170431a;
        snsTagDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(snsTagDetailUI.f167446g, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", snsTagDetailUI.getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c, 1024) & (-16777217));
        intent.putExtra("always_select_contact", c17);
        j45.l.v(snsTagDetailUI, ".ui.contact.SelectContactUI", intent, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f170431a.f167445f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI = this.f170431a;
        java.lang.String c17 = lz.a.c(snsTagDetailUI.f167445f, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        long j17 = snsTagDetailUI.f167447h;
        if (j17 == 4) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 18);
        } else if (j17 == 5) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 19);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, snsTagDetailUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }
}
