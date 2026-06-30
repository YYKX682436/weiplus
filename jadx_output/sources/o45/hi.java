package o45;

/* loaded from: classes11.dex */
public class hi extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public int f342948b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f342949c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f342951e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f342952f;

    /* renamed from: d, reason: collision with root package name */
    public int f342950d = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f342947a = 7;

    public java.lang.String a() {
        byte[] bArr = this.f342949c;
        return (bArr == null || bArr.length == 0) ? "" : new java.lang.String(bArr, o45.ji.f342972a);
    }

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("synccheck3 err resp buf:");
            sb6.append(bArr == null ? -1 : bArr.length);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSyncCheck", sb6.toString());
            return -1;
        }
        r45.ee5 ee5Var = new r45.ee5();
        ee5Var.parseFrom(bArr);
        this.f342947a = ee5Var.f373361d;
        this.f342948b = ee5Var.f373362e;
        com.tencent.mm.protobuf.g gVar = ee5Var.f373363f;
        this.f342949c = gVar != null ? gVar.g() : null;
        this.f342950d = ee5Var.f373364g;
        com.tencent.mm.protobuf.g gVar2 = ee5Var.f373365h;
        this.f342951e = gVar2 != null ? gVar2.g() : null;
        com.tencent.mm.protobuf.g gVar3 = ee5Var.f373366i;
        this.f342952f = gVar3 != null ? gVar3.g() : null;
        return this.f342948b;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000800;
    }

    @Override // o45.ah
    public int getRetCode() {
        return this.f342948b;
    }

    @Override // o45.ah, o45.yg
    public boolean isRawData() {
        return true;
    }
}
