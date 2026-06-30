package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.rl f147325d;

    public pl(com.tencent.mm.plugin.luckymoney.ui.rl rlVar) {
        this.f147325d = rlVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.luckymoney.ui.rl rlVar = this.f147325d;
        if (C) {
            rlVar.f147390d.f147576s.setBackgroundResource(com.tencent.mm.R.drawable.amo);
        } else {
            rlVar.f147390d.f147576s.setBackgroundResource(com.tencent.mm.R.drawable.amm);
        }
        rlVar.f147390d.f147576s.setEnabled(true);
        rlVar.f147390d.itemView.setSelected(true);
    }
}
