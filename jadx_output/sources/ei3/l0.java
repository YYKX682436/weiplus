package ei3;

/* loaded from: classes10.dex */
public class l0 implements ei3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.h f253106a;

    /* renamed from: b, reason: collision with root package name */
    public final float f253107b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f253108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f253109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f253110e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f253111f;

    public l0(com.tencent.mm.plugin.sight.base.h hVar, java.lang.String str, float f17, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19) {
        this.f253106a = hVar;
        this.f253108c = str;
        this.f253107b = f17;
        this.f253109d = i18;
        this.f253110e = i19;
        this.f253111f = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s, mute: %s, useSoftEncode:%s, enableHevc:%s", java.lang.Integer.valueOf(hVar.f162415a), str, java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
    }

    public boolean a(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = this.f253108c;
        new com.tencent.mm.vfs.r6(str).s().J();
        java.lang.String a17 = com.tencent.mm.plugin.sight.base.e.a(str);
        java.lang.String str2 = null;
        try {
            if (!com.tencent.mm.vfs.w6.j(a17)) {
                a17 = null;
            }
            str2 = a17;
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMP4Muxer", "start mux, bufId: %s, aacFile: %s useFFMpeg:%b", java.lang.Integer.valueOf(this.f253106a.f162415a), str2, java.lang.Boolean.valueOf(z17));
        int b17 = this.f253106a.b(this.f253108c, java.lang.Math.max(1000, this.f253109d), this.f253107b, this.f253111f, this.f253110e, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightMP4Muxer", "mux sight end, duration %ds, used %sms", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                com.tencent.mm.vfs.w6.h(str2);
            } catch (java.lang.Exception unused2) {
            }
        }
        return b17 >= 0;
    }
}
