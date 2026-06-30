package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class g extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.i f151828a;

    public g(com.tencent.mm.plugin.mv.ui.view.i iVar) {
        this.f151828a = iVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.mv.ui.view.i iVar = this.f151828a;
        if (iVar.f151864m != -1 || (recyclerView = iVar.f151859h) == null) {
            return;
        }
        recyclerView.post(new com.tencent.mm.plugin.mv.ui.view.e(iVar));
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.mv.ui.view.i iVar = this.f151828a;
        if (iVar.f151864m != -1 || (recyclerView = iVar.f151859h) == null) {
            return;
        }
        recyclerView.post(new com.tencent.mm.plugin.mv.ui.view.f(iVar));
    }
}
