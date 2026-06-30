package v24;

/* loaded from: classes15.dex */
public class b0 implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f432902a;

    public b0(wd0.p1 p1Var) {
        this.f432902a = p1Var;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        wd0.p1 p1Var = this.f432902a;
        if (en0Var == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. response = success");
            p1Var.a();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. response = fail");
            p1Var.onSuccess();
        }
    }
}
