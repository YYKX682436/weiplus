package o45;

/* loaded from: classes12.dex */
public class ci extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f342915b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f342916c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f342917d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f342918e;

    /* renamed from: a, reason: collision with root package name */
    public r45.zv4 f342914a = new r45.zv4();

    /* renamed from: f, reason: collision with root package name */
    public int f342919f = 0;

    public void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f342916c = bArr;
        this.f342917d = bArr2;
        this.f342918e = bArr3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReg2.Resp", "summerauths setSession [%s] [%s] [%s]", com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(this.f342917d)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(this.f342918e)));
    }

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        this.f342919f = 0;
        r45.zv4 zv4Var = (r45.zv4) new r45.zv4().parseFrom(bArr);
        this.f342914a = zv4Var;
        o45.bh.b(this, zv4Var.getBaseResponse());
        this.f342919f = 0;
        return this.f342914a.getBaseResponse().f376959d;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 0;
    }

    @Override // o45.ah
    public byte[] getNewRegResponse() {
        try {
            return this.f342914a.toByteArray();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
