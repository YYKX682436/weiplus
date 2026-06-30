package i53;

/* loaded from: classes8.dex */
public class y implements i53.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.z f288786b;

    public y(i53.z zVar, java.util.LinkedList linkedList) {
        this.f288786b = zVar;
        this.f288785a = linkedList;
    }

    public void a(boolean z17) {
        i53.z zVar = this.f288786b;
        i53.d3 d3Var = (i53.d3) zVar.f288801h.f288541d.remove(zVar.f288798e.field_taskId);
        if (d3Var != null) {
            d3Var.d();
        }
        if (!z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().L0(zVar.f288798e.field_taskId, 1);
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(zVar.f288798e.field_taskId, 1);
            zVar.f288801h.Bi(zVar.f288798e.field_taskId, -1);
        } else {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().L0(zVar.f288798e.field_taskId, 2);
            i53.d0 d0Var = zVar.f288801h;
            i53.x xVar = zVar.f288798e;
            d0Var.Vi(xVar.field_taskId, xVar.field_publishSource, this.f288785a, xVar.field_BusinessData, xVar.field_sourceSceneId, zVar.f288800g);
        }
    }
}
