package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ql implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.rl f147356d;

    public ql(com.tencent.mm.plugin.luckymoney.ui.rl rlVar) {
        this.f147356d = rlVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "dialog dismiss");
        this.f147356d.f147391e.finish();
    }
}
