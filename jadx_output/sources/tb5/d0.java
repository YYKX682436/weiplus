package tb5;

@yn.c(exportInterface = tb5.n0.class)
/* loaded from: classes9.dex */
public final class d0 extends com.tencent.mm.ui.chatting.component.a implements tb5.n0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f417042e;

    /* renamed from: f, reason: collision with root package name */
    public tb5.a0 f417043f = new tb5.a0();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        this.f417043f.f417028c = c01.id.c();
        tb5.a0 a0Var = this.f417043f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitorComponent", "initMs:" + a0Var.f417026a + ",onListFirstLayout:" + a0Var.f417027b + ",exitAnimEndMs:" + a0Var.f417028c + ",cost:" + java.lang.Math.max(a0Var.f417027b - a0Var.f417026a, 0L) + "ms,loadingHasShow:" + a0Var.f417030e + ",stage:" + kz5.n0.g0(kz5.e1.v(tb5.f0.b(a0Var.f417029d)), null, null, null, 0, null, tb5.z.f417107d, 31, null));
        boolean z17 = c06.e.f37716d.d(1000) == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitorComponent", "hitSampling: " + z17);
        if (z17 || this.f417043f.f417030e) {
            tb5.a0 a0Var2 = this.f417043f;
            java.util.Map l17 = kz5.c1.l(new jz5.l("initMs", java.lang.Long.valueOf(a0Var2.f417026a)), new jz5.l("firstFrameShowMs", java.lang.Long.valueOf(a0Var2.f417027b)), new jz5.l("exitAnimEndMs", java.lang.Long.valueOf(a0Var2.f417028c)), new jz5.l("cost", java.lang.Long.valueOf(java.lang.Math.max(a0Var2.f417027b - a0Var2.f417026a, 0L))), new jz5.l("loadingHasShow", java.lang.Boolean.valueOf(a0Var2.f417030e)));
            l17.putAll(tb5.f0.b(a0Var2.f417029d));
            java.lang.String G1 = com.tencent.mm.sdk.platformtools.t8.G1(this.f198580d.x());
            kotlin.jvm.internal.o.f(G1, "secPrint(...)");
            l17.put("talker", G1);
            km.a.a("chatting_msg_load_rpt", l17);
        }
    }

    @Override // yn.d
    public void S(xm3.o0 o0Var) {
        if (this.f417042e) {
            return;
        }
        this.f417042e = true;
        this.f198580d.f460710e.a0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        tb5.a0 a0Var = new tb5.a0();
        this.f417043f = a0Var;
        a0Var.f417026a = c01.id.c();
        this.f417042e = false;
    }

    @Override // yn.d
    public void a0() {
        m0("onFirstDataLoadFinsih", hd5.n.ACTION_ENTER);
    }

    @Override // yn.d
    public void e0() {
        this.f417043f.f417027b = c01.id.c();
        m0("onListFirstLayout", hd5.n.ACTION_ENTER);
    }

    public void m0(java.lang.String stage, hd5.n nVar) {
        kotlin.jvm.internal.o.g(stage, "stage");
        if (nVar != hd5.n.ACTION_ENTER) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitorComponent", "recordMsgLoad[" + stage + ']');
        this.f417043f.f417029d.put(stage, java.lang.Long.valueOf(c01.id.c()));
    }
}
