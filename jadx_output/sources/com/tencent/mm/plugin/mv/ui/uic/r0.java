package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t0 f151393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f151396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f151397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f151398i;

    public r0(com.tencent.mm.plugin.mv.ui.uic.t0 t0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, org.json.JSONObject jSONObject3) {
        this.f151393d = t0Var;
        this.f151394e = jSONObject;
        this.f151395f = jSONObject2;
        this.f151396g = jSONArray;
        this.f151397h = jSONArray2;
        this.f151398i = jSONObject3;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 1201) {
            com.tencent.mm.vfs.w6.f(gm0.j1.u().d() + "music/cover/");
            com.tencent.mm.plugin.mv.ui.uic.t0 t0Var = this.f151393d;
            t0Var.getActivity().finish();
            dp.a.makeText(t0Var.getActivity(), com.tencent.mm.R.string.f490355sn, 0).show();
            return;
        }
        if (itemId != 1202) {
            return;
        }
        java.lang.String str = "music_mv_info_" + k35.m1.d("yyyy-MM-dd_HH_mm_ss", java.lang.System.currentTimeMillis() / 1000) + ".json";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("songInfoText", this.f151394e);
            jSONObject.put("mvHeadInfoText", this.f151395f);
            jSONObject.put("mvTrackInfoText", this.f151396g);
            jSONObject.put("mvRefObjInfoText", this.f151397h);
            jSONObject.put("cgiInfo", this.f151398i);
        } finally {
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(str, bytes, true);
        }
    }
}
