package w32;

/* loaded from: classes13.dex */
public class i extends com.tencent.mm.plugin.exdevice.model.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.h f442680d;

    public i(int i17) {
        this.f442680d = new i32.h(i17);
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.h hVar = this.f442680d;
        if (a17.g(hVar.f288119a)) {
            return new w32.a(hVar, dVar).b(n0Var);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.MMSwitchBackGroudTaskExcuter", "push switch backgroud event to device before it do auth, device id = %d", java.lang.Long.valueOf(hVar.f288119a));
        return true;
    }
}
