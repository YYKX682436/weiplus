package hg0;

/* loaded from: classes12.dex */
public abstract class e {
    public static final void a(java.lang.String eventId, java.util.Map params) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(params, "params");
        try {
            com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct voiceMessageDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct();
            voiceMessageDownloadStruct.f61696k = voiceMessageDownloadStruct.b("EventId", eventId, true);
            voiceMessageDownloadStruct.f61697l = java.lang.System.currentTimeMillis();
            voiceMessageDownloadStruct.f61698m = voiceMessageDownloadStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(params)), ",", ";", false), true);
            voiceMessageDownloadStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Report26956Receive", e17, "report", new java.lang.Object[0]);
        }
    }

    public static final void b(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        a("after_download_voice_msg", params);
    }
}
