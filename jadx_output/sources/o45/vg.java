package o45;

/* loaded from: classes12.dex */
public abstract class vg extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f343016b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f343017c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f343018d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f343019e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f343020f;

    /* renamed from: a, reason: collision with root package name */
    public r45.sr6 f343015a = new r45.sr6();

    /* renamed from: g, reason: collision with root package name */
    public int f343021g = 0;

    public void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f343018d = bArr;
        this.f343019e = bArr2;
        this.f343020f = bArr3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAuth", "summerauths setSession [%s] [%s], [%s]", com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(bArr)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(this.f343019e)), com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(this.f343020f)));
    }

    @Override // o45.ah
    public byte[] getAuthResponse() {
        try {
            return this.f343015a.toByteArray();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // o45.ah
    public byte[] getServerIndexBuffer() {
        try {
            r45.cu5 cu5Var = this.f343015a.f385958n;
            if (cu5Var == null) {
                return null;
            }
            return cu5Var.f371841f.f192156a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
