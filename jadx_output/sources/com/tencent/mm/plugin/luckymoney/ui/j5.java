package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f147043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.i5 f147045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.t5 f147046g;

    public j5(com.tencent.mm.plugin.luckymoney.ui.t5 t5Var, in5.s0 s0Var, r45.wv3 wv3Var, com.tencent.mm.plugin.luckymoney.ui.i5 i5Var) {
        this.f147046g = t5Var;
        this.f147043d = s0Var;
        this.f147044e = wv3Var;
        this.f147045f = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147046g.o(this.f147043d, this.f147044e, true, this.f147045f);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
