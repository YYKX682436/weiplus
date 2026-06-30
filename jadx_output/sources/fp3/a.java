package fp3;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265302d;

    public a(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f265302d = mallOrderDetailInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f265302d;
        if (id6 == com.tencent.mm.R.id.kkv) {
            dp3.c cVar = mallOrderDetailInfoUI.f152831h.f152820b;
            if (cVar != null) {
                hp3.d.c(mallOrderDetailInfoUI, cVar.f242205d);
                com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, mallOrderDetailInfoUI.f152831h.f152820b.f242202a);
            }
        } else if (view.getId() == com.tencent.mm.R.id.kl_ || view.getId() == com.tencent.mm.R.id.kl9) {
            java.util.ArrayList arrayList2 = mallOrderDetailInfoUI.f152831h.f152821c;
            if (arrayList2 != null && arrayList2.size() > 0) {
                if (!(!android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.order.model.ProductSectionItem) mallOrderDetailInfoUI.f152831h.f152821c.get(0)).f152814i) ? hp3.d.c(mallOrderDetailInfoUI, ((com.tencent.mm.plugin.order.model.ProductSectionItem) mallOrderDetailInfoUI.f152831h.f152821c.get(0)).f152814i) : false)) {
                    hp3.d.b(mallOrderDetailInfoUI, ((com.tencent.mm.plugin.order.model.ProductSectionItem) mallOrderDetailInfoUI.f152831h.f152821c.get(0)).f152815m);
                }
                com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, ((com.tencent.mm.plugin.order.model.ProductSectionItem) mallOrderDetailInfoUI.f152831h.f152821c.get(0)).f152810e);
            }
        } else if (view.getId() == com.tencent.mm.R.id.kl8) {
            android.os.Bundle input = mallOrderDetailInfoUI.getInput();
            input.putParcelableArrayList("order_product_list", mallOrderDetailInfoUI.f152831h.f152821c);
            input.putInt("key_enter_id", 0);
            input.putString("key_trans_id", mallOrderDetailInfoUI.f152841u);
            input.putString("appname", mallOrderDetailInfoUI.f152831h.f152825g);
            com.tencent.mm.wallet_core.a.d(mallOrderDetailInfoUI, new android.os.Bundle());
            com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, mallOrderDetailInfoUI.getResources().getString(com.tencent.mm.R.string.grj));
        } else if (view.getId() == com.tencent.mm.R.id.klp) {
            java.lang.String string = mallOrderDetailInfoUI.getInput().getString("key_trans_id");
            android.os.Bundle input2 = mallOrderDetailInfoUI.getInput();
            input2.putString("key_trans_id", string);
            input2.putInt("key_enter_id", 1);
            com.tencent.mm.plugin.order.model.a aVar = mallOrderDetailInfoUI.f152831h;
            if (aVar != null) {
                input2.putParcelable("transaction_data", aVar.f152819a);
            }
            com.tencent.mm.wallet_core.a.d(mallOrderDetailInfoUI, input2);
            com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, mallOrderDetailInfoUI.getResources().getString(com.tencent.mm.R.string.gri));
        } else if (view.getId() == com.tencent.mm.R.id.kkq) {
            int i17 = com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.B;
            db5.e1.A(mallOrderDetailInfoUI, "商家已退全款，总价125元，包含商品价格115元，邮费10元，请确认是否同意通过该处理结果。", mallOrderDetailInfoUI.getString(com.tencent.mm.R.string.gr9), mallOrderDetailInfoUI.getString(com.tencent.mm.R.string.grk), mallOrderDetailInfoUI.getString(com.tencent.mm.R.string.grl), new fp3.b(mallOrderDetailInfoUI), new fp3.c(mallOrderDetailInfoUI));
        } else if (view.getId() == com.tencent.mm.R.id.h1b) {
            com.tencent.mm.plugin.order.model.a aVar2 = mallOrderDetailInfoUI.f152831h;
            if (aVar2 != null && (str = aVar2.f152824f) != null) {
                mallOrderDetailInfoUI.f152827d = str;
                if (!android.text.TextUtils.isEmpty(str)) {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + mallOrderDetailInfoUI.f152827d));
                    intent.addFlags(268435456);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mallOrderDetailInfoUI, arrayList3.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mallOrderDetailInfoUI.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(mallOrderDetailInfoUI, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, mallOrderDetailInfoUI.getResources().getString(com.tencent.mm.R.string.grh));
            }
        } else if (view.getId() == com.tencent.mm.R.id.pr7) {
            com.tencent.mm.wallet_core.ui.r1.d0(mallOrderDetailInfoUI, mallOrderDetailInfoUI.f152831h.f152825g);
            com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.U6(mallOrderDetailInfoUI, mallOrderDetailInfoUI.getResources().getString(com.tencent.mm.R.string.grn));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
