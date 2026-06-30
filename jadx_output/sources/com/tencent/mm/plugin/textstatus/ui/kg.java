package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class kg extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity f174040d;

    public kg(com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity textStatusSquareActivity) {
        this.f174040d = textStatusSquareActivity;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity textStatusSquareActivity = this.f174040d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusSquareActivity.f173700e;
        if (i17 == ((wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) ? 1 : adapter.getItemCount()) - 1) {
            outRect.bottom = i65.a.b(textStatusSquareActivity, 16);
        } else {
            outRect.bottom = i65.a.b(textStatusSquareActivity, 8);
        }
    }
}
