package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class il implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jl f147032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147033b;

    public il(com.tencent.mm.plugin.luckymoney.ui.jl jlVar, int i17) {
        this.f147032a = jlVar;
        this.f147033b = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.luckymoney.ui.jl jlVar = this.f147032a;
        r45.wv3 wv3Var = jlVar.f147066d;
        if (wv3Var == null) {
            kotlin.jvm.internal.o.o("hbEnvelopSource");
            throw null;
        }
        java.lang.String str = wv3Var.f389500f;
        if (str == null) {
            str = "";
        }
        hashMap.put("key_red_packet_preview_material_id", str);
        hashMap.put("key_red_packet_preview_scene", "1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click preview ： ");
        r45.wv3 wv3Var2 = jlVar.f147066d;
        if (wv3Var2 == null) {
            kotlin.jvm.internal.o.o("hbEnvelopSource");
            throw null;
        }
        sb6.append(wv3Var2.f389500f);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI", sb6.toString());
        int intExtra = jlVar.getIntent().getIntExtra("key_source_original_pos", -1);
        java.lang.String stringExtra = jlVar.getIntent().getStringExtra("key_source_original_coverid");
        java.lang.String stringExtra2 = jlVar.getIntent().getStringExtra("key_source_sessionid");
        int intExtra2 = jlVar.getIntent().getIntExtra("key_source_cover_count", 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = 3;
        objArr[1] = java.lang.Integer.valueOf(intExtra + 1);
        objArr[2] = java.lang.Integer.valueOf(this.f147033b + 1);
        objArr[3] = stringExtra;
        r45.wv3 wv3Var3 = jlVar.f147066d;
        if (wv3Var3 == null) {
            kotlin.jvm.internal.o.o("hbEnvelopSource");
            throw null;
        }
        objArr[4] = wv3Var3.f389500f;
        objArr[5] = stringExtra2;
        objArr[6] = java.lang.Integer.valueOf(intExtra2);
        objArr[7] = 2;
        g0Var.d(18892, objArr);
        ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).Ai(jlVar.getContext(), hashMap);
    }
}
