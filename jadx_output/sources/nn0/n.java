package nn0;

/* loaded from: classes10.dex */
public final class n extends nn0.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, boolean z17, int i17) {
        super(context, z17, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // nn0.i
    public nn0.o a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() ? new nn0.s(context) : new nn0.h(context);
    }

    @Override // nn0.i, com.tencent.rtmp.TXLivePlayer
    public int startLivePlay(java.lang.String str, int i17) {
        nn0.o oVar;
        if (this.f338583a && (oVar = this.f338584b) != null) {
            kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener");
            super.setVideoRenderListener((com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener) oVar, null);
            kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener");
            super.setAudioRawDataListener((com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener) oVar);
            oVar.startPlay();
        }
        return super.startLivePlay(str, i17);
    }
}
