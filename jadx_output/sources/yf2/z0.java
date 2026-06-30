package yf2;

/* loaded from: classes3.dex */
public final class z0 extends if2.b implements w25.e, if2.e, jm2.c {

    /* renamed from: m, reason: collision with root package name */
    public ya2.p1 f461824m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f461825n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f461826o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final boolean Z6(yf2.z0 z0Var, r45.d64 d64Var, w25.e eVar) {
        z0Var.getClass();
        if (!zl2.r4.f473950a.w1()) {
            return false;
        }
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, eVar);
        return true;
    }

    public final r45.ze2 a7() {
        r45.ze2 ze2Var = (r45.ze2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329073n).getValue();
        if (ze2Var != null) {
            return ze2Var;
        }
        pf5.u uVar = pf5.u.f353936a;
        if (!((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "getLocation no permission");
            return null;
        }
        r45.ze2 ze2Var2 = new r45.ze2();
        jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
        ze2Var2.set(1, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        ze2Var2.set(0, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        return ze2Var2;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        if (this.f461825n || this.f461826o) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "#onGetLbsLifes isDestroy=" + this.f461825n + " ignore=" + this.f461826o);
            return;
        }
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "get lbsLife fail");
            ya2.p1 p1Var = this.f461824m;
            if (p1Var != null) {
                ((yv2.b) p1Var).e();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "get lbsLife success");
        ya2.p1 p1Var2 = this.f461824m;
        if (p1Var2 != null) {
            ((yv2.b) p1Var2).e();
        }
        ya2.p1 p1Var3 = this.f461824m;
        if (p1Var3 != null) {
            r45.c64 lbsLife = (r45.c64) kz5.n0.X(list);
            yv2.b bVar = (yv2.b) p1Var3;
            kotlin.jvm.internal.o.g(lbsLife, "lbsLife");
            jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
            float floatValue = ((java.lang.Number) P6.f302833d).floatValue();
            float floatValue2 = ((java.lang.Number) P6.f302834e).floatValue();
            if (bVar.f466205n) {
                bVar.f466206o = true;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    bVar.f();
                    com.tencent.mm.plugin.finder.report.p2.X(com.tencent.mm.plugin.finder.report.p2.f125237a, 0, bVar.f466202h, 0, 4, null);
                    return;
                }
                android.content.Intent intent = bVar.f466204m;
                if (intent == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent.putExtra("saveLocation", true);
                android.content.Intent intent2 = bVar.f466204m;
                if (intent2 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent2.putExtra("get_poi_name", "");
                android.content.Intent intent3 = bVar.f466204m;
                if (intent3 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent3.putExtra("get_city", str == null ? "" : str);
                android.content.Intent intent4 = bVar.f466204m;
                if (intent4 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent4.putExtra("get_lat", floatValue2);
                android.content.Intent intent5 = bVar.f466204m;
                if (intent5 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent5.putExtra("get_lng", floatValue);
                android.content.Intent intent6 = bVar.f466204m;
                if (intent6 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent6.putExtra("get_poi_classify_type", lbsLife.f371319p);
                android.content.Intent intent7 = bVar.f466204m;
                if (intent7 == null) {
                    kotlin.jvm.internal.o.o("intent");
                    throw null;
                }
                intent7.putExtra("get_poi_classify_id", "");
                bVar.d(false);
                r45.ze2 ze2Var = bVar.f466202h;
                if (ze2Var != null) {
                    android.os.Bundle bundle = bVar.f466203i;
                    if (bundle == null) {
                        kotlin.jvm.internal.o.o("postData");
                        throw null;
                    }
                    bundle.putByteArray("post_location", ze2Var.toByteArray());
                }
                bVar.a().setSuggestView(str);
                com.tencent.mm.plugin.finder.report.p2.X(com.tencent.mm.plugin.finder.report.p2.f125237a, 1, bVar.f466202h, 0, 4, null);
            }
        }
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 20000 && intent != null && zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            r45.ze2 ze2Var = new r45.ze2();
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            ze2Var.set(3, stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            ze2Var.set(2, stringExtra2);
            ze2Var.set(1, java.lang.Float.valueOf(intent.getFloatExtra("get_lat", 0.0f)));
            ze2Var.set(0, java.lang.Float.valueOf(intent.getFloatExtra("get_lng", 0.0f)));
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            ze2Var.set(4, stringExtra3);
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            ze2Var.set(5, stringExtra4);
            if (((mm2.c1) getStore().business(mm2.c1.class)).a8()) {
                df2.o oVar = (df2.o) getStore().controller(df2.o.class);
                if (oVar != null) {
                    com.tencent.mars.xlog.Log.i(oVar.f230899p, "[onLocPickResult] loc = " + pm0.b0.g(ze2Var));
                    com.tencent.mm.plugin.finder.live.util.y.o(oVar, null, null, new df2.l(oVar, ze2Var, null), 3, null);
                    return;
                }
                return;
            }
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329073n).k(ze2Var);
            if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(3)) && com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(2))) {
                ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329073n).k(null);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String stringExtra5 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            jSONObject.put("poiClassifyId", stringExtra5);
            jSONObject.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1000.0f)));
            jSONObject.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -85.0f)));
            java.lang.String stringExtra6 = intent.getStringExtra("get_city");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            jSONObject.put("city", stringExtra6);
            java.lang.String stringExtra7 = intent.getStringExtra("get_poi_name");
            jSONObject.put("poiname", stringExtra7 != null ? stringExtra7 : "");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 9L, jSONObject.toString(), null, 4, null);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("longitude", java.lang.Float.valueOf(ze2Var.getFloat(0)));
            jSONObject2.put("latitude", java.lang.Float.valueOf(ze2Var.getFloat(1)));
            jSONObject2.put("city", ze2Var.getString(2));
            jSONObject2.put("poiName", ze2Var.getString(3));
            jSONObject2.put("poiAddress", ze2Var.getString(4));
            jSONObject2.put("poiClassifyId", ze2Var.getString(5));
            jSONObject2.put("poiClassifyType", ze2Var.getInteger(6));
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.j5((zy2.zb) c18, 66L, jSONObject2.toString(), null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.w0(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f461824m = null;
    }
}
