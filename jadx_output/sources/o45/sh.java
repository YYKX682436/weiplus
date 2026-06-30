package o45;

/* loaded from: classes12.dex */
public class sh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ho0 f343008a = new r45.ho0();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ho0 ho0Var = (r45.ho0) new r45.ho0().parseFrom(bArr);
        this.f343008a = ho0Var;
        o45.bh.b(this, ho0Var.getBaseResponse());
        return this.f343008a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }
}
