package r61;

/* loaded from: classes12.dex */
public class y0 extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ro3 f392999a = new r45.ro3();

    @Override // o45.xg
    public int getFuncId() {
        return com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.ro3 ro3Var = this.f392999a;
        ro3Var.f385053d = cu5Var;
        ro3Var.setBaseRequest(o45.bh.a(this));
        return ro3Var.toByteArray();
    }
}
