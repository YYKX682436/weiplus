package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.m f192061d;

    public h(com.tencent.mm.pluginsdk.ui.websearch.m mVar) {
        this.f192061d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192061d;
        if (mVar.f192069h != null) {
            mVar.f192078t = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
            com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
            com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f192070i;
            if (mMEditText == null || mMEditText.getText() == null || mVar.f192070i.getText().length() <= 0) {
                if (mVar.f192078t) {
                    voiceInputBehavior.cancel = 2;
                } else {
                    voiceInputBehavior.cancel = 15;
                }
            } else if (mVar.f192078t) {
                voiceInputBehavior.cancel = 14;
            } else {
                voiceInputBehavior.cancel = 16;
            }
            long j17 = mVar.f192073o;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                voiceInputBehavior.voiceInputTime = android.os.SystemClock.elapsedRealtime() - j17;
                mVar.f192073o = 0L;
            }
            ((zk5.c) mVar.f192069h).a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
