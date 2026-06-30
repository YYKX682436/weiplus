package iy2;

/* loaded from: classes15.dex */
public final class h implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout f295895a;

    public h(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout) {
        this.f295895a = finderLiveVoiceInputLayout;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        android.text.Editable text;
        kotlin.jvm.internal.o.g(lst, "lst");
        kotlin.jvm.internal.o.g(voiceIdSet, "voiceIdSet");
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295895a;
        iy2.e voiceDetectListener = finderLiveVoiceInputLayout.getVoiceDetectListener();
        kotlin.jvm.internal.o.d(voiceDetectListener);
        iy2.z zVar = (iy2.z) voiceDetectListener;
        if (lst.length > 0 && lst[0].length() > 0) {
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = zVar.f295915a;
            if (finderLiveVoiceInputPanel.f136778v) {
                finderLiveVoiceInputPanel.f136778v = false;
                com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveVoiceInputPanel.f136771o;
                if (mMEditText != null && mMEditText.getText() != null) {
                    com.tencent.mm.ui.widget.MMEditText mMEditText2 = finderLiveVoiceInputPanel.f136771o;
                    android.text.Editable text2 = mMEditText2 != null ? mMEditText2.getText() : null;
                    if (!(text2 == null || text2.length() == 0)) {
                        if (r26.i0.p(finderLiveVoiceInputPanel.f136779w, "。", true) || r26.i0.p(finderLiveVoiceInputPanel.f136779w, ".", true)) {
                            com.tencent.mm.ui.widget.MMEditText mMEditText3 = finderLiveVoiceInputPanel.f136771o;
                            int selectionStart = mMEditText3 != null ? mMEditText3.getSelectionStart() : 0;
                            com.tencent.mm.ui.widget.MMEditText mMEditText4 = finderLiveVoiceInputPanel.f136771o;
                            if (selectionStart >= ((mMEditText4 == null || (text = mMEditText4.getText()) == null) ? 0 : text.length())) {
                                iy2.c cVar = finderLiveVoiceInputPanel.f136781y;
                                if (cVar != null) {
                                    com.tencent.mm.ui.widget.MMEditText mMEditText5 = finderLiveVoiceInputPanel.f136771o;
                                    java.lang.String text3 = finderLiveVoiceInputPanel.f136779w;
                                    kotlin.jvm.internal.o.g(text3, "text");
                                    cVar.c(mMEditText5, text3, true);
                                }
                                iy2.c cVar2 = finderLiveVoiceInputPanel.f136781y;
                                if (cVar2 != null) {
                                    cVar2.a(finderLiveVoiceInputPanel.f136771o);
                                }
                            }
                            finderLiveVoiceInputPanel.f136779w = "";
                        }
                        com.tencent.mm.ui.widget.MMEditText mMEditText6 = finderLiveVoiceInputPanel.f136771o;
                        java.lang.String valueOf = java.lang.String.valueOf(mMEditText6 != null ? mMEditText6.getText() : null);
                        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "addPunctuation msg = %s,msg.length() = %s", com.tencent.mm.sdk.platformtools.t8.G1(valueOf), java.lang.Integer.valueOf(valueOf.length()));
                    }
                }
            }
            iy2.c cVar3 = finderLiveVoiceInputPanel.f136781y;
            if (cVar3 != null) {
                com.tencent.mm.ui.widget.MMEditText mMEditText7 = finderLiveVoiceInputPanel.f136771o;
                java.lang.String text4 = lst[0];
                kotlin.jvm.internal.o.g(text4, "text");
                cVar3.c(mMEditText7, text4, true);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText8 = finderLiveVoiceInputPanel.f136771o;
            if (mMEditText8 != null) {
                mMEditText8.setCursorVisible(true);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText9 = finderLiveVoiceInputPanel.f136771o;
            if (mMEditText9 != null) {
                mMEditText9.requestFocus();
            }
            com.tencent.mm.sdk.platformtools.t8.t0(finderLiveVoiceInputPanel.f136764e);
            if (!finderLiveVoiceInputPanel.f136776t && lst[0].length() != 0) {
                finderLiveVoiceInputPanel.f136776t = true;
                java.lang.System.currentTimeMillis();
                java.lang.System.currentTimeMillis();
            }
        }
        com.tencent.mm.sdk.platformtools.n3 mmHandler = finderLiveVoiceInputLayout.getMmHandler();
        kotlin.jvm.internal.o.d(mmHandler);
        mmHandler.removeMessages(0);
        finderLiveVoiceInputLayout.getMmHandler().sendEmptyMessageDelayed(0, finderLiveVoiceInputLayout.f136755r);
    }

    @Override // z21.b
    public void b(java.util.List keywords) {
        kotlin.jvm.internal.o.g(keywords, "keywords");
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295895a;
        java.lang.String str = finderLiveVoiceInputLayout.f136744d;
        com.tencent.mm.sdk.platformtools.n3 mmHandler = finderLiveVoiceInputLayout.getMmHandler();
        kotlin.jvm.internal.o.d(mmHandler);
        mmHandler.removeMessages(0);
        finderLiveVoiceInputLayout.getMmHandler().removeMessages(1);
        iy2.e voiceDetectListener = finderLiveVoiceInputLayout.getVoiceDetectListener();
        kotlin.jvm.internal.o.d(voiceDetectListener);
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = ((iy2.z) voiceDetectListener).f295915a;
        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel.a(finderLiveVoiceInputPanel);
        iy2.c cVar = finderLiveVoiceInputPanel.f136781y;
        if (cVar != null) {
            cVar.b(finderLiveVoiceInputPanel.f136771o);
        }
        finderLiveVoiceInputPanel.e();
        android.content.Context context = finderLiveVoiceInputPanel.f136773q;
        if (context instanceof android.app.Activity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        iy2.r rVar = finderLiveVoiceInputPanel.f136770n;
        if (rVar != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.wr) rVar).a(false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveVoiceInputPanel.f136771o;
        if (mMEditText != null) {
            mMEditText.setHint((java.lang.CharSequence) null);
        }
        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "resumeMusic");
        co0.s u07 = dk2.ef.f233372a.u0();
        if (u07 != null) {
            u07.f1(false);
        }
        finderLiveVoiceInputLayout.f(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295895a;
        com.tencent.mm.sdk.platformtools.n3 mmHandler = finderLiveVoiceInputLayout.getMmHandler();
        kotlin.jvm.internal.o.d(mmHandler);
        mmHandler.removeMessages(0);
        finderLiveVoiceInputLayout.getMmHandler().removeMessages(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = finderLiveVoiceInputLayout.f136748h;
        com.tencent.mm.sdk.platformtools.n3 callUiHandler = finderLiveVoiceInputLayout.getCallUiHandler();
        kotlin.jvm.internal.o.d(callUiHandler);
        callUiHandler.sendMessage(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = this.f295895a;
        java.lang.String str = finderLiveVoiceInputLayout.f136744d;
        finderLiveVoiceInputLayout.getCurrentState();
        com.tencent.mm.sdk.platformtools.b4 amplitudeTimer = finderLiveVoiceInputLayout.getAmplitudeTimer();
        if (amplitudeTimer != null) {
            amplitudeTimer.d();
        }
        com.tencent.mm.sdk.platformtools.n3 callUiHandler = finderLiveVoiceInputLayout.getCallUiHandler();
        kotlin.jvm.internal.o.d(callUiHandler);
        finderLiveVoiceInputLayout.getClass();
        callUiHandler.sendEmptyMessage(0);
    }
}
