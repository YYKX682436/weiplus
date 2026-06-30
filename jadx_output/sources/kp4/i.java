package kp4;

/* loaded from: classes2.dex */
public final class i extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int b17 = i65.a.b(parent.getContext(), 8);
        int u07 = parent.u0(view);
        boolean z17 = true;
        if (u07 != 0) {
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            kotlin.jvm.internal.o.d(adapter);
            if (u07 != adapter.getItemCount() - 1) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        int i17 = -b17;
        outRect.left = i17;
        outRect.right = i17;
    }
}
