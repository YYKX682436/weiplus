package yf2;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f461787a = new java.util.ArrayList();

    public final void a(r45.q12 q12Var) {
        java.util.List list = this.f461787a;
        kz5.h0.B(list, yf2.s.f461780d);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.tencent.mm.plugin.finder.live.widget.z60 z60Var = (com.tencent.mm.plugin.finder.live.widget.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveModeInfoChanged: mode=");
                sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.getInteger(0)) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                if (q12Var != null) {
                    z60Var.p();
                    z60Var.q();
                    com.tencent.mm.plugin.finder.live.widget.b60 b60Var = z60Var.f120540n;
                    if (b60Var == null) {
                        kotlin.jvm.internal.o.o("tabAdapter");
                        throw null;
                    }
                    b60Var.notifyDataSetChanged();
                } else {
                    continue;
                }
            }
        }
    }
}
