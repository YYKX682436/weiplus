package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pk extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.o6 f147322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qk f147324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(com.tencent.mm.plugin.luckymoney.ui.qk qkVar, com.tencent.mm.plugin.luckymoney.model.o6 o6Var, android.content.Context context) {
        super(false);
        this.f147324f = qkVar;
        this.f147322d = o6Var;
        this.f147323e = context;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var;
        r45.xv3 xv3Var;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var2 = this.f147322d;
        g0Var.d(11701, 14, 0, 0, 0, 2, java.lang.Integer.valueOf(o6Var2.f145521h));
        com.tencent.mm.plugin.luckymoney.ui.qk qkVar = this.f147324f;
        com.tencent.mm.plugin.luckymoney.ui.ok okVar = qkVar.f147355a;
        if (okVar != null) {
            o45.eg.a(okVar.f147286d, 1);
            r45.wv3 wv3Var = qkVar.f147355a.f147288f;
            if (wv3Var != null && (xv3Var = wv3Var.f389501g) != null && !com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390480g)) {
                gb3.m.a(66, qkVar.f147355a.f147288f.f389501g.f390480g);
            }
        }
        com.tencent.mm.plugin.luckymoney.ui.ok okVar2 = qkVar.f147355a;
        if (okVar2 == null || !okVar2.f147285c) {
            o6Var = o6Var2;
        } else {
            o6Var = o6Var2;
            g0Var.d(13051, java.lang.Integer.valueOf(okVar2.f147286d), 2, "", "", "", o6Var2.f145520g, o6Var2.f145519f, "", "", java.lang.Integer.valueOf(qkVar.f147355a.f147287e));
        }
        if (o6Var.f145519f.equals("Native")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "go native:" + o6Var.f145520g);
            if ("weixin://festival/gotoshake".equalsIgnoreCase(o6Var.f145520g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", " go new year shake");
            }
        } else {
            com.tencent.mm.wallet_core.ui.r1.V(this.f147323e, o6Var.f145520g, true);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 2;
        objArr[1] = o6Var.f145520g;
        r45.wv3 wv3Var2 = qkVar.f147355a.f147288f;
        objArr[2] = wv3Var2 != null ? wv3Var2.f389498d : "";
        objArr[3] = gb3.m.f270022c;
        objArr[4] = 0;
        objArr[5] = gb3.m.f270020a;
        g0Var.d(16589, objArr);
    }
}
