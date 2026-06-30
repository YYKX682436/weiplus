package com.tenpay.wphk;

/* loaded from: classes7.dex */
public class HkWxKeyboardWindow extends android.widget.LinearLayout {
    public static final int X_MODE_CHARACTER = 1;
    public static final int X_MODE_DOT = 2;
    public static final int X_MODE_NONE = 0;
    private android.content.Context mContext;
    private android.widget.EditText mInputEditText;
    private android.widget.RelativeLayout mKeyD;
    private android.widget.TextView[] mKeys;
    private com.tenpay.wphk.HkWxKeyboardWindow.OnTouchListener mOnTouchListener;
    private int mXMode;

    /* loaded from: classes7.dex */
    public interface OnTouchListener {
        boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent);
    }

    public HkWxKeyboardWindow(android.content.Context context) {
        super(context);
        this.mXMode = 0;
        this.mKeys = new android.widget.TextView[11];
        init(context);
    }

    private void init(android.content.Context context) {
        this.mContext = context.getApplicationContext();
        com.tenpay.wphk.TenpayTTSUtil.init(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(this.mContext.getResources().getIdentifier(com.tenpay.android.wechat.MyKeyboardWindow.LAYOUT_ID, "layout", this.mContext.getPackageName()), (android.view.ViewGroup) this, true);
        this.mKeys[1] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_1"));
        this.mKeys[2] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_2"));
        this.mKeys[3] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_3"));
        this.mKeys[4] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_4"));
        this.mKeys[5] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_5"));
        this.mKeys[6] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_6"));
        this.mKeys[7] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_7"));
        this.mKeys[8] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_8"));
        this.mKeys[9] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_9"));
        this.mKeys[10] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_x"));
        int i17 = 0;
        this.mKeys[0] = (android.widget.TextView) inflate.findViewById(getId("tenpay_keyboard_0"));
        this.mKeyD = (android.widget.RelativeLayout) inflate.findViewById(getId("tenpay_keyboard_d"));
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tenpay.wphk.HkWxKeyboardWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText == null) {
                    return;
                }
                if (view.getId() != com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_x")) {
                    int i18 = view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_1") ? 8 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_2") ? 9 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_3") ? 10 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_4") ? 11 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_5") ? 12 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_6") ? 13 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_7") ? 14 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_8") ? 15 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_9") ? 16 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_0") ? 7 : view.getId() == com.tenpay.wphk.HkWxKeyboardWindow.this.getId("tenpay_keyboard_d") ? 67 : 0;
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, i18));
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(1, i18));
                    return;
                }
                int i19 = com.tenpay.wphk.HkWxKeyboardWindow.this.mXMode;
                if (i19 != 1) {
                    if (i19 != 2) {
                        return;
                    }
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
                } else {
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
                    com.tenpay.wphk.HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
                }
            }
        };
        for (int i18 = 0; i18 <= 9; i18++) {
            this.mKeys[i18].setContentDescription(java.lang.String.valueOf(i18));
        }
        this.mKeys[10].setContentDescription("字母X");
        this.mKeyD.setContentDescription("删除");
        while (true) {
            android.widget.TextView[] textViewArr = this.mKeys;
            if (i17 >= textViewArr.length) {
                this.mKeyD.setOnClickListener(onClickListener);
                return;
            } else {
                textViewArr[i17].setOnClickListener(onClickListener);
                i17++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            com.tenpay.wphk.HkWxKeyboardWindow.OnTouchListener onTouchListener = this.mOnTouchListener;
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

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tenpay.wphk.TenpayTTSUtil.destroy();
    }

    public void resetSecureAccessibility() {
        int i17 = 0;
        while (true) {
            android.widget.TextView[] textViewArr = this.mKeys;
            if (i17 >= textViewArr.length) {
                this.mKeyD.setAccessibilityDelegate(null);
                return;
            } else {
                textViewArr[i17].setAccessibilityDelegate(null);
                i17++;
            }
        }
    }

    public void setInputEditText(android.widget.EditText editText) {
        if (editText != null) {
            this.mInputEditText = editText;
            int imeOptions = editText.getImeOptions();
            java.lang.CharSequence imeActionLabel = this.mInputEditText.getImeActionLabel();
            if (!android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.mKeys[10].setText(imeActionLabel);
            }
            if (imeOptions != 1) {
                return;
            }
            this.mXMode = 0;
            if (android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.mKeys[10].setText("");
            }
        }
    }

    public void setOnTouchListener(com.tenpay.wphk.HkWxKeyboardWindow.OnTouchListener onTouchListener) {
        this.mOnTouchListener = onTouchListener;
    }

    public void setSecureAccessibility(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        int i17 = 0;
        while (true) {
            android.widget.TextView[] textViewArr = this.mKeys;
            if (i17 >= textViewArr.length) {
                this.mKeyD.setAccessibilityDelegate(accessibilityDelegate);
                return;
            } else {
                textViewArr[i17].setAccessibilityDelegate(accessibilityDelegate);
                i17++;
            }
        }
    }

    public void setXMode(int i17) {
        this.mXMode = i17;
        android.widget.TextView textView = this.mKeys[10];
        if (i17 == 0) {
            textView.setText("");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        } else if (i17 == 1) {
            textView.setText("X");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        } else if (i17 != 2) {
            this.mXMode = 0;
        } else {
            textView.setText(".");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        }
    }

    public HkWxKeyboardWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mXMode = 0;
        this.mKeys = new android.widget.TextView[11];
        init(context);
    }
}
