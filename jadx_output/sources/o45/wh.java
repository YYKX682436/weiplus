package o45;

/* loaded from: classes8.dex */
public class wh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ju4 f343035a = new r45.ju4();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ju4 ju4Var = (r45.ju4) new r45.ju4().parseFrom(bArr);
        this.f343035a = ju4Var;
        o45.bh.b(this, ju4Var.getBaseResponse());
        return this.f343035a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000027;
    }
}
