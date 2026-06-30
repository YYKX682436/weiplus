package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class u implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.x f129205d;

    public u(com.tencent.mm.plugin.finder.ui.fav.x xVar) {
        this.f129205d = xVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129205d;
        android.app.Activity context = xVar.f129217a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.viewmodel.component.fd) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class)).f134393d) {
            return false;
        }
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment = xVar.f129218b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        xVar.f129219c.i(adapter, view, i17, holder);
        com.tencent.mm.plugin.finder.report.b6.f124969a.b(V6, "channel_feedcard_moreActionPanel", true, j5Var.getItemId(), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? "" : null);
        return false;
    }
}
