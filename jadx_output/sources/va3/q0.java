package va3;

/* loaded from: classes15.dex */
public class q0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va3.v0 f434337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(va3.v0 v0Var, android.os.Looper looper) {
        super(looper);
        this.f434337a = v0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message == null) {
            return;
        }
        va3.v0 v0Var = this.f434337a;
        v0Var.getClass();
        if (message.what != 1) {
            return;
        }
        v0Var.e();
    }
}
