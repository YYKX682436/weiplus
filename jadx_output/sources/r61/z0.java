package r61;

/* loaded from: classes12.dex */
public class z0 extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.so3 f393003a = new r45.so3();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.so3 so3Var = (r45.so3) new r45.so3().parseFrom(bArr);
        this.f393003a = so3Var;
        o45.bh.b(this, so3Var.getBaseResponse());
        return this.f393003a.getBaseResponse().f376959d;
    }
}
