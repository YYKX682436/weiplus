package ol4;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ol4.q qVar) {
        super(0);
        this.f346155d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f346155d;
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts tingTPAudioMixTts = qVar.f346200v;
        if (tingTPAudioMixTts != null) {
            tingTPAudioMixTts.release();
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance tingTPAudioEnhance = qVar.f346202x;
        if (tingTPAudioEnhance != null) {
            tingTPAudioEnhance.release();
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid tingTPHearingAid = qVar.f346201w;
        if (tingTPHearingAid != null) {
            tingTPHearingAid.release();
        }
        ((kk4.f0) qVar.f346180b).release();
        pl4.k kVar = qVar.f346199u;
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "release fileCacheId:" + kVar.f356718b);
            kVar.f356728l = true;
        }
        wu5.c cVar = qVar.f346186h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f346186h = null;
        com.tencent.mars.xlog.Log.i(qVar.f346197s, "call release cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return jz5.f0.f302826a;
    }
}
