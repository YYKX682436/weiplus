package w32;

/* loaded from: classes13.dex */
public class f extends com.tencent.mm.plugin.exdevice.model.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.f f442676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442677e;

    public f(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f442676d = new i32.f(j17, i18, i19, bArr);
        this.f442677e = i17;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.f fVar = this.f442676d;
        if (!a17.g(fVar.f288119a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", java.lang.Long.valueOf(fVar.f288119a));
            this.f442676d.e(-2, "", new byte[0], new byte[0], 0, 0);
            boolean b17 = new w32.a(fVar, dVar).b(n0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b17));
            return b17;
        }
        int i17 = this.f442677e;
        if (-5 == i17 || -3 == i17 || -4 == i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", java.lang.Integer.valueOf(i17));
            this.f442676d.e(-1, "", new byte[0], new byte[0], 0, 0);
            boolean b18 = new w32.a(fVar, dVar).b(n0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b18));
            return b18;
        }
        o32.f fVar2 = (o32.f) fVar.f288123e;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
            this.f442676d.e(-4, "", new byte[0], new byte[0], 0, 0);
            boolean b19 = new w32.a(fVar, dVar).b(n0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b19));
            return b19;
        }
        com.tencent.mm.protobuf.g gVar = fVar2.f342697f;
        byte[] g17 = gVar != null ? gVar.g() : null;
        com.tencent.mm.protobuf.g gVar2 = fVar2.f342696e;
        byte[] g18 = gVar2 != null ? gVar2.g() : null;
        com.tencent.mm.plugin.exdevice.model.l3.Bi().getClass();
        int i18 = com.tencent.mm.plugin.exdevice.model.d0.f98864g;
        if (i18 != 1 && i18 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", java.lang.Integer.valueOf(i18));
        }
        this.f442676d.e(0, null, g18, g17, i18, (int) (a42.i.e() / 1000));
        return new w32.a(fVar, dVar).b(n0Var);
    }
}
