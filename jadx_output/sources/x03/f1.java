package x03;

/* loaded from: classes15.dex */
public class f1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451024a;

    public f1(x03.p1 p1Var) {
        this.f451024a = p1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 1001) {
            return;
        }
        x03.p1 p1Var = this.f451024a;
        if (p1Var.f451096i != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "preparing");
            ((ku5.t0) ku5.t0.f312615d).B(new x03.z0(p1Var, hashMap));
        }
    }
}
