package o45;

/* loaded from: classes11.dex */
public class fh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ei f342925a = new r45.ei();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ei eiVar = (r45.ei) new r45.ei().parseFrom(bArr);
        this.f342925a = eiVar;
        o45.bh.b(this, eiVar.getBaseResponse());
        return this.f342925a.getBaseResponse().f376959d;
    }
}
