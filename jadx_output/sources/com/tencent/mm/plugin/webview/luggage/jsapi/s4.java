package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class s4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f182456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.z4 f182457e;

    public s4(com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var, org.json.JSONArray jSONArray) {
        this.f182457e = z4Var;
        this.f182456d = jSONArray;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.luggage.jsapi.z4 z4Var = this.f182457e;
        g4Var.h(1, z4Var.f182540f.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, z4Var.f182540f.getResources().getColor(com.tencent.mm.R.color.f478502m));
        g4Var.h(2, z4Var.f182540f.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
        z4Var.f182541g.j(this.f182456d, g4Var, z4Var.f182540f);
    }
}
