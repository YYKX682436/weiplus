package wr3;

/* loaded from: classes11.dex */
public final class k extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f448825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f448826e;

    public k(android.content.Context context) {
        int round = java.lang.Math.round(es.h.b(context) * 8.0f);
        this.f448825d = round;
        this.f448826e = round / 2;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 >= 0) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(layoutParams2.e());
            if (!(valueOf.intValue() >= 0)) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : u07 % 2;
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView bizProfilePicTabRecyclerView = parent instanceof com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView ? (com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView) parent : null;
            boolean hasTopic = bizProfilePicTabRecyclerView != null ? bizProfilePicTabRecyclerView.getHasTopic() : false;
            if (u07 == 0 && hasTopic) {
                outRect.top = 0;
            } else {
                outRect.top = this.f448825d;
            }
            outRect.bottom = 0;
            int i17 = this.f448826e;
            if (intValue == 0) {
                outRect.right = i17;
            } else {
                outRect.left = i17;
            }
        }
    }
}
