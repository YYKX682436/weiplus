package w32;

/* loaded from: classes13.dex */
public class e extends com.tencent.mm.plugin.exdevice.model.o3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.c f442671d;

    /* renamed from: e, reason: collision with root package name */
    public w32.a f442672e;

    /* renamed from: f, reason: collision with root package name */
    public u32.n0 f442673f;

    /* renamed from: g, reason: collision with root package name */
    public w32.d f442674g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442675h;

    public e(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f442671d = null;
        this.f442671d = new i32.c(j17, i18, i19, bArr);
        this.f442675h = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r18 != r8.f288119a) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        if (a42.i.c(r9.f192156a, 0, kk.k.h((r10.field_deviceType + r10.field_deviceID).getBytes())) == false) goto L73;
     */
    @Override // com.tencent.mm.plugin.exdevice.model.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(u32.n0 r24, w32.d r25) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w32.e.a(u32.n0, w32.d):boolean");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.n().f273288b.q(541, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.exdevice.model.k2 k2Var = (com.tencent.mm.plugin.exdevice.model.k2) m1Var;
        v32.c Ui = com.tencent.mm.plugin.exdevice.model.l3.Ui();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        i32.c cVar = this.f442671d;
        sb6.append(cVar.f288119a);
        sb6.append("");
        if (Ui.b1(sb6.toString()) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        if (java.lang.System.currentTimeMillis() / 1000 >= r11.f237103v) {
            cVar.e(i18, str, k2Var.H());
            w32.a aVar = new w32.a(cVar, this.f442674g);
            this.f442672e = aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", java.lang.Boolean.valueOf(aVar.b(this.f442673f)));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
        cVar.e(-5, "", new byte[0]);
        w32.a aVar2 = new w32.a(cVar, this.f442674g);
        this.f442672e = aVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", java.lang.Boolean.valueOf(aVar2.b(this.f442673f)));
    }
}
