package o45;

/* loaded from: classes8.dex */
public class ei extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.uy5 f342923a = new r45.uy5();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.uy5 uy5Var = (r45.uy5) new r45.uy5().parseFrom(bArr);
        this.f342923a = uy5Var;
        o45.bh.b(this, uy5Var.getBaseResponse());
        return this.f342923a.getBaseResponse().f376959d;
    }
}
