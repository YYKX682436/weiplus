package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class xl implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147697b;

    public xl(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str) {
        this.f147697b = luckyMoneyPickEnvelopeUI;
        this.f147696a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147697b;
        android.app.Dialog dialog = luckyMoneyPickEnvelopeUI.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyPickEnvelopeUI.getContext(), fVar.f70617c);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f70618d).f374977d));
        r45.g80 g80Var = (r45.g80) fVar.f70618d;
        if (g80Var.f374977d != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(g80Var.f374978e)) {
                return null;
            }
            com.tencent.mm.wallet_core.ui.r1.M(luckyMoneyPickEnvelopeUI.getContext(), ((r45.g80) fVar.f70618d).f374978e);
            return null;
        }
        java.util.List list = luckyMoneyPickEnvelopeUI.f146532t;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) it.next();
            if (zmVar.f147793b.f389500f.equals(this.f147696a)) {
                arrayList.remove(zmVar);
                break;
            }
            i17++;
        }
        if (((java.util.ArrayList) list).isEmpty()) {
            android.view.View view = luckyMoneyPickEnvelopeUI.f146531s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = luckyMoneyPickEnvelopeUI.f146520h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = luckyMoneyPickEnvelopeUI.f146525o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "doDeleteShowSource: %s", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return null;
        }
        if (i17 != ((java.util.ArrayList) list).size()) {
            luckyMoneyPickEnvelopeUI.f146524n.notifyItemRemoved(i17);
            luckyMoneyPickEnvelopeUI.f146530r.notifyItemRemoved(i17);
            com.tencent.mm.plugin.luckymoney.ui.zm zmVar2 = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(i17);
            r45.wv3 wv3Var = zmVar2.f147793b;
            if (wv3Var.f389503i != 1 && wv3Var.f389507p != 1 && !luckyMoneyPickEnvelopeUI.f7(wv3Var.f389500f)) {
                z17 = true;
            }
            zmVar2.f147792a = z17;
            if (z17) {
                luckyMoneyPickEnvelopeUI.f146534v = i17;
            } else {
                luckyMoneyPickEnvelopeUI.f146534v = -1;
            }
            luckyMoneyPickEnvelopeUI.m7(i17, z17);
            luckyMoneyPickEnvelopeUI.q7();
            return null;
        }
        luckyMoneyPickEnvelopeUI.f146524n.notifyItemRemoved(i17);
        luckyMoneyPickEnvelopeUI.f146530r.notifyItemRemoved(i17);
        luckyMoneyPickEnvelopeUI.f146534v = -1;
        if (((java.util.ArrayList) list).size() == 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = luckyMoneyPickEnvelopeUI.f146521i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(luckyMoneyEnvelopeTouchRecyclerView, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            luckyMoneyEnvelopeTouchRecyclerView.a1(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(luckyMoneyEnvelopeTouchRecyclerView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) list).get(0)).f147792a = true;
            luckyMoneyPickEnvelopeUI.f146534v = 0;
            luckyMoneyPickEnvelopeUI.m7(0, true);
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView2 = luckyMoneyPickEnvelopeUI.f146521i;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList6.add(java.lang.Integer.valueOf(i17 - 1));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(luckyMoneyEnvelopeTouchRecyclerView2, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            luckyMoneyEnvelopeTouchRecyclerView2.a1(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(luckyMoneyEnvelopeTouchRecyclerView2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        luckyMoneyPickEnvelopeUI.f146521i.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.wl(this), 100L);
        return null;
    }
}
