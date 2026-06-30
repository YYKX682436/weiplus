package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.pluginsdk.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.m f192064a;

    public k(com.tencent.mm.pluginsdk.ui.websearch.m mVar) {
        this.f192064a = mVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        if (mVar.f192080v) {
            mVar.f192080v = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "onDetected %s", strArr[0]);
        mVar.f192070i.setText(strArr[0]);
        if (!mVar.f192074p && strArr[0].length() != 0) {
            mVar.f192074p = true;
            mVar.f192077s = java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            long j17 = mVar.f192077s;
            long j18 = mVar.f192076r;
        }
        ((java.util.ArrayList) mVar.f192082x).addAll(list);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void b() {
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f192069h.getClass();
        mVar.f192070i.setHint((java.lang.CharSequence) null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f192076r = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", java.lang.Long.valueOf(currentTimeMillis));
        mVar.f192074p = false;
        mVar.f192075q = true;
        mVar.f192080v = true;
        mVar.f192077s = 0L;
        mVar.f();
        mVar.f192071m.setVisibility(8);
        mVar.f192075q = false;
        android.media.AudioManager audioManager = mVar.A;
        if (audioManager != null) {
            audioManager.setStreamMute(3, true);
        }
        android.content.Context context = mVar.f192072n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().addFlags(128);
        }
        mVar.f192068g.setVisibility(4);
        mVar.f192066e.setVisibility(4);
        mVar.f192067f.setVisibility(8);
        mVar.f192070i.setHint(mVar.getResources().getString(com.tencent.mm.R.string.k9b));
        zk5.c cVar = (zk5.c) mVar.f192069h;
        cVar.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        com.tencent.mm.ui.websearch.WebSearchVoiceUI webSearchVoiceUI = cVar.f473549a;
        g0Var.d(15178, 2, valueOf, "", webSearchVoiceUI.f211226f, webSearchVoiceUI.f211227g, java.lang.Integer.valueOf(webSearchVoiceUI.f211228h), java.lang.Integer.valueOf(webSearchVoiceUI.f211229i));
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f();
        android.content.Context context = mVar.f192072n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f192069h.getClass();
        mVar.f192070i.setHint((java.lang.CharSequence) null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f();
        android.content.Context context = mVar.f192072n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f192069h.getClass();
        mVar.f192070i.setHint((java.lang.CharSequence) null);
        com.tencent.mm.pluginsdk.ui.websearch.m.b(mVar, 2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + java.lang.System.currentTimeMillis());
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f();
        android.content.Context context = mVar.f192072n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f192069h.getClass();
        mVar.f192070i.setHint((java.lang.CharSequence) null);
        com.tencent.mm.pluginsdk.ui.websearch.m.b(mVar, 2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.u3
    public void g(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192064a;
        mVar.f();
        android.content.Context context = mVar.f192072n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        if (i17 == 12) {
            com.tencent.mm.pluginsdk.ui.websearch.m.a(mVar, com.tencent.mm.R.string.k9c);
        } else {
            com.tencent.mm.pluginsdk.ui.websearch.m.a(mVar, com.tencent.mm.R.string.f490391to);
        }
        mVar.f192069h.getClass();
        mVar.f192070i.setHint((java.lang.CharSequence) null);
    }
}
