package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class o implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.p f162436a;

    public o(com.tencent.mm.plugin.sight.decode.model.p pVar) {
        this.f162436a = pVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", this.f162436a.f162440g.f162447c, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f162436a.f162440g.c();
        if (this.f162436a.f162440g.F == null) {
            return true;
        }
        this.f162436a.f162440g.F.a(this.f162436a.f162440g, -1);
        return true;
    }
}
