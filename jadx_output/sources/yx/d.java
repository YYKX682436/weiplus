package yx;

/* loaded from: classes5.dex */
public final class d implements com.tencent.mm.pluginsdk.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467009a;

    public d(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity) {
        this.f467009a = cBTBrandLiveActivity;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void a() {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467009a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "onEndRecord");
        ay.l lVar = cBTBrandLiveActivity.f65280f;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        lVar.P6(false);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.j();
        }
        a31.m mVar2 = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar2 != null) {
            mVar2.f973g = 4;
        }
        if (cBTBrandLiveActivity.f65284m != 2) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = cBTBrandLiveActivity.f65281g;
            int abs = java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null)).toString().length() - cBTBrandLiveActivity.f65285n);
            xx.y yVar = cBTBrandLiveActivity.f65283i;
            yVar.g(abs);
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = cBTBrandLiveActivity.f65281g;
            yVar.h(java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(mMEditText2 != null ? mMEditText2.getText() : null)).toString().length() - cBTBrandLiveActivity.f65285n), xx.d.f457781f);
        }
        cBTBrandLiveActivity.f65284m = 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void b() {
        com.tencent.mars.xlog.Log.i(this.f467009a.f65278d, "autoSend");
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void c(int i17) {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467009a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "setStopType: " + i17);
        ay.l lVar = cBTBrandLiveActivity.f65280f;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        lVar.P6(true);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void d() {
        com.tencent.mars.xlog.Log.i(this.f467009a.f65278d, "hideGuide");
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void e(int i17) {
        z21.w wVar;
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467009a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "setStopType: " + i17);
        cBTBrandLiveActivity.f65284m = i17;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null && (wVar = mVar.f985s) != null) {
            wVar.e(i17);
        }
        if (i17 == 2) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = cBTBrandLiveActivity.f65281g;
            int abs = java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null)).toString().length() - cBTBrandLiveActivity.f65285n);
            xx.y yVar = cBTBrandLiveActivity.f65283i;
            yVar.g(abs);
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = cBTBrandLiveActivity.f65281g;
            yVar.h(java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(mMEditText2 != null ? mMEditText2.getText() : null)).toString().length() - cBTBrandLiveActivity.f65285n), xx.d.f457780e);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void f() {
        com.tencent.mars.xlog.Log.i(this.f467009a.f65278d, "clearHint");
    }

    @Override // com.tencent.mm.pluginsdk.ui.v2
    public void g(int i17) {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467009a;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "onStartRecord");
        ay.l lVar = cBTBrandLiveActivity.f65280f;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        lVar.P6(true);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
        if (mVar != null) {
            mVar.i(i17);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = cBTBrandLiveActivity.f65281g;
        cBTBrandLiveActivity.f65285n = r26.n0.u0(java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null)).toString().length();
        xx.y yVar = cBTBrandLiveActivity.f65283i;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportGreenMicStart");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(yVar.f457835h);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        yVar.f457841n = sb6.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_green_mic_start", yVar.a(yVar.f457837j, new xx.s(yVar)), 36708);
    }
}
