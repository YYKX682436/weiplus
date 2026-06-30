package lt5;

/* loaded from: classes8.dex */
public class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt5.c f321294d;

    public b(lt5.c cVar) {
        this.f321294d = cVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "msa-init-fetcher";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.stubs.logger.Log.i("MicroMsg.MsaIdManager", "[+] do initialize in sep thread now.");
        lt5.c cVar = this.f321294d;
        lt5.f a17 = cVar.f321295d.f321297a.a(cVar.f321296e);
        lt5.f[] fVarArr = lt5.e.f321300b;
        synchronized (fVarArr) {
            fVarArr[0] = a17;
        }
        lt5.e.d();
        com.tencent.stubs.logger.Log.i("MicroMsg.MsaIdManager", "[+] initialize done.");
    }
}
