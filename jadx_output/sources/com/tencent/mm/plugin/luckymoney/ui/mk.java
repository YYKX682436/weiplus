package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mk extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.o6 f147194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(com.tencent.mm.plugin.luckymoney.ui.nk nkVar, com.tencent.mm.plugin.luckymoney.model.o6 o6Var, android.content.Context context) {
        super(false);
        this.f147194d = o6Var;
        this.f147195e = context;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var = this.f147194d;
        g0Var.d(11701, 14, 0, 0, 0, 2, java.lang.Integer.valueOf(o6Var.f145521h));
        int i17 = o6Var.f145523m;
        android.content.Context context = this.f147195e;
        if (i17 == 1) {
            com.tencent.mm.wallet_core.ui.r1.a0(context, o6Var.f145520g);
            return;
        }
        o25.o1 o1Var = (o25.o1) i95.n0.c(o25.o1.class);
        java.lang.String str = o6Var.f145520g;
        com.tencent.mm.plugin.luckymoney.ui.lk lkVar = new com.tencent.mm.plugin.luckymoney.ui.lk(this);
        ((r35.p) o1Var).getClass();
        new r35.o(context, str, 0, lkVar).f();
    }
}
