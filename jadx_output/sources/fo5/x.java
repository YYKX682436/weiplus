package fo5;

/* loaded from: classes14.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.m implements yz5.a {
    public x(java.lang.Object obj) {
        super(0, obj, fo5.r0.class, "quickConnectTTSComplete", "quickConnectTTSComplete()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fo5.r0 r0Var = (fo5.r0) this.receiver;
        if (r0Var.r()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startRingAfterQuickConnectTTS() called with: username = ");
            er4.x xVar = r0Var.f265085d;
            sb6.append(xVar != null ? xVar.getName() : null);
            sb6.append(", roomRole = ");
            sb6.append(r0Var.f265084c);
            sb6.append(", roomType = ");
            sb6.append(r0Var.f265083b);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
            r0Var.f265102u = true;
            r0Var.v();
        }
        return jz5.f0.f302826a;
    }
}
