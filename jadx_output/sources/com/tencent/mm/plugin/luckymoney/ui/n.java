package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class n implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI f147212b;

    public n(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI, java.lang.String str) {
        this.f147212b = luckyMoneyBeforeDetailUI;
        this.f147211a = str;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.vm3 vm3Var = (r45.vm3) obj;
        if (vm3Var != null && vm3Var.f388358d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "response.subtype_id：%s, %s", java.lang.Integer.valueOf(vm3Var.f388359e), java.lang.Integer.valueOf(vm3Var.f388358d.f381512u));
            vm3Var.f388358d.G = vm3Var.f388359e;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, java.lang.Integer.valueOf(vm3Var.f388358d.f381512u));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_AUTO_PLAY_DELAY_INT_SYNC, java.lang.Integer.valueOf(vm3Var.f388358d.f381513v));
            ((java.util.HashMap) gb3.l.f270018b).put(this.f147211a, vm3Var.f388358d);
        }
        int i19 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.f145975u;
        this.f147212b.W6(false);
    }
}
