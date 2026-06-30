package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f136517b;

    public y10(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, boolean z17) {
        this.f136516a = f50Var;
        this.f136517b = z17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            androidx.appcompat.app.AppCompatActivity context = this.f136516a.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_red_dot", this.f136517b ? 1 : 0);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "post_video", 0, jSONObject, false, null, 48, null);
        }
    }
}
