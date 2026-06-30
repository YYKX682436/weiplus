package y73;

/* loaded from: classes11.dex */
public class l0 implements w73.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.File f459734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f459735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f459736d;

    public l0(y73.d0 d0Var, java.lang.String str, java.io.File file, long j17) {
        this.f459736d = d0Var;
        this.f459733a = str;
        this.f459734b = file;
        this.f459735c = j17;
    }

    @Override // w73.d
    public void a(boolean z17) {
        this.f459736d.f459710h.put(this.f459733a, java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f459736d.f459713n));
        if (this.f459736d.f459713n) {
            this.f459736d.e(this.f459734b, this.f459735c);
            this.f459736d.f459710h.remove(this.f459733a);
        }
    }
}
