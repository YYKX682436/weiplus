package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes10.dex */
public final class z5 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a6 f117572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f117573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f117574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117575d;

    public z5(com.tencent.mm.plugin.finder.live.viewmodel.a6 a6Var, long j17, yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        this.f117572a = a6Var;
        this.f117573b = j17;
        this.f117574c = lVar;
        this.f117575d = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("168", this.f117572a.R6(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.f117573b)));
        this.f117574c.invoke(java.lang.Boolean.valueOf(this.f117575d.f310112d));
    }
}
