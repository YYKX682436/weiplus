package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class i extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f201823d;

    public i(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f201823d = appAttachNewDownloadUI;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.right = (int) this.f201823d.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
    }
}
