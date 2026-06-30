package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class q3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124692b;

    public q3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var) {
        this.f124691a = s4Var;
        this.f124692b = m3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.y2 y2Var = ml2.y2.f328266v;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 1);
            gVar.h("noticeid", this.f124692b.f124624a.getString(4));
            ((ml2.j0) zbVar).Ij(y2Var, gVar.toString(), "", this.f124691a.E);
        }
    }
}
