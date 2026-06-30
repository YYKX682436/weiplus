package od0;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od0.v f344591d;

    public w(od0.v vVar) {
        this.f344591d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            this.f344591d.Ai(540999718, k57Var.toByteArray(), false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report posi error: " + th6);
        }
    }
}
