package io5;

/* loaded from: classes14.dex */
public final class c implements r90.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io5.e f293531d;

    public c(io5.e eVar) {
        this.f293531d = eVar;
    }

    @Override // r90.j
    public final void onOrientationChange(int i17) {
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (i17 % 90 != 0) {
            i17 = ((i17 + 44) / 90) * 90;
        }
        io5.e eVar = this.f293531d;
        eVar.b();
        eVar.e();
        if (eVar.f293536d != i17) {
            eVar.f293536d = i17;
            fo5.r0 r0Var = ((fo5.o) eVar.f293533a).f265037a;
            r0Var.w();
            fo5.r0.g(r0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device rotate changed to " + i17);
        }
    }
}
