package i11;

/* loaded from: classes15.dex */
public class g implements com.tencent.mm.modelbase.u0, u60.f {

    /* renamed from: i, reason: collision with root package name */
    public static i11.g f287085i;

    /* renamed from: d, reason: collision with root package name */
    public u60.h f287086d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f287087e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f287088f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f287089g = new com.tencent.mm.sdk.platformtools.i6(1, "addr_worker", 1);

    /* renamed from: h, reason: collision with root package name */
    public boolean f287090h = true;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492292fy3);
    }

    public final void a(com.tencent.mm.modelgeo.Addr addr) {
        u60.h hVar = this.f287086d;
        if (hVar == null) {
            return;
        }
        if (addr == null) {
            addr = new com.tencent.mm.modelgeo.Addr();
        }
        java.lang.Object obj = hVar.f424873f;
        if (obj == null) {
            obj = new java.lang.Object();
        }
        addr.f71227w = obj;
        addr.f71224t = (float) hVar.f424868a;
        addr.f71225u = (float) hVar.f424869b;
        java.util.HashMap hashMap = this.f287088f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.toString());
        if (copyOnWriteArrayList != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference != null && weakReference.get() != null) {
                    ((u60.e) weakReference.get()).onLocationAddr(addr);
                }
            }
        }
        hashMap.remove(this.f287086d.toString());
        hashMap.size();
        this.f287086d = null;
        d();
        if (this.f287086d != null || this.f287087e.size() <= 0) {
            return;
        }
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.appdownload.t.CTRL_INDEX, this);
        gm0.j1.d().q(com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE, this);
    }

    public boolean b(u60.h hVar, u60.e eVar) {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2 = hVar.f424873f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f287087e;
        if (obj2 != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u60.h hVar2 = (u60.h) it.next();
                if (hVar2 != null && (obj = hVar2.f424873f) != null && obj.equals(obj2)) {
                    copyOnWriteArrayList.remove(hVar2);
                    break;
                }
            }
        }
        java.util.HashMap hashMap = this.f287088f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.toString());
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        }
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it6.next();
            if (weakReference != null && weakReference.get() != null && ((u60.e) weakReference.get()).equals(eVar)) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            copyOnWriteArrayList2.add(new java.lang.ref.WeakReference(eVar));
        }
        hashMap.put(hVar.toString(), copyOnWriteArrayList2);
        java.util.Iterator it7 = copyOnWriteArrayList.iterator();
        while (it7.hasNext()) {
            if (((u60.h) it7.next()).equals(hVar)) {
                d();
                return false;
            }
        }
        u60.h hVar3 = this.f287086d;
        if (hVar3 != null && hVar.equals(hVar3)) {
            return false;
        }
        copyOnWriteArrayList.add(hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationAddr", "push task size %d listeners %d", java.lang.Integer.valueOf(copyOnWriteArrayList.size()), java.lang.Integer.valueOf(hashMap.size()));
        while (copyOnWriteArrayList.size() > 30) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationAddr", "force remove task");
            u60.h hVar4 = (u60.h) copyOnWriteArrayList.remove(0);
            if (hVar4 != null) {
                hashMap.remove(hVar4.toString());
            }
        }
        d();
        return true;
    }

    public boolean c(u60.e eVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.HashMap hashMap = this.f287088f;
        for (java.lang.String str : hashMap.keySet()) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(str);
            if (copyOnWriteArrayList != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null && ((u60.e) weakReference.get()).equals(eVar)) {
                        copyOnWriteArrayList.remove(weakReference);
                        break;
                    }
                }
            }
            hashMap.put(str, copyOnWriteArrayList);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
                linkedList2.add(str);
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            hashMap.remove((java.lang.String) it6.next());
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f287087e;
        java.util.Iterator it7 = copyOnWriteArrayList2.iterator();
        while (it7.hasNext()) {
            u60.h hVar = (u60.h) it7.next();
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.toString());
            if (copyOnWriteArrayList3 == null || copyOnWriteArrayList3.size() == 0) {
                linkedList.add(hVar);
                hashMap.remove(hVar.toString());
            }
        }
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            copyOnWriteArrayList2.remove((u60.h) it8.next());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationAddr", "remove taskLists %d listeners size %d", java.lang.Integer.valueOf(copyOnWriteArrayList2.size()), java.lang.Integer.valueOf(hashMap.size()));
        return true;
    }

    public final void d() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f287086d != null || (copyOnWriteArrayList = this.f287087e) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.f287086d = (u60.h) copyOnWriteArrayList.remove(0);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.appdownload.t.CTRL_INDEX, this);
        gm0.j1.d().a(com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE, this);
        if (!this.f287086d.f424874g) {
            gm0.j1.d().g(new i11.q(this.f287086d));
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        u60.h hVar = this.f287086d;
        d17.g(new i11.r(hVar.f424868a, hVar.f424869b, hVar.f424870c));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        com.tencent.mm.modelgeo.Addr addr = null;
        try {
            if (m1Var.getType() == 4005) {
                i11.r rVar = (i11.r) m1Var;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(rVar.f287146f)) {
                    com.tencent.mm.modelgeo.Addr addr2 = new com.tencent.mm.modelgeo.Addr();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(rVar.f287146f);
                    addr2.f71223s = jSONObject.optString("request_id");
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    org.json.JSONObject optJSONObject3 = jSONObject2.optJSONObject("address_component");
                    if (optJSONObject3 != null) {
                        addr2.f71212e = optJSONObject3.optString(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_NATION);
                        addr2.f71213f = optJSONObject3.optString("province", optJSONObject3.optString("ad_level_1"));
                        addr2.f71214g = optJSONObject3.optString("city", optJSONObject3.optString("ad_level_2"));
                        addr2.f71216i = optJSONObject3.optString("district");
                        addr2.f71217m = "";
                        addr2.f71218n = optJSONObject3.optString("street");
                        addr2.f71219o = optJSONObject3.optString("street_number");
                    }
                    org.json.JSONObject optJSONObject4 = jSONObject2.optJSONObject("formatted_addresses");
                    if (optJSONObject4 != null) {
                        addr2.f71211d = optJSONObject4.optString("recommend");
                        addr2.f71221q = optJSONObject4.optString("rough");
                    } else {
                        org.json.JSONObject optJSONObject5 = jSONObject2.optJSONObject("address_component");
                        if (optJSONObject5 != null) {
                            java.lang.String optString = optJSONObject5.optString("street_number");
                            addr2.f71211d = optString;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                                addr2.f71211d = optJSONObject5.optString("street");
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(addr2.f71211d)) {
                                addr2.f71211d = optJSONObject5.optString("ad_level_3");
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(addr2.f71211d)) {
                                addr2.f71211d = optJSONObject5.optString("ad_level_2");
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(addr2.f71211d)) {
                                addr2.f71211d = optJSONObject5.optString("ad_level_1");
                            }
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(addr2.f71219o)) {
                        addr2.f71218n = "";
                    }
                    org.json.JSONObject optJSONObject6 = jSONObject2.optJSONObject("address_reference");
                    if (optJSONObject6 != null && (optJSONObject2 = optJSONObject6.optJSONObject("town")) != null) {
                        addr2.f71220p = optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        addr2.f71226v = optJSONObject2.optString(dm.i4.COL_ID);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(addr2.f71226v) && (optJSONObject = jSONObject2.optJSONObject("ad_info")) != null) {
                        addr2.f71226v = optJSONObject.optString("adcode");
                    }
                    org.json.JSONObject optJSONObject7 = jSONObject2.optJSONObject("ad_info");
                    if (optJSONObject7 != null) {
                        addr2.A = optJSONObject7.optString("nation_code");
                        addr2.C = optJSONObject7.optString("adcode");
                    }
                    addr = addr2;
                }
            } else if (m1Var.getType() == 655) {
                i11.q qVar = (i11.q) m1Var;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f287143f)) {
                    com.tencent.mm.modelgeo.Addr addr3 = new com.tencent.mm.modelgeo.Addr();
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(qVar.f287143f);
                    addr3.f71223s = jSONObject3.optString("request_id");
                    org.json.JSONArray jSONArray = jSONObject3.getJSONArray("results");
                    org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(1);
                    addr3.f71211d = jSONObject4.getString("address_name");
                    addr3.f71228x = jSONObject4.getString("address_name_id");
                    addr3.B = jSONObject4.getJSONObject("second_landmark").getString("uid");
                    org.json.JSONObject jSONObject5 = jSONArray.getJSONObject(0);
                    addr3.f71213f = jSONObject5.getString("p");
                    addr3.f71229y = jSONObject5.getString("city_code");
                    addr3.f71214g = jSONObject5.getString("c");
                    addr3.f71216i = jSONObject5.getString("d");
                    addr3.f71230z = jSONObject5.getString("adcode");
                    addr3.f71217m = "";
                    addr3.f71218n = "";
                    addr3.f71219o = "";
                    for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                        try {
                            org.json.JSONObject jSONObject6 = jSONArray.getJSONObject(i19);
                            java.lang.String string = jSONObject6.getString("dtype");
                            if ("ST".equals(string)) {
                                addr3.f71218n = jSONObject6.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                            } else if ("ST_NO".equals(string)) {
                                addr3.f71219o = jSONObject6.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                            }
                            if ("FORMAT_ADDRESS".equals(string)) {
                                addr3.f71221q = jSONObject6.getString("rough_address_name");
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(addr3.f71219o)) {
                        addr3.f71218n = "";
                    }
                    addr = addr3;
                }
            }
        } catch (java.lang.Exception unused2) {
        }
        if (addr == null || (str2 = addr.f71211d) == null || str2.equals("")) {
            this.f287089g.a(new i11.f(this));
        } else {
            a(addr);
        }
    }
}
