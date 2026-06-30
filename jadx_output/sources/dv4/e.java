package dv4;

/* loaded from: classes.dex */
public class e implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv4.f f244003d;

    public e(dv4.f fVar) {
        this.f244003d = fVar;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        dv4.j jVar;
        dv4.a aVar = (dv4.a) vVar.f351157b.f351070m;
        if (aVar == null || (jVar = (dv4.j) ((java.util.HashMap) this.f244003d.f244005b).remove(aVar)) == null) {
            return;
        }
        int i17 = vVar.f351158c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            aVar.a(java.util.Collections.emptyList());
        } else if (i17 == 0) {
            java.util.List list = vVar.f351160e;
            if (list == null || list.size() == 0) {
                com.tencent.mars.xlog.Log.i("FTSMatchContact", "local contact search size 0");
                com.tencent.mm.plugin.websearch.k0 k0Var = (com.tencent.mm.plugin.websearch.k0) jVar;
                com.tencent.mm.plugin.websearch.q0 q0Var = k0Var.f181555d;
                q0Var.d(q0Var.f181602r, k0Var.f181552a, k0Var.f181553b, k0Var.f181554c);
                return;
            }
            aVar.a(vVar.f351160e);
        }
        com.tencent.mm.plugin.websearch.k0 k0Var2 = (com.tencent.mm.plugin.websearch.k0) jVar;
        com.tencent.mm.plugin.websearch.q0 q0Var2 = k0Var2.f181555d;
        q0Var2.d(q0Var2.f181602r, k0Var2.f181552a, k0Var2.f181553b, k0Var2.f181554c);
    }
}
