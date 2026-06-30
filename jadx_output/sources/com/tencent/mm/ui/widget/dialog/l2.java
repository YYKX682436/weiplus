package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public class l2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.MMFilterDialog f211920e;

    public l2(com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog, int i17) {
        this.f211920e = mMFilterDialog;
        this.f211919d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        if (recyclerView.v0(view) != 0) {
            com.tencent.mm.ui.widget.dialog.y2 y2Var = this.f211920e.f211699o;
            if (y2Var == com.tencent.mm.ui.widget.dialog.y2.Border || y2Var == com.tencent.mm.ui.widget.dialog.y2.Grey) {
                rect.left = this.f211919d;
            }
        }
    }
}
