package cq4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f221488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f221489g;

    public v(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView, long j17, long j18, boolean z17) {
        this.f221486d = vLogThumbView;
        this.f221487e = j17;
        this.f221488f = j18;
        this.f221489g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221486d;
        int width = vLogThumbView.getWidth();
        int height = (vLogThumbView.getRecyclerView().getHeight() - vLogThumbView.getRecyclerView().getPaddingTop()) - vLogThumbView.getRecyclerView().getPaddingBottom();
        if (width <= 0 || height <= 0) {
            vLogThumbView.getRecyclerView().post(vLogThumbView.f176144r);
            return;
        }
        float f17 = (height * 1.0f) / vLogThumbView.f176132J;
        float f18 = width / (vLogThumbView.K * f17);
        long j17 = this.f221487e;
        float f19 = ((float) j17) / 1000.0f < f18 ? ((float) j17) / f18 : 1000.0f;
        vLogThumbView.f176137h = 0;
        for (kp4.a aVar : vLogThumbView.C) {
            if (aVar.f311077g.isEmpty() && (aVar instanceof kp4.c1)) {
                aVar.f311076f = (((float) (aVar.f311075e - aVar.f311074d)) / f19) / ((kp4.c1) aVar).f311097n.f175627l.f397506h;
                aVar.f();
            }
            vLogThumbView.f176137h += (int) (aVar.f311076f * aVar.f311071a * f17);
        }
        vLogThumbView.f176143q = (vLogThumbView.f176137h * 1.0f) / ((float) (vLogThumbView.f176139m - vLogThumbView.f176138i));
        kp4.c1 c1Var = vLogThumbView.f176145s;
        int i17 = width / 2;
        android.view.ViewGroup.LayoutParams layoutParams = vLogThumbView.getRecyclerView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        c1Var.f311073c = i17 - ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        vLogThumbView.f176146t.f311073c = i17;
        if (!kotlin.jvm.internal.o.b(kz5.n0.a0(vLogThumbView.C, 0), vLogThumbView.f176145s)) {
            vLogThumbView.C.add(0, vLogThumbView.f176145s);
            vLogThumbView.C.add(vLogThumbView.f176146t);
        }
        vLogThumbView.f176136g.z(vLogThumbView.C);
        vLogThumbView.f176136g.notifyDataSetChanged();
        vLogThumbView.getRecyclerView().measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        vLogThumbView.B = true;
        long j18 = this.f221488f;
        if (j18 != -1) {
            int i18 = (int) (((float) (j18 - vLogThumbView.f176138i)) * vLogThumbView.f176143q);
            vLogThumbView.f176142p = i18;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = vLogThumbView.f176135f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(-i18));
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        if (this.f221489g) {
            int i19 = vLogThumbView.f176141o;
            vLogThumbView.f176142p = i19;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = vLogThumbView.f176135f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(-i19));
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(linearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager2.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
