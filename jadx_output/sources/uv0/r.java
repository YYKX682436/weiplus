package uv0;

/* loaded from: classes5.dex */
public final class r implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431346d;

    public r(uv0.u uVar) {
        this.f431346d = uVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        vv0.j jVar;
        uv0.f adapter;
        kotlin.jvm.internal.o.g(tab, "tab");
        uv0.u uVar = this.f431346d;
        androidx.recyclerview.widget.RecyclerView recyclerView = uVar.R;
        if (!(recyclerView != null && recyclerView.getScrollState() == 0) || (jVar = (vv0.j) kz5.n0.a0(uVar.W, tab.f343782e)) == null) {
            return;
        }
        adapter = uVar.getAdapter();
        java.util.Iterator it = adapter.f275970d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((vv0.k) it.next()).f440388d == jVar.f440382b) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 < 0) {
            return;
        }
        uv0.u.N(uVar, i17);
    }
}
