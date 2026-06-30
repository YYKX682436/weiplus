package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f147469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.um f147470e;

    public tm(com.tencent.mm.plugin.luckymoney.ui.um umVar, boolean z17) {
        this.f147470e = umVar;
        this.f147469d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.um umVar = this.f147470e;
        umVar.f147515b.f147577t.setVisibility(8);
        android.app.Dialog dialog = umVar.f147515b.f147583z.B;
        if (dialog != null && dialog.isShowing()) {
            umVar.f147515b.f147583z.B.dismiss();
        }
        r45.wv3 wv3Var = umVar.f147514a;
        if (wv3Var.f389503i == 1 || wv3Var.f389507p == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
            return;
        }
        if (this.f147469d) {
            android.view.View view = umVar.f147515b.f147571n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = umVar.f147515b.f147571n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        umVar.f147515b.f147572o.setVisibility(0);
        umVar.f147515b.f147573p.setVisibility(8);
        umVar.f147515b.f147574q.setVisibility(0);
    }
}
