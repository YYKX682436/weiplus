package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.zm f147516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147517e;

    public un(com.tencent.mm.plugin.luckymoney.ui.co coVar, com.tencent.mm.plugin.luckymoney.ui.zm zmVar) {
        this.f147517e = coVar;
        this.f147516d = zmVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147517e;
        android.content.Intent intent = new android.content.Intent(coVar.M.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew.class);
        int layoutPosition = coVar.getLayoutPosition();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.V6(coVar.M, layoutPosition);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click normalVh thumb item , realPos : %s ， mSelectPos：%s", java.lang.Integer.valueOf(layoutPosition), java.lang.Integer.valueOf(coVar.M.f146534v));
        intent.putExtra("key_source_click_thumb_detail_need_close_dynamic", coVar.M.f146517e);
        intent.putExtra("key_source_click_thumb_detail_need_close_atmosphere_dynamic", coVar.M.f146518f);
        intent.putExtra("key_source_click_thumb_detail_resp", false);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_CLICK_THUNB_ITEM_SNAPSHOT_STRING_SYNC;
        c17.x(u3Var, "");
        com.tencent.mm.plugin.luckymoney.ui.zm zmVar = this.f147516d;
        r45.wv3 wv3Var = zmVar.f147793b;
        if (wv3Var != null) {
            try {
                gm0.j1.u().c().x(u3Var, new java.lang.String(wv3Var.toByteArray(), s46.a.f403001a));
                intent.putExtra("key_source_click_thumb_detail_resp", true);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "itemView parse error: %s", e17.toString());
            }
            intent.putExtra("key_source_is_illegal", coVar.M.f7(zmVar.f147793b.f389500f));
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = coVar.M;
            int i17 = luckyMoneyPickEnvelopeUI.f146534v;
            if (i17 >= 0 && i17 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).size()) {
                intent.putExtra("key_source_select_pos", coVar.M.f146534v);
            }
            intent.putExtra("key_source_is_select_create_Envelope", coVar.M.h7());
            intent.putExtra("key_source_is_select_biz_Envelope", coVar.M.g7());
        }
        intent.putExtra("key_source_original_pos", coVar.M.f146535w);
        intent.putExtra("key_source_original_coverid", coVar.M.K);
        intent.putExtra("key_source_sessionid", coVar.M.f146515J);
        intent.putExtra("key_source_cover_count", coVar.M.f146524n.getItemCount() - 1);
        coVar.M.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
