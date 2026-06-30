package e21;

/* loaded from: classes9.dex */
public class i extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.i25 f246528a = new r45.i25();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.i25 i25Var = (r45.i25) new r45.i25().parseFrom(bArr);
        this.f246528a = i25Var;
        return i25Var.f376687d;
    }
}
