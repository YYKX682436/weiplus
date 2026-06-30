package ol4;

/* loaded from: classes14.dex */
public final class e implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346153d;

    public e(ol4.q qVar) {
        this.f346153d = qVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer player, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer audioFrameBuffer) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(audioFrameBuffer, "audioFrameBuffer");
        ol4.q qVar = this.f346153d;
        ll4.b bVar = qVar.f346204z;
        if (bVar != null) {
            bw5.y1 y1Var = new bw5.y1();
            y1Var.f35305e = audioFrameBuffer.sampleRate;
            boolean[] zArr = y1Var.f35308h;
            zArr[2] = true;
            y1Var.f35306f = audioFrameBuffer.channels;
            zArr[3] = true;
            y1Var.f35304d = bw5.x1.PCMFormatS16LE;
            zArr[1] = true;
            y1Var.f35307g = true;
            zArr[4] = true;
            java.lang.String str = qVar.f346197s;
            int i17 = audioFrameBuffer.size[0];
            byte[] bArr = audioFrameBuffer.data[0];
            kl4.h hVar = qVar.A;
            com.tencent.unit_rc.ByteBuffer a17 = hVar.a(i17, bArr);
            try {
                try {
                    ((kl4.q) bVar).a(a17, y1Var);
                    java.nio.ByteBuffer data = a17.getData();
                    data.rewind();
                    int min = java.lang.Math.min(data.remaining(), audioFrameBuffer.size[0]);
                    if (min == audioFrameBuffer.size[0]) {
                        byte[] bArr2 = new byte[min];
                        data.get(bArr2);
                        data.rewind();
                        java.lang.System.arraycopy(bArr2, 0, audioFrameBuffer.data[0], 0, min);
                    } else {
                        com.tencent.mars.xlog.Log.w(str, "notifyAudioFrameOut audio frame out callback size not match");
                    }
                    hVar.b(a17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(str, "audio frame out callback error: " + e17.getMessage());
                    hVar.b(a17);
                }
            } catch (java.lang.Throwable th6) {
                hVar.b(a17);
                throw th6;
            }
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioGainProcess tingTPAudioGainProcess = qVar.f346203y;
        if (tingTPAudioGainProcess != null) {
            audioFrameBuffer = tingTPAudioGainProcess.processNotifyAudioFrameBuffer(audioFrameBuffer);
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts tingTPAudioMixTts = qVar.f346200v;
        if (tingTPAudioMixTts != null) {
            audioFrameBuffer = tingTPAudioMixTts.processNotifyAudioFrameBuffer(audioFrameBuffer);
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance tingTPAudioEnhance = qVar.f346202x;
        if (tingTPAudioEnhance != null) {
            audioFrameBuffer = tingTPAudioEnhance.processNotifyAudioFrameBuffer(audioFrameBuffer);
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid tingTPHearingAid = qVar.f346201w;
        return tingTPHearingAid != null ? tingTPHearingAid.processNotifyAudioFrameBuffer(audioFrameBuffer) : audioFrameBuffer;
    }
}
