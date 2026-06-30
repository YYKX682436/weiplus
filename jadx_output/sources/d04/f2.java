package d04;

/* loaded from: classes8.dex */
public final class f2 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 == 0) {
            outRect.left = 0;
            outRect.right = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.C;
            return;
        }
        if (u07 == 1) {
            outRect.left = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.B;
            outRect.right = 0;
            return;
        }
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (u07 == (adapter != null ? adapter.getItemCount() : 0) - 1) {
            outRect.left = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.C;
            outRect.right = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.B;
        } else {
            int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.B;
            outRect.left = i17;
            outRect.right = i17;
        }
    }
}
