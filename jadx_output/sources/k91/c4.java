package k91;

/* loaded from: classes7.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.e6 f305558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k91.g4 f305559f;

    public c4(k91.g4 g4Var, java.lang.String str, com.tencent.mm.plugin.appbrand.service.e6 e6Var) {
        this.f305559f = g4Var;
        this.f305557d = str;
        this.f305558e = e6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f305557d;
        android.util.Pair i17 = com.tencent.mm.plugin.appbrand.config.q.i(str, false, null, new k91.q4(str, null), null);
        com.tencent.mm.plugin.appbrand.service.e6 e6Var = this.f305558e;
        if (e6Var != null) {
            e6Var.a(i17.first != null ? this.f305559f.Ai(str) : null);
        }
    }
}
