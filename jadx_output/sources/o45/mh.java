package o45;

/* loaded from: classes8.dex */
public class mh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.d20 f342982a = new r45.d20();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.d20 d20Var = this.f342982a;
        d20Var.parseFrom(bArr);
        return d20Var.BaseResponse.f376959d;
    }
}
