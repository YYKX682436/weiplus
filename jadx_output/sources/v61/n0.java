package v61;

/* loaded from: classes13.dex */
public class n0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v61.q0 f433466a;

    public n0(v61.q0 q0Var) {
        this.f433466a = q0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        v61.p0 p0Var;
        int i17 = message.what;
        v61.q0 q0Var = this.f433466a;
        if (i17 != 1) {
            if (i17 == 2 && (p0Var = q0Var.f433470b) != null) {
                p0Var.b(message.getData());
                return;
            }
            return;
        }
        v61.p0 p0Var2 = q0Var.f433470b;
        if (p0Var2 != null) {
            p0Var2.a(message.arg1, (java.lang.String) message.obj);
        }
    }
}
