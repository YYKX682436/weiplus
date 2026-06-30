package o45;

/* loaded from: classes8.dex */
public class uh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.qc3 f343012a = new r45.qc3();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.qc3 qc3Var = (r45.qc3) new r45.qc3().parseFrom(bArr);
        this.f343012a = qc3Var;
        o45.bh.b(this, qc3Var.getBaseResponse());
        return this.f343012a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000179;
    }
}
