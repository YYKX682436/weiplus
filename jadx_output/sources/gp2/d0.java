package gp2;

/* loaded from: classes10.dex */
public final class d0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274211d;

    public d0(gp2.l0 l0Var) {
        this.f274211d = l0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        gp2.l0 l0Var = this.f274211d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "onScrollStateChanged newState:" + i17);
        gp2.q0 q0Var = l0Var.f274266y;
        if (q0Var != null) {
            if (i17 == 0) {
                if (!q0Var.f274303n && q0Var.f274302m) {
                    q0Var.f274299g.invoke(java.lang.Integer.valueOf(q0Var.f274300h));
                }
                if (q0Var.f274304o && q0Var.f274305p != null && q0Var.f274297e) {
                    pm0.v.K(null, new gp2.p0(q0Var));
                }
                q0Var.f274303n = false;
            } else if (i17 == 1) {
                q0Var.f274304o = true;
            } else if (i17 == 2) {
                q0Var.f274303n = true;
            }
        }
        if (i17 == 0) {
            l0Var.g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        gp2.l0 l0Var = this.f274211d;
        l0Var.j();
        gp2.q0 q0Var = l0Var.f274266y;
        if (q0Var != null) {
            if (q0Var.f274302m) {
                com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for isInvokeAutoPlayCallback");
            } else if (q0Var.f274300h < 0) {
                com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for onTouchPos:" + q0Var.f274300h);
            } else {
                if (q0Var.f274301i == 0) {
                    q0Var.f274301i = i18;
                }
                if (java.lang.Math.abs(i18 - q0Var.f274301i) > 1) {
                    com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled hit auto play pos:" + q0Var.f274300h + " (" + q0Var.f274301i + ", " + i18 + ')');
                    q0Var.f274298f.invoke(java.lang.Integer.valueOf(q0Var.f274300h));
                    q0Var.f274302m = true;
                } else {
                    com.tencent.mars.xlog.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled auto play pos:" + q0Var.f274300h + " (" + q0Var.f274301i + ", " + i18 + " move:" + java.lang.Math.abs(i18 - q0Var.f274301i) + " threshold:1");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
