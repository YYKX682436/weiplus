package z21;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f469702a;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f469710i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f469703b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f469704c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f469705d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f469706e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f469707f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469708g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f469709h = false;

    /* renamed from: j, reason: collision with root package name */
    public long f469711j = 0;

    public z(z21.a0 a0Var) {
        this.f469702a = a(a0Var.f469550a);
    }

    public final java.lang.String a(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f469711j = currentTimeMillis;
        long j17 = currentTimeMillis & io.flutter.embedding.android.KeyboardMap.kValueMask;
        long nextInt = io.flutter.embedding.android.KeyboardMap.kValueMask & new java.util.Random(java.lang.System.currentTimeMillis()).nextInt();
        long j18 = (j17 << 32) | nextInt;
        if (j18 < 0) {
            j18 = java.lang.Math.abs(j18);
        }
        java.lang.String str2 = str + j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortSentenceContainer", "finally random = %s(%s) time = %s(%s) id = %s(%s) session = %s strId = %s", java.lang.Long.valueOf(nextInt), java.lang.Long.toBinaryString(nextInt), java.lang.Long.valueOf(j17), java.lang.Long.toBinaryString(j17), java.lang.Long.valueOf(j18), java.lang.Long.toBinaryString(j18), str, str2);
        return str2;
    }

    public z(z21.a0 a0Var, java.lang.String str) {
        this.f469702a = a(str);
    }
}
