package yx;

/* loaded from: classes14.dex */
public final class b implements fl5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467004a;

    public b(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity) {
        this.f467004a = cBTBrandLiveActivity;
    }

    @Override // fl5.g
    public final boolean a(fl5.i iVar, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467004a;
        if (i17 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "_setOnEditorActionListener false");
            return false;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = cBTBrandLiveActivity.f65281g;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null)).toString();
        if (obj.length() > 0) {
            ay.l lVar = cBTBrandLiveActivity.f65280f;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            hy.a0 a0Var = lVar.f15153h;
            if (a0Var != null) {
                com.tencent.wechat.aff.chatbot.w0.f216518b.j(obj, 0, a0Var.f285721a);
            }
            lVar.Q6(false, false);
            lVar.f15160n.f457840m.f457843a++;
            int length = obj.length();
            xx.y yVar = cBTBrandLiveActivity.f65283i;
            yVar.getClass();
            com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportUserSendQuestionWithWordCnt");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_user_send_question", yVar.a(yVar.f457837j, new xx.u(length)), 36708);
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = cBTBrandLiveActivity.f65281g;
            if (mMEditText2 != null) {
                mMEditText2.setText("");
            }
        }
        cBTBrandLiveActivity.hideVKB();
        return true;
    }
}
