package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i40 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f134695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f134696c;

    public i40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, boolean z17, boolean z18) {
        this.f134694a = f50Var;
        this.f134695b = z17;
        this.f134696c = z18;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134694a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_red_dot", (!this.f134695b || this.f134696c) ? 0 : 1);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "post_video", 0, jSONObject, false, null, 48, null);
            com.tencent.mm.plugin.finder.report.p2.N(com.tencent.mm.plugin.finder.report.p2.f125237a, f50Var.getContext(), 94, null, 0L, 0, 28, null);
        }
    }
}
