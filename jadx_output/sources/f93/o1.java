package f93;

/* loaded from: classes11.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelEditUI f260408d;

    public o1(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI) {
        this.f260408d = contactLabelEditUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260408d;
        com.tencent.mm.storage.d4 d4Var = contactLabelEditUI.f143223g;
        if (d4Var.field_isTemporary) {
            contactLabelEditUI.W6(d4Var);
        } else {
            contactLabelEditUI.C = db5.e1.Q(contactLabelEditUI, contactLabelEditUI.getString(com.tencent.mm.R.string.f490573yv), contactLabelEditUI.getString(com.tencent.mm.R.string.g8w), true, true, new f93.c1(contactLabelEditUI));
            c01.d9.e().g(new e93.c(d4Var.field_labelID + ""));
        }
        if (contactLabelEditUI.F) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 2, 2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 2, 3);
        }
        java.lang.String str = contactLabelEditUI.f143227n;
        if (str != null) {
            int length = str.length();
            boolean z17 = false;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = true;
                    break;
                }
                int codePointAt = str.codePointAt(i18);
                if (!java.lang.Character.isWhitespace(codePointAt)) {
                    break;
                } else {
                    i18 += java.lang.Character.charCount(codePointAt);
                }
            }
            if (z17) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "label_detele_confirm_btn");
            hashMap.put("label_business_type", java.lang.Integer.valueOf(contactLabelEditUI.f143228o));
            hashMap.put("label_select_sessionid", contactLabelEditUI.f143227n);
            hashMap.put("delete_cnt", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", contactLabelEditUI.getListView(), hashMap, 33926);
        }
    }
}
