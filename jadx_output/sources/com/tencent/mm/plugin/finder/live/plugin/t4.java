package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f114338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f114342h;

    public t4(int i17, com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, int i18, int i19, int i27) {
        this.f114338d = i17;
        this.f114339e = a5Var;
        this.f114340f = i18;
        this.f114341g = i19;
        this.f114342h = i27;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f114338d;
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f114339e;
        if (itemId == i18) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 4);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.plugin.finder.live.plugin.a5.y1(a5Var, jSONObject2);
            hf2.x xVar = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar != null) {
                xVar.w7(1, "");
                return;
            }
            return;
        }
        if (itemId == this.f114340f) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", 4);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            com.tencent.mm.plugin.finder.live.plugin.a5.y1(a5Var, jSONObject4);
            hf2.x xVar2 = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar2 != null) {
                xVar2.w7(1, "");
                return;
            }
            return;
        }
        if (itemId == this.f114341g) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("type", 6);
            java.lang.String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            com.tencent.mm.plugin.finder.live.plugin.a5.y1(a5Var, jSONObject6);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = a5Var.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int i19 = a5Var.W;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e((android.app.Activity) context, i19, 1, 28, null);
            return;
        }
        if (itemId == this.f114342h) {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("type", 6);
            java.lang.String jSONObject8 = jSONObject7.toString();
            kotlin.jvm.internal.o.f(jSONObject8, "toString(...)");
            com.tencent.mm.plugin.finder.live.plugin.a5.y1(a5Var, jSONObject8);
            hf2.x xVar3 = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar3 != null) {
                xVar3.w7(2, "");
            }
        }
    }
}
