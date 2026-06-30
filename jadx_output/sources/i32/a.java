package i32;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f288113d;

    /* renamed from: e, reason: collision with root package name */
    public final int f288114e;

    /* renamed from: f, reason: collision with root package name */
    public final int f288115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f288116g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f288117h;

    public a(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f288113d = -1L;
        this.f288114e = -1;
        this.f288115f = -1;
        this.f288117h = null;
        this.f288113d = j17;
        this.f288114e = i18;
        this.f288115f = i19;
        this.f288117h = bArr;
        this.f288116g = i17;
    }

    public void a() {
        int i17;
        int i18;
        long j17 = this.f288113d;
        if (j17 == -1 || (i17 = this.f288114e) == -1 || (i18 = this.f288115f) == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
            return;
        }
        switch (i18) {
            case 10001:
                u32.h1.c().b(new w32.e(this.f288116g, j17, i17, i18, this.f288117h));
                return;
            case 10002:
                i32.s a17 = i32.s.a();
                long j18 = this.f288113d;
                int i19 = this.f288114e;
                int i27 = this.f288115f;
                byte[] bArr = this.f288117h;
                a17.getClass();
                a17.f288141e.obtainMessage(1, this.f288116g, 0, new i32.g(j18, i19, i27, bArr)).sendToTarget();
                return;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                u32.h1.c().b(new w32.f(this.f288116g, j17, i17, i18, this.f288117h));
                return;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", java.lang.Integer.valueOf(i18));
                return;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }
}
