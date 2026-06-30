package o45;

/* loaded from: classes9.dex */
public class ch extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public int f342912a;

    /* renamed from: b, reason: collision with root package name */
    public int f342913b = 0;

    @Override // o45.zg
    public int getCmdId() {
        return 312;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 0;
    }

    @Override // o45.zg
    public boolean getShortSupport() {
        return false;
    }

    @Override // o45.zg, o45.xg
    public boolean isRawData() {
        return true;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        r45.hh hhVar = new r45.hh();
        hhVar.f376142d = o45.wf.f343029g;
        hhVar.f376143e = 2;
        hhVar.f376144f = this.f342912a;
        int i17 = this.f342913b;
        hhVar.f376145g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBgFg", "somr online:%d nettype:%d ver:%d devid:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hhVar.f376144f), java.lang.Integer.valueOf(hhVar.f376142d), java.lang.Integer.valueOf(hhVar.f376143e));
        try {
            return hhVar.toByteArray();
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBgFg", "MMBgfg toProtoBuf exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
