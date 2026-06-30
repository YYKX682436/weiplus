package o45;

/* loaded from: classes12.dex */
public class yh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ew4 f343039a = new r45.ew4();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ew4 ew4Var = (r45.ew4) new r45.ew4().parseFrom(bArr);
        this.f343039a = ew4Var;
        return ew4Var.f373758d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000121;
    }
}
