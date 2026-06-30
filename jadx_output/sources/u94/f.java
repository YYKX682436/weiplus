package u94;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a */
    public w64.k f425846a;

    /* renamed from: b */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f425847b;

    /* renamed from: c */
    public android.content.Context f425848c;

    /* renamed from: d */
    public com.tencent.mm.storage.z3 f425849d;

    /* renamed from: e */
    public com.tencent.mm.storage.e8 f425850e;

    /* renamed from: f */
    public com.tencent.mm.ui.widget.dialog.u3 f425851f;

    /* renamed from: g */
    public ca4.k f425852g;

    /* renamed from: h */
    public boolean f425853h;

    /* renamed from: i */
    public java.lang.String f425854i;

    /* renamed from: j */
    public java.lang.String f425855j;

    /* renamed from: k */
    public java.lang.String f425856k;

    /* renamed from: l */
    public int f425857l = 0;

    /* renamed from: m */
    public java.lang.String f425858m = "";

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 a(u94.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = fVar.f425851f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        return u3Var;
    }

    public static void b(u94.f fVar, android.content.Context context, int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.lang.String str11;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        u94.f fVar2 = fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deal", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (i17 == 0 && i18 == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (i19 != 182) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                w64.k kVar = fVar2.f425846a;
                if (kVar == null || (adClickActionInfo = fVar2.f425847b) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                } else {
                    kVar.a(adClickActionInfo);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealRetOk", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            if (fVar2.f425852g == null || fVar2.f425848c == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str3 = "access$500";
                str5 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                str4 = "deal";
                str6 = "HalfScreenAddBrandController";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRetOk", str5);
            } else {
                android.content.Context context2 = fVar2.f425848c;
                if ((context2 instanceof android.app.Activity) && ((android.app.Activity) context2).isFinishing()) {
                    com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "dealRetOk, isFinishing return");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRetOk", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    str3 = "access$500";
                    str5 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                    str4 = "deal";
                    str6 = "HalfScreenAddBrandController";
                } else {
                    ca4.k kVar2 = fVar2.f425852g;
                    if (kVar2.f39969e == 0) {
                        android.content.Context context3 = fVar2.f425848c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper");
                        if (context3 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper");
                        } else {
                            android.view.View inflate = android.view.LayoutInflater.from(context3).inflate(com.tencent.mm.R.layout.dur, (android.view.ViewGroup) null);
                            if (inflate == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper");
                            } else {
                                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context3, 1, false);
                                k0Var.s(inflate, true);
                                k0Var.V1 = true;
                                k0Var.e(true);
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.close_icon);
                                androidx.appcompat.widget.AppCompatButton appCompatButton = (androidx.appcompat.widget.AppCompatButton) inflate.findViewById(com.tencent.mm.R.id.rsc);
                                appCompatButton.setText(context3.getString(com.tencent.mm.R.string.mt9));
                                float b17 = i65.a.b(context3, 17) * i65.a.q(context3);
                                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483459re0);
                                str3 = "access$500";
                                textView.setText(context3.getString(com.tencent.mm.R.string.d1w));
                                textView.setTextSize(0, b17);
                                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                                com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate.findViewById(com.tencent.mm.R.id.awq);
                                a84.z.h(kVar2.f39966b, mMRoundCornerImageView);
                                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aws);
                                textView2.setText(kVar2.f39967c);
                                kotlin.jvm.internal.o.d(mMRoundCornerImageView);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeBrandName", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper");
                                str4 = "deal";
                                android.view.ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
                                if (viewTreeObserver != null) {
                                    str6 = "HalfScreenAddBrandController";
                                    weImageView = weImageView2;
                                    str7 = "dealRetOk";
                                    str11 = "resizeBrandName";
                                    str8 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                                    str10 = "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper";
                                    str9 = "showBottomSheet";
                                    viewTreeObserver.addOnPreDrawListener(new g44.a(inflate, context3, mMRoundCornerImageView, textView2, b17));
                                } else {
                                    str9 = "showBottomSheet";
                                    str8 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                                    str6 = "HalfScreenAddBrandController";
                                    str10 = "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper";
                                    weImageView = weImageView2;
                                    str7 = "dealRetOk";
                                    str11 = "resizeBrandName";
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str11, str10);
                                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rdw)).setText(kVar2.f39968d);
                                weImageView.setOnClickListener(new g44.b(k0Var));
                                appCompatButton.setOnClickListener(new g44.c(k0Var, context3, str2));
                                k0Var.v();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, str10);
                                fVar2 = fVar;
                            }
                        }
                        str7 = "dealRetOk";
                        str3 = "access$500";
                        str8 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                        str4 = "deal";
                        str6 = "HalfScreenAddBrandController";
                        fVar2 = fVar;
                    } else {
                        str7 = "dealRetOk";
                        str3 = "access$500";
                        str8 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
                        str4 = "deal";
                        str6 = "HalfScreenAddBrandController";
                        f(fVar2.f425848c, str2);
                    }
                    str5 = str8;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str5);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processUpdateContact", str5);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mars.xlog.Log.i(str6, "updateContact, main, respUsername = " + str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContact", str5);
                com.tencent.mm.storage.z3 z3Var = fVar2.f425849d;
                if (z3Var != null && fVar2.f425850e != null) {
                    z3Var.N2();
                    fVar2.f425849d.X1(str2);
                    ((ku5.t0) ku5.t0.f312615d).g(new u94.a(fVar2));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContact", str5);
            } else {
                java.lang.String str12 = str6;
                if (com.tencent.mm.sdk.platformtools.x2.s()) {
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().updateContact(str2);
                    com.tencent.mars.xlog.Log.i(str12, "updateContact, tools, respUsername = " + str2);
                } else {
                    com.tencent.mars.xlog.Log.e(str12, "updateContact, process err");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processUpdateContact", str5);
            fVar2.d(i19, 1, str2);
        } else {
            str3 = "access$500";
            str4 = "deal";
            str5 = "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController";
            if (i18 == -44) {
                fVar2.e(false, str2);
                fVar2.d(i19, 2, str2);
            } else if (i18 == -87) {
                db5.e1.s(context, context.getString(com.tencent.mm.R.string.f490953bc5), "");
                fVar2.d(i19, 2, str2);
            } else if (i18 == -101) {
                fVar2.e(false, str2);
                fVar2.d(i19, 2, str2);
            } else if (i18 == -2) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    fVar2.e(false, str2);
                } else {
                    db5.e1.y(context, str, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490507x1), null);
                }
                fVar2.d(i19, 2, str2);
            } else if (i18 == -160) {
                fVar2.e(false, str2);
                fVar2.d(i19, 2, str2);
            } else {
                fVar2.e(false, str2);
                fVar2.d(i19, 2, str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str5);
    }

    public static /* synthetic */ com.tencent.mm.storage.z3 c(u94.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        com.tencent.mm.storage.z3 z3Var = fVar.f425849d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        return z3Var;
    }

    public static void f(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpChattingUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (context == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpChattingUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("key_has_add_contact", true);
        intent.putExtra("finish_direct", true);
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "jumpChattingUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "jumpChattingUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpChattingUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        int i19 = 2;
        try {
            if (i18 == 2) {
                if (i17 == 182) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 170);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, be1.r.CTRL_INDEX);
                }
            }
            boolean z17 = true;
            if (i17 == 0) {
                i19 = 1;
            } else if (i17 == 182) {
                i19 = 3;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("enterType", i19);
            jSONObject2.put("result", i18);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject2.put("brandUsername", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCanvasFromFinder", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            int i27 = this.f425857l;
            if (i27 != 24 && i27 != 30) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCanvasFromFinder", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            if (z17 && !android.text.TextUtils.isEmpty(this.f425858m)) {
                jSONObject2.put("canvasDynamicInfo", this.f425858m);
            }
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", this.f425854i);
            jSONObject.put("snsid", this.f425856k);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            jSONObject.put("adExtInfo", this.f425855j);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_ad_half_screen_quickly_add_brand_result", jSONObject3);
            com.tencent.mars.xlog.Log.i("HalfScreenAddBrandController", "addBrandReport timeline_ad_half_screen_quickly_add_brand_result, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HalfScreenAddBrandController", "addBrandReport exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    public final void e(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        android.content.Context context = this.f425848c;
        if (context == null) {
            com.tencent.mars.xlog.Log.i("HalfScreenAddBrandController", "context is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "dealRet, isFinishing return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.content.Context context2 = this.f425848c;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var.f211776c = context2.getString(com.tencent.mm.R.string.j7g);
            e4Var.c();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("key_has_add_contact", true);
            intent.putExtra("finish_direct", true);
            intent.setClassName(this.f425848c, "com.tencent.mm.ui.chatting.ChattingUI");
            android.content.Context context3 = this.f425848c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "dealRet", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "dealRet", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    public void g(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17, com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var, w64.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        this.f425847b = adClickActionInfo;
        this.f425848c = context;
        this.f425850e = e8Var;
        this.f425849d = z3Var;
        this.f425846a = kVar;
        this.f425856k = java.lang.String.valueOf(ca4.m0.D0(snsInfo.getSnsId()));
        this.f425854i = snsInfo.getUxinfo();
        this.f425855j = snsInfo.getAdXml().adExtInfo;
        ca4.k kVar2 = new ca4.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        } else {
            java.lang.String str = adClickActionInfo.M;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            kVar2.f39965a = str;
            java.lang.String str2 = adClickActionInfo.N;
            if (str2 == null) {
                str2 = "";
            }
            kVar2.f39966b = str2;
            java.lang.String str3 = adClickActionInfo.O;
            if (str3 == null) {
                str3 = "";
            }
            kVar2.f39967c = str3;
            java.lang.String str4 = adClickActionInfo.P;
            kVar2.f39968d = str4 != null ? str4 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        }
        this.f425852g = kVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }
}
