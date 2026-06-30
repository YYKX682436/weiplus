package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class j implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.m f192063a;

    public j(com.tencent.mm.pluginsdk.ui.websearch.m mVar) {
        this.f192063a = mVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f192063a;
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = mVar.f192065d;
        if ((voiceInputLayout != null ? voiceInputLayout.getCurrentState() : -1) != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "pause");
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout2 = mVar.f192065d;
        if (voiceInputLayout2 != null) {
            voiceInputLayout2.a();
        }
        mVar.f192078t = false;
        mVar.F = true;
    }
}
