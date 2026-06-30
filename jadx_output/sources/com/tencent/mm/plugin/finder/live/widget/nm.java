package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nm implements tg2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119193a;

    public nm(com.tencent.mm.plugin.finder.live.widget.wm wmVar) {
        this.f119193a = wmVar;
    }

    @Override // tg2.h
    public void a(java.lang.String giftId, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f119193a;
        com.tencent.mars.xlog.Log.i(wmVar.f120208f, "on gift batch send, giftId: " + giftId + ", batchNum: " + i17);
        vg2.y1 y1Var = wmVar.f120221v;
        if (y1Var != null) {
            y1Var.f436626e.dismiss();
        }
        android.content.Context context = wmVar.f120206d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (wmVar.k(context, i17, giftId)) {
            com.tencent.mm.plugin.finder.live.widget.wm.m(this.f119193a, null, giftId, i17, 1, null);
        }
    }

    @Override // tg2.h
    public void b(android.view.ViewGroup view, java.lang.String giftId, boolean z17, ce2.i iVar, boolean z18) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void c(android.view.ViewGroup view, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void e(android.view.ViewGroup view, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void f(android.view.ViewGroup view, ce2.i giftInfo) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
    }
}
