package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f176252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f176252d = u3Var;
        this.f176253e = voicePrintStateSettingUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.voiceprint.ui.h0(this.f176252d, this.f176253e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.voiceprint.ui.h0 h0Var = (com.tencent.mm.plugin.voiceprint.ui.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f176252d.dismiss();
        int i17 = com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI.f176204f;
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI = this.f176253e;
        voicePrintStateSettingUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "showError");
        db5.t7.g(voicePrintStateSettingUI.getContext(), voicePrintStateSettingUI.getContext().getString(com.tencent.mm.R.string.k9o));
        boolean z17 = (c01.z1.o() & 131072) == 131072;
        com.tencent.mars.xlog.Log.e("MicroMsg.VoicePrintStateSettingUI", "check error, show local state " + z17);
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI.T6(voicePrintStateSettingUI, z17);
        return jz5.f0.f302826a;
    }
}
