package xn2;

/* loaded from: classes2.dex */
public final class v implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f455582e;

    public v(xn2.p0 p0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f455581d = p0Var;
        this.f455582e = recyclerView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        boolean z17 = j5Var instanceof zn2.a;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f455582e;
        xn2.p0 p0Var = this.f455581d;
        if (z17) {
            zn2.a aVar = (zn2.a) j5Var;
            p0Var.o(aVar, i17);
            android.content.Context context = recyclerView.getContext();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = aVar.getFeedObject();
            java.lang.String str = aVar.f474488i;
            boolean h17 = p0Var.h();
            xn2.p0 p0Var2 = this.f455581d;
            kotlin.jvm.internal.o.d(context);
            p0Var2.n(1, context, holder, feedObject, i17, str, h17);
            return;
        }
        if (!(j5Var instanceof zn2.c)) {
            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "click position=" + i17 + " feed:" + j5Var);
            return;
        }
        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "click position=" + i17 + ",finderContextId=" + p0Var.f455544b + ",SeeLaterCardFeed:" + j5Var);
        android.content.Context context2 = recyclerView.getContext();
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = ((zn2.c) j5Var).getFeedObject();
        int i18 = qg3.g1.f362820d;
        java.lang.String UR_BC6E = urgen.ur_54A4.UR_6075.UR_BC6E();
        xn2.p0 p0Var3 = this.f455581d;
        kotlin.jvm.internal.o.d(context2);
        p0Var3.n(3, context2, holder, feedObject2, i17, UR_BC6E, false);
    }
}
