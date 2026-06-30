package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f120313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f120314b;

    public xd(com.tencent.mm.plugin.finder.live.widget.fe feVar, r45.h84 h84Var) {
        this.f120313a = feVar;
        this.f120314b = h84Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.fe feVar = this.f120313a;
            r45.h84 h84Var = this.f120314b;
            com.tencent.mm.plugin.finder.live.widget.fe.b(feVar, 3, h84Var.getString(0), h84Var.getString(1), 0L, 8, null);
        }
    }
}
