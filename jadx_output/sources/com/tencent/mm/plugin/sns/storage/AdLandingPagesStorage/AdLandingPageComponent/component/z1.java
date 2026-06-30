package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class z1 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public static final java.util.HashMap I = new java.util.HashMap();
    public final db4.a B;
    public com.tencent.mm.ui.widget.dialog.u3 C;
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1 D;
    public java.lang.String E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final java.lang.String H;

    public z1(android.content.Context context, db4.a aVar, android.view.ViewGroup viewGroup) {
        super(context, aVar, viewGroup);
        this.E = "0";
        this.B = aVar;
        if (aVar.f228274z1 != null) {
            this.f165386t.b("appointmentId", aVar.f228274z1.f402546a + "");
        } else {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "appointmentInfo==null");
            this.f165386t.b("appointmentId", "");
        }
        this.F = aVar.M;
        this.G = aVar.I;
        this.H = aVar.N;
        this.D = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1(context, this, aVar.f228274z1.f402546a);
    }

    public static void h0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ab4.n0 u17 = z1Var.u();
            jSONObject.put("snsid", u17.j());
            jSONObject.put("uxinfo", u17.o());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, u17.l());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            s34.a aVar = z1Var.B.f228274z1;
            jSONObject2.put("appointmentId", aVar == null ? 0L : aVar.f402546a);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("canvas_ad_appointment_cancel_action", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "doCancelReport, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public static void i0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = z1Var.B;
        if (aVar.f228274z1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            try {
                ab4.n0 u17 = z1Var.u();
                java.lang.String o17 = u17.o();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (o17 == null) {
                    o17 = "";
                }
                new c84.c(z1Var.f165049d, 2).h(u17.j(), o17, aVar.f228274z1, z1Var.E);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showSuccHalfDialog exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 r5, int r6, boolean r7) {
        /*
            java.lang.String r0 = "access$500"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r5.getClass()
            java.lang.String r2 = "showResultToast"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            db4.a r3 = r5.B
            s34.a r3 = r3.f228274z1
            if (r3 != 0) goto L1a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L5c
        L1a:
            if (r6 != 0) goto L21
            if (r7 != 0) goto L2c
            java.lang.String r6 = r3.f402556k
            goto L2e
        L21:
            r4 = 1
            if (r6 != r4) goto L2c
            if (r7 == 0) goto L29
            java.lang.String r6 = r3.f402557l
            goto L2e
        L29:
            java.lang.String r6 = r3.f402558m
            goto L2e
        L2c:
            java.lang.String r6 = ""
        L2e:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L59
            android.content.Context r5 = r5.f165049d
            if (r7 == 0) goto L3c
            db5.t7.h(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L59
        L3c:
            db5.t7.g(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L59
        L40:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "showResultToast, exp="
            r6.<init>(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ADAppointment.AdLandingPageAppointmentBtnComp"
            com.tencent.mars.xlog.Log.e(r6, r5)
        L59:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L5c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1.j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1, int, boolean):void");
    }

    public static void l0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = z1Var.B;
        if (aVar.f228274z1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "onStatusChange, old=" + z1Var.E + ", new=" + str);
            z1Var.E = str;
            z1Var.q0();
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().setAdValue(z1Var.u().j(), l44.d.e(aVar.f228274z1.f402546a), str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = this.B;
        if (aVar.f228274z1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "onBtnClick, status=" + this.E);
        boolean equals = "0".equals(this.E);
        android.content.Context context = this.f165049d;
        if (equals) {
            ab4.n0 u17 = u();
            s34.a aVar2 = aVar.f228274z1;
            boolean z17 = (aVar2.f402561p != 1 || com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f402563r) || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f228274z1.f402562q)) ? false : true;
            java.lang.String phoneNumber = z17 ? com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getPhoneNumber() : "";
            if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(phoneNumber) && (context instanceof com.tencent.mm.ui.MMActivity)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestPhoneNumberInHfScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
                eb4.d dVar = eb4.d.f250884a;
                s34.a aVar3 = aVar.f228274z1;
                dVar.a((com.tencent.mm.ui.MMActivity) context, phoneNumber, aVar3.f402562q, aVar3.f402563r, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1(this, u17, phoneNumber));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestPhoneNumberInHfScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            } else {
                n0(u17.o(), aVar.f228274z1.f402546a, 0);
            }
            this.f165386t.a("opType", 0L);
        } else if ("1".equals(this.E)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            if (aVar.f228274z1 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            } else {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                k0Var.f211872n = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v1(this);
                k0Var.X1 = true;
                k0Var.f211881s = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w1(this);
                k0Var.v();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            }
            this.f165386t.a("opType", 1L);
        }
        P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        super.k();
        db4.a aVar = this.B;
        s34.a aVar2 = aVar.f228274z1;
        if (aVar2 == null) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem,appointmentInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        long j17 = aVar2.f402546a;
        ab4.n0 u17 = u();
        java.lang.String j18 = u17.j();
        l44.d.e(j17);
        java.lang.String d17 = l44.d.d(j18, aVar.f228274z1);
        com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem, snsId=" + j18 + ", cacheStatus=" + d17);
        this.E = d17;
        q0();
        if (!"1000".equals(this.E)) {
            java.util.HashMap hashMap = I;
            long longValue = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() : 0L;
            if (longValue == 0 || java.lang.System.currentTimeMillis() - longValue > 30000) {
                n0(u17.o(), j17, 2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.C;
            if (u3Var != null && u3Var.isShowing()) {
                this.C.dismiss();
            }
            android.content.Context context = this.f165049d;
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public final void n0(java.lang.String str, long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        o0(str, j17, i17, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public final void o0(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "sendAppointmentReq, opType=" + i17 + ", id=" + j17 + ", uxInfo=" + str);
        if (android.text.TextUtils.isEmpty(str) || j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        if (i17 == 0) {
            p0();
        } else if (i17 == 1) {
            p0();
        }
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().sendAppointmentReq(str, j17, i17, str2, this.D);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void p0() {
        android.content.Context context = this.f165049d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490604zq);
            if (this.C == null) {
                this.C = com.tencent.mm.ui.widget.dialog.u3.c(context, string, true, 0, null);
            }
            if (!this.C.isShowing()) {
                this.C.show();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void q0() {
        android.widget.Button button;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = this.B;
        if (aVar.f228274z1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "updateBtnUI, status=" + this.E);
        android.widget.Button button2 = this.f165859v;
        if (button2 != null) {
            button2.setEnabled(true);
        }
        boolean equals = "0".equals(this.E);
        java.lang.String str = this.H;
        java.lang.String str2 = this.G;
        java.lang.String str3 = this.F;
        if (equals) {
            aVar.M = str3;
            aVar.I = str2;
            aVar.N = str;
        } else {
            int A1 = (int) (com.tencent.mm.sdk.platformtools.t8.A1("0.6") * 255.0d);
            if (!android.text.TextUtils.isEmpty(str3)) {
                X().M = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str3.substring(1));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                X().I = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str2.substring(1));
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                X().N = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str.substring(1));
            }
            if ("1000".equals(this.E) && (button = this.f165859v) != null) {
                button.setEnabled(false);
            }
        }
        b0();
        if ("1".equals(this.E)) {
            this.f165859v.setText(aVar.f228274z1.f402554i);
        } else if ("1000".equals(this.E)) {
            this.f165859v.setText(aVar.f228274z1.f402560o);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }
}
