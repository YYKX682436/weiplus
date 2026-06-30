package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.z6 f147721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.a7 f147722e;

    public y6(com.tencent.mm.plugin.luckymoney.ui.a7 a7Var, com.tencent.mm.plugin.luckymoney.ui.z6 z6Var) {
        this.f147722e = a7Var;
        this.f147721d = z6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.z6 z6Var = this.f147721d;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) z6Var.f147765a.getLayoutParams();
        layoutParams.rightMargin = z6Var.f147767c.getWidth() + com.tencent.mm.ui.zk.a(this.f147722e.f146695f, 4);
        z6Var.f147765a.setLayoutParams(layoutParams);
    }
}
