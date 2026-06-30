package d61;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f226689e = d61.c.d("ftyp");

    /* renamed from: f, reason: collision with root package name */
    public static final int f226690f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f226691g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f226692h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f226693i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f226694j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f226695k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f226696l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f226697m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f226698n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f226699o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f226700p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f226701q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f226702r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f226703s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f226704t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f226705u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f226706v;

    /* renamed from: a, reason: collision with root package name */
    public final int f226707a;

    /* renamed from: b, reason: collision with root package name */
    public final long f226708b;

    /* renamed from: c, reason: collision with root package name */
    public final int f226709c;

    /* renamed from: d, reason: collision with root package name */
    public final long f226710d;

    static {
        d61.c.d("avc1");
        d61.c.d("avc3");
        d61.c.d("hvc1");
        d61.c.d("hev1");
        d61.c.d("s263");
        d61.c.d("d263");
        d61.c.d("mdat");
        d61.c.d("mp4a");
        d61.c.d("wave");
        d61.c.d("ac-3");
        d61.c.d("dac3");
        d61.c.d("ec-3");
        d61.c.d("dec3");
        d61.c.d("dtsc");
        d61.c.d("dtsh");
        d61.c.d("dtsl");
        d61.c.d("dtse");
        d61.c.d("ddts");
        d61.c.d("tfdt");
        d61.c.d("tfhd");
        d61.c.d("trex");
        d61.c.d("trun");
        d61.c.d("sidx");
        f226690f = d61.c.d("moov");
        f226691g = d61.c.d("mvhd");
        f226692h = d61.c.d("trak");
        f226693i = d61.c.d("mdia");
        f226694j = d61.c.d("minf");
        f226695k = d61.c.d("stbl");
        d61.c.d("avcC");
        d61.c.d("hvcC");
        d61.c.d("esds");
        d61.c.d("moof");
        d61.c.d("traf");
        d61.c.d("mvex");
        d61.c.d("tkhd");
        f226696l = d61.c.d("edts");
        f226697m = d61.c.d("elst");
        f226698n = d61.c.d("mdhd");
        f226699o = d61.c.d("hdlr");
        d61.c.d("stsd");
        d61.c.d("pssh");
        d61.c.d("sinf");
        d61.c.d("schm");
        d61.c.d("schi");
        d61.c.d("tenc");
        d61.c.d("encv");
        d61.c.d("enca");
        d61.c.d("frma");
        d61.c.d("saiz");
        d61.c.d("saio");
        d61.c.d("uuid");
        d61.c.d("senc");
        d61.c.d("pasp");
        d61.c.d("TTML");
        d61.c.d("vmhd");
        d61.c.d("mp4v");
        f226700p = d61.c.d("stts");
        f226701q = d61.c.d("stss");
        d61.c.d("ctts");
        f226702r = d61.c.d("stsc");
        f226703s = d61.c.d("stsz");
        f226704t = d61.c.d("stco");
        f226705u = d61.c.d("co64");
        d61.c.d("tx3g");
        d61.c.d("wvtt");
        d61.c.d("stpp");
        d61.c.d("samr");
        d61.c.d("sawb");
        f226706v = d61.c.d("udta");
        d61.c.d("meta");
        d61.c.d("ilst");
        d61.c.d("mean");
        d61.c.d(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        d61.c.d(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        d61.c.d("----");
    }

    public a(int i17, long j17, int i18, long j18) {
        this.f226707a = i17;
        this.f226710d = j17;
        this.f226709c = i18;
        this.f226708b = j18;
    }

    public long a() {
        long j17 = this.f226708b;
        return j17 > 0 ? j17 : this.f226707a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Atom{atomSize=");
        sb6.append(this.f226707a);
        sb6.append(", atomLargeSize=");
        sb6.append(this.f226708b);
        sb6.append(", type=");
        int i17 = this.f226709c;
        sb6.append(new java.lang.String(new byte[]{(byte) ((i17 >> 24) & 255), (byte) ((i17 >> 16) & 255), (byte) ((i17 >> 8) & 255), (byte) (i17 & 255)}));
        sb6.append(", beginPos=");
        sb6.append(this.f226710d);
        sb6.append('}');
        return sb6.toString();
    }
}
