package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class jk extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.o6 f147063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.kk f147065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(com.tencent.mm.plugin.luckymoney.ui.kk kkVar, com.tencent.mm.plugin.luckymoney.model.o6 o6Var, android.content.Context context) {
        super(false);
        this.f147065f = kkVar;
        this.f147063d = o6Var;
        this.f147064e = context;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var = this.f147063d;
        g0Var.d(11701, 14, 0, 0, 0, 2, java.lang.Integer.valueOf(o6Var.f145521h));
        com.tencent.mm.plugin.luckymoney.ui.ok okVar = this.f147065f.f147110a;
        if (okVar != null) {
            o45.eg.a(okVar.f147286d, 1);
        }
        com.tencent.mm.wallet_core.ui.r1.V(this.f147064e, o6Var.f145520g, true);
    }
}
