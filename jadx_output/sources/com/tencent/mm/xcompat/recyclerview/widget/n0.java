package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214587d;

    public n0(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214587d = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214587d;
        if (!recyclerView.A || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.f214420y) {
            recyclerView.requestLayout();
        } else if (recyclerView.D) {
            recyclerView.C = true;
        } else {
            recyclerView.n();
        }
    }
}
