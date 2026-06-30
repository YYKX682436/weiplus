package ln1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f319725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f319726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f319727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f319728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ln1.g f319729h;

    public c(ln1.g gVar, int i17, byte[] bArr, int i18, long j17) {
        this.f319729h = gVar;
        this.f319725d = i17;
        this.f319726e = bArr;
        this.f319727f = i18;
        this.f319728g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f319729h.f319756a.get() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupCEngine", "sendImp err mode!! seq:%d", java.lang.Integer.valueOf(this.f319725d));
            return;
        }
        if (this.f319729h.f319756a.get() == 1) {
            ln1.g gVar = this.f319729h;
            i17 = com.tencent.mm.lan_cs.Server$Java2C.send(gVar.f319757b, gVar.f319758c, this.f319726e);
        } else if (this.f319729h.f319756a.get() == 2) {
            ln1.g gVar2 = this.f319729h;
            i17 = com.tencent.mm.lan_cs.Client$Java2C.send(gVar2.f319757b, gVar2.f319758c, this.f319726e);
        } else {
            i17 = 0;
        }
        byte[] bArr = this.f319726e;
        sn1.i.H(bArr == null ? -1 : bArr.length);
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(this.f319725d);
        byte[] bArr2 = this.f319726e;
        objArr[2] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : -1);
        objArr[3] = java.lang.Integer.valueOf(this.f319729h.f319756a.get());
        objArr[4] = java.lang.Integer.valueOf(this.f319727f);
        objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f319728g);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], mode[%d], type[%d], time[%d,%d]", objArr);
    }
}
