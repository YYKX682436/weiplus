package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class j4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputUI f190881d;

    public j4(com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI) {
        this.f190881d = voiceInputUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI = this.f190881d;
        voiceInputUI.f189871d.post(new com.tencent.mm.pluginsdk.ui.i4(this));
        voiceInputUI.f189871d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
