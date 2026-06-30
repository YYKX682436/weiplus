package v32;

/* loaded from: classes9.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f433094e = {l75.n0.getCreateSQLs(v32.d.D, "HardIotCdnInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f433095d;

    public e(l75.k0 k0Var) {
        super(k0Var, v32.d.D, "HardIotCdnInfo", null);
        this.f433095d = k0Var;
    }

    public boolean y0(long j17) {
        if (this.f433095d.delete("HardIotCdnInfo", "msgid=?", new java.lang.String[]{java.lang.String.valueOf(j17)}) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo fail, msgId = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo ok, msgId = %d", java.lang.Long.valueOf(j17));
        return true;
    }
}
