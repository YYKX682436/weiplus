package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public class p5 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f192920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f192921c;

    public p5(java.lang.String str, android.media.MediaPlayer mediaPlayer, int i17) {
        this.f192919a = str;
        this.f192920b = mediaPlayer;
        this.f192921c = i17;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f192919a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PlaySound", "play onPrepared mp:%d  path:%s", objArr);
        try {
            android.media.MediaPlayer mediaPlayer2 = this.f192920b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PlaySound", e17, "play failed pathId:%d", java.lang.Integer.valueOf(this.f192921c));
        }
    }
}
