package w32;

/* loaded from: classes13.dex */
public class g extends com.tencent.mm.plugin.exdevice.model.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.d f442678d;

    public g(byte[] bArr, int i17, long j17) {
        this.f442678d = new i32.j(bArr, i17, j17);
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.d dVar2 = this.f442678d;
        if (a17.g(dVar2.f288119a)) {
            return new w32.a(dVar2, dVar).b(n0Var);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", java.lang.Long.valueOf(dVar2.f288119a));
        return true;
    }
}
