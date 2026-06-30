package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class x1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.CheckCanSubscribeBizUI f212538d;

    public x1(com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI) {
        this.f212538d = checkCanSubscribeBizUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.g00 g00Var = (r45.g00) oVar.f70711b.f70700a;
        java.lang.String str2 = g00Var.f374764d;
        com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI = this.f212538d;
        checkCanSubscribeBizUI.f196622q = str2;
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(g00Var.f374765e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback ok");
            checkCanSubscribeBizUI.f196613e = g00Var.f374765e;
            checkCanSubscribeBizUI.f196627v = g00Var.f374766f;
            com.tencent.mm.ui.CheckCanSubscribeBizUI.T6(checkCanSubscribeBizUI);
            return 0;
        }
        if (com.tencent.mm.ui.pc.a(checkCanSubscribeBizUI, i17, i18, str, 7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_NORMAL_ERROR");
            checkCanSubscribeBizUI.setResult(5);
            checkCanSubscribeBizUI.finish();
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_FORBID");
        checkCanSubscribeBizUI.U6(i17, i18, str);
        checkCanSubscribeBizUI.setResult(3);
        checkCanSubscribeBizUI.finish();
        return 0;
    }
}
