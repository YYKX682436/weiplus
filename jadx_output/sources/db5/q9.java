package db5;

/* loaded from: classes8.dex */
public class q9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.VoiceSearchEditText f228485d;

    public q9(com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText) {
        this.f228485d = voiceSearchEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText = this.f228485d;
        voiceSearchEditText.f197730m = true;
        com.tencent.mm.ui.base.VoiceSearchEditText.a(voiceSearchEditText);
    }
}
