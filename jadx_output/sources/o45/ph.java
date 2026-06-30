package o45;

/* loaded from: classes12.dex */
public class ph extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.fo0 f342996a = new r45.fo0();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.fo0 fo0Var = (r45.fo0) new r45.fo0().parseFrom(bArr);
        this.f342996a = fo0Var;
        o45.bh.b(this, fo0Var.getBaseResponse());
        return this.f342996a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
