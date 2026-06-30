package tl;

/* loaded from: classes12.dex */
public class l0 implements com.tencent.mm.modelbase.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f420059a;

    public l0(tl.p0 p0Var) {
        this.f420059a = p0Var;
    }

    @Override // com.tencent.mm.modelbase.e1
    public void a() {
        tl.p0 p0Var = this.f420059a;
        p0Var.l();
        com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Record Failed file:" + p0Var.f420072e);
        if (!p0Var.m() || p0Var.f420073f == null) {
            w21.x0.b(p0Var.f420072e);
        } else {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(p0Var.f420073f);
        }
        com.tencent.mm.modelbase.e1 e1Var = p0Var.f420086s;
        if (e1Var != null) {
            e1Var.a();
        }
    }
}
