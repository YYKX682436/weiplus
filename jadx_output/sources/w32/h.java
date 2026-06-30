package w32;

/* loaded from: classes13.dex */
public class h extends com.tencent.mm.plugin.exdevice.model.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.g f442679d;

    public h(i32.g gVar) {
        this.f442679d = gVar;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        boolean b17 = new w32.a(this.f442679d, dVar).b(n0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", java.lang.Boolean.valueOf(b17));
        return b17;
    }
}
