package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f137222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137223e;

    public j(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout, java.util.HashMap hashMap) {
        this.f137223e = faceFlashPreviewLayout;
        this.f137222d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f137222d.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS)) {
            java.lang.String str = (java.lang.String) this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS);
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137223e;
            android.widget.TextView textView = faceFlashPreviewLayout.f137021f;
            if (textView != null && textView.getVisibility() == 4 && faceFlashPreviewLayout.K.contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "showTopBusinessTips match tips: %s", str);
                faceFlashPreviewLayout.f137021f.setVisibility(0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent tips:%s isVerifying:%s,prepareVerifying:%s", str, java.lang.Boolean.valueOf(this.f137223e.f137037y), java.lang.Boolean.valueOf(this.f137223e.f137036x));
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout2 = this.f137223e;
            if (faceFlashPreviewLayout2.f137035w == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE || (!faceFlashPreviewLayout2.f137037y && !faceFlashPreviewLayout2.f137036x)) {
                faceFlashPreviewLayout2.f137032t.a(faceFlashPreviewLayout2.f137020e, str);
            }
        }
        if (this.f137222d.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent actions:" + this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION));
            if (java.util.Objects.equals(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION), com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.NET_REQ)) {
                vz2.c.d().f56171m = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout3 = this.f137223e;
                faceFlashPreviewLayout3.G = 0L;
                faceFlashPreviewLayout3.f137019d.setProgress(0.0f);
                this.f137223e.g();
                this.f137223e.f137030r.a();
                this.f137223e.f137025m.setVisibility(4);
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout4 = this.f137223e;
                faceFlashPreviewLayout4.f(faceFlashPreviewLayout4.f137020e, i65.a.r(faceFlashPreviewLayout4.getContext(), com.tencent.mm.R.string.net_reporting));
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f137223e.f137024i.getLayoutParams();
                layoutParams.topMargin = (int) (this.f137223e.f137019d.getCircleY() - (i65.a.h(this.f137223e.f137031s, com.tencent.mm.R.dimen.f480395wq) / 2));
                this.f137223e.f137024i.setLayoutParams(layoutParams);
                this.f137223e.f137024i.setVisibility(0);
                this.f137223e.f137027o.setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                android.view.View view = this.f137223e.f137027o;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (java.util.Objects.equals(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION), com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS)) {
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout5 = this.f137223e;
                int i17 = faceFlashPreviewLayout5.C + 1;
                faceFlashPreviewLayout5.C = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "STAGE_NOTPASS %s", java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout6 = this.f137223e;
                if (faceFlashPreviewLayout6.C > 10) {
                    if (faceFlashPreviewLayout6.f137036x && faceFlashPreviewLayout6.A) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "prepareVerifying and out rect time:%s", java.lang.Integer.valueOf(faceFlashPreviewLayout6.B));
                        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout7 = this.f137223e;
                        int i18 = faceFlashPreviewLayout7.B + 1;
                        faceFlashPreviewLayout7.B = i18;
                        if (i18 >= 4) {
                            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
                            this.f137223e.g();
                            this.f137223e.f137030r.a();
                            vz2.c.b().B = 6;
                            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout8 = this.f137223e;
                            faceFlashPreviewLayout8.f137029q.a7(((tz2.e) faceFlashPreviewLayout8.f137032t).f(i65.a.r(faceFlashPreviewLayout8.getContext(), com.tencent.mm.R.string.f491166c71), 90031).toString());
                        }
                    }
                    com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout9 = this.f137223e;
                    if (!faceFlashPreviewLayout9.f137037y && faceFlashPreviewLayout9.A) {
                        faceFlashPreviewLayout9.f137026n.setVisibility(4);
                        android.view.View view2 = this.f137223e.f137027o;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f137223e.setOnClickListener(null);
                        this.f137223e.e(wz2.a.c(this.f137223e.f137031s, (java.lang.String) this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS)));
                        this.f137223e.f137036x = false;
                    }
                    this.f137223e.A = false;
                }
            } else if (java.util.Objects.equals(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION), com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS)) {
                vz2.c.l("faceRecognized");
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout10 = this.f137223e;
                faceFlashPreviewLayout10.C = 0;
                faceFlashPreviewLayout10.A = true;
                if (!faceFlashPreviewLayout10.f137036x) {
                    faceFlashPreviewLayout10.f137036x = true;
                    com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = faceFlashPreviewLayout10.f137035w;
                    com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode2 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                    if (ytSDKKitFrameworkWorkMode == ytSDKKitFrameworkWorkMode2 && faceFlashPreviewLayout10.f137025m.getChildCount() == 0) {
                        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout11 = this.f137223e;
                        faceFlashPreviewLayout11.f137025m.setNumbers(((tz2.i) faceFlashPreviewLayout11.f137032t).G);
                        this.f137223e.f137025m.measure(0, 0);
                        int circleY = ((int) this.f137223e.f137019d.getCircleY()) - (this.f137223e.f137025m.getMeasuredHeight() / 2);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f137223e.f137025m.getLayoutParams();
                        layoutParams2.width = ((int) ((this.f137223e.getWidth() * com.tencent.mm.plugin.flash.view.FaceFlashReflectMask.f137256q) * 2.0f)) - i65.a.h(this.f137223e.f137031s, com.tencent.mm.R.dimen.f479714d7);
                        layoutParams2.topMargin = circleY;
                        this.f137223e.f137025m.setLayoutParams(layoutParams2);
                    }
                    com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout12 = this.f137223e;
                    faceFlashPreviewLayout12.f(faceFlashPreviewLayout12.f137020e, i65.a.r(faceFlashPreviewLayout12.getContext(), com.tencent.mm.R.string.fl_pose_incorrect));
                    com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout13 = this.f137223e;
                    faceFlashPreviewLayout13.f137032t.b(faceFlashPreviewLayout13.f137020e);
                    if (faceFlashPreviewLayout13.f137035w == ytSDKKitFrameworkWorkMode2) {
                        faceFlashPreviewLayout13.f137027o.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
                        android.view.View view3 = faceFlashPreviewLayout13.f137027o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        faceFlashPreviewLayout13.f137026n.setVisibility(0);
                        vz2.c.m(6);
                        faceFlashPreviewLayout13.setOnClickListener(new com.tencent.mm.plugin.flash.i(faceFlashPreviewLayout13));
                    }
                    if (faceFlashPreviewLayout13.f137036x) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "start face verity.");
                        vz2.c.m(3);
                        vz2.c.j("sdkVerify");
                        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode3 = faceFlashPreviewLayout13.f137035w;
                        if (ytSDKKitFrameworkWorkMode3 != ytSDKKitFrameworkWorkMode2) {
                            if (ytSDKKitFrameworkWorkMode3 == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                                vz2.c.m(7);
                            } else if (ytSDKKitFrameworkWorkMode3 == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE) {
                                vz2.c.m(5);
                            }
                            vz2.c.b().f56195t = java.lang.System.currentTimeMillis();
                            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, null);
                            faceFlashPreviewLayout13.f137037y = true;
                            faceFlashPreviewLayout13.f137033u.e();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "prepareVerifying = false ,face not in rect.");
                    }
                }
            }
        }
        if (this.f137222d.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT) && this.f137223e.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:" + this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT));
            this.f137223e.N.cancel();
            this.f137223e.g();
            this.f137223e.f137037y = false;
            if (!java.util.Objects.equals(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT), com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED)) {
                if (!java.util.Objects.equals(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT), com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:UNKNOWN ,param:%s", this.f137222d);
                    this.f137223e.f137029q.a7((java.lang.String) this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE));
                    return;
                }
                java.util.HashMap hashMap = this.f137222d;
                vz2.c.k("sdkResult", java.lang.Integer.valueOf(hashMap.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE) ? ((java.lang.Integer) hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)).intValue() : -1));
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:FAILED ,param:%s", this.f137222d);
                if (wz2.a.g(this.f137222d, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_VERIFY_TIMEOUT)) {
                    wz2.a.i(this.f137222d, i65.a.r(this.f137223e.f137031s, com.tencent.mm.R.string.f491173c81));
                } else if (wz2.a.g(this.f137222d, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_NETWORK_ERROR)) {
                    wz2.a.i(this.f137222d, i65.a.r(this.f137223e.f137031s, com.tencent.mm.R.string.net_fetch_failed));
                } else if (wz2.a.g(this.f137222d, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 4194304) && this.f137222d.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE).toString());
                        if ((jSONObject.optString("errormsg").equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_FACE) || jSONObject.optString("errormsg").equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_INCOMPLETE_FACE)) && !this.f137223e.H) {
                            vz2.c.b().f56187l++;
                            this.f137223e.f137030r.f137240a.getClass();
                            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().reset();
                            this.f137223e.a();
                            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout14 = this.f137223e;
                            faceFlashPreviewLayout14.f(faceFlashPreviewLayout14.f137020e, i65.a.r(faceFlashPreviewLayout14.getContext(), com.tencent.mm.R.string.fl_pose_not_in_rect));
                            return;
                        }
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "get message error,message:%s", this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE));
                    }
                }
                wz2.a.h(this.f137223e.getContext(), this.f137222d);
                this.f137223e.f137029q.a7((java.lang.String) this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE));
                return;
            }
            vz2.c.j("sdkResult");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:SUCCEED ,param:%s", this.f137222d);
            final tz2.j jVar = this.f137223e.f137033u;
            synchronized (jVar) {
                try {
                    if (jVar.f423285b) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "sendRequestUploadVideoAfterStop wait for stop finish");
                        jVar.f423292i = new java.lang.Runnable() { // from class: tz2.j$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                tz2.j jVar2 = tz2.j.this;
                                jVar2.f423294k.postToWorker(new tz2.j$$b(jVar2, "sendRequestUploadVideoAfterStop runnable exec"));
                            }
                        };
                    } else {
                        jVar.f423294k.postToWorker(new tz2.j$$b(jVar, "sendRequestUploadVideoAfterStop directly"));
                    }
                } finally {
                }
            }
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout15 = this.f137223e;
            com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI = faceFlashPreviewLayout15.f137029q;
            java.lang.String str2 = (java.lang.String) this.f137222d.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showSuccessLayout", java.lang.Integer.valueOf(faceFlashUI.hashCode()));
            com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout16 = faceFlashUI.f137051d;
            if (faceFlashPreviewLayout16.f137034v.isShowing()) {
                faceFlashPreviewLayout16.f137034v.dismiss();
            }
            faceFlashUI.f137056i = str2;
            vz2.c.g(str2);
            faceFlashUI.Z6(i65.a.d(faceFlashUI.getContext(), com.tencent.mm.R.color.f478714f5));
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                if (jSONObject2.optBoolean("selfHandle", false)) {
                    try {
                        faceFlashUI.V6(new org.json.JSONObject(str2));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManager", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    faceFlashUI.f137051d.setVisibility(8);
                    faceFlashUI.f137051d.b();
                    faceFlashUI.f137052e.setVisibility(0);
                    faceFlashUI.f137052e.a();
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.flash.u uVar = new com.tencent.mm.plugin.flash.u(faceFlashUI, jSONObject2);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(uVar, 1000L, false);
                }
                r2 = true;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "parse face success result error.%s", str2);
            }
            faceFlashPreviewLayout15.f137038z = r2;
        }
    }
}
