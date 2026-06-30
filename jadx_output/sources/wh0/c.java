package wh0;

/* loaded from: classes11.dex */
public class c extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.g06 f445912a = new r45.g06();

    public c(wh0.a aVar) {
    }

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.g06 g06Var = (r45.g06) new r45.g06().parseFrom(bArr);
        this.f445912a = g06Var;
        o45.bh.b(this, g06Var.getBaseResponse());
        return this.f445912a.getBaseResponse().f376959d;
    }
}
