package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136036e;

    public tj(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f136035d = view;
        this.f136036e = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        android.view.View view = this.f136035d;
        aVar.pk(view, "person_center_head");
        cy1.a aVar2 = (cy1.a) aVar.ik(view, 40, 25496);
        aVar2.Tj(view, 40, 1, false);
        aVar2.Ai(view, new com.tencent.mm.plugin.finder.viewmodel.component.sj(view, this.f136036e));
    }
}
