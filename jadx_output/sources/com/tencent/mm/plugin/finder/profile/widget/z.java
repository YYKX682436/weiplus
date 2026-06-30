package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class z extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.d0 f124833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f124835c;

    public z(com.tencent.mm.plugin.finder.profile.widget.d0 d0Var, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f124833a = d0Var;
        this.f124834b = str;
        this.f124835c = h0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.profile.widget.d0.a(this.f124833a, 0, this.f124834b, (java.lang.String) this.f124835c.f310123d);
        }
    }
}
