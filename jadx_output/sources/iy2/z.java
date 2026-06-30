package iy2;

/* loaded from: classes15.dex */
public final class z implements iy2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel f295915a;

    public z(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel) {
        this.f295915a = finderLiveVoiceInputPanel;
    }

    public void a(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.f295915a;
        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
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
        if (i17 == 12) {
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel.b(finderLiveVoiceInputPanel, com.tencent.mm.R.string.nw9);
        } else {
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel.b(finderLiveVoiceInputPanel, com.tencent.mm.R.string.non);
        }
        iy2.r rVar = finderLiveVoiceInputPanel.f136770n;
        if (rVar != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.wr) rVar).a(false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveVoiceInputPanel.f136771o;
        if (mMEditText != null) {
            mMEditText.setHint((java.lang.CharSequence) null);
        }
    }
}
