package s74;

/* loaded from: classes4.dex */
public final class k implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404372b;

    /* renamed from: c, reason: collision with root package name */
    public final int f404373c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f404374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f404375e;

    /* renamed from: f, reason: collision with root package name */
    public final w64.w f404376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404378h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404379i;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(com.tencent.mm.plugin.sns.storage.SnsInfo r6, int r7, s74.o0 r8, org.json.JSONObject r9, android.view.View r10) {
        /*
            r5 = this;
            r5.f404377g = r8
            r5.f404378h = r9
            r5.f404379i = r10
            r5.<init>()
            java.lang.String r6 = r6.getSnsId()
            if (r6 != 0) goto L11
            java.lang.String r6 = ""
        L11:
            r5.f404372b = r6
            r5.f404373c = r7
            s74.f3 r6 = r8.D()
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext"
            java.lang.String r9 = "true"
            java.lang.String r10 = "no-transition-anim"
            r0 = 0
            if (r6 == 0) goto L62
            java.lang.String r1 = "getMainElementContainerSubAbsoluteViews"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
            java.util.List r6 = r6.C
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
            if (r6 == 0) goto L62
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r6.next()
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            s74.q4 r4 = s74.q4.f404513a
            org.json.JSONObject r3 = r4.g(r3)
            if (r3 == 0) goto L55
            java.lang.String r3 = r3.optString(r10)
            goto L56
        L55:
            r3 = r0
        L56:
            boolean r3 = kotlin.jvm.internal.o.b(r3, r9)
            r3 = r3 ^ 1
            if (r3 == 0) goto L3b
            r1.add(r2)
            goto L3b
        L62:
            r1 = r0
        L63:
            r5.f404374d = r1
            s74.f3 r6 = r8.D()
            if (r6 == 0) goto Laa
            java.lang.String r1 = "getOtherAlphaAnimViews"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
            java.util.List r6 = r6.f404287u
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
            if (r6 == 0) goto Laa
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r6 = r6.iterator()
        L82:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r6.next()
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            s74.q4 r3 = s74.q4.f404513a
            org.json.JSONObject r2 = r3.g(r2)
            if (r2 == 0) goto L9c
            java.lang.String r2 = r2.optString(r10)
            goto L9d
        L9c:
            r2 = r0
        L9d:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r9)
            r2 = r2 ^ 1
            if (r2 == 0) goto L82
            r7.add(r1)
            goto L82
        La9:
            r0 = r7
        Laa:
            r5.f404375e = r0
            s74.j r6 = new s74.j
            r6.<init>(r8)
            r5.f404376f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.k.<init>(com.tencent.mm.plugin.sns.storage.SnsInfo, int, s74.o0, org.json.JSONObject, android.view.View):void");
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return null;
    }

    @Override // w64.x
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return this.f404372b;
    }

    @Override // w64.x
    public android.view.View c() {
        com.google.android.flexbox.FlexboxLayout k17;
        com.google.android.flexbox.FlexboxLayout k18;
        com.google.android.flexbox.FlexboxLayout k19;
        com.google.android.flexbox.FlexboxLayout k27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        org.json.JSONObject jSONObject = this.f404378h;
        boolean b17 = kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "gridElementClick");
        s74.o0 o0Var = this.f404377g;
        if (b17) {
            if (kotlin.jvm.internal.o.b(jSONObject.optString("type"), "gridElement")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
                return this.f404379i;
            }
            s74.f3 D = o0Var.D();
            if (((D == null || (k27 = D.k()) == null) ? 0 : k27.getChildCount()) > 0) {
                s74.f3 D2 = o0Var.D();
                if (D2 != null && (k19 = D2.k()) != null) {
                    r5 = k19.getChildAt(0);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
                return r5;
            }
        }
        s74.f3 D3 = o0Var.D();
        if ((D3 != null ? D3.o() : null) != null) {
            s74.f3 D4 = o0Var.D();
            r5 = D4 != null ? D4.o() : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
            return r5;
        }
        s74.f3 D5 = o0Var.D();
        if (((D5 == null || (k18 = D5.k()) == null) ? 0 : k18.getChildCount()) <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
            return null;
        }
        s74.f3 D6 = o0Var.D();
        if (D6 != null && (k17 = D6.k()) != null) {
            r5 = k17.getChildAt(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return r5;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        w64.w wVar = this.f404376f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return wVar;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        java.util.List list = this.f404375e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return list;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        com.tencent.mm.plugin.sns.ui.listener.i f17 = this.f404377g.C().f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return f17;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        java.util.List list = this.f404374d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return list;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1");
        return this.f404373c;
    }
}
