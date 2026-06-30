package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t0 f151372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f151374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f151375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151376i;

    public q0(org.json.JSONObject jSONObject, com.tencent.mm.plugin.mv.ui.uic.t0 t0Var, org.json.JSONObject jSONObject2, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, org.json.JSONObject jSONObject3) {
        this.f151371d = jSONObject;
        this.f151372e = t0Var;
        this.f151373f = jSONObject2;
        this.f151374g = jSONArray;
        this.f151375h = jSONArray2;
        this.f151376i = jSONObject3;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.mv.ui.uic.t0 t0Var = this.f151372e;
        switch (itemId) {
            case 1101:
                com.tencent.mm.sdk.platformtools.b0.e(this.f151371d.toString());
                dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490361st, 0).show();
                return;
            case 1102:
                com.tencent.mm.sdk.platformtools.b0.e(this.f151373f.toString());
                dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490361st, 0).show();
                return;
            case 1103:
                com.tencent.mm.sdk.platformtools.b0.e(this.f151374g.toString());
                dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490361st, 0).show();
                return;
            case 1104:
                com.tencent.mm.sdk.platformtools.b0.e(this.f151375h.toString());
                dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490361st, 0).show();
                return;
            case 1105:
                com.tencent.mm.sdk.platformtools.b0.e(this.f151376i.toString());
                dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490361st, 0).show();
                return;
            default:
                return;
        }
    }
}
