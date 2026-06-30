package qp1;

/* loaded from: classes10.dex */
public class z implements i4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv.i0 f365758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365759b;

    public z(pv.i0 i0Var, int i17) {
        this.f365758a = i0Var;
        this.f365759b = i17;
    }

    @Override // i4.h
    public void a(i4.j jVar) {
        int i17 = this.f365759b;
        pv.i0 i0Var = this.f365758a;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated fail");
            ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w0) i0Var).a(i17);
            return;
        }
        i4.i iVar = jVar.f288359d;
        if (iVar != null) {
            ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w0) i0Var).a(iVar.f288349d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated but swatch is null");
            ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w0) i0Var).a(i17);
        }
    }
}
