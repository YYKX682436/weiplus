package o45;

/* loaded from: classes8.dex */
public class th extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.pc3 f343009a = new r45.pc3();

    @Override // o45.zg
    public int getCmdId() {
        return 179;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 381;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.a());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.pc3 pc3Var = this.f343009a;
        pc3Var.f382937d = cu5Var;
        pc3Var.f382938e = o45.pi.d().f342999c;
        pc3Var.setBaseRequest(o45.bh.a(this));
        return pc3Var.toByteArray();
    }
}
