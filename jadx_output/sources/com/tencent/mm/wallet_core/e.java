package com.tencent.mm.wallet_core;

/* loaded from: classes14.dex */
public class e extends android.view.View.AccessibilityDelegate {
    private static final java.lang.String TAG = "MicroMsg.KindaAccessibilityDelegate";
    boolean isCLickEvent;
    boolean isTTSKeyboardMode;
    private android.view.View.AccessibilityDelegate origin;
    private boolean shouldSpeakPassWord;
    private com.tencent.kinda.gen.StatesType statesType;
    private com.tencent.kinda.gen.TraitsType viewType;

    public e() {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = null;
        this.isCLickEvent = false;
        this.isTTSKeyboardMode = false;
    }

    public final void a(android.view.View view, int i17) {
        if ((j62.e.g().i("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && fp.h.c(30) && la5.b.f317600a.g(true) && i17 == 32768) {
            com.tencent.mars.xlog.Log.i(TAG, "send event step 2");
            super.sendAccessibilityEvent(view, i17);
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "send event step 3");
        if (view != null && i17 == 1) {
            if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
                com.tencent.mars.xlog.Log.i(TAG, "send event step 4");
                la5.b.f317600a.e(view);
                return;
            }
            return;
        }
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEvent(view, i17);
        } else {
            accessibilityDelegate.sendAccessibilityEvent(view, i17);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        try {
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getMessage());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.isTTSKeyboardMode) {
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            return accessibilityDelegate == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.setContentDescription("");
        accessibilityEvent.setClassName("");
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
        if (this.isTTSKeyboardMode) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription("");
            accessibilityEvent.setClassName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        com.tencent.kinda.gen.StatesType statesType;
        com.tencent.kinda.gen.TraitsType traitsType;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
        if (accessibilityNodeInfo != null && (traitsType = this.viewType) != null) {
            int i17 = com.tencent.mm.wallet_core.d.f213797a[traitsType.ordinal()];
            if (i17 == 1) {
                accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
            } else if (i17 == 2) {
                accessibilityNodeInfo.setClassName(android.widget.CheckBox.class.getName());
            }
        }
        if (accessibilityNodeInfo != null && (statesType = this.statesType) != null) {
            int i18 = com.tencent.mm.wallet_core.d.f213798b[statesType.ordinal()];
            if (i18 == 1) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            } else if (i18 == 2) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(false);
            }
        }
        if (this.isTTSKeyboardMode) {
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setContentDescription("");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText("");
            }
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setViewIdResourceName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        if (this.isTTSKeyboardMode) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription("");
            accessibilityEvent.setClassName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.performAccessibilityAction(view, i17, bundle) : accessibilityDelegate.performAccessibilityAction(view, i17, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r4) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r2 == false) goto L37;
     */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendAccessibilityEvent(android.view.View r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.shouldSpeakPassWord
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.KindaAccessibilityDelegate"
            java.lang.String r2 = "send event %s, event %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = r6.shouldSpeakPassWord
            if (r0 == 0) goto L27
            android.view.View$AccessibilityDelegate r0 = r6.origin
            if (r0 != 0) goto L22
            super.sendAccessibilityEvent(r7, r8)
            goto La4
        L22:
            r0.sendAccessibilityEvent(r7, r8)
            goto La4
        L27:
            r0 = 1
            if (r7 == 0) goto L33
            if (r8 != r0) goto L33
            java.lang.String r2 = "click event"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r6.isCLickEvent = r0
        L33:
            boolean r2 = r6.isTTSKeyboardMode
            r3 = 0
            if (r2 == 0) goto L8c
            if (r7 == 0) goto L8c
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r8 != r2) goto L8c
            com.tencent.mm.accessibility.uitl.AccUtil r2 = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE
            boolean r2 = r2.isAccessibilityEnabled()
            if (r2 == 0) goto L8c
            boolean r2 = r7 instanceof android.widget.TextView
            if (r2 == 0) goto L5d
            r4 = r7
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L5d
            goto L6d
        L5d:
            java.lang.CharSequence r4 = r7.getContentDescription()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L6c
            java.lang.String r4 = r4.toString()
            goto L6d
        L6c:
            r4 = 0
        L6d:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L8c
            boolean r5 = r6.isCLickEvent
            if (r5 == 0) goto L7f
            java.lang.String r0 = "focus after click， ignore tts"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r6.isCLickEvent = r3
            goto L8c
        L7f:
            android.content.Context r1 = r7.getContext()
            com.tenpay.android.wechat.TenpayTTSUtil.checkInit(r1)
            com.tenpay.android.wechat.TenpayTTSUtil.speak(r4)
            if (r2 != 0) goto L8c
            goto L8d
        L8c:
            r0 = r3
        L8d:
            if (r0 == 0) goto La1
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.wallet_core.c r1 = new com.tencent.mm.wallet_core.c
            r1.<init>(r6, r7, r8)
            ku5.t0 r0 = (ku5.t0) r0
            r0.getClass()
            r7 = 600(0x258, double:2.964E-321)
            r0.z(r1, r7, r3)
            goto La4
        La1:
            r6.a(r7, r8)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.e.sendAccessibilityEvent(android.view.View, int):void");
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mars.xlog.Log.i(TAG, "send uncheck step 1 %s, event %d", java.lang.Boolean.valueOf(this.shouldSpeakPassWord), java.lang.Integer.valueOf(accessibilityEvent.getEventType()));
        boolean z17 = true;
        if (accessibilityEvent.getEventType() != 1 && accessibilityEvent.getEventType() != 16 && accessibilityEvent.getEventType() != 2048) {
            z17 = false;
        }
        if (this.shouldSpeakPassWord || !z17) {
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                return;
            } else {
                accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                return;
            }
        }
        if (view == null || !com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "send uncheck step 4");
        la5.c cVar = la5.b.f317600a;
        if (cVar.f317606d == null) {
            cVar.f317606d = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        }
        android.os.Vibrator vibrator = cVar.f317606d;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
    }

    public void setStatesType(com.tencent.kinda.gen.StatesType statesType) {
        this.statesType = statesType;
    }

    public void setViewType(com.tencent.kinda.gen.TraitsType traitsType) {
        this.viewType = traitsType;
    }

    public e(com.tencent.kinda.gen.TraitsType traitsType) {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = null;
        this.isCLickEvent = false;
        this.isTTSKeyboardMode = false;
        setViewType(traitsType);
    }

    public e(boolean z17) {
        this.viewType = null;
        this.statesType = null;
        this.shouldSpeakPassWord = true;
        this.origin = null;
        this.isCLickEvent = false;
        this.isTTSKeyboardMode = false;
        com.tencent.mars.xlog.Log.i(TAG, "password window init");
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_pwd_accessibility_v2, false)) {
                com.tencent.mars.xlog.Log.i(TAG, "revert shouldSpeakPassWord");
                this.shouldSpeakPassWord = true;
                return;
            }
            this.shouldSpeakPassWord = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_keyboard_tts_mode_v2, false)) {
                this.isTTSKeyboardMode = true;
            } else {
                this.isTTSKeyboardMode = false;
            }
        }
    }
}
