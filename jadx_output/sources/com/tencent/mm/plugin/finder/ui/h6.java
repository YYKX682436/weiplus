package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.o6 f129317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f129318e;

    public h6(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f129317d = o6Var;
        this.f129318e = linearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.o6 o6Var = this.f129317d;
        androidx.recyclerview.widget.RecyclerView recyclerView = o6Var.f129576k;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        o6Var.o(recyclerView, this.f129318e, 1, true);
        o6Var.f129580o = null;
    }
}
