package y8;

/* loaded from: classes15.dex */
public class b extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f459796d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f459797e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f459798f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f459799g;

    public b(com.google.android.exoplayer2.Format format, java.lang.Throwable th6, boolean z17, int i17) {
        super("Decoder init failed: [" + i17 + "], " + format, th6);
        this.f459796d = format.f44080i;
        this.f459797e = z17;
        this.f459798f = null;
        this.f459799g = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i17 < 0 ? "neg_" : "") + java.lang.Math.abs(i17);
    }

    public b(com.google.android.exoplayer2.Format format, java.lang.Throwable th6, boolean z17, java.lang.String str) {
        super("Decoder init failed: " + str + ", " + format, th6);
        this.f459796d = format.f44080i;
        this.f459797e = z17;
        this.f459798f = str;
        java.lang.String str2 = null;
        if (t9.d0.f416498a >= 21 && (th6 instanceof android.media.MediaCodec.CodecException)) {
            str2 = ((android.media.MediaCodec.CodecException) th6).getDiagnosticInfo();
        }
        this.f459799g = str2;
    }
}
