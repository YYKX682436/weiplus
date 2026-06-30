package w32;

/* loaded from: classes13.dex */
public class j extends com.tencent.mm.plugin.exdevice.model.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.i f442681d;

    public j(int i17, int i18, long j17) {
        this.f442681d = new i32.i(i17, i18, j17);
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.i iVar = this.f442681d;
        if (a17.g(iVar.f288119a)) {
            return new w32.b(iVar, dVar).b(n0Var);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", java.lang.Long.valueOf(iVar.f288119a));
        return true;
    }
}
