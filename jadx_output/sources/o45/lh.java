package o45;

/* loaded from: classes12.dex */
public class lh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gk0 f342975a;

    public lh() {
        r45.gk0 gk0Var = new r45.gk0();
        this.f342975a = gk0Var;
        setUin(0);
        r45.fk0 fk0Var = new r45.fk0();
        gk0Var.f375310e = fk0Var;
        fk0Var.f374405d = new r45.c20();
        gk0Var.f375309d = new r45.hk0();
    }

    @Override // o45.xg
    public int getFuncId() {
        return o45.ag.f342892a ? 784 : 722;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.gk0 gk0Var = this.f342975a;
        gk0Var.f375310e.setBaseRequest(o45.bh.a(this));
        r45.hk0 hk0Var = gk0Var.f375309d;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        hk0Var.f376240d = cu5Var;
        setPassKey(gk0Var.f375309d.f376240d.f371841f.g());
        setReqPackControl(new o45.kh(this, this));
        return gk0Var.toByteArray();
    }
}
