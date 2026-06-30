package o45;

/* loaded from: classes9.dex */
public class dh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ih f342920a = new r45.ih();

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.ih ihVar = (r45.ih) new r45.ih().parseFrom(bArr);
        this.f342920a = ihVar;
        return ihVar.f377042d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000312;
    }

    @Override // o45.ah, o45.yg
    public boolean isRawData() {
        return true;
    }
}
