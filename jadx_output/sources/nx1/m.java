package nx1;

/* loaded from: classes10.dex */
public final class m extends com.tencent.mm.pluginsdk.model.b3 {

    /* renamed from: y, reason: collision with root package name */
    public ix1.i f341299y;

    /* renamed from: z, reason: collision with root package name */
    public nx1.o f341300z;

    public m(nx1.l lVar) {
    }

    @Override // com.tencent.mm.pluginsdk.model.b3, com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        boolean z17;
        synchronized (nx1.n.f341302s) {
            z17 = !nx1.n.f341301r.containsKey(this.f189224d);
        }
        if (!z17) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str = this.f189224d;
            ((vf0.y1) x1Var).getClass();
            z17 = t21.d3.h(str) == null;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EditorVideoCompress", "remuxing job has been removed, filename %s", this.f189224d);
            return true;
        }
        c();
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.model.b3, com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        synchronized (nx1.n.f341302s) {
            nx1.n.f341301r.remove(this.f189224d);
        }
        nx1.o oVar = this.f341300z;
        if (oVar == null) {
            return false;
        }
        ((com.tencent.mm.plugin.component.editor.o1) oVar).a(this.f189226f, this.f341299y);
        return false;
    }
}
