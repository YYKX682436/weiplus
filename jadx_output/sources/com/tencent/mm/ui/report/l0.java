package com.tencent.mm.ui.report;

/* loaded from: classes15.dex */
public abstract class l0 {
    public static final void a(boolean z17, boolean z18, long j17, java.lang.String voiceId, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(voiceId, "voiceId");
        com.tencent.mars.xlog.Log.i("Report25041", "report() called with: isC2C = " + z18 + ", actionType = " + j17 + ", voiceId = " + voiceId + ", totalTime = " + j18 + ", stopReason = " + j19 + ", playTime = " + j27);
        com.tencent.mm.autogen.mmdata.rpt.VoiceBreakPointConPlayStruct voiceBreakPointConPlayStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceBreakPointConPlayStruct();
        voiceBreakPointConPlayStruct.f61682d = !z17 ? 0L : z18 ? 1L : 2L;
        voiceBreakPointConPlayStruct.f61683e = j17;
        voiceBreakPointConPlayStruct.f61684f = voiceBreakPointConPlayStruct.b("ActionResult", "0", true);
        voiceBreakPointConPlayStruct.f61685g = voiceBreakPointConPlayStruct.b("VoiceId", voiceId, true);
        voiceBreakPointConPlayStruct.f61686h = j18;
        voiceBreakPointConPlayStruct.f61687i = j19;
        voiceBreakPointConPlayStruct.f61688j = j27;
        voiceBreakPointConPlayStruct.k();
    }
}
