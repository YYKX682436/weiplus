package cp2;

/* loaded from: classes2.dex */
public final class f1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220803e;

    public f1(java.util.ArrayList arrayList, cp2.q1 q1Var) {
        this.f220802d = arrayList;
        this.f220803e = q1Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        java.util.ArrayList arrayList = this.f220802d;
        java.lang.Object obj = arrayList.get(i17 - a07);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        if (!z17 || !zl2.q4.f473933a.C((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var)) {
            com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "onItemLongClick return for not live feed.");
        }
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        if (!zl2.q4.f473933a.C(baseFinderFeed)) {
            return true;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.dialog.k0 a17 = r4Var.a1(context, baseFinderFeed, 1001, this.f220803e.a(), new cp2.e1(arrayList, j5Var, adapter, i17));
        if (a17 == null) {
            return true;
        }
        a17.v();
        return true;
    }
}
