package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ul implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147513b;

    public ul(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str) {
        this.f147513b = luckyMoneyPickEnvelopeUI;
        this.f147512a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147513b;
        android.app.Dialog dialog = luckyMoneyPickEnvelopeUI.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyPickEnvelopeUI.getContext(), fVar.f70617c);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f70618d).f374977d));
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        if (fVar2 == null || ((r45.g80) fVar2).f374977d != 0) {
            if (fVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(((r45.g80) fVar2).f374978e)) {
                return null;
            }
            com.tencent.mm.wallet_core.ui.r1.M(luckyMoneyPickEnvelopeUI.getContext(), ((r45.g80) fVar.f70618d).f374978e);
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        r45.wv3 U6 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.U6(luckyMoneyPickEnvelopeUI, this.f147512a);
        if (U6 != null) {
            try {
                intent.putExtra("key_envelope_source", U6.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", e17, "", new java.lang.Object[0]);
            }
        }
        luckyMoneyPickEnvelopeUI.setResult(-1, intent);
        if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyPickEnvelopeUI.L)) {
            luckyMoneyPickEnvelopeUI.finish();
            return null;
        }
        com.tencent.mm.ui.widget.snackbar.j.b(luckyMoneyPickEnvelopeUI.getContext(), luckyMoneyPickEnvelopeUI.findViewById(com.tencent.mm.R.id.jlt), luckyMoneyPickEnvelopeUI.getContext().getString(com.tencent.mm.R.string.gk_), new com.tencent.mm.plugin.luckymoney.ui.tl(this));
        return null;
    }
}
