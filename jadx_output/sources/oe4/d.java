package oe4;

/* loaded from: classes9.dex */
public class d extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.us6 f344801a = new r45.us6();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.us6 us6Var = (r45.us6) new r45.us6().parseFrom(bArr);
        this.f344801a = us6Var;
        o45.bh.b(this, us6Var.getBaseResponse());
        return this.f344801a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
