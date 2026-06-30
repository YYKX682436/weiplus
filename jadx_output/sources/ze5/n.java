package ze5;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.n f472100d = new ze5.n();

    public n() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d ui6 = (yb5.d) obj;
        rd5.d msgData = (rd5.d) obj2;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        return v17 == null ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(te5.t.g(f9Var, v17, ui6));
    }
}
