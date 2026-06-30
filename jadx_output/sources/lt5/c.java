package lt5;

/* loaded from: classes8.dex */
public class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt5.d f321295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321296e;

    public c(lt5.d dVar, android.content.Context context) {
        this.f321295d = dVar;
        this.f321296e = context;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "msa-init-waiter";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((ku5.t0) ku5.t0.f312615d).j(new lt5.b(this), "sn-msa-init-fetcher").get(10L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            lt5.e.d();
            com.tencent.stubs.logger.Log.w("MicroMsg.MsaIdManager", "[!] asyncInit, timeout.");
        } catch (java.lang.Throwable th6) {
            lt5.e.d();
            com.tencent.stubs.logger.Log.e("MicroMsg.MsaIdManager", th6, "[-] asyncInit failure.");
        }
    }
}
