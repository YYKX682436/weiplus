package ru1;

/* loaded from: classes14.dex */
public final class g implements ru1.u {

    /* renamed from: a, reason: collision with root package name */
    public final pu1.a f399714a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f399715b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.r2 f399716c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioRecord f399717d;

    public g(android.media.projection.MediaProjection mp6, android.content.Context context, pu1.a cfg, yz5.l callback) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(cfg, "cfg");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f399714a = cfg;
        this.f399715b = callback;
        if (android.os.Build.VERSION.SDK_INT < 29 || b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") != 0) {
            return;
        }
        android.media.AudioPlaybackCaptureConfiguration build = new android.media.AudioPlaybackCaptureConfiguration.Builder(mp6).addMatchingUsage(0).addMatchingUsage(14).addMatchingUsage(1).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        this.f399717d = new android.media.AudioRecord.Builder().setAudioPlaybackCaptureConfig(build).setAudioFormat(new android.media.AudioFormat.Builder().setSampleRate(cfg.f358416b).setEncoding(2).setChannelMask(cfg.f358417c == 2 ? 12 : 16).build()).build();
    }

    @Override // ru1.u
    public void a() {
        kotlinx.coroutines.r2 r2Var = this.f399716c;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("ScreenCastDirectlyEncoder", "startRecord cannot start twice");
        } else {
            this.f399716c = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(lu5.a.f321457f), null, null, new ru1.f(this, null), 3, null);
        }
    }

    @Override // ru1.u
    public void stopRecord() {
        kotlinx.coroutines.r2 r2Var = this.f399716c;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.media.AudioRecord audioRecord = this.f399717d;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }
}
