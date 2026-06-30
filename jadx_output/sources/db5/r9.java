package db5;

/* loaded from: classes8.dex */
public class r9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.VoiceSearchEditText f228500d;

    public r9(com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText) {
        this.f228500d = voiceSearchEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText = this.f228500d;
        boolean z18 = voiceSearchEditText.f197730m;
        if (z17 || !voiceSearchEditText.f197730m) {
            return;
        }
        com.tencent.mm.ui.base.VoiceSearchEditText.a(voiceSearchEditText);
        voiceSearchEditText.f197730m = false;
    }
}
