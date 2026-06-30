package oe4;

/* loaded from: classes11.dex */
public class c extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ts6 f344800a = new r45.ts6();

    @Override // o45.zg
    public int getCmdId() {
        return 0;
    }

    @Override // o45.xg
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.z4.CTRL_INDEX;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        setRsaInfo(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.s0());
        r45.ts6 ts6Var = this.f344800a;
        ts6Var.f386764g = cu5Var;
        ts6Var.setBaseRequest(o45.bh.a(this));
        setPassKey(ts6Var.f386764g.f371841f.g());
        return ts6Var.toByteArray();
    }
}
