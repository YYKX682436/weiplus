package oh1;

/* loaded from: classes4.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f345204a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f345205b;

    /* renamed from: c, reason: collision with root package name */
    public int f345206c;

    /* renamed from: d, reason: collision with root package name */
    public long f345207d;

    /* renamed from: e, reason: collision with root package name */
    public int f345208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f345209f;

    /* renamed from: g, reason: collision with root package name */
    public k01.w0 f345210g;

    public e2(oh1.d2 d2Var) {
    }

    public void a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f345204a) || com.tencent.mm.sdk.platformtools.t8.K0(this.f345205b)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaUpdateableMsgService", "appId or shareKey is null, return");
            return;
        }
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) j2Var.f345241d;
        concurrentHashMap.size();
        concurrentHashMap.put(java.lang.Integer.valueOf(this.f345205b.hashCode()), this);
        j2Var.h();
    }

    public boolean b() {
        int i17 = this.f345206c;
        if (i17 < 0) {
            return false;
        }
        return i17 == 0 ? java.lang.System.currentTimeMillis() - this.f345207d > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT : java.lang.System.currentTimeMillis() - this.f345207d > ((long) this.f345206c) * 1000;
    }
}
