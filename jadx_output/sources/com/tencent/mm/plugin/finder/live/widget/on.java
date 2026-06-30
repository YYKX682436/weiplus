package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class on implements com.tencent.mm.plugin.finder.live.widget.hd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f119309a;

    public on(com.tencent.mm.plugin.finder.live.widget.zn znVar) {
        this.f119309a = znVar;
    }

    public void a(android.graphics.drawable.Drawable drawable) {
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(drawable, "drawable");
        c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.f119309a;
        gk2.e eVar = znVar.f120599s;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        android.content.Context context = znVar.f120581a.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        int hashCode = activity != null ? activity.hashCode() : 0;
        pg2.j0 j0Var = (pg2.j0) s0Var;
        j0Var.getClass();
        if (j17 == j0Var.f354136d && j0Var.wh()) {
            com.tencent.mm.autogen.events.FinderLiveBgChangeEvent finderLiveBgChangeEvent = new com.tencent.mm.autogen.events.FinderLiveBgChangeEvent();
            am.mb mbVar = finderLiveBgChangeEvent.f54282g;
            mbVar.f7333a = drawable;
            mbVar.f7334b = hashCode;
            finderLiveBgChangeEvent.e();
        }
    }
}
