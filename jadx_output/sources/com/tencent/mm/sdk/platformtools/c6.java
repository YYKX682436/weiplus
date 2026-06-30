package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.x5 f192500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f192501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f192502h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w5 f192503i;

    public c6(android.content.Context context, int i17, com.tencent.mm.sdk.platformtools.x5 x5Var, int i18, boolean z17, com.tencent.mm.sdk.platformtools.w5 w5Var) {
        this.f192498d = context;
        this.f192499e = i17;
        this.f192500f = x5Var;
        this.f192501g = i18;
        this.f192502h = z17;
        this.f192503i = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f192502h;
        com.tencent.mm.sdk.platformtools.x5 x5Var = this.f192500f;
        android.content.Context context = this.f192498d;
        int i17 = this.f192501g;
        int i18 = this.f192499e;
        try {
            try {
                java.lang.String string = context.getString(i18);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.sdk.platformtools.d6 d6Var = com.tencent.mm.sdk.platformtools.d6.f192524a;
                if (com.tencent.mm.sdk.platformtools.d6.a(d6Var, i18)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PlaySoundNew", "play asset path:" + string + " hit rateControl, ignore this play request");
                    com.tencent.mm.sdk.platformtools.d6.b(d6Var, i18);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PlaySoundNew", "play asset path:" + string + ", pathId:" + i18 + ", speakeron:" + x5Var + ", stream:" + i17 + ", looping:" + z17);
                com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(context);
                if (createTPPlayer == null) {
                    com.tencent.mm.sdk.platformtools.d6.b(d6Var, i18);
                    return;
                }
                createTPPlayer.setDataSource(context.getAssets().openFd(string));
                if (x5Var != com.tencent.mm.sdk.platformtools.x5.f193084d && -1 == i17) {
                    createTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, x5Var == com.tencent.mm.sdk.platformtools.x5.f193085e ? 3 : 8));
                } else if (i17 != -1) {
                    createTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, i17));
                }
                createTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildInt(419, 1));
                createTPPlayer.setLoopback(z17);
                com.tencent.mm.sdk.platformtools.b6 b6Var = new com.tencent.mm.sdk.platformtools.b6(this.f192503i);
                createTPPlayer.setOnPreparedListener(b6Var);
                createTPPlayer.setOnInfoListener(b6Var);
                createTPPlayer.setOnPlayerStateChangeListener(b6Var);
                createTPPlayer.setOnCompletionListener(b6Var);
                createTPPlayer.setOnErrorListener(b6Var);
                createTPPlayer.prepareAsync();
                com.tencent.mm.sdk.platformtools.d6.b(d6Var, i18);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PlaySoundNew", e17, "", new java.lang.Object[0]);
                com.tencent.mm.sdk.platformtools.d6.b(com.tencent.mm.sdk.platformtools.d6.f192524a, i18);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.d6.b(com.tencent.mm.sdk.platformtools.d6.f192524a, i18);
            throw th6;
        }
    }
}
