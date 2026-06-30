package vd2;

/* loaded from: classes3.dex */
public final class b2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.n f435661d;

    /* renamed from: e, reason: collision with root package name */
    public final vd2.t1 f435662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f435663f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f435664g;

    public b2(android.content.Context context, km2.n liveDataModel, vd2.t1 presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveDataModel, "liveDataModel");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f435661d = liveDataModel;
        this.f435662e = presenter;
        this.f435663f = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aog);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488832e80, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f435664g = inflate;
    }

    public final int d() {
        vd2.a2 a2Var = ((vd2.v2) this.f435662e).f435944f;
        if (!(a2Var != null && a2Var.d())) {
            return -1;
        }
        java.util.ArrayList arrayList = this.f435661d.f309153e;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            km2.m mVar = ((km2.t) listIterator.previous()).f309222d;
            if (mVar != null && mVar.f309136n) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 == -1) {
            return;
        }
        int d17 = d();
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        if (d17 >= 0 && u07 == d17) {
            outRect.bottom = this.f435663f;
        } else {
            int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
            outRect.bottom = com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int d17 = d();
        if (d17 < 0 || parent.getChildCount() == 0) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (parent.u0(parent.getChildAt(i17)) == d17) {
                vd2.a2 a2Var = ((vd2.v2) this.f435662e).f435944f;
                java.lang.String b17 = (a2Var == null || (finderLiveRelatedBaseLoader = a2Var.f435648f) == null) ? null : finderLiveRelatedBaseLoader.b();
                android.view.View view = this.f435664g;
                if (b17 != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gc8)) != null) {
                    textView.setText(b17);
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
                int i18 = this.f435663f;
                view.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                view.layout(0, 0, parent.getWidth(), i18);
                c17.save();
                c17.translate(0.0f, r3.getBottom());
                view.draw(c17);
                c17.restore();
                return;
            }
        }
    }
}
