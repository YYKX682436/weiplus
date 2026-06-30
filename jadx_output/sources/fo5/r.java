package fo5;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fo5.r0 r0Var) {
        super(0);
        this.f265081d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "flipCamera");
        fo5.r0 r0Var = this.f265081d;
        if (r0Var.p()) {
            if (r0Var.t()) {
                r0Var.l();
            } else {
                ro5.b bVar = r0Var.f265097p;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("renderController");
                    throw null;
                }
                int i17 = bVar.b() ? 9 : 10;
                long j17 = r0Var.f265105x;
                long j18 = r0Var.f265106y;
                long j19 = r0Var.f265083b.f256166d;
                boolean z17 = r0Var.f265107z;
                long j27 = r0Var.f265104w;
                com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct voipButtonStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct();
                voipButtonStatusStruct.f61704d = j17;
                voipButtonStatusStruct.f61705e = j18;
                voipButtonStatusStruct.f61706f = j19 == 0 ? 1L : 2L;
                voipButtonStatusStruct.p(java.lang.String.valueOf(i17));
                voipButtonStatusStruct.f61707g = z17 ? 1L : 2L;
                voipButtonStatusStruct.f61710j = j27;
                voipButtonStatusStruct.f61709i = java.lang.System.currentTimeMillis();
                voipButtonStatusStruct.q("");
                voipButtonStatusStruct.k();
            }
        }
        r0Var.w();
        r0Var.i();
        r0Var.h();
        return jz5.f0.f302826a;
    }
}
