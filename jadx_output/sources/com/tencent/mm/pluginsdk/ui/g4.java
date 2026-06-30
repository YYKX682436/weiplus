package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class g4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputUI f190859d;

    public g4(com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI) {
        this.f190859d = voiceInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI = this.f190859d;
        boolean z17 = voiceInputUI.f189880p;
        boolean z18 = voiceInputUI.f189881q;
        if (voiceInputUI.f189880p) {
            voiceInputUI.f189880p = false;
        } else {
            voiceInputUI.f189881q = true;
            voiceInputUI.f189871d.requestLayout();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
