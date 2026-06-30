package f93;

/* loaded from: classes11.dex */
public class k1 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelEditUI f260370a;

    public k1(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI) {
        this.f260370a = contactLabelEditUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260370a;
        contactLabelEditUI.G.f55741i = 1;
        java.lang.String c17 = lz.a.c(contactLabelEditUI.f143231r, i17);
        contactLabelEditUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealRemoveContact]");
        java.util.ArrayList arrayList = contactLabelEditUI.f143237x;
        if (arrayList != null && arrayList.contains(c17)) {
            contactLabelEditUI.f143237x.remove(c17);
            com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct contactLabelEditStruct = contactLabelEditUI.G;
            contactLabelEditStruct.f55742j++;
            contactLabelEditStruct.f55743k = contactLabelEditStruct.b("DeleteUinlist", contactLabelEditStruct.f55743k + ";" + c17, true);
        }
        java.util.ArrayList arrayList2 = contactLabelEditUI.f143238y;
        if (arrayList2 != null && arrayList2.contains(c17)) {
            contactLabelEditUI.B.add(c17);
        }
        java.util.HashSet hashSet = contactLabelEditUI.f143239z;
        if (hashSet != null && hashSet.contains(c17)) {
            hashSet.remove(c17);
            contactLabelEditUI.A.remove(c17);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactLabelEditUI.H;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
        }
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260370a;
        contactLabelEditUI.G.f55741i = 1;
        contactLabelEditUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealAddContact]");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, 1024));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", contactLabelEditUI.getString(com.tencent.mm.R.string.g8s));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        java.util.ArrayList arrayList = contactLabelEditUI.f143237x;
        if (arrayList != null) {
            intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        }
        j45.l.v(contactLabelEditUI, ".ui.contact.SelectContactUI", intent, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f260370a.f143231r;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260370a;
        lz.f fVar = contactLabelEditUI.f143231r.M;
        if (fVar != null ? ((r35.u1) fVar).f369274f.g(i17) : false) {
            contactLabelEditUI.G.f55740h++;
            java.lang.String c17 = lz.a.c(contactLabelEditUI.f143231r, i17);
            java.lang.String a17 = lz.a.a(contactLabelEditUI.f143231r, i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", c17);
            intent.putExtra("Contact_RoomNickname", a17);
            if ((java.util.Objects.equals(contactLabelEditUI.E, "label_source_Address") ? (char) 1 : java.util.Objects.equals(contactLabelEditUI.E, "label_source_SNS") ? (char) 2 : (char) 65535) == 1) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 108);
            } else {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", contactLabelEditUI.F ? 17 : 15);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, contactLabelEditUI);
        }
    }
}
