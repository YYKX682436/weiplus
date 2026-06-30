package yf2;

/* loaded from: classes3.dex */
public final class e1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461684d;

    public e1(yf2.m1 m1Var) {
        this.f461684d = m1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        yf2.m1 m1Var = this.f461684d;
        m1Var.getClass();
        m1Var.f461749n = linkedList;
        yf2.t tVar = m1Var.f461751p;
        kz5.h0.B(tVar.f461787a, yf2.s.f461780d);
        java.util.Iterator it = ((java.util.ArrayList) tVar.f461787a).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.tencent.mm.plugin.finder.live.widget.z60 z60Var = (com.tencent.mm.plugin.finder.live.widget.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onModeInfoListChanged: size=");
                sb6.append(linkedList != null ? linkedList.size() : 0);
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                java.util.List i17 = z60Var.i(linkedList);
                z60Var.f120544r = i17;
                com.tencent.mm.plugin.finder.live.widget.b60 b60Var = z60Var.f120540n;
                if (b60Var == null) {
                    kotlin.jvm.internal.o.o("tabAdapter");
                    throw null;
                }
                b60Var.f117841e = i17;
                b60Var.notifyDataSetChanged();
                android.widget.LinearLayout linearLayout = z60Var.f120539m;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("contentContainer");
                    throw null;
                }
                linearLayout.removeAllViews();
                z60Var.f();
                z60Var.e();
                z60Var.q();
            }
        }
        return jz5.f0.f302826a;
    }
}
