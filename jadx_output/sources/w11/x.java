package w11;

/* loaded from: classes12.dex */
public class x extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.uc f442162a = new r45.uc();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.uc ucVar = (r45.uc) new r45.uc().parseFrom(bArr);
        this.f442162a = ucVar;
        o45.bh.b(this, ucVar.getBaseResponse());
        return this.f442162a.getBaseResponse().f376959d;
    }
}
