package ta1;

/* loaded from: classes7.dex */
public class x implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.y f416693a;

    public x(ta1.y yVar) {
        this.f416693a = yVar;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: start record failed!");
            this.f416693a.f416694d.f416599d.a(i17, i18, str, "");
            return;
        }
        ta1.a0 a0Var = this.f416693a.f416694d;
        ta1.q0 q0Var = a0Var.f416603h;
        q0Var.f416668d = ta1.o0.Running;
        ta1.s0 s0Var = a0Var.f416600e;
        q0Var.f416669e = s0Var.f416677c;
        q0Var.f416670f = s0Var.f416678d;
        ta1.f fVar = (ta1.f) q0Var.f416666b;
        synchronized (fVar) {
            fVar.f416615d = null;
        }
        ta1.a0 a0Var2 = this.f416693a.f416694d;
        ta1.b bVar = a0Var2.f416603h.f416666b;
        ta1.l0 l0Var = a0Var2.f416601f;
        ta1.f fVar2 = (ta1.f) bVar;
        synchronized (fVar2) {
            fVar2.f416615d = l0Var;
        }
        this.f416693a.f416694d.f416599d.a(0, 0, "ok", null);
    }
}
