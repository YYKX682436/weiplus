package w21;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final w21.u f442477a = new w21.u();

    public static final void a(java.lang.String fileName, int i17, int i18, long j17, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        f442477a.b(1, fileName, i17, i18, (int) j17, z17, str);
    }

    public static final void c(java.lang.String fileName, int i17, int i18, long j17, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        f442477a.b(2, fileName, i17, i18, (int) j17, z17, str);
    }

    public final void b(int i17, java.lang.String str, int i18, int i19, int i27, boolean z17, java.lang.String str2) {
        com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct voiceMessageDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceMessageDownloadStruct();
        voiceMessageDownloadStruct.f61689d = i17;
        voiceMessageDownloadStruct.f61690e = voiceMessageDownloadStruct.b(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, str, true);
        voiceMessageDownloadStruct.f61691f = i18;
        voiceMessageDownloadStruct.f61692g = i19;
        voiceMessageDownloadStruct.f61693h = i27;
        voiceMessageDownloadStruct.f61694i = z17 ? 2 : 1;
        if (str2 == null) {
            str2 = "";
        }
        voiceMessageDownloadStruct.f61695j = voiceMessageDownloadStruct.b("errMsg", str2, true);
        voiceMessageDownloadStruct.k();
    }
}
