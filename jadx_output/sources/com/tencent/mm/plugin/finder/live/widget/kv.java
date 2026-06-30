package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kv extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sv f118858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f118859b;

    public kv(com.tencent.mm.plugin.finder.live.widget.sv svVar, r45.h84 h84Var) {
        this.f118858a = svVar;
        this.f118859b = h84Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.sv svVar = this.f118858a;
            r45.h84 h84Var = this.f118859b;
            com.tencent.mm.plugin.finder.live.widget.sv.b(svVar, 3, h84Var.getString(0), h84Var.getString(1), 0L, 8, null);
        }
    }
}
