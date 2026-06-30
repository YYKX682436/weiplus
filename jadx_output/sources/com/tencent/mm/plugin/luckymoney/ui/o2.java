package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147252d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f147253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.p2 f147254f;

    public o2(com.tencent.mm.plugin.luckymoney.ui.p2 p2Var, r45.zg5 zg5Var) {
        this.f147254f = p2Var;
        this.f147253e = zg5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f147252d));
        if (!this.f147252d) {
            com.tencent.mm.plugin.luckymoney.ui.p2 p2Var = this.f147254f;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.Y6(p2Var.f147303d, this.f147253e, p2Var.f147301b, p2Var.f147302c);
        }
        this.f147252d = true;
    }
}
