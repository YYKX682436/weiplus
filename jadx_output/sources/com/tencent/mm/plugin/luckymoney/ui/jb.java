package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class jb extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147054e;

    public jb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147054e = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View v17) {
        java.lang.String str;
        java.lang.String str2;
        char c17;
        android.text.Editable editable;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        java.lang.CharSequence hint;
        android.text.Editable text;
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147054e;
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((ec3.g1) pf5.z.f353948a.a(context).a(ec3.g1.class)).R6(true);
        androidx.appcompat.app.AppCompatActivity context2 = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ec3.g1 g1Var = (ec3.g1) pf5.z.f353948a.a(context2).a(ec3.g1.class);
        g1Var.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[13];
        objArr[0] = 20;
        objArr[1] = 0;
        objArr[2] = g1Var.f251026w;
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        objArr[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
        objArr[4] = "";
        objArr[5] = "";
        com.tencent.mm.ui.widget.MMEditText mMEditText = g1Var.f251013g;
        if (mMEditText == null || (text = mMEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = g1Var.f251013g;
        if (mMEditText2 == null || (hint = mMEditText2.getHint()) == null || (str2 = hint.toString()) == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[getClickReportWishHintText] editText: " + str + "，svrHintText: " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = str2;
        }
        objArr[6] = str;
        objArr[7] = 0;
        objArr[8] = "";
        objArr[9] = 0;
        objArr[10] = "";
        objArr[11] = java.lang.Integer.valueOf(g1Var.C);
        androidx.appcompat.app.AppCompatActivity activity2 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        java.lang.String md52 = (luckyMoneyNewPrepareUI3 == null || (iEmojiInfo = luckyMoneyNewPrepareUI3.K1) == null) ? null : iEmojiInfo.getMd5();
        objArr[12] = md52 != null ? md52 : "";
        g0Var.d(18890, objArr);
        gb3.p.f270042a.a(9);
        luckyMoneyNewPrepareUI.L1 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = luckyMoneyNewPrepareUI.L1;
        if (redEnvSendWithEmoticonClickStruct != null) {
            redEnvSendWithEmoticonClickStruct.f59936d = 6L;
        }
        if (redEnvSendWithEmoticonClickStruct != null) {
            redEnvSendWithEmoticonClickStruct.k();
        }
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = 8;
        objArr2[1] = java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.f146248d2);
        objArr2[2] = java.lang.Float.valueOf(luckyMoneyNewPrepareUI.f146247c2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = luckyMoneyNewPrepareUI.f146253h;
        objArr2[3] = (luckyMoneyMoneyInputView == null || (editText2 = luckyMoneyMoneyInputView.getEditText()) == null) ? null : editText2.getText();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = luckyMoneyNewPrepareUI.f146251g;
        if (luckyMoneyNumInputView == null || (editText = luckyMoneyNumInputView.getEditText()) == null) {
            c17 = 4;
            editable = null;
        } else {
            editable = editText.getText();
            c17 = 4;
        }
        objArr2[c17] = editable;
        g0Var.d(25925, objArr2);
        if (!((h45.q) i95.n0.c(h45.q.class)).canOpenKindaCashier(luckyMoneyNewPrepareUI)) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNewPrepareUI", "can not request hb while authen");
            g0Var.A(965, 55);
        } else {
            com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = luckyMoneyNewPrepareUI.S;
            if ((c6Var.f146779b || c6Var.b()) ? false : true) {
                luckyMoneyNewPrepareUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "doPrePareBtnClick()");
                luckyMoneyNewPrepareUI.e7(0);
            }
        }
    }
}
