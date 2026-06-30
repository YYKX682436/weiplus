package o45;

/* loaded from: classes12.dex */
public class fi extends o45.zg implements o45.xg {

    /* renamed from: b, reason: collision with root package name */
    public int f342927b;

    /* renamed from: c, reason: collision with root package name */
    public int f342928c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f342930e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f342931f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f342932g;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f342926a = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public long f342929d = 0;

    @Override // o45.zg
    public int getCmdId() {
        return 800;
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

    @Override // o45.zg
    public void setClientVersion(int i17) {
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        byte[] bArr = this.f342926a;
        if (bArr != null) {
            int length = bArr.length;
        }
        long j17 = this.f342929d;
        if (j17 == 0) {
            return new byte[0];
        }
        int i17 = (int) (io.flutter.embedding.android.KeyboardMap.kValueMask & j17);
        int i18 = (int) (j17 >> 32);
        int i19 = ((i17 >>> 13) | (i18 << 19)) ^ 1442968193;
        int i27 = ((i18 >>> 13) | (i17 << 19)) ^ 1442968193;
        r45.de5 de5Var = new r45.de5();
        de5Var.f372354d = i19;
        de5Var.f372355e = i27;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(this.f342926a)) {
            de5Var.f372356f = com.tencent.mm.protobuf.g.b(this.f342926a);
        }
        de5Var.f372357g = o45.wf.f343029g;
        de5Var.f372358h = com.tencent.mm.sdk.platformtools.m2.d();
        de5Var.f372359i = 2;
        de5Var.f372360m = this.f342927b;
        de5Var.f372361n = this.f342928c;
        byte[] bArr2 = this.f342931f;
        if (bArr2 != null && bArr2.length == 32) {
            de5Var.f372362o = com.tencent.mm.protobuf.g.b(bArr2);
        }
        byte[] bArr3 = this.f342932g;
        if (bArr3 != null && bArr3.length > 0) {
            de5Var.f372363p = com.tencent.mm.protobuf.g.b(bArr3);
        }
        byte[] byteArray = de5Var.toByteArray();
        this.f342930e = kk.k.h(byteArray);
        return byteArray;
    }
}
