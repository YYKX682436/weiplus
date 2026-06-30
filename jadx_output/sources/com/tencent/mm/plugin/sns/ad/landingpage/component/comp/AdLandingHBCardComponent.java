package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class AdLandingHBCardComponent extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 implements androidx.lifecycle.x {
    public android.graphics.Bitmap A;
    public o44.d B;
    public final o44.b C;
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n1 D;
    public final android.view.View.OnClickListener E;
    public boolean F;
    public final android.view.View.OnClickListener G;
    public final android.view.View.OnClickListener H;

    /* renamed from: s, reason: collision with root package name */
    public o44.c f162732s;

    /* renamed from: t, reason: collision with root package name */
    public o44.c f162733t;

    /* renamed from: u, reason: collision with root package name */
    public final f54.p f162734u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f162735v;

    /* renamed from: w, reason: collision with root package name */
    public int f162736w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f162737x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f162738y;

    /* renamed from: z, reason: collision with root package name */
    public f54.o f162739z;

    public AdLandingHBCardComponent(android.content.Context context, f54.p pVar, android.view.ViewGroup viewGroup) {
        super(context, pVar, viewGroup);
        this.f162736w = -1;
        this.f162737x = "";
        this.f162738y = "";
        this.E = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h1(this);
        this.F = false;
        this.G = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i1(this);
        this.H = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j1(this);
        this.f162734u = pVar;
        this.C = new o44.b((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context, this, pVar);
    }

    public static /* synthetic */ o44.c O(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        o44.c cVar = adLandingHBCardComponent.f162733t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return cVar;
    }

    public static /* synthetic */ int P(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        int i17 = adLandingHBCardComponent.f162736w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return i17;
    }

    public static /* synthetic */ f54.p R(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        f54.p pVar = adLandingHBCardComponent.f162734u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return pVar;
    }

    public static /* synthetic */ o44.b S(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        o44.b bVar = adLandingHBCardComponent.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return bVar;
    }

    public static void Y(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeIntValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            jSONObject.put(str, jSONObject.optInt(str) + jSONObject2.optInt(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "mergeIntValue exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeIntValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean C(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        o44.b bVar = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (D(jSONObject3)) {
            try {
                org.json.JSONArray a17 = bVar.a();
                if (a17 != null) {
                    bVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalExpCount", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
                    int i17 = bVar.f342859b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalExpCount", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
                    jSONObject3.put(dm.n.COL_EXPOSURECOUNT, i17);
                    jSONObject3.put("hbCard", a17);
                }
                jSONArray.put(jSONObject3);
                com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "kv13387:" + jSONObject3.toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "setComponentKVReportData, exp=" + e17.toString());
            }
        }
        org.json.JSONObject jSONObject4 = null;
        if (this.f162732s.f342873k != null) {
            jSONObject = new org.json.JSONObject();
            this.f162732s.f342873k.D(jSONObject);
        } else {
            jSONObject = null;
        }
        if (this.f162733t.f342873k != null) {
            jSONObject2 = new org.json.JSONObject();
            this.f162733t.f342873k.D(jSONObject2);
        } else {
            jSONObject2 = null;
        }
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (jSONObject == null && jSONObject2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        } else {
            if (jSONObject != null && jSONObject2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else if (jSONObject2 == null || jSONObject != null) {
                Y(dm.n.COL_EXPOSURECOUNT, jSONObject, jSONObject2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeLongValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                try {
                    jSONObject.put("stayTime", jSONObject.optLong("stayTime") + jSONObject2.optLong("stayTime"));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "mergeLongValue exp=" + e18.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeLongValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                Y("playTimeInterval", jSONObject, jSONObject2);
                Y("playCount", jSONObject, jSONObject2);
                Y("playCompletedCount", jSONObject, jSONObject2);
                Y("doubleClickCount", jSONObject, jSONObject2);
                Y("clickSightCount", jSONObject, jSONObject2);
                Y("clickSightIconCount", jSONObject, jSONObject2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeVideoReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                jSONObject4 = jSONObject2;
            }
            jSONObject4 = jSONObject;
        }
        if (jSONObject4 != null) {
            try {
                ab4.g gVar = this.f162734u.G;
                if (gVar != null) {
                    java.lang.String str = gVar.f2817d;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject4.put("cid", str);
                }
            } catch (java.lang.Exception unused) {
            }
            jSONArray.put(jSONObject4);
        }
        java.util.Objects.toString(jSONObject4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r2 != 4) goto L27;
     */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            r4 = this;
            java.lang.String r0 = "viewAppeared"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.J()
            int r2 = r4.f162736w
            r3 = 1
            if (r2 == r3) goto L46
            r3 = 2
            if (r2 == r3) goto L3e
            r3 = 3
            if (r2 == r3) goto L1a
            r3 = 4
            if (r2 == r3) goto L3e
            goto L4d
        L1a:
            o44.c r2 = r4.f162732s
            if (r2 == 0) goto L2c
            android.view.View r2 = r2.f342865c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2c
            o44.c r2 = r4.f162732s
            r2.c()
            goto L4d
        L2c:
            o44.c r2 = r4.f162733t
            if (r2 == 0) goto L4d
            android.view.View r2 = r2.f342865c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L4d
            o44.c r2 = r4.f162733t
            r2.c()
            goto L4d
        L3e:
            o44.c r2 = r4.f162733t
            if (r2 == 0) goto L4d
            r2.c()
            goto L4d
        L46:
            o44.c r2 = r4.f162732s
            if (r2 == 0) goto L4d
            r2.c()
        L4d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.J():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r2 != 4) goto L27;
     */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            r4 = this;
            java.lang.String r0 = "viewWillAppear"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.K()
            int r2 = r4.f162736w
            r3 = 1
            if (r2 == r3) goto L46
            r3 = 2
            if (r2 == r3) goto L3e
            r3 = 3
            if (r2 == r3) goto L1a
            r3 = 4
            if (r2 == r3) goto L3e
            goto L4d
        L1a:
            o44.c r2 = r4.f162732s
            if (r2 == 0) goto L2c
            android.view.View r2 = r2.f342865c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2c
            o44.c r2 = r4.f162732s
            r2.d()
            goto L4d
        L2c:
            o44.c r2 = r4.f162733t
            if (r2 == 0) goto L4d
            android.view.View r2 = r2.f342865c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L4d
            o44.c r2 = r4.f162733t
            r2.d()
            goto L4d
        L3e:
            o44.c r2 = r4.f162733t
            if (r2 == 0) goto L4d
            r2.d()
            goto L4d
        L46:
            o44.c r2 = r4.f162732s
            if (r2 == 0) goto L4d
            r2.d()
        L4d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.K():void");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.L();
        o44.c cVar = this.f162732s;
        if (cVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            cVar.f342865c.getVisibility();
            java.util.Objects.toString(cVar.f342873k);
            ab4.b bVar = cVar.f342873k;
            if (bVar != null) {
                bVar.L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        }
        o44.c cVar2 = this.f162733t;
        if (cVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            cVar2.f342865c.getVisibility();
            java.util.Objects.toString(cVar2.f342873k);
            ab4.b bVar2 = cVar2.f342873k;
            if (bVar2 != null) {
                bVar2.L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.M();
        o44.c cVar = this.f162732s;
        if (cVar != null) {
            cVar.e();
        }
        o44.c cVar2 = this.f162733t;
        if (cVar2 != null) {
            cVar2.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    public void T(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetHBCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        f54.p pVar = this.f162734u;
        if (isEmpty) {
            java.lang.String str3 = pVar.K;
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "doGetHBCover, dynamicUrl empty, use compInfo url");
            str2 = str3;
        } else {
            str2 = str;
        }
        ab4.n0 u17 = u();
        java.lang.String j17 = u17.j();
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(j17);
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "doGetHBCover, subType=" + this.f162736w + ", jumpUrl=" + str2 + ", dynamicUrl=" + str + ", snsId=" + j17);
        a84.a0.a(this.f165049d, str2, u17, u17.l(), E1, pVar.f2817d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetHBCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    public final android.widget.FrameLayout.LayoutParams U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        ab4.d0 d0Var = this.f165050e;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) d0Var.f2823m, (int) d0Var.f2824n);
        layoutParams.gravity = 1;
        ab4.d0 d0Var2 = this.f165050e;
        layoutParams.topMargin = (int) d0Var2.f2819f;
        layoutParams.bottomMargin = (int) d0Var2.f2820g;
        layoutParams.leftMargin = (int) d0Var2.f2821h;
        layoutParams.rightMargin = (int) d0Var2.f2822i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardContentLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return layoutParams;
    }

    public org.json.JSONObject V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i17 = this.f162736w;
            if (i17 != 3) {
                jSONObject.put("subType", i17);
                jSONObject.put("isDoubleCard", 0);
            } else {
                jSONObject.put("isDoubleCard", 1);
                if (this.f162732s.f342865c.getVisibility() == 0) {
                    jSONObject.put("subType", 1);
                } else if (this.f162733t.f342865c.getVisibility() == 0) {
                    jSONObject.put("subType", 2);
                }
            }
            if (jSONObject.optInt("subType") != 1) {
                jSONObject.put("giveCardId", this.f162734u.F);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "getCurrentShowCardStatInfo, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCardStatInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return null;
        }
    }

    public void W(o44.c cVar, f54.o oVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHBStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        ab4.n0 u17 = u();
        int l17 = u17.l();
        java.lang.String o17 = u17.o();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = o17 == null ? "" : o17;
        java.lang.String e17 = u17.e();
        if (e17 == null) {
            e17 = "";
        }
        f54.p pVar = this.f162734u;
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getTwistAdCardStatus(str, l17, e17, pVar.A, pVar.F, i17, new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q1(this, cVar, oVar, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHBStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    public final boolean X(f54.o oVar) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHBExpired", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (this.B != null) {
            int syncServerTimeSecond = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSyncServerTimeSecond();
            if (oVar == null || (i17 = oVar.f259731g) <= 0) {
                com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "isHBExpired, use Default");
                i17 = 86400;
            }
            r4 = this.B.f342891f + ((long) i17) < ((long) syncServerTimeSecond);
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "isHBExpired, shareTime=" + this.B.f342891f + ", expireTime=" + i17 + ", now=" + syncServerTimeSecond + ", sys.now=" + (java.lang.System.currentTimeMillis() / 1000));
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "isHBExpired, mShareInfo==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHBExpired", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return r4;
    }

    public void Z() {
        o44.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "restoreVideoToOriginState, exp=" + e17.toString());
        }
        if (q().getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "restoreVideoToOriginState, hbCardComp invisible, id=" + z());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        o44.c cVar2 = this.f162732s;
        if (cVar2 == null || cVar2.f342865c.getVisibility() != 0) {
            o44.c cVar3 = this.f162733t;
            if (cVar3 == null || cVar3.f342865c.getVisibility() != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                cVar = null;
            } else {
                cVar = this.f162733t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            }
        } else {
            cVar = this.f162732s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentShowCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        }
        if (cVar != null && cVar.f342873k != null) {
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "restoreVideoToOriginState, vidoCompId=" + cVar.f342873k.z());
            cVar.f342873k.P();
            cVar.f342873k.B();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreVideoToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    public final void a0(o44.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        cVar.f342867e.setLayoutParams(U());
        cVar.f342866d.setLayoutParams(U());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0701  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(int r27) {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.b0(int):void");
    }

    public void c0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDynamicContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "updateDynamicContent, twistCardId=" + str2 + ", extInfo=" + str);
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                this.f162737x = str2;
                b0(1);
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int optInt = jSONObject.optInt("subCardType");
                if (optInt == 4) {
                    this.B = o44.d.a(str);
                } else {
                    this.B = null;
                }
                this.f162737x = str2;
                this.f162738y = jSONObject.optString("receiveUrl");
                this.f162734u.F = jSONObject.optString("giveCardId");
                b0(optInt);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingHBCardComponent", "updateDyncContent, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDynamicContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f165056n.findViewById(com.tencent.mm.R.id.gxa);
        this.f162735v = frameLayout;
        android.content.Context context = this.f165049d;
        this.f162732s = o44.c.g(context, frameLayout, 1);
        o44.c g17 = o44.c.g(context, this.f162735v, 2);
        this.f162733t = g17;
        a0(g17);
        this.f162735v.addView(this.f162733t.f342865c, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View view = this.f162733t.f342865c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a0(this.f162732s);
        this.f162735v.addView(this.f162732s.f342865c, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View view2 = this.f162732s.f342865c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        o44.c cVar = this.f162732s;
        f54.p pVar = this.f162734u;
        cVar.l(pVar);
        this.f162733t.l(pVar);
        this.f162733t.f342867e.setBackgroundResource(com.tencent.mm.R.drawable.bum);
        android.view.View view3 = this.f162733t.f342866d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShadowPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        int b17 = i65.a.b(context, 7);
        android.widget.FrameLayout.LayoutParams U = U();
        U.bottomMargin += b17;
        U.rightMargin += b17;
        U.topMargin += b17;
        U.leftMargin += b17;
        int i17 = b17 * 2;
        U.width -= i17;
        U.height -= i17;
        view3.setLayoutParams(U);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShadowPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        this.f162732s.f342867e.setClickable(true);
        if (context instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) context).mo133getLifecycle().a(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        super.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onUIDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "onUIDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "onUIPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "onUIResume");
        if (this.F) {
            this.F = false;
            if (this.f162732s.f342865c.getVisibility() == 0) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k1 k1Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k1(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(k1Var, 500L, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        return com.tencent.mm.R.layout.cpl;
    }
}
