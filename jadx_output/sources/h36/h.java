package h36;

/* loaded from: classes13.dex */
public class h {
    public static byte[] A = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final java.security.SecureRandom f278595a = new java.security.SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f278596b = java.security.SecureRandom.getSeed(16);

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f278597c = new byte[16];

    /* renamed from: d, reason: collision with root package name */
    public j36.d f278598d = new j36.d();

    /* renamed from: e, reason: collision with root package name */
    public j36.e f278599e = new j36.e();

    /* renamed from: f, reason: collision with root package name */
    public long f278600f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f278601g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final long f278602h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f278603i = 0;

    /* renamed from: j, reason: collision with root package name */
    public android.content.Context f278604j = null;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f278605k = new byte[0];

    /* renamed from: l, reason: collision with root package name */
    public byte[] f278606l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public int f278607m = 0;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f278608n = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    public byte[] f278609o = new byte[0];

    /* renamed from: p, reason: collision with root package name */
    public byte[] f278610p = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public byte[] f278611q = new byte[0];

    /* renamed from: r, reason: collision with root package name */
    public byte[] f278612r = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    public int f278613s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f278614t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f278615u = 0;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f278616v = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public oicq.wlogin_sdk.tools.ErrMsg f278617w = new oicq.wlogin_sdk.tools.ErrMsg();

    /* renamed from: x, reason: collision with root package name */
    public byte[] f278618x = new byte[0];

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f278619y = new byte[4];

    /* renamed from: z, reason: collision with root package name */
    public h36.e f278620z = null;

    public h(android.content.Context context) {
    }

    public synchronized oicq.wlogin_sdk.sharemem.WloginSigInfo a(long j17, long j18) {
        oicq.wlogin_sdk.tools.util.b("get_siginfo", "uin=" + j17 + "appid=" + j18);
        return this.f278620z.k(j17, j18);
    }
}
