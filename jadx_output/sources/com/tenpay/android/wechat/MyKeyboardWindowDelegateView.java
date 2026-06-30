package com.tenpay.android.wechat;

/* loaded from: classes15.dex */
public class MyKeyboardWindowDelegateView extends android.widget.LinearLayout {
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardWindowDelegateView";
    public static final int X_MODE_CHARACTER = 1;
    public static final int X_MODE_DOT = 2;
    public static final int X_MODE_NONE = 0;
    private com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener keyBoardOnTouchListener;
    private android.view.View.OnClickListener keyOnClickListener;
    private android.view.View.OnTouchListener keyOnTouchListener;
    private android.content.Context mContext;
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
    private int mXMode;

    public MyKeyboardWindowDelegateView(android.content.Context context) {
        super(context);
        this.mXMode = 0;
        init(context);
    }

    private void init(android.content.Context context) {
        this.mContext = context.getApplicationContext();
        com.tenpay.android.wechat.TenpayTTSUtil.init(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(this.mContext.getResources().getIdentifier(com.tenpay.android.wechat.MyKeyboardWindow.LAYOUT_ID, "layout", this.mContext.getPackageName()), (android.view.ViewGroup) this, true);
        this.mKey1 = inflate.findViewById(getId("tenpay_keyboard_1"));
        this.mKey2 = inflate.findViewById(getId("tenpay_keyboard_2"));
        this.mKey3 = inflate.findViewById(getId("tenpay_keyboard_3"));
        this.mKey4 = inflate.findViewById(getId("tenpay_keyboard_4"));
        this.mKey5 = inflate.findViewById(getId("tenpay_keyboard_5"));
        this.mKey6 = inflate.findViewById(getId("tenpay_keyboard_6"));
        this.mKey7 = inflate.findViewById(getId("tenpay_keyboard_7"));
        this.mKey8 = inflate.findViewById(getId("tenpay_keyboard_8"));
        this.mKey9 = inflate.findViewById(getId("tenpay_keyboard_9"));
        this.mKeyX = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_x"));
        this.mKey0 = inflate.findViewById(getId("tenpay_keyboard_0"));
        this.mKeyD = (android.widget.RelativeLayout) inflate.findViewById(getId("tenpay_keyboard_d"));
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
        setAlpha(1.0E-6f);
        setBackgroundColor(this.mContext.getResources().getColor(com.tencent.mm.R.color.a9e));
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

    private void setRealKeyActionListener(android.view.View view, final android.view.View view2) {
        view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegateView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view3, android.view.MotionEvent motionEvent) {
                if (com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.keyOnTouchListener == null || view2 == null) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    com.tencent.mars.xlog.Log.i(com.tenpay.android.wechat.MyKeyboardWindowDelegateView.TAG, "[onTouch] action down");
                    view2.setBackgroundColor(com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.mContext.getResources().getColor(com.tencent.mm.R.color.FG_3));
                } else if (action == 1) {
                    com.tencent.mars.xlog.Log.i(com.tenpay.android.wechat.MyKeyboardWindowDelegateView.TAG, "[onTouch] action up");
                    view2.setBackgroundColor(com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.mContext.getResources().getColor(com.tencent.mm.R.color.BW_100));
                }
                com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.keyOnTouchListener.onTouch(view2, motionEvent);
                return false;
            }
        });
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegateView.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view3) {
                com.tencent.mars.xlog.Log.i(com.tenpay.android.wechat.MyKeyboardWindowDelegateView.TAG, "[onClick]");
                if (com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.keyOnClickListener == null || view2 == null) {
                    return;
                }
                com.tenpay.android.wechat.MyKeyboardWindowDelegateView.this.keyOnClickListener.onClick(view2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener onTouchListener = this.keyBoardOnTouchListener;
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

    public void initRealKeyBoard(java.util.ArrayList<android.view.View> arrayList, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener, com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener onTouchListener2) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e(TAG, "[initRealKeyBoard] keyList == null || keyList.size() <= 0, return");
            return;
        }
        android.view.View view = (android.widget.TextView) arrayList.get(0);
        android.view.View view2 = (android.widget.TextView) arrayList.get(1);
        android.view.View view3 = (android.widget.TextView) arrayList.get(2);
        android.view.View view4 = (android.widget.TextView) arrayList.get(3);
        android.view.View view5 = (android.widget.TextView) arrayList.get(4);
        android.view.View view6 = (android.widget.TextView) arrayList.get(5);
        android.view.View view7 = (android.widget.TextView) arrayList.get(6);
        android.view.View view8 = (android.widget.TextView) arrayList.get(7);
        android.view.View view9 = (android.widget.TextView) arrayList.get(8);
        android.widget.TextView textView = (android.widget.TextView) arrayList.get(9);
        android.view.View view10 = (android.widget.TextView) arrayList.get(10);
        android.view.View view11 = (android.widget.RelativeLayout) arrayList.get(11);
        this.keyOnTouchListener = onTouchListener;
        this.keyOnClickListener = onClickListener;
        this.keyBoardOnTouchListener = onTouchListener2;
        setRealKeyActionListener(this.mKey1, view);
        setRealKeyActionListener(this.mKey2, view2);
        setRealKeyActionListener(this.mKey3, view3);
        setRealKeyActionListener(this.mKey4, view4);
        setRealKeyActionListener(this.mKey5, view5);
        setRealKeyActionListener(this.mKey6, view6);
        setRealKeyActionListener(this.mKey7, view7);
        setRealKeyActionListener(this.mKey8, view8);
        setRealKeyActionListener(this.mKey9, view9);
        setRealKeyActionListener(this.mKeyX, textView);
        setRealKeyActionListener(this.mKey0, view10);
        setRealKeyActionListener(this.mKeyD, view11);
        setKeyXText(textView.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tenpay.android.wechat.TenpayTTSUtil.destroy();
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
    }

    public void setXMode(int i17) {
        this.mXMode = i17;
        if (i17 == 0) {
            setKeyXText("");
            return;
        }
        if (i17 == 1) {
            setKeyXText("X");
        } else if (i17 != 2) {
            this.mXMode = 0;
        } else {
            setKeyXText(".");
        }
    }

    public MyKeyboardWindowDelegateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mXMode = 0;
        init(context);
    }
}
