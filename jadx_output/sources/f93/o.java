package f93;

/* loaded from: classes3.dex */
public final class o extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f260404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f260405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260406f;

    public o(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog) {
        this.f260406f = absLabelUserDialog;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f260404d = paint;
        this.f260405e = 1;
        paint.setColor(i65.a.d(absLabelUserDialog.getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_1));
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            int u07 = parent.u0(childAt);
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            if (!(adapter != null && adapter.getItemViewType(u07) == 1)) {
                androidx.recyclerview.widget.f2 adapter2 = parent.getAdapter();
                if (!(adapter2 != null && adapter2.getItemViewType(u07) == 3)) {
                    androidx.recyclerview.widget.f2 adapter3 = parent.getAdapter();
                    if (!(adapter3 != null && adapter3.getItemViewType(u07) == 4)) {
                        androidx.recyclerview.widget.f2 adapter4 = parent.getAdapter();
                        if (!(adapter4 != null && adapter4.getItemViewType(u07) == 6)) {
                            int bottom = childAt.getBottom() - this.f260405e;
                            androidx.recyclerview.widget.f2 adapter5 = parent.getAdapter();
                            boolean z17 = adapter5 != null && adapter5.getItemViewType(u07) == 2;
                            com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog = this.f260406f;
                            c17.drawRect(parent.getPaddingLeft() + (z17 ? i65.a.h(absLabelUserDialog.getContext(), com.tencent.mm.R.dimen.f479688cn) : i65.a.h(absLabelUserDialog.getContext(), com.tencent.mm.R.dimen.f479732dp)), bottom, parent.getWidth() - parent.getPaddingRight(), childAt.getBottom(), this.f260404d);
                        }
                    }
                }
            }
        }
    }
}
