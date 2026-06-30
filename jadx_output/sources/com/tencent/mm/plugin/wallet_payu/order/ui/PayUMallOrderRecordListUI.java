package com.tencent.mm.plugin.wallet_payu.order.ui;

/* loaded from: classes9.dex */
public class PayUMallOrderRecordListUI extends com.tencent.mm.plugin.order.ui.MallOrderRecordListUI {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f181271r = 0;

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
    public void U6() {
        addSceneEndListener(com.tencent.mm.minigame.y.CTRL_INDEX);
        addSceneEndListener(1544);
    }

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
    public void V6(java.lang.String str, java.lang.String str2, int i17) {
        doSceneProgress(new wt4.b(str));
    }

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
    public void W6() {
        doSceneProgress(new wt4.a(10, this.f152858m));
    }

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
    public java.lang.String X6(int i17) {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        return com.tencent.mm.wallet_core.ui.r1.q(i17, new java.text.SimpleDateFormat("dd MMMM", locale), new java.text.SimpleDateFormat("dd MMMM yyyy", locale));
    }

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI
    public void a7() {
        removeSceneEndListener(com.tencent.mm.minigame.y.CTRL_INDEX);
        removeSceneEndListener(1544);
    }

    @Override // com.tencent.mm.plugin.order.ui.MallOrderRecordListUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof wt4.a) {
            wt4.a aVar = (wt4.a) m1Var;
            java.util.LinkedList linkedList = ((r45.d75) aVar.f449530e.f70711b.f70700a).f372206f;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.m75 m75Var = (r45.m75) it.next();
                dp3.o oVar = new dp3.o();
                oVar.f242234q = m75Var.f380198p;
                oVar.f242235r = m75Var.f380199q;
                oVar.f242236s = m75Var.f380200r;
                oVar.f242227g = m75Var.f380192g;
                oVar.f242230m = m75Var.f380195m;
                oVar.f242226f = m75Var.f380191f;
                oVar.f242233p = "0";
                oVar.f242229i = m75Var.f380194i;
                oVar.f242232o = m75Var.f380197o;
                oVar.f242239v = 1;
                oVar.f242238u = m75Var.f380202t;
                oVar.f242237t = m75Var.f380201s;
                oVar.f242231n = m75Var.f380196n;
                oVar.f242225e = m75Var.f380190e;
                oVar.f242228h = m75Var.f380193h;
                oVar.f242224d = m75Var.f380189d;
                linkedList2.add(oVar);
            }
            Z6(linkedList2);
            int size = ((java.util.ArrayList) this.f152855g).size();
            this.f152857i = size;
            com.tencent.mm.modelbase.o oVar2 = aVar.f449530e;
            this.f152856h = ((r45.d75) oVar2.f70711b.f70700a).f372204d > size;
            this.f152854f.notifyDataSetChanged();
            int i19 = ((r45.d75) oVar2.f70711b.f70700a).f372204d;
            this.f152852d.post(new xt4.a(this));
            this.f152861p = false;
        } else if (m1Var instanceof dp3.m) {
            com.tencent.mm.protobuf.f fVar = ((dp3.m) m1Var).f242222e.f70710a.f70684a;
            if (((r45.w55) fVar).f388899d == 2) {
                java.util.List list = this.f152855g;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                this.f152857i = 0;
                this.f152856h = false;
                this.f152853e.b();
            } else {
                java.lang.String str2 = ((r45.w55) fVar).f388900e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.Iterator it6 = ((java.util.ArrayList) this.f152855g).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        dp3.o oVar3 = (dp3.o) it6.next();
                        if (str2.equals(oVar3.f242224d)) {
                            ((java.util.ArrayList) this.f152855g).remove(oVar3);
                            this.f152857i = ((java.util.ArrayList) this.f152855g).size();
                            break;
                        }
                    }
                }
            }
            this.f152852d.post(new xt4.b(this));
        }
        if (this.f152857i > 0 || ((java.util.ArrayList) this.f152855g).size() != 0) {
            showOptionMenu(true);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.dfu);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            showOptionMenu(false);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dfu);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
