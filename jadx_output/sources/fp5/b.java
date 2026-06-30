package fp5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final fp5.b f265387a = new fp5.b();

    public final void a(long j17, long j18, long j19, boolean z17, long j27, int i17, java.lang.String audioDeviceType) {
        kotlin.jvm.internal.o.g(audioDeviceType, "audioDeviceType");
        com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct voipButtonStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct();
        voipButtonStatusStruct.f61704d = j17;
        voipButtonStatusStruct.f61705e = j18;
        voipButtonStatusStruct.f61706f = j19 == 0 ? 1L : 2L;
        voipButtonStatusStruct.p(java.lang.String.valueOf(i17));
        voipButtonStatusStruct.f61707g = z17 ? 1L : 2L;
        voipButtonStatusStruct.f61710j = j27;
        voipButtonStatusStruct.f61709i = java.lang.System.currentTimeMillis();
        voipButtonStatusStruct.q(audioDeviceType);
        voipButtonStatusStruct.k();
    }
}
