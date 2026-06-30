package ze5;

/* loaded from: classes5.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f471814d = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.y2 it = (ze5.y2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.storage.f9 f9Var = this.f471814d;
        if (f9Var != null && !f9Var.n2()) {
            pm0.v.O("MicroMsg.ChattingItemAppMsgNewFileMvvm", new ze5.s3(f9Var));
        }
        return jz5.f0.f302826a;
    }
}
