package o45;

/* loaded from: classes8.dex */
public class vh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public r45.iu4 f343022a = new r45.iu4();

    @Override // o45.zg
    public int getCmdId() {
        return 27;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 139;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        this.f343022a.setBaseRequest(o45.bh.a(this));
        return this.f343022a.toByteArray();
    }
}
