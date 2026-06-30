package cq4;

/* loaded from: classes10.dex */
public final class o extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221481d;

    public o(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView) {
        this.f221481d = vLogThumbView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onScrollStateChanged: " + i17);
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221481d;
        if (i17 == 0) {
            if (vLogThumbView.A) {
                vLogThumbView.f176140n = true;
                bp4.c0 c0Var = vLogThumbView.f176151y;
                if (c0Var != null) {
                    c0Var.resume();
                }
                vLogThumbView.A = false;
            }
            vLogThumbView.I = false;
        } else if (i17 == 1) {
            if (!vLogThumbView.I) {
                vLogThumbView.setScrollCount(vLogThumbView.getScrollCount() + 1);
            }
            vLogThumbView.I = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int i19;
        bp4.c0 c0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221481d;
        boolean z17 = vLogThumbView.B;
        if (z17) {
            vLogThumbView.f176142p += i17;
        }
        int i27 = vLogThumbView.f176142p;
        if (!vLogThumbView.f176140n && z17 && (i19 = vLogThumbView.f176137h) > 0 && i17 != 0 && (c0Var = vLogThumbView.f176151y) != null) {
            long j17 = vLogThumbView.f176139m;
            long j18 = vLogThumbView.f176138i;
            bp4.c0.m(c0Var, (((j17 - j18) * i27) / i19) + j18, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
