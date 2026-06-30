package pw0;

/* loaded from: classes5.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f358629d;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(j65.q.a(context).getColor(com.tencent.mm.R.color.ac9, null));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f358629d = paint;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        pw0.i iVar = adapter instanceof pw0.i ? (pw0.i) adapter : null;
        if (iVar == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
        if (parent.getChildCount() == 0 || w17 > y17) {
            return;
        }
        while (true) {
            vv0.n nVar = (vv0.n) kz5.n0.a0(iVar.f275970d, w17);
            boolean z17 = false;
            if (nVar != null && !nVar.f440402e) {
                z17 = true;
            }
            if (!z17) {
                androidx.recyclerview.widget.k3 p07 = parent.p0(w17);
                kotlin.jvm.internal.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.adapter.SegmentAdapter.Holder");
                android.view.View itemView = ((pw0.h) p07).itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                float bottom = itemView.getBottom();
                float left = (itemView.getLeft() + itemView.getRight()) / 2.0f;
                float f17 = 2;
                c17.drawOval(new android.graphics.RectF(left - ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17)), ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4)) + bottom, left + ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17)), bottom + ((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8))), this.f358629d);
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }
}
