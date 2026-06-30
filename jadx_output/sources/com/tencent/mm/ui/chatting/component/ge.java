package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class ge extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f199101d;

    public ge(int i17, int i18) {
        this.f199101d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.left = this.f199101d * (recyclerView.u0(view) % 4);
    }
}
