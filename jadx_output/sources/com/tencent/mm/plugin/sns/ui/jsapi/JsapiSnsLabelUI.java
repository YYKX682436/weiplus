package com.tencent.mm.plugin.sns.ui.jsapi;

/* loaded from: classes15.dex */
public class JsapiSnsLabelUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public java.util.ArrayList C;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.AnimatedExpandableListView f169545i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f169546m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f169547n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f169548o;

    /* renamed from: p, reason: collision with root package name */
    public qd4.r f169549p;

    /* renamed from: u, reason: collision with root package name */
    public int f169554u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f169555v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f169556w;

    /* renamed from: x, reason: collision with root package name */
    public int f169557x;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f169559z;

    /* renamed from: d, reason: collision with root package name */
    public int f169540d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f169541e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f169542f = 2;

    /* renamed from: g, reason: collision with root package name */
    public int f169543g = 3;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f169544h = java.util.Arrays.asList("public,private,visible,invisible".split(","));

    /* renamed from: q, reason: collision with root package name */
    public int f169550q = this.f169540d;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169551r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f169552s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f169553t = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f169558y = new java.util.ArrayList();

    public static /* synthetic */ qd4.r T6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = jsapiSnsLabelUI.f169549p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return rVar;
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", jsapiSnsLabelUI.getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("snsPostWhoCanSee", true);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, 1024));
        int i17 = jsapiSnsLabelUI.f169554u;
        if (i17 == jsapiSnsLabelUI.f169542f) {
            if (jsapiSnsLabelUI.f169549p.f361899t.size() > 0) {
                intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361899t, ","));
            }
        } else if (i17 == jsapiSnsLabelUI.f169543g && jsapiSnsLabelUI.f169549p.f361900u.size() > 0) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361900u, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        j45.l.v(jsapiSnsLabelUI, ".ui.contact.SelectContactUI", intent, com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.listview.AnimatedExpandableListView V6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = jsapiSnsLabelUI.f169545i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return animatedExpandableListView;
    }

    public static void W6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = jsapiSnsLabelUI.f169549p;
        if (rVar == null || rVar.f361894o != 1) {
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.drawable.f481256oo);
            } else {
                arrayList.add(str);
                if (i17 == 1) {
                    ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                } else {
                    ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.checkbox_selected_red);
                }
            }
        } else if (arrayList.contains(str)) {
            arrayList.remove(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected);
            } else {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
            }
        } else {
            arrayList.add(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected);
            } else {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public static /* synthetic */ java.util.ArrayList X6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = jsapiSnsLabelUI.f169546m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList Y6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f169546m = arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.lang.String Z6(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.lang.String m76 = jsapiSnsLabelUI.m7(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return m76;
    }

    public static /* synthetic */ java.util.ArrayList a7(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = jsapiSnsLabelUI.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ int b7(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int i17 = jsapiSnsLabelUI.f169554u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i17;
    }

    public static /* synthetic */ int c7(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f169554u = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i17;
    }

    public final void d7() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList2 = this.f169546m;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = this.f169549p.f361897r;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            java.util.ArrayList arrayList4 = this.f169549p.f361898s;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.List list = this.f169558y;
        if (((java.util.ArrayList) list).size() > 0 && "visible".equals(m7(this.f169550q)) && (arrayList = this.f169549p.f361897r) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f169546m.contains(str)) {
                    arrayList5.add(str);
                }
            }
            this.f169549p.f361897r.removeAll(arrayList5);
        } else if (((java.util.ArrayList) list).size() > 0 && "invisible".equals(m7(this.f169550q))) {
            java.util.Iterator it6 = this.f169549p.f361898s.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f169546m.contains(str2)) {
                    arrayList5.add(str2);
                }
            }
            this.f169549p.f361898s.removeAll(arrayList5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            i7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return dispatchKeyEvent;
    }

    public final int[] e7(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int[] iArr = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) list.get(i17)).intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return iArr;
    }

    public final void f7(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        c93.b bVar;
        java.util.ArrayList P1;
        java.lang.String str3 = "fillArgs";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.ArrayList arrayList = this.f169546m;
        java.lang.String str4 = ",";
        if (arrayList == null || arrayList.isEmpty()) {
            this.f169547n = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String str5 = this.f169547n;
            if (str5 != null && (P1 = com.tencent.mm.sdk.platformtools.t8.P1(str5.split(","))) != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str6 = (java.lang.String) it.next();
                    if (!this.f169546m.contains(str6)) {
                        arrayList2.add(str6);
                    }
                }
                P1.removeAll(arrayList2);
                this.f169547n = com.tencent.mm.sdk.platformtools.t8.c1(P1, ",");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
        java.lang.String str7 = this.f169547n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(str7, ",");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        c93.b a17 = c93.a.a();
        java.util.Iterator it6 = O1.iterator();
        while (true) {
            str = str3;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.String str8 = (java.lang.String) it6.next();
            java.util.Iterator it7 = it6;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                jSONObject.put(str8, jSONArray);
                str2 = str4;
                try {
                    b93.b bVar2 = (b93.b) a17;
                    java.util.List j17 = bVar2.j(bVar2.e(str8));
                    if (j17 != null) {
                        java.util.Iterator it8 = j17.iterator();
                        while (it8.hasNext()) {
                            java.lang.String str9 = (java.lang.String) it8.next();
                            java.util.Iterator it9 = it8;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put(dm.i4.COL_USERNAME, str9);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            bVar = a17;
                            try {
                                java.lang.String e17 = c01.a2.e(str9);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                                jSONObject2.put("displayName", e17);
                                jSONObject2.put("avatar", g7(str9));
                                jSONArray.put(jSONObject2);
                                it8 = it9;
                                a17 = bVar;
                            } catch (org.json.JSONException e18) {
                                e = e18;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLabelUI", e, "", new java.lang.Object[0]);
                                str3 = str;
                                it6 = it7;
                                str4 = str2;
                                a17 = bVar;
                            }
                        }
                    }
                    bVar = a17;
                } catch (org.json.JSONException e19) {
                    e = e19;
                    bVar = a17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLabelUI", e, "", new java.lang.Object[0]);
                    str3 = str;
                    it6 = it7;
                    str4 = str2;
                    a17 = bVar;
                }
            } catch (org.json.JSONException e27) {
                e = e27;
                str2 = str4;
            }
            str3 = str;
            it6 = it7;
            str4 = str2;
            a17 = bVar;
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent.putExtra("Klabel_name_list", jSONObject3);
        java.lang.String str10 = this.f169548o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List<java.lang.String> O12 = com.tencent.mm.sdk.platformtools.t8.O1(str10, str4);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        if (O12 != null) {
            for (java.lang.String str11 : O12) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put(dm.i4.COL_USERNAME, str11);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e28 = c01.a2.e(str11);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    jSONObject4.put("displayName", e28);
                    jSONObject4.put("avatar", g7(str11));
                    jSONArray2.put(jSONObject4);
                } catch (org.json.JSONException e29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLabelUI", e29, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String jSONArray3 = jSONArray2.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent.putExtra("Kother_user_name_list", jSONArray3);
        intent.putExtra("k_select_group", m7(this.f169549p.f361895p));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final java.lang.String g7(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        java.lang.String d17 = n07 != null ? n07.d() : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return d17;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return com.tencent.mm.R.layout.cs8;
    }

    public final int h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return intValue;
    }

    public final void i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        qd4.r rVar = this.f169549p;
        int i17 = rVar.f361895p;
        boolean z17 = i17 == this.f169550q ? !((i17 != this.f169542f || rVar.f361897r.size() == 0 || (com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361897r, ",").equals(this.f169547n) && com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361899t, ",").equals(this.f169548o))) && (i17 != this.f169543g || this.f169549p.f361898s.size() == 0 || (com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361898s, ",").equals(this.f169547n) && com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361900u, ",").equals(this.f169548o)))) : !((i17 != this.f169542f || (rVar.f361897r.size() == 0 && this.f169549p.f361899t.size() == 0)) && !((i17 == this.f169543g && (this.f169549p.f361898s.size() != 0 || this.f169549p.f361900u.size() != 0)) || i17 == this.f169541e || i17 == this.f169540d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.tencent.mm.R.string.jbg), "", getString(com.tencent.mm.R.string.jbf), getString(com.tencent.mm.R.string.jbe), new qd4.l(this), new qd4.m(this));
        } else {
            j7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f169545i = (com.tencent.mm.ui.widget.listview.AnimatedExpandableListView) findViewById(com.tencent.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f169546m = arrayList;
        qd4.r rVar = this.f169549p;
        rVar.f361896q = booleanExtra;
        rVar.h(arrayList);
        d7();
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f169545i.addHeaderView(view);
        this.f169545i.setAdapter(this.f169549p);
        this.f169545i.setOnGroupClickListener(new qd4.f(this));
        this.f169545i.setOnChildClickListener(new qd4.g(this));
        setBackBtn(new qd4.h(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.jbc), new qd4.i(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final void j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f169550q);
        f7(intent);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final void k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11455, "", "", java.lang.Integer.valueOf(this.f169557x), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        this.A = null;
        this.f169553t = false;
        this.f169552s = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f169555v;
        if (u3Var != null && u3Var.isShowing()) {
            this.f169555v.dismiss();
        }
        if (this.f169551r) {
            this.f169551r = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        } else {
            db5.e1.m(this, h7() > 1 ? com.tencent.mm.R.string.f493217jc2 : com.tencent.mm.R.string.f493218jc3, com.tencent.mm.R.string.f490507x1, new qd4.c(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
    }

    public final void l7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        qd4.r rVar = this.f169549p;
        int i17 = rVar.f361895p;
        if (i17 == this.f169542f) {
            this.f169547n = com.tencent.mm.sdk.platformtools.t8.c1(rVar.f361897r, ",");
            this.f169548o = com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361899t, ",");
            f7(intent);
        } else if (i17 == this.f169543g) {
            this.f169547n = com.tencent.mm.sdk.platformtools.t8.c1(rVar.f361898s, ",");
            this.f169548o = com.tencent.mm.sdk.platformtools.t8.c1(this.f169549p.f361900u, ",");
            f7(intent);
        }
        intent.putExtra("k_select_group", m7(this.f169549p.f361895p));
        intent.putExtra("k_select_index", this.f169549p.f361895p);
        intent.putExtra("Ktag_range_index", this.f169549p.f361895p);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public final java.lang.String m7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.util.List list = this.f169558y;
        if (i17 >= ((java.util.ArrayList) list).size() || i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return "";
        }
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) list).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return str;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 4003) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                j45.l.n(getContext(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            this.f169548o = new java.lang.String(stringExtra2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra2 + "");
            int i19 = this.f169554u;
            if (i19 == this.f169542f) {
                this.f169549p.f361899t.clear();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f169549p.f361899t.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f169549p.f361895p = this.f169554u;
                }
            } else if (i19 == this.f169543g) {
                this.f169549p.f361900u.clear();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f169549p.f361900u.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f169549p.f361895p = this.f169554u;
                }
            }
            this.f169549p.notifyDataSetChanged();
            this.f169545i.expandGroup(this.f169554u);
        } else if (i18 == -1 && i17 == 4001) {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra3 + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Select_Contact", stringExtra3);
                j45.l.n(this, "label", ".ui.ContactLabelEditUI", intent3, 4002);
            }
        } else if (i18 == 0 && i17 == 4002 && intent != null) {
            java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
            this.f169556w = intent.getStringExtra("k_sns_label_add_label");
            this.f169545i.postDelayed(new qd4.k(this, stringExtra4), 600L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f493249jg0);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(kd1.c.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(638, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        this.f169549p = new qd4.r(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        qd4.r rVar = this.f169549p;
        qd4.d dVar = new qd4.d(this);
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        rVar.f361901v = dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            this.f169550q = this.f169540d;
            this.f169549p.f361894o = 0;
            this.f169547n = null;
            this.f169548o = null;
        } else {
            if (intent.hasExtra("k_title")) {
                setMMTitle(intent.getStringExtra("k_title"));
            }
            this.f169550q = intent.getIntExtra("KLabel_range_index", this.f169540d);
            this.f169549p.f361894o = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f169547n = intent.getStringExtra("Klabel_name_list");
            this.f169548o = intent.getStringExtra("Kother_user_name_list");
            if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        qd4.r rVar2 = this.f169549p;
        rVar2.f361895p = this.f169550q;
        if (rVar2.f361894o == 1) {
            findViewById(com.tencent.mm.R.id.n9l).setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        }
        int i17 = this.f169550q;
        if (i17 == this.f169542f) {
            if (!android.text.TextUtils.isEmpty(this.f169547n)) {
                this.f169549p.f361897r = com.tencent.mm.sdk.platformtools.t8.P1(this.f169547n.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f169548o)) {
                this.f169549p.f361899t = com.tencent.mm.sdk.platformtools.t8.P1(this.f169548o.split(","));
            }
        } else if (i17 == this.f169543g) {
            if (!android.text.TextUtils.isEmpty(this.f169547n)) {
                this.f169549p.f361898s = com.tencent.mm.sdk.platformtools.t8.P1(this.f169547n.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f169548o)) {
                this.f169549p.f361900u = com.tencent.mm.sdk.platformtools.t8.P1(this.f169548o.split(","));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE)).booleanValue()) {
            this.f169552s = true;
            this.f169553t = true;
            if (h7() >= 1) {
                this.f169551r = true;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            java.lang.String stringExtra = intent2.getStringExtra("k_select_group");
            boolean booleanExtra = intent2.getBooleanExtra("k_show_public", true);
            boolean booleanExtra2 = intent2.getBooleanExtra("k_show_private", true);
            boolean booleanExtra3 = intent2.getBooleanExtra("k_show_include", true);
            boolean booleanExtra4 = intent2.getBooleanExtra("k_show_exclude", true);
            int[] iArr = {com.tencent.mm.R.string.jbq, com.tencent.mm.R.string.jbo, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jba};
            java.util.List list = this.f169558y;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            str = "onCreate";
            java.util.List list2 = this.f169544h;
            if (booleanExtra) {
                str2 = ",";
                arrayList2.add(java.lang.Integer.valueOf(iArr[0]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[0]));
                arrayList.add((java.lang.String) list2.get(0));
            } else {
                str2 = ",";
            }
            if (booleanExtra2) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[1]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[1]));
                arrayList.add((java.lang.String) list2.get(1));
            }
            if (booleanExtra3) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[2]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[2]));
                arrayList.add((java.lang.String) list2.get(2));
            }
            if (booleanExtra4) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[3]));
                arrayList3.add(java.lang.Integer.valueOf(iArr[3]));
                arrayList.add((java.lang.String) list2.get(3));
            }
            if (arrayList.size() == 0) {
                finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            }
            this.f169540d = arrayList.indexOf("public");
            this.f169541e = arrayList.indexOf("private");
            this.f169542f = arrayList.indexOf("visible");
            this.f169543g = arrayList.indexOf("invisible");
            qd4.r rVar3 = this.f169549p;
            if (rVar3 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar3.f361890k = list;
                rVar3.f361884e = arrayList.indexOf("public");
                rVar3.f361885f = arrayList.indexOf("private");
                rVar3.f361886g = arrayList.indexOf("visible");
                rVar3.f361887h = arrayList.indexOf("invisible");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar4 = this.f169549p;
                int size = arrayList2.size();
                rVar4.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar4.f361883d = size;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar5 = this.f169549p;
                int[] e76 = e7(arrayList2);
                rVar5.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar5.f361888i = e76;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                qd4.r rVar6 = this.f169549p;
                int[] e77 = e7(arrayList3);
                rVar6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                rVar6.f361889j = e77;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                if (!android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f169549p.f361895p = arrayList.indexOf(stringExtra);
                    if (stringExtra.equals("visible")) {
                        if (android.text.TextUtils.isEmpty(this.f169547n)) {
                            str3 = str2;
                        } else {
                            str3 = str2;
                            this.f169549p.f361897r = com.tencent.mm.sdk.platformtools.t8.P1(this.f169547n.split(str3));
                        }
                        if (!android.text.TextUtils.isEmpty(this.f169548o)) {
                            this.f169549p.f361899t = com.tencent.mm.sdk.platformtools.t8.P1(this.f169548o.split(str3));
                        }
                        this.f169545i.expandGroup(arrayList.indexOf(stringExtra));
                    } else {
                        java.lang.String str4 = str2;
                        if (stringExtra.equals("invisible")) {
                            if (!android.text.TextUtils.isEmpty(this.f169547n)) {
                                this.f169549p.f361898s = com.tencent.mm.sdk.platformtools.t8.P1(this.f169547n.split(str4));
                            }
                            if (!android.text.TextUtils.isEmpty(this.f169548o)) {
                                this.f169549p.f361900u = com.tencent.mm.sdk.platformtools.t8.P1(this.f169548o.split(str4));
                            }
                            this.f169545i.expandGroup(arrayList.indexOf(stringExtra));
                        }
                    }
                }
            }
        } else {
            str = "onCreate";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(kd1.c.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(638, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (this.f169549p != null && this.f169556w == null && (animatedExpandableListView = this.f169545i) != null) {
            animatedExpandableListView.postDelayed(new qd4.a(this), 600L);
        }
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        if (r13 != false) goto L75;
     */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, com.tencent.mm.modelbase.m1 r15) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
