package od0;

/* loaded from: classes13.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f344569d;

    public p0(od0.q0 q0Var, android.os.Bundle bundle) {
        this.f344569d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f344569d;
        try {
            byte[] byteArray = bundle.getByteArray("ECD");
            java.lang.String string = bundle.getString("MGAI", "");
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(byteArray);
            k57Var.f378396f = cu5Var;
            if (!android.text.TextUtils.isEmpty(string)) {
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(string.getBytes());
                k57Var.f378407t = cu5Var2;
            }
            ((od0.v) i95.n0.c(od0.v.class)).Ai(540999708, k57Var.toByteArray(), false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "report wg task error: %s", th6.toString());
        }
    }
}
