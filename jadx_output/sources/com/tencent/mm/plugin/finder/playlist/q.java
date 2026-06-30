package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class q extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122404a;

    public q(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        this.f122404a = l0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.playlist.l0.y(this.f122404a, this.f122404a.w() ? "paid_collection_menu_button" : "collection_list_menu_button", false, null, 6, null);
        }
    }
}
