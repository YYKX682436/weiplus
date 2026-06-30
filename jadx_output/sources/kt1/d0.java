package kt1;

/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f311926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kt1.h0 h0Var) {
        super(0);
        this.f311926d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ho5 ho5Var = new r45.ho5();
        byte[] bArr = this.f311926d.f311943a;
        if (bArr != null) {
            try {
                ho5Var.parseFrom(bArr);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReliableSync.SyncTask", th6, "parse ReliableSyncNotifyData err", new java.lang.Object[0]);
            }
        }
        return ho5Var;
    }
}
