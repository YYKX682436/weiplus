package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135641b;

    public q(in5.s0 s0Var, java.lang.String str) {
        this.f135640a = s0Var;
        this.f135641b = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            in5.s0 s0Var = this.f135640a;
            java.lang.String username = ((com.tencent.mm.plugin.finder.viewmodel.component.t) s0Var.f293125i).f135948d.getUsername();
            if (username == null) {
                username = "";
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            pm0.v.K(null, new com.tencent.mm.plugin.finder.viewmodel.component.p(username, nyVar != null ? nyVar.V6() : null, this.f135641b));
        }
    }
}
