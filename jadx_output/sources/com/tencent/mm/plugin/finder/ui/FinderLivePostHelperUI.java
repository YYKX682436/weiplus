package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/n8", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLivePostHelperUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int C = 0;
    public final com.tencent.mm.sdk.event.IListener A;
    public final jz5.g B;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.se f128606v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.pr f128607w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ProgressBar f128608x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f128609y = "";

    /* renamed from: z, reason: collision with root package name */
    public int f128610z;

    public FinderLivePostHelperUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$realnameNotifyListener$1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent event = walletRealNameResultNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                int i17 = event.f54973g.f6120a;
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.this;
                if (i17 == -1) {
                    finderLivePostHelperUI.t7(finderLivePostHelperUI.f128610z);
                    finderLivePostHelperUI.f128610z = 0;
                } else {
                    com.tencent.mm.plugin.finder.live.widget.pr prVar = finderLivePostHelperUI.f128607w;
                    if (prVar == null) {
                        kotlin.jvm.internal.o.o("precheck");
                        throw null;
                    }
                    prVar.h(false, finderLivePostHelperUI.f128610z);
                    finderLivePostHelperUI.f128610z = 0;
                }
                return false;
            }
        };
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.ui.b9(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.d7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.e7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.f7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void g7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI) {
        finderLivePostHelperUI.A.alive();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(finderLivePostHelperUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI.class);
        intent.putExtra("enterRealnameVerifyUI", true);
        androidx.appcompat.app.AppCompatActivity context = finderLivePostHelperUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerify", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerify", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final void h7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, boolean z17) {
        finderLivePostHelperUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: authSucc=" + z17);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: auth failed, calling finishWithVerifyResult(false)");
            o7(finderLivePostHelperUI, false, 0, null, 6, null);
        } else {
            com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.z8(finderLivePostHelperUI, null), 2, null);
        }
    }

    public static final java.lang.Object i7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, kotlin.coroutines.Continuation continuation) {
        finderLivePostHelperUI.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderLivePostHelperUI, 1, true);
        k0Var.q(finderLivePostHelperUI.getString(com.tencent.mm.R.string.oyi), 17);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.g9(1, finderLivePostHelperUI, 2);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.h9(1, nVar, 2);
        k0Var.f211854d = new com.tencent.mm.plugin.finder.ui.i9(nVar);
        k0Var.v();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static final void j7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, int i17, java.lang.String str) {
        com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.k9(finderLivePostHelperUI, i17, str, null), 2, null);
    }

    public static final void k7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, java.lang.String str) {
        finderLivePostHelperUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "#startLive finderrealnameverify check");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", str);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(finderLivePostHelperUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r5, r45.tt4 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.tencent.mm.plugin.finder.ui.m9
            if (r0 == 0) goto L16
            r0 = r7
            com.tencent.mm.plugin.finder.ui.m9 r0 = (com.tencent.mm.plugin.finder.ui.m9) r0
            int r1 = r0.f129513f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f129513f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.ui.m9 r0 = new com.tencent.mm.plugin.finder.ui.m9
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f129511d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f129513f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r45.is2 r7 = new r45.is2
            r7.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.set(r4, r2)
            r2 = 6
            r7.set(r2, r6)
            java.lang.String r5 = xy2.c.e(r5)
            r6 = 3
            r7.set(r6, r5)
            com.tencent.mm.modelbase.i r5 = r7.d()
            r0.f129513f = r4
            java.lang.Object r7 = xg2.g.d(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L5d
            goto L8f
        L5d:
            xg2.h r7 = (xg2.h) r7
            boolean r5 = r7 instanceof xg2.i
            java.lang.String r6 = "Finder.FinderLivePostHelperUI"
            if (r5 != 0) goto L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "[CTID] uploadCTIDAuthResult failed: "
            r5.<init>(r0)
            boolean r0 = r7 instanceof xg2.b
            if (r0 == 0) goto L73
            xg2.b r7 = (xg2.b) r7
            goto L74
        L73:
            r7 = r3
        L74:
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r7.f454381b
            r3 = r7
            xg2.a r3 = (xg2.a) r3
        L7b:
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.e(r6, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L8f
        L88:
            java.lang.String r5 = "[CTID] uploadCTIDAuthResult success"
            com.tencent.mars.xlog.Log.i(r6, r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.l7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI, r45.tt4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void o7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI, boolean z17, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        finderLivePostHelperUI.n7(z17, i17, str);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488965ax5;
    }

    public final java.lang.Object m7(kotlin.coroutines.Continuation continuation) {
        q7().b();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.e6a);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.g(string);
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.a(true);
        u1Var.e(new com.tencent.mm.plugin.finder.ui.s8(rVar));
        u1Var.q(false);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final void n7(boolean z17, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "finishWithVerifyResult: success=" + z17 + ", newUserFlag=" + i17 + ", newRealnameAuthUrl=" + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("FACE_VERIFY_RESULT", z17 ? 1 : 0);
        if (z17) {
            intent.putExtra("RESULT_USER_FLAG", i17);
            intent.putExtra("RESULT_REALNAME_AUTH_URL", str);
        }
        setResult(-1, intent);
        p7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        switch (i17) {
            case 10000:
                android.content.Intent intent2 = new android.content.Intent();
                android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
                int i19 = -1;
                if (i18 == -1) {
                    if (bundleExtra != null) {
                        java.lang.String string = bundleExtra.getString("go_next", "");
                        java.lang.String string2 = bundleExtra.getString("result_json");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                            int i27 = new cl0.g(string2).getInt("code");
                            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult nextStep:" + string + ", code:" + i27);
                            if (kotlin.jvm.internal.o.b(string, "roomlive_verify") && i27 == 0) {
                                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                                intent2.putExtra("FACE_VERIFY_RESULT", 1);
                            }
                        }
                    }
                    i19 = -1;
                }
                setResult(i19, intent2);
                p7();
                return;
            case 10001:
                android.os.Bundle bundleExtra2 = intent != null ? intent.getBundleExtra("result_data") : null;
                if (i18 == -1 && bundleExtra2 != null) {
                    java.lang.String string3 = bundleExtra2.getString("go_next", "");
                    java.lang.String string4 = bundleExtra2.getString("result_json");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                        int i28 = new cl0.g(string4).getInt("code");
                        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult precheckTypeCache:" + this.f128610z + " nextStep:" + string3 + ", code:" + i28);
                        if (kotlin.jvm.internal.o.b(string3, "roomlive_verify") && i28 == 0) {
                            t7(this.f128610z);
                            this.f128610z = 0;
                            return;
                        }
                    }
                }
                com.tencent.mm.plugin.finder.live.widget.pr prVar = this.f128607w;
                if (prVar == null) {
                    kotlin.jvm.internal.o.o("precheck");
                    throw null;
                }
                prVar.h(false, this.f128610z);
                this.f128610z = 0;
                return;
            case 40001:
                return;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN /* 40002 */:
                android.os.Bundle bundleExtra3 = intent != null ? intent.getBundleExtra("result_data") : null;
                if (i18 != -1 || bundleExtra3 == null) {
                    return;
                }
                java.util.Map map = (java.util.Map) bundleExtra3.getSerializable("next_params");
                if (map != null) {
                    java.lang.String str = (java.lang.String) map.get("next_step");
                    java.lang.String str2 = (java.lang.String) map.get("result");
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult precheckTypeCache:" + this.f128610z + " nextStep:" + str + ", resultMap:" + str2);
                    if (r26.i0.p("realname_verify", str, true) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        cl0.g gVar = new cl0.g(str2);
                        java.lang.String string5 = gVar.getString("code");
                        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult precheckTypeCache:" + this.f128610z + " nextStep:" + str + ", code:" + string5 + ", msg:" + gVar.getString("msg"));
                        java.lang.String str3 = string5 == null ? "" : string5;
                        com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = getUICScope();
                        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                        kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.v8(this, str3, null), 2, null);
                    }
                }
                this.f128610z = 0;
                return;
            case 40006:
                android.os.Bundle bundleExtra4 = intent != null ? intent.getBundleExtra("result_data") : null;
                if (i18 == -1 && bundleExtra4 != null) {
                    java.io.Serializable serializable = bundleExtra4.getSerializable("next_params");
                    java.util.Map map2 = serializable instanceof java.util.Map ? (java.util.Map) serializable : null;
                    if (map2 != null) {
                        java.lang.Object obj = map2.get("next_step");
                        java.lang.String str4 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                        java.lang.Object obj2 = map2.get("result");
                        java.lang.String str5 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult EXTERNAL nextStep:" + str4 + ", resultMap:" + str5);
                        if (r26.i0.p("realname_verify", str4, true) && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            java.lang.String string6 = new cl0.g(str5).getString("code");
                            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult EXTERNAL code:" + string6);
                            com.tencent.mm.sdk.coroutines.LifecycleScope uICScope2 = getUICScope();
                            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(uICScope2, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.c9(this, string6, null), 2, null);
                            return;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "onActivityResult EXTERNAL: not auth success, finishing");
                o7(this, false, 0, null, 6, null);
                return;
            default:
                com.tencent.mm.plugin.finder.live.widget.pr prVar2 = this.f128607w;
                if (prVar2 == null) {
                    kotlin.jvm.internal.o.o("precheck");
                    throw null;
                }
                if (i17 == 10123 && i18 == -1) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    c17.x(u3Var, bool);
                    prVar2.f119423x = true;
                    if (prVar2.f119424y || prVar2.B || prVar2.C) {
                        prVar2.e();
                        return;
                    }
                    yz5.l lVar = prVar2.f119413n;
                    if (lVar != null) {
                        lVar.invoke(bool);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.qp1 qp1Var;
        r45.qc6 qc6Var;
        super.onCreate(bundle);
        hideTitleView();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fg7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128606v = new com.tencent.mm.plugin.finder.live.widget.se(findViewById, null, null, null, 14, null);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fgp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.pr prVar = new com.tencent.mm.plugin.finder.live.widget.pr((android.view.ViewGroup) findViewById2);
        this.f128607w = prVar;
        prVar.f119412m = new com.tencent.mm.plugin.finder.ui.d9(this);
        prVar.f119413n = new com.tencent.mm.plugin.finder.ui.e9(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f4o);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128608x = (android.widget.ProgressBar) findViewById3;
        int intExtra = getIntent().getIntExtra("LIVE_HELP_TYPE", 0);
        try {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("LIVE_ERROR_PAGE");
            com.tencent.mm.protobuf.f parseFrom = byteArrayExtra != null ? new r45.qp1().parseFrom(byteArrayExtra) : null;
            qp1Var = parseFrom instanceof r45.qp1 ? (r45.qp1) parseFrom : null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostHelperUI", "#initIntent " + e17);
            qp1Var = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "initIntent: type=" + intExtra);
        if (intExtra == 1) {
            java.lang.String stringExtra = getIntent().getStringExtra("FACE_VERIFY_URL");
            this.f128609y = stringExtra != null ? stringExtra : "";
            int intExtra2 = getIntent().getIntExtra("PRECHECK_TYPE", 3);
            boolean booleanExtra = getIntent().getBooleanExtra("SKIP_INTERMEDIATE_PAGE", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("DIRECT_CTID", false);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "initIntent: FACE_VERIFY, precheckType=" + intExtra2 + ", skipIntermediatePage=" + booleanExtra + ", directCtid=" + booleanExtra2 + ", faceVerifyUrl=" + this.f128609y);
            if (booleanExtra) {
                if (booleanExtra2) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "initIntent: directCtid=true, calling startCTIDAuth directly");
                    u7(true, 5);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "initIntent: skipIntermediatePage=true, calling gotoFaceVerifyByTypeWithoutIntermediatePage");
                    r7(this.f128609y, intExtra2);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "initIntent: skipIntermediatePage=false, calling gotoFaceVerifyByType");
            java.lang.String str = this.f128609y;
            this.f128610z = intExtra2;
            com.tencent.mm.plugin.finder.live.widget.se seVar = this.f128606v;
            if (seVar != null) {
                com.tencent.mm.plugin.finder.live.widget.se.d(seVar, 2, qp1Var, 0, new com.tencent.mm.plugin.finder.ui.x8(intExtra2, this, str), 4, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("exception");
                throw null;
            }
        }
        if (intExtra == 2 || intExtra == 3) {
            com.tencent.mm.plugin.finder.live.widget.se seVar2 = this.f128606v;
            if (seVar2 != null) {
                com.tencent.mm.plugin.finder.live.widget.se.d(seVar2, 1, qp1Var, 0, new com.tencent.mm.plugin.finder.ui.a9(this), 4, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("exception");
                throw null;
            }
        }
        if (intExtra != 11) {
            return;
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("PRECHECK_SPAMRISK");
        if (byteArrayExtra2 != null) {
            qc6Var = new r45.qc6();
            qc6Var.parseFrom(byteArrayExtra2);
        } else {
            qc6Var = null;
        }
        if (qc6Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostHelperUI", "LIVE_PRECHECK error, spamRisk is empty!");
            finish();
            return;
        }
        int intExtra3 = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("REALNAME_AUTH_URL");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        com.tencent.mm.plugin.finder.live.widget.pr prVar2 = this.f128607w;
        if (prVar2 == null) {
            kotlin.jvm.internal.o.o("precheck");
            throw null;
        }
        int intExtra4 = getIntent().getIntExtra("PRECHECK_USERFLAG", 0);
        prVar2.D = intExtra3;
        prVar2.E = longExtra;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.or(prVar2, intExtra4, qc6Var, str2));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        android.widget.ProgressBar progressBar = this.f128608x;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("progressBar");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.widget.ProgressBar progressBar = this.f128608x;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("progressBar");
            throw null;
        }
    }

    public final void p7() {
        finish();
        overridePendingTransition(0, 0);
    }

    public final com.tencent.mm.plugin.finder.assist.d9 q7() {
        return (com.tencent.mm.plugin.finder.assist.d9) ((jz5.n) this.B).getValue();
    }

    public final void r7(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "gotoFaceVerifyByTypeWithoutIntermediatePage: precheckType=" + i17 + ", verifyUrl=" + str);
        this.f128610z = i17;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "gotoFaceVerifyByTypeWithoutIntermediatePage: PRECHECK_REALNAME, calling goToPayRealNameVerifyForExternal");
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "goToPayRealNameVerifyForExternal: starting FinderLiveRealNameVerifyJumpUI");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI.class);
            intent.putExtra("enterRealnameVerifyUI", true);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerifyForExternal", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerifyForExternal", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "goToPayRealNameVerifyForExternal: returning to caller, user needs to click again after auth");
            o7(this, false, 0, null, 6, null);
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "gotoFaceVerifyByTypeWithoutIntermediatePage: PRECHECK_FINDER_REALNAME, calling finderRealNameAuth");
            com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = getUICScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.y8(this, null), 2, null);
            return;
        }
        if (i17 != 5) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "gotoFaceVerifyByTypeWithoutIntermediatePage: other type, calling gotoFaceVerifyImpl");
            s7(str, 10000);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "gotoFaceVerifyByTypeWithoutIntermediatePage: PRECHECK_FINDER_REALNAME_NEW, calling startFinderRealNameNewAuthForExternal");
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelperUI", "#startFinderRealNameNewAuthForExternal verifyUrl:" + str);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("open_custom_style_url", true);
        intent2.putExtra("forceHideShare", true);
        intent2.putExtra("show_native_web_view", true);
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("screen_orientation", 1);
        j45.l.n(getContext(), "webview", ".ui.tools.WebViewUI", intent2, 40006);
    }

    public final void s7(java.lang.String str, int i17) {
        android.widget.ProgressBar progressBar = this.f128608x;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", str);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(getContext(), "webview", ".ui.tools.WebViewUI", intent, i17);
    }

    public final void t7(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.live.widget.pr prVar = this.f128607w;
            if (prVar == null) {
                kotlin.jvm.internal.o.o("precheck");
                throw null;
            }
            if (!prVar.f119425z) {
                com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = getUICScope();
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.f9(this, i17, null), 2, null);
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.widget.pr prVar2 = this.f128607w;
        if (prVar2 != null) {
            prVar2.h(true, i17);
        } else {
            kotlin.jvm.internal.o.o("precheck");
            throw null;
        }
    }

    public final void u7(boolean z17, int i17) {
        com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = getUICScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.ui.l9(z17, this, i17, null), 2, null);
    }
}
