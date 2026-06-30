package uo4;

/* loaded from: classes10.dex */
public final class g extends uo4.f {

    /* renamed from: g, reason: collision with root package name */
    public int f429690g;

    /* renamed from: h, reason: collision with root package name */
    public int f429691h;

    /* renamed from: q, reason: collision with root package name */
    public long f429700q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f429701r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f429703t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f429704u;

    /* renamed from: d, reason: collision with root package name */
    public float f429687d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f429688e = 1;

    /* renamed from: f, reason: collision with root package name */
    public float f429689f = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f429692i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f429693j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f429694k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f429695l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f429696m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f429697n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f429698o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f429699p = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f429702s = "";

    @Override // uo4.f, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        float f17 = this.f429689f;
        if (!(f17 == 1.0f)) {
            b17.put("playRate", java.lang.Float.valueOf(f17));
        }
        b17.put("duration", this.f429700q);
        b17.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Float.valueOf(this.f429687d));
        b17.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f429688e);
        b17.put("audioSampleRate", this.f429690g);
        b17.put("audioBitrate", this.f429691h);
        b17.put("videoMime", this.f429692i);
        b17.put("audioMime", this.f429693j);
        b17.put("useHdrTransfer", this.f429701r);
        b17.put("audioType", this.f429694k);
        b17.put("videoType", this.f429695l);
        b17.put("videoCodeCTAG", this.f429696m);
        b17.put("audioCodeCTAG", this.f429697n);
        b17.put("hasAudioTrack", this.f429703t);
        b17.put("hasVideoTrack", this.f429704u);
        b17.put("videoCodeCName", this.f429698o);
        b17.put("audioCodeCName", this.f429699p);
        if (!kotlin.jvm.internal.o.b(this.f429702s, "")) {
            b17.put("maxAlignment", this.f429702s);
        }
        return b17;
    }
}
