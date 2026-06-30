package o45;

/* loaded from: classes12.dex */
public class rh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f343004a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.go0 f343005b = new r45.go0();

    public rh(boolean z17) {
        this.f343004a = true;
        this.f343004a = z17;
    }

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return this.f343004a ? 3789 : 3644;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        r45.he a17 = o45.bh.a(this);
        r45.go0 go0Var = this.f343005b;
        go0Var.setBaseRequest(a17);
        if (this.f343004a) {
            byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
            setRsaInfo(o45.pi.d());
            go0Var.f375391d = com.tencent.mm.protobuf.g.b(s07);
            if (!o45.ag.f342892a) {
                setPassKey(s07);
            }
        }
        return go0Var.toByteArray();
    }
}
