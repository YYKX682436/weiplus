package gu1;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI f275889d;

    public h(com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI) {
        this.f275889d = cardConsumeSuccessUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI = this.f275889d;
        if (id6 == com.tencent.mm.R.id.f482335bp) {
            fu1.g gVar = cardConsumeSuccessUI.f94709p;
            if (gVar == null || (arrayList = gVar.f266840a) == null || arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list == null || mConsumedInfo.list.isEmpty()!");
            } else {
                cardConsumeSuccessUI.X6(true);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < cardConsumeSuccessUI.f94709p.f266840a.size(); i17++) {
                    r45.vu vuVar = ((fu1.o) cardConsumeSuccessUI.f94709p.f266840a.get(i17)).f266864a;
                    r45.a46 a46Var = new r45.a46();
                    if (vuVar != null) {
                        java.lang.String str = vuVar.f388545d;
                        a46Var.f369719e = str;
                        cardConsumeSuccessUI.f94712s = str;
                    }
                    a46Var.f369720f = ((fu1.o) cardConsumeSuccessUI.f94709p.f266840a.get(i17)).f266865b;
                    a46Var.f369722h = "";
                    a46Var.f369721g = "";
                    a46Var.f369723i = cardConsumeSuccessUI.f94715v;
                    linkedList.add(a46Var);
                }
                java.lang.String str2 = cardConsumeSuccessUI.f94714u == 1 ? cardConsumeSuccessUI.f94709p.f266841b : cardConsumeSuccessUI.f94710q;
                r45.o46 o17 = lu1.a0.o(cardConsumeSuccessUI.f94716w, cardConsumeSuccessUI.f94719z, cardConsumeSuccessUI.A);
                fu1.e eVar = cardConsumeSuccessUI.f94708o.isChecked() ? new fu1.e(0, linkedList, cardConsumeSuccessUI.f94709p.f266843d, str2, o17, 20, null) : new fu1.e(0, linkedList, "", str2, o17, 20, null);
                android.widget.CheckBox checkBox = cardConsumeSuccessUI.f94708o;
                if (checkBox != null && checkBox.getVisibility() == 0) {
                    if (cardConsumeSuccessUI.f94708o.isChecked()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumeSuccessFollowServices", 0, "", "", 0, 0, "", 0, "");
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumeSuccessView", 0, "", "", 0, 0, "", 0, "");
                    }
                }
                gm0.j1.n().f273288b.g(eVar);
            }
        } else if (view.getId() == com.tencent.mm.R.id.nrt) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KLabel_range_index", cardConsumeSuccessUI.f94716w);
            intent.putExtra("Klabel_name_list", cardConsumeSuccessUI.f94717x);
            intent.putExtra("Kother_user_name_list", cardConsumeSuccessUI.f94718y);
            intent.putExtra("k_sns_label_ui_title", cardConsumeSuccessUI.getString(com.tencent.mm.R.string.av9));
            intent.putExtra("k_sns_label_ui_style", 0);
            intent.putExtra("KLabel_is_filter_private", true);
            j45.l.n(cardConsumeSuccessUI, "sns", ".ui.SnsLabelUI", intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
