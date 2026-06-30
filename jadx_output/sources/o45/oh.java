package o45;

/* loaded from: classes12.dex */
public class oh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f342990a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.eo0 f342991b = new r45.eo0();

    public oh(boolean z17) {
        this.f342990a = true;
        this.f342990a = z17;
    }

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return this.f342990a ? 3944 : 836;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        r45.he a17 = o45.bh.a(this);
        r45.eo0 eo0Var = this.f342991b;
        eo0Var.setBaseRequest(a17);
        if (this.f342990a) {
            byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
            setRsaInfo(o45.pi.d());
            eo0Var.f373616d = com.tencent.mm.protobuf.g.b(s07);
            if (!o45.ag.f342892a) {
                setPassKey(s07);
            }
        }
        return eo0Var.toByteArray();
    }
}
