package ze5;

/* loaded from: classes5.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f472188d = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f472188d;
        f9Var.setType(1090519089);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNewFileMvvm", "[updateFileLocalType] ret: " + pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var) + " , msgId: " + f9Var.getMsgId() + ", talker: " + f9Var.Q0() + ", svrId: " + f9Var.I0());
        return jz5.f0.f302826a;
    }
}
