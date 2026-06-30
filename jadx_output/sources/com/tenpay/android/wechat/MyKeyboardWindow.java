package com.tenpay.android.wechat;

/* loaded from: classes15.dex */
public class MyKeyboardWindow extends android.widget.LinearLayout {
    public static final java.lang.String KINDE_REPORT_CLASS_NAME = "com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative";
    public static final java.lang.String KINDE_REPORT_METHOD_NAME = "reportKindaEvent";
    public static final java.lang.String LAYOUT_ID = "tenpay_number_keyboard";
    private static final int PASS_WORD_LENGTH = 6;
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardWindow";
    public static final int X_MODE_CHARACTER = 1;
    public static final int X_MODE_DOT = 2;
    public static final int X_MODE_NONE = 0;
    private byte _hellAccFlag_;
    private int badTouchCountDelegate;
    private int badTouchCountReal;
    private java.util.ArrayList<java.lang.Float> clickButtonPressure;
    private java.util.ArrayList<java.lang.Float> clickButtonSize;
    private java.util.ArrayList<java.lang.Long> clickButtonTime;
    private boolean hasShowKeyBoardWindowDelegate;
    private boolean isOpenKeyboardWindowDelegateMode;
    private com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener keyBoardOnTouchListenerDelegate;
    private android.view.View.OnClickListener keyOnClickListenerDelegate;
    private android.view.View.OnTouchListener keyOnTouchListenerDelegate;
    private android.content.Context mContext;
    private java.lang.ref.WeakReference<android.view.View> mEventTargetView;
    private boolean mHasShowDialog;
    private android.widget.EditText mInputEditText;
    private android.view.View mKey0;
    private android.view.View mKey1;
    private android.view.View mKey2;
    private android.view.View mKey3;
    private android.view.View mKey4;
    private android.view.View mKey5;
    private android.view.View mKey6;
    private android.view.View mKey7;
    private android.view.View mKey8;
    private android.view.View mKey9;
    private android.widget.RelativeLayout mKeyD;
    private android.widget.TextView mKeyX;
    private boolean mNeedSecureCheckOnTouch;
    private com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener mOnTouchListener;
    private android.content.Context mUIContext;
    private com.tenpay.android.wechat.MyKeyboardWindowDelegate mWindowDelegate;
    private int mXMode;
    private int payClickReportCnt;
    private android.view.View.AccessibilityDelegate secureAccessibilityDelegate;

    /* loaded from: classes15.dex */
    public interface IMyKeyboardWindowActionEvent {
        int onKeyboardActionGetInputLength();

        void onKeyboardActionWithCode(int i17);
    }

    /* loaded from: classes9.dex */
    public interface OnTouchListener {
        boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent);
    }

    public MyKeyboardWindow(android.content.Context context) {
        super(context);
        this.payClickReportCnt = 0;
        this.mXMode = 0;
        this.mHasShowDialog = false;
        this.mNeedSecureCheckOnTouch = false;
        this.mEventTargetView = null;
        this.isOpenKeyboardWindowDelegateMode = false;
        this.hasShowKeyBoardWindowDelegate = false;
        this.badTouchCountReal = 0;
        this.badTouchCountDelegate = 0;
        this.clickButtonPressure = new java.util.ArrayList<>();
        this.clickButtonTime = new java.util.ArrayList<>();
        this.clickButtonSize = new java.util.ArrayList<>();
        init(context);
    }

    public static /* synthetic */ int access$712(com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow, int i17) {
        int i18 = myKeyboardWindow.payClickReportCnt + i17;
        myKeyboardWindow.payClickReportCnt = i18;
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean detectViewId(android.view.View view, java.lang.String str) {
        return view.getId() == getId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doReportButtonClickInfo(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.clickButtonPressure.add(java.lang.Float.valueOf(motionEvent.getPressure()));
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        java.util.ArrayList<java.lang.Long> arrayList = this.clickButtonTime;
        if (eventTime < 0) {
            eventTime = 0;
        }
        arrayList.add(java.lang.Long.valueOf(eventTime));
        this.clickButtonSize.add(java.lang.Float.valueOf(motionEvent.getSize()));
        java.lang.ref.WeakReference<android.view.View> weakReference = this.mEventTargetView;
        if (weakReference == null || !(weakReference.get() instanceof com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent) || ((com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent) ((android.view.View) this.mEventTargetView.get())).onKeyboardActionGetInputLength() < 5 || this.clickButtonPressure.size() <= 0) {
            return;
        }
        java.lang.String join = android.text.TextUtils.join(",", this.clickButtonPressure);
        java.lang.String join2 = android.text.TextUtils.join(",", this.clickButtonTime);
        java.lang.String join3 = android.text.TextUtils.join(",", this.clickButtonSize);
        com.tencent.mars.xlog.Log.i(TAG, "[doReportButtonClickInfo] final clickButtonPressure: %s, clickButtonTime: %s, clickButtonSize: %s", join, join2, join3);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting");
        M.D("kv_pwd_keyboard_click_btn_pressure", join);
        M.D("kv_pwd_keyboard_click_btn_clicktime", join2);
        M.D("kv_pwd_keyboard_click_btn_size", join3);
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("pay_usecase").getString("currentstate", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || string.equals("floatPay")) {
            return;
        }
        reportKindaEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getKeyEventCode(android.view.View view) {
        if (detectViewId(view, "tenpay_keyboard_1")) {
            return 8;
        }
        if (detectViewId(view, "tenpay_keyboard_2")) {
            return 9;
        }
        if (detectViewId(view, "tenpay_keyboard_3")) {
            return 10;
        }
        if (detectViewId(view, "tenpay_keyboard_4")) {
            return 11;
        }
        if (detectViewId(view, "tenpay_keyboard_5")) {
            return 12;
        }
        if (detectViewId(view, "tenpay_keyboard_6")) {
            return 13;
        }
        if (detectViewId(view, "tenpay_keyboard_7")) {
            return 14;
        }
        if (detectViewId(view, "tenpay_keyboard_8")) {
            return 15;
        }
        if (detectViewId(view, "tenpay_keyboard_9")) {
            return 16;
        }
        if (detectViewId(view, "tenpay_keyboard_0")) {
            return 7;
        }
        return detectViewId(view, "tenpay_keyboard_d") ? 67 : 0;
    }

    private void init(android.content.Context context) {
        this.mContext = context.getApplicationContext();
        this.mUIContext = context;
        com.tenpay.android.wechat.TenpayTTSUtil.init(context);
        realInitKeyboard();
    }

    private void initKeyBoardDelegate() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.mWindowDelegate == null);
        com.tencent.mars.xlog.Log.i(TAG, "[initKeyBoardDelegate] do show WindowDelegate: %s", objArr);
        if (this.mWindowDelegate != null) {
            return;
        }
        this.hasShowKeyBoardWindowDelegate = true;
        this.mWindowDelegate = new com.tenpay.android.wechat.MyKeyboardWindowDelegate();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.mKey1);
        arrayList.add(this.mKey2);
        arrayList.add(this.mKey3);
        arrayList.add(this.mKey4);
        arrayList.add(this.mKey5);
        arrayList.add(this.mKey6);
        arrayList.add(this.mKey7);
        arrayList.add(this.mKey8);
        arrayList.add(this.mKey9);
        arrayList.add(this.mKeyX);
        arrayList.add(this.mKey0);
        arrayList.add(this.mKeyD);
        postDelayed(new java.lang.Runnable() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.tenpay.android.wechat.MyKeyboardWindow.this.mWindowDelegate != null) {
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mWindowDelegate.initWindowDelegateView(com.tenpay.android.wechat.MyKeyboardWindow.this.mContext, arrayList, com.tenpay.android.wechat.MyKeyboardWindow.this.keyOnTouchListenerDelegate, com.tenpay.android.wechat.MyKeyboardWindow.this.keyOnClickListenerDelegate, com.tenpay.android.wechat.MyKeyboardWindow.this.keyBoardOnTouchListenerDelegate, com.tenpay.android.wechat.MyKeyboardWindow.this.getWidth(), com.tenpay.android.wechat.MyKeyboardWindow.this.getHeight(), (int) com.tenpay.android.wechat.MyKeyboardWindow.this.mKey1.getX(), (int) com.tenpay.android.wechat.MyKeyboardWindow.this.mKey1.getY());
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mWindowDelegate.setXMode(com.tenpay.android.wechat.MyKeyboardWindow.this.mXMode);
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mWindowDelegate.setSecureAccessibility(com.tenpay.android.wechat.MyKeyboardWindow.this.secureAccessibilityDelegate);
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mWindowDelegate.show();
                    jx3.f.INSTANCE.d(30687, 1, 3);
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean needInterrupt(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17 = (motionEvent.getFlags() & 1) != 0;
        if (motionEvent.getAction() == 1) {
            if (z17 && !this.hasShowKeyBoardWindowDelegate) {
                this.badTouchCountReal++;
                jx3.f.INSTANCE.d(30687, 1, 1, java.lang.Integer.valueOf(this.badTouchCountReal));
                com.tencent.mars.xlog.Log.i(TAG, "[needInterrupt] RealKeyboard bad touch count ： %s", java.lang.Integer.valueOf(this.badTouchCountReal));
                if (needShowDelegateView()) {
                    initKeyBoardDelegate();
                }
            } else if (z17 && this.hasShowKeyBoardWindowDelegate) {
                this.badTouchCountDelegate++;
                jx3.f.INSTANCE.d(30687, 1, 2, java.lang.Integer.valueOf(this.badTouchCountDelegate));
                com.tencent.mars.xlog.Log.i(TAG, "[needInterrupt] delegateKeyboard bad touch count： %s", java.lang.Integer.valueOf(this.badTouchCountDelegate));
            }
            com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").G("kv_pay_pwd_keyboard_overlaid", this.badTouchCountReal > 0 || this.badTouchCountDelegate > 0);
        }
        if (!this.mNeedSecureCheckOnTouch || !z17) {
            return false;
        }
        if (!this.mHasShowDialog) {
            this.mHasShowDialog = true;
            db5.e1.E(view.getContext(), this.mContext.getString(com.tencent.mm.R.string.fid), "", this.mContext.getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mHasShowDialog = false;
                }
            });
        }
        this.mInputEditText.clearFocus();
        return true;
    }

    private boolean needShowDelegateView() {
        boolean f17 = zo.e.f(this.mContext);
        boolean z17 = android.os.Build.VERSION.SDK_INT < 31;
        boolean z18 = this.isOpenKeyboardWindowDelegateMode && !this.hasShowKeyBoardWindowDelegate && f17 && z17 && !com.tencent.mm.ui.bk.Q();
        com.tencent.mars.xlog.Log.i(TAG, "[needShowDelegateView] result：%s。    process tag - hasShowKeyBoardWindowDelegate: %s， isOpenKeyboardWindowDelegateMode：%s , hasFloatWindowPermission: %s apiBelow12：%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.hasShowKeyBoardWindowDelegate), java.lang.Boolean.valueOf(this.isOpenKeyboardWindowDelegateMode), java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(z17));
        return z18;
    }

    private void realInitKeyboard() {
        android.view.View inflate = android.view.LayoutInflater.from("1".equals(j62.e.g().a("clicfg_android_keyboard_darkmode_use_app_context", "", false, true)) ? this.mContext : this.mUIContext).inflate(this.mContext.getResources().getIdentifier(LAYOUT_ID, "layout", this.mContext.getPackageName()), (android.view.ViewGroup) this, true);
        this.mKey1 = getViewWithId(inflate, "tenpay_keyboard_1");
        this.mKey2 = getViewWithId(inflate, "tenpay_keyboard_2");
        this.mKey3 = getViewWithId(inflate, "tenpay_keyboard_3");
        this.mKey4 = getViewWithId(inflate, "tenpay_keyboard_4");
        this.mKey5 = getViewWithId(inflate, "tenpay_keyboard_5");
        this.mKey6 = getViewWithId(inflate, "tenpay_keyboard_6");
        this.mKey7 = getViewWithId(inflate, "tenpay_keyboard_7");
        this.mKey8 = getViewWithId(inflate, "tenpay_keyboard_8");
        this.mKey9 = getViewWithId(inflate, "tenpay_keyboard_9");
        this.mKeyX = (android.widget.TextView) getViewWithId(inflate, "tenpay_keyboard_x");
        this.mKey0 = getViewWithId(inflate, "tenpay_keyboard_0");
        this.mKeyD = (android.widget.RelativeLayout) getViewWithId(inflate, "tenpay_keyboard_d");
        android.view.View viewWithId = getViewWithId(inflate, "divider1");
        this.mKey1.setTag(viewWithId);
        this.mKey2.setTag(viewWithId);
        this.mKey3.setTag(viewWithId);
        this.mKey4.setTag(viewWithId);
        this.mKey5.setTag(viewWithId);
        this.mKey6.setTag(viewWithId);
        this.mKey7.setTag(viewWithId);
        this.mKey8.setTag(viewWithId);
        this.mKey9.setTag(viewWithId);
        this.mKeyX.setTag(viewWithId);
        this.mKey0.setTag(viewWithId);
        this.mKeyD.setTag(viewWithId);
        setInnerAccessibility(null);
        final java.util.HashMap<java.lang.Integer, java.lang.Boolean> hashMap = new java.util.HashMap<java.lang.Integer, java.lang.Boolean>() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.1
            {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                put(7, bool);
                put(8, bool);
                put(9, bool);
                put(10, bool);
                put(11, bool);
                put(12, bool);
                put(13, bool);
                put(14, bool);
                put(15, bool);
                put(16, bool);
            }
        };
        android.view.View.OnTouchListener onTouchListener = new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.2
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
            
                if (r2 != 6) goto L27;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    com.tenpay.android.wechat.MyKeyboardWindow r0 = com.tenpay.android.wechat.MyKeyboardWindow.this
                    boolean r0 = com.tenpay.android.wechat.MyKeyboardWindow.access$000(r0, r6, r7)
                    r1 = 1
                    if (r0 == 0) goto La
                    return r1
                La:
                    r0 = 0
                    com.tenpay.android.wechat.MyKeyboardWindow r2 = com.tenpay.android.wechat.MyKeyboardWindow.this     // Catch: java.lang.Throwable -> L57
                    android.widget.EditText r2 = com.tenpay.android.wechat.MyKeyboardWindow.access$100(r2)     // Catch: java.lang.Throwable -> L57
                    if (r2 != 0) goto L14
                    return r0
                L14:
                    com.tenpay.android.wechat.MyKeyboardWindow r2 = com.tenpay.android.wechat.MyKeyboardWindow.this     // Catch: java.lang.Throwable -> L57
                    int r6 = com.tenpay.android.wechat.MyKeyboardWindow.access$200(r2, r6)     // Catch: java.lang.Throwable -> L57
                    java.util.HashMap r2 = r2     // Catch: java.lang.Throwable -> L57
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L57
                    boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L57
                    if (r2 != 0) goto L27
                    return r0
                L27:
                    int r2 = r7.getAction()     // Catch: java.lang.Throwable -> L57
                    fo3.s r3 = fo3.s.INSTANCE
                    java.lang.String r4 = "ce_pp"
                    if (r2 == 0) goto L46
                    if (r2 == r1) goto L3a
                    r1 = 5
                    if (r2 == r1) goto L46
                    r6 = 6
                    if (r2 == r6) goto L3a
                    goto L6b
                L3a:
                    r3.H2(r4, r7)     // Catch: java.lang.Throwable -> L57
                    r3.Qa(r4)     // Catch: java.lang.Throwable -> L57
                    com.tenpay.android.wechat.MyKeyboardWindow r6 = com.tenpay.android.wechat.MyKeyboardWindow.this     // Catch: java.lang.Throwable -> L57
                    com.tenpay.android.wechat.MyKeyboardWindow.access$300(r6, r7)     // Catch: java.lang.Throwable -> L57
                    goto L6b
                L46:
                    java.util.HashMap r7 = r2     // Catch: java.lang.Throwable -> L57
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L57
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L57
                    r7.put(r6, r1)     // Catch: java.lang.Throwable -> L57
                    java.lang.String r6 = "<PayClick>"
                    r3.Z7(r4, r6)     // Catch: java.lang.Throwable -> L57
                    goto L6b
                L57:
                    r6 = move-exception
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r1 = "error: "
                    r7.<init>(r1)
                    r7.append(r6)
                    java.lang.String r6 = r7.toString()
                    java.lang.String r7 = "MicroMsg.MyKeyboardWindow"
                    com.tencent.mars.xlog.Log.i(r7, r6)
                L6b:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.MyKeyboardWindow.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        this.mKey1.setOnTouchListener(onTouchListener);
        this.mKey2.setOnTouchListener(onTouchListener);
        this.mKey3.setOnTouchListener(onTouchListener);
        this.mKey4.setOnTouchListener(onTouchListener);
        this.mKey5.setOnTouchListener(onTouchListener);
        this.mKey6.setOnTouchListener(onTouchListener);
        this.mKey7.setOnTouchListener(onTouchListener);
        this.mKey8.setOnTouchListener(onTouchListener);
        this.mKey9.setOnTouchListener(onTouchListener);
        this.mKeyX.setOnTouchListener(onTouchListener);
        this.mKey0.setOnTouchListener(onTouchListener);
        this.mKeyD.setOnTouchListener(onTouchListener);
        this.keyOnTouchListenerDelegate = onTouchListener;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindow.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.mars.xlog.Log.i(com.tenpay.android.wechat.MyKeyboardWindow.TAG, "[onClick]");
                if (com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText == null) {
                    com.tencent.mars.xlog.Log.e(com.tenpay.android.wechat.MyKeyboardWindow.TAG, "[onClick]mInputEditText == null");
                    return;
                }
                if (com.tenpay.android.wechat.MyKeyboardWindow.this.detectViewId(view, "tenpay_keyboard_x")) {
                    int i17 = com.tenpay.android.wechat.MyKeyboardWindow.this.mXMode;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            return;
                        }
                        com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
                        return;
                    } else {
                        com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
                        com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
                        com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
                        return;
                    }
                }
                int keyEventCode = com.tenpay.android.wechat.MyKeyboardWindow.this.getKeyEventCode(view);
                android.view.KeyEvent.Callback callback = com.tenpay.android.wechat.MyKeyboardWindow.this.mEventTargetView != null ? (android.view.View) com.tenpay.android.wechat.MyKeyboardWindow.this.mEventTargetView.get() : null;
                if (callback == null || !(callback instanceof com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent)) {
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, keyEventCode));
                    com.tenpay.android.wechat.MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(1, keyEventCode));
                } else {
                    com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent iMyKeyboardWindowActionEvent = (com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent) callback;
                    iMyKeyboardWindowActionEvent.onKeyboardActionWithCode(keyEventCode);
                    int onKeyboardActionGetInputLength = iMyKeyboardWindowActionEvent.onKeyboardActionGetInputLength();
                    com.tencent.mars.xlog.Log.i(com.tenpay.android.wechat.MyKeyboardWindow.TAG, "[onClick] send keyboard event, inputLength: %s", java.lang.Integer.valueOf(onKeyboardActionGetInputLength));
                    if (onKeyboardActionGetInputLength >= 6 || onKeyboardActionGetInputLength == -1) {
                        com.tenpay.android.wechat.MyKeyboardWindow.this.releaseKeyBoardDelegateView();
                    }
                }
                try {
                    if (hashMap.containsKey(java.lang.Integer.valueOf(keyEventCode))) {
                        if (java.lang.Boolean.TRUE.equals(hashMap.get(java.lang.Integer.valueOf(keyEventCode)))) {
                            hashMap.put(java.lang.Integer.valueOf(keyEventCode), java.lang.Boolean.FALSE);
                        } else {
                            fo3.s sVar = fo3.s.INSTANCE;
                            sVar.Z7("ce_pp", "<PayClick>");
                            sVar.H2("ce_pp", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                            sVar.Qa("ce_pp");
                        }
                        if (com.tenpay.android.wechat.MyKeyboardWindow.this.payClickReportCnt == 0) {
                            w04.l.INSTANCE.Ki();
                            com.tenpay.android.wechat.MyKeyboardWindow.access$712(com.tenpay.android.wechat.MyKeyboardWindow.this, 1);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e(com.tenpay.android.wechat.MyKeyboardWindow.TAG, "async report pci error:" + th6);
                }
            }
        };
        this.mKey1.setOnClickListener(onClickListener);
        this.mKey2.setOnClickListener(onClickListener);
        this.mKey3.setOnClickListener(onClickListener);
        this.mKey4.setOnClickListener(onClickListener);
        this.mKey5.setOnClickListener(onClickListener);
        this.mKey6.setOnClickListener(onClickListener);
        this.mKey7.setOnClickListener(onClickListener);
        this.mKey8.setOnClickListener(onClickListener);
        this.mKey9.setOnClickListener(onClickListener);
        this.mKeyX.setOnClickListener(onClickListener);
        this.mKey0.setOnClickListener(onClickListener);
        this.mKeyD.setOnClickListener(onClickListener);
        this.keyOnClickListenerDelegate = onClickListener;
    }

    private void reportKindaEvent() {
        try {
            com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative secLiteAppNative = com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative.INSTANCE;
            java.lang.reflect.Method declaredMethod = com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative.class.getDeclaredMethod(KINDE_REPORT_METHOD_NAME, java.lang.String.class, java.lang.String.class);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, "url", "VerifyPassword");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "reportKindaEvent reflection error: " + e17.getMessage());
        }
    }

    private void setInnerAccessibility(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        com.tenpay.android.wechat.MyKeyboardAccessibilityDelegateWrap myKeyboardAccessibilityDelegateWrap = accessibilityDelegate != null ? new com.tenpay.android.wechat.MyKeyboardAccessibilityDelegateWrap(accessibilityDelegate) : new com.tenpay.android.wechat.MyKeyboardAccessibilityDelegateWrap();
        myKeyboardAccessibilityDelegateWrap.setViewTypeName(com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS);
        this.mKeyD.setAccessibilityDelegate(myKeyboardAccessibilityDelegateWrap);
    }

    private void setKeyXText(java.lang.CharSequence charSequence) {
        this.mKeyX.setText(charSequence);
        this.mKeyX.setContentDescription(charSequence.toString().toLowerCase());
        if (android.text.TextUtils.isEmpty(charSequence)) {
            this.mKeyX.setImportantForAccessibility(2);
        } else {
            this.mKeyX.setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener onTouchListener = this.mOnTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        } catch (java.lang.Throwable unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDrawableId(java.lang.String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }

    public int getId(java.lang.String str) {
        return this.mContext.getResources().getIdentifier(str, dm.i4.COL_ID, this.mContext.getPackageName());
    }

    public android.view.View getViewWithId(android.view.View view, java.lang.String str) {
        return view.findViewById(getId(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tenpay.android.wechat.TenpayTTSUtil.destroy();
        releaseKeyBoardDelegateView();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i(TAG, "[onSizeChanged] w： %s， h： %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (this.mWindowDelegate == null || i17 <= 0 || i18 <= 0) {
            return;
        }
        releaseKeyBoardDelegateView();
        initKeyBoardDelegate();
    }

    public void releaseKeyBoardDelegateView() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.mWindowDelegate != null);
        com.tencent.mars.xlog.Log.i(TAG, "[releaseKeyBoardDelegateView] trigger， real need destory？ %s", objArr);
        com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = this.mWindowDelegate;
        if (myKeyboardWindowDelegate != null) {
            myKeyboardWindowDelegate.release();
            this.mWindowDelegate = null;
            this.hasShowKeyBoardWindowDelegate = false;
        }
        this.badTouchCountDelegate = 0;
    }

    public void resetSecureAccessibility() {
        this.mKey0.setAccessibilityDelegate(null);
        this.mKey1.setAccessibilityDelegate(null);
        this.mKey2.setAccessibilityDelegate(null);
        this.mKey3.setAccessibilityDelegate(null);
        this.mKey4.setAccessibilityDelegate(null);
        this.mKey5.setAccessibilityDelegate(null);
        this.mKey6.setAccessibilityDelegate(null);
        this.mKey7.setAccessibilityDelegate(null);
        this.mKey8.setAccessibilityDelegate(null);
        this.mKey9.setAccessibilityDelegate(null);
        this.mKeyX.setAccessibilityDelegate(null);
        this.mKeyD.setAccessibilityDelegate(null);
        setInnerAccessibility(null);
        this.secureAccessibilityDelegate = null;
        com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = this.mWindowDelegate;
        if (myKeyboardWindowDelegate != null) {
            myKeyboardWindowDelegate.resetSecureAccessibility();
        }
    }

    public void setInputEditText(android.widget.EditText editText) {
        if (editText != null) {
            this.mInputEditText = editText;
            int imeOptions = editText.getImeOptions();
            java.lang.CharSequence imeActionLabel = this.mInputEditText.getImeActionLabel();
            if (!android.text.TextUtils.isEmpty(imeActionLabel)) {
                setKeyXText(imeActionLabel);
            }
            if (imeOptions == 1) {
                this.mXMode = 0;
                if (android.text.TextUtils.isEmpty(imeActionLabel)) {
                    setKeyXText("");
                }
            }
            if (editText instanceof com.tenpay.android.wechat.TenpaySecureEditText) {
                fo3.s.INSTANCE.Zh();
            }
        }
    }

    public void setKeyboardDisabled(boolean z17) {
        this.mKey0.setClickable(!z17);
        this.mKey1.setClickable(!z17);
        this.mKey2.setClickable(!z17);
        this.mKey3.setClickable(!z17);
        this.mKey4.setClickable(!z17);
        this.mKey5.setClickable(!z17);
        this.mKey6.setClickable(!z17);
        this.mKey7.setClickable(!z17);
        this.mKey8.setClickable(!z17);
        this.mKey9.setClickable(!z17);
        this.mKeyX.setClickable(!z17);
        this.mKeyD.setClickable(!z17);
        android.view.View view = this.mKey0;
        float f17 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.mKey1;
        float f18 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.mKey2;
        float f19 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = this.mKey3;
        float f27 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(f27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view5 = this.mKey4;
        float f28 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Float.valueOf(f28));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
        yj0.a.f(view5, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view6 = this.mKey5;
        float f29 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Float.valueOf(f29));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
        yj0.a.f(view6, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view7 = this.mKey6;
        float f37 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
        yj0.a.f(view7, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.mKey7;
        float f38 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Float.valueOf(f38));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
        yj0.a.f(view8, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view9 = this.mKey8;
        float f39 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(java.lang.Float.valueOf(f39));
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view9.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
        yj0.a.f(view9, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view10 = this.mKey9;
        float f47 = z17 ? 0.1f : 1.0f;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Float.valueOf(f47));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view10.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
        yj0.a.f(view10, "com/tenpay/android/wechat/MyKeyboardWindow", "setKeyboardDisabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.mKeyX.setAlpha(z17 ? 0.1f : 1.0f);
        this.mKeyD.setAlpha(z17 ? 0.1f : 1.0f);
        com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = this.mWindowDelegate;
        if (myKeyboardWindowDelegate != null) {
            myKeyboardWindowDelegate.setKeyboardDisabled(z17);
        }
    }

    public void setOnTouchListener(com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener onTouchListener) {
        this.mOnTouchListener = onTouchListener;
        this.keyBoardOnTouchListenerDelegate = onTouchListener;
    }

    public void setSecureAccessibility(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.mKey0.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey1.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey2.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey3.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey4.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey5.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey6.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey7.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey8.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey9.setAccessibilityDelegate(accessibilityDelegate);
        this.mKeyX.setAccessibilityDelegate(accessibilityDelegate);
        this.mKeyD.setAccessibilityDelegate(accessibilityDelegate);
        setInnerAccessibility(accessibilityDelegate);
        this.secureAccessibilityDelegate = accessibilityDelegate;
        com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = this.mWindowDelegate;
        if (myKeyboardWindowDelegate != null) {
            myKeyboardWindowDelegate.setSecureAccessibility(accessibilityDelegate);
        }
    }

    public void setSecureOnTouchCallback() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MKM", "setSecureOnTouchCallback");
        this.mNeedSecureCheckOnTouch = true;
    }

    public void setUseEditTextEventMode(android.view.View view) {
        com.tencent.mars.xlog.Log.i(TAG, "use event mode");
        this.mEventTargetView = new java.lang.ref.WeakReference<>(view);
    }

    public void setUseKeyboardWindowDelegateMode(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "use delegate mode : %s", java.lang.Boolean.valueOf(z17));
        this.isOpenKeyboardWindowDelegateMode = z17;
    }

    public void setXMode(int i17) {
        this.mXMode = i17;
        if (i17 == 0) {
            setKeyXText("");
        } else if (i17 == 1) {
            setKeyXText("X");
        } else if (i17 != 2) {
            this.mXMode = 0;
        } else {
            setKeyXText(".");
        }
        com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = this.mWindowDelegate;
        if (myKeyboardWindowDelegate != null) {
            myKeyboardWindowDelegate.setXMode(this.mXMode);
        }
    }

    public MyKeyboardWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.payClickReportCnt = 0;
        this.mXMode = 0;
        this.mHasShowDialog = false;
        this.mNeedSecureCheckOnTouch = false;
        this.mEventTargetView = null;
        this.isOpenKeyboardWindowDelegateMode = false;
        this.hasShowKeyBoardWindowDelegate = false;
        this.badTouchCountReal = 0;
        this.badTouchCountDelegate = 0;
        this.clickButtonPressure = new java.util.ArrayList<>();
        this.clickButtonTime = new java.util.ArrayList<>();
        this.clickButtonSize = new java.util.ArrayList<>();
        init(context);
    }
}
