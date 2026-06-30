package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class o5 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f192904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t5 f192905c;

    public o5(java.lang.String str, android.media.MediaPlayer mediaPlayer, com.tencent.mm.sdk.platformtools.t5 t5Var) {
        this.f192903a = str;
        this.f192904b = mediaPlayer;
        this.f192905c = t5Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f192903a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PlaySound", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f192904b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        com.tencent.mm.sdk.platformtools.t5 t5Var = this.f192905c;
        if (t5Var != null) {
            t5Var.onCompletion();
        }
    }
}
