package s74;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f404320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s74.o0 o0Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f404319d = o0Var;
        this.f404320e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        s74.f3 f3Var;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        java.lang.String str3 = "invoke";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        s74.o0 o0Var = this.f404319d;
        com.tencent.mm.plugin.sns.ui.MaskImageView F = o0Var.F();
        if (F != null) {
            F.settouchEnable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mars.xlog.Log.i(o0Var.j(), "processClickableViews");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) o0Var.i();
        if (snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        } else {
            android.content.Context E = o0Var.E();
            android.app.Activity activity = E instanceof android.app.Activity ? (android.app.Activity) E : null;
            if (activity != null) {
                s74.f3 f3Var2 = o0Var.f404458y;
                if (f3Var2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.List list = f3Var2.f404288v;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (it.hasNext()) {
                        jz5.l lVar = (jz5.l) it.next();
                        android.view.View view = (android.view.View) lVar.f302833d;
                        org.json.JSONObject jSONObject = (org.json.JSONObject) lVar.f302834e;
                        if (kotlin.jvm.internal.o.b(jSONObject.optString(dm.i4.COL_ID), "clickActionButton")) {
                            com.tencent.mars.xlog.Log.e(o0Var.j(), "clickActionButton is already clickable!");
                        } else if (kotlin.jvm.internal.o.b(jSONObject.optString("type"), "gridElement")) {
                            com.tencent.mars.xlog.Log.e(o0Var.j(), "gridElement is already clickable!");
                        } else {
                            if (jSONObject.has("click-type")) {
                                boolean b17 = kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "rootElementClick");
                                s74.p2 p2Var = o0Var.f404452s;
                                if (b17) {
                                    view.setTag(p2Var.e());
                                    view.setOnClickListener(new s74.b0(o0Var));
                                } else {
                                    str2 = str3;
                                    if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "mainElementClick")) {
                                        if (f3Var2.e().f289288b.isCombinedGridAD()) {
                                            w64.n nVar = new w64.n(o0Var.E(), o0Var.f404448o, o0Var.f404449p, null, new s74.j0(view));
                                            s74.c0 c0Var = new s74.c0(view);
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnGetJumpAnimInfoListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                                            nVar.f443327t = c0Var;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnGetJumpAnimInfoListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                                            com.tencent.mm.plugin.sns.storage.m0 m0Var = f3Var2.e().f289288b.adCombinedGridInfo;
                                            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = m0Var != null ? m0Var.a() : null;
                                            if (a17 != null) {
                                                a17.f162569a = 11;
                                                nVar.p(new w64.c(a17, snsInfo2, 0, null, true, 1, false, null, 204, null));
                                            }
                                            view.setOnClickListener(new s74.d0(snsInfo2, o0Var, nVar));
                                        } else {
                                            view.setTag(p2Var.e());
                                            i64.q e17 = f3Var2.e();
                                            e17.getClass();
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                                            if (e17.f289290d) {
                                                view.setOnClickListener(new s74.e0(o0Var));
                                            } else {
                                                view.setOnClickListener(new s74.f0(o0Var));
                                            }
                                        }
                                    } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "actionLinkClick")) {
                                        view.setTag(java.lang.Long.valueOf(snsInfo2.field_snsId));
                                        view.setOnClickListener(new s74.g0(o0Var));
                                    } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "gameGiftTagClick")) {
                                        view.setOnClickListener(new s74.h0(o0Var, snsInfo2, f3Var2));
                                    } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "consultBarTitleClick") || kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "consultBarButtonClick")) {
                                        view.setOnClickListener(new s74.i0(f3Var2, o0Var, snsInfo2, jSONObject));
                                    } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "actionButtonClick")) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createActionButtonClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                                        final s74.e1 e1Var = new s74.e1((s74.o2) o0Var, snsInfo2, o0Var.f404450q);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createActionButtonClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                                        view.setOnClickListener(new android.view.View.OnClickListener(e1Var) { // from class: s74.l0

                                            /* renamed from: d, reason: collision with root package name */
                                            public final /* synthetic */ yz5.l f404401d;

                                            {
                                                kotlin.jvm.internal.o.g(e1Var, "function");
                                                this.f404401d = e1Var;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View view2) {
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$sam$android_view_View_OnClickListener$0");
                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                arrayList.add(view2);
                                                java.lang.Object[] array = arrayList.toArray();
                                                arrayList.clear();
                                                yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                                                this.f404401d.invoke(view2);
                                                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$sam$android_view_View_OnClickListener$0");
                                            }
                                        });
                                    } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "gridElementClick")) {
                                        com.tencent.mars.xlog.Log.i(o0Var.j(), "init gridElementClick, id=" + jSONObject.optString(dm.i4.COL_ID) + ", type=" + jSONObject.optString("type"));
                                        if (snsInfo2.isCombinedGridAD()) {
                                            view.setOnClickListener(new s74.y(o0Var, view));
                                        } else {
                                            view.setTag(p2Var.e());
                                            com.tencent.mm.plugin.sns.ui.listener.i f17 = p2Var.f();
                                            view.setOnClickListener(f17 != null ? f17.f169813p : null);
                                        }
                                    }
                                }
                            } else {
                                str2 = str3;
                                if (jSONObject.has("bind-click-action-info")) {
                                    java.lang.String optString = jSONObject.optString("bind-click-action-info");
                                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f18 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(snsInfo2.getAdXml().mValuesMap, snsInfo2.getAdXml().mKeyPrefix + '.' + optString);
                                    f18.f162569a = 15;
                                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
                                    kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                                    r45.a90 a90Var = timeLine.ContentObj;
                                    if (!(a90Var != null && a90Var.f369837e == 5)) {
                                        if (!(a90Var != null && a90Var.f369837e == 15)) {
                                            z17 = false;
                                            f3Var = f3Var2;
                                            boolean z18 = z17;
                                            snsInfo = snsInfo2;
                                            view.setOnClickListener(new s74.a0(activity, o0Var, f18, snsInfo2, z18, view));
                                            snsInfo2 = snsInfo;
                                            f3Var2 = f3Var;
                                            str3 = str2;
                                        }
                                    }
                                    z17 = true;
                                    f3Var = f3Var2;
                                    boolean z182 = z17;
                                    snsInfo = snsInfo2;
                                    view.setOnClickListener(new s74.a0(activity, o0Var, f18, snsInfo2, z182, view));
                                    snsInfo2 = snsInfo;
                                    f3Var2 = f3Var;
                                    str3 = str2;
                                }
                            }
                            f3Var = f3Var2;
                            snsInfo = snsInfo2;
                            snsInfo2 = snsInfo;
                            f3Var2 = f3Var;
                            str3 = str2;
                        }
                        str2 = str3;
                        f3Var = f3Var2;
                        snsInfo = snsInfo2;
                        snsInfo2 = snsInfo;
                        f3Var2 = f3Var;
                        str3 = str2;
                    }
                }
                str = str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                s74.o0.y(o0Var, (s74.j3) this.f404320e.f310123d);
                java.lang.String str4 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
                return f0Var;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        str = "invoke";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.o0.y(o0Var, (s74.j3) this.f404320e.f310123d);
        java.lang.String str42 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str42, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str42, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        return f0Var2;
    }
}
