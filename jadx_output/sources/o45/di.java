package o45;

/* loaded from: classes8.dex */
public class di extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ty5 f342921a = new r45.ty5();

    @Override // o45.zg
    public int getCmdId() {
        return 42;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 131;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        r45.he a17 = o45.bh.a(this);
        r45.ty5 ty5Var = this.f342921a;
        ty5Var.setBaseRequest(a17);
        return ty5Var.toByteArray();
    }
}
