package com.tenpay.bankcard;

/* loaded from: classes9.dex */
public final class TenpaySegmentEditText extends android.widget.LinearLayout {
    private static java.lang.String mTimeStamp;
    private final int BG_LINE_COLOR;
    private final int BG_LINE_HEIGHT;
    private final int BG_LINE_SIZE;
    private final java.lang.String TAG;
    private android.content.Context mContext;
    private java.util.List<android.widget.EditText> mEditArray;
    com.tenpay.bankcard.TenpaySegmentEditText.EditState mEditState;
    private com.tenpay.android.wechat.MyKeyboardWindow mKeyboard;
    private boolean mNoFocus;
    private android.view.View.OnClickListener mOnClickListener;
    private android.graphics.Paint mPaintBg;
    private android.graphics.Paint mPaintSplit;

    /* loaded from: classes6.dex */
    public enum EditState {
        DEFAULT,
        BANKCARD,
        BANKCARD_WITH_TAILNUM
    }

    public TenpaySegmentEditText(android.content.Context context) {
        this(context, null);
        this.mContext = context;
        init();
    }

    private void drawBackgroundLine(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f17 = height - 4;
        canvas.drawRect(0.0f, f17, width, height, this.mPaintBg);
        float f18 = f17 - 9.0f;
        int size = this.mEditArray.size();
        canvas.drawRect(0.0f, f18, 4.0f, f17, this.mPaintBg);
        int i17 = 0;
        float f19 = 0.0f;
        while (i17 < size) {
            int i18 = i17 == size + (-1) ? -4 : -2;
            float width2 = f19 + this.mEditArray.get(i17).getWidth() + i18;
            canvas.drawRect(width2, f18, width2 + 4.0f, f17, this.mPaintBg);
            f19 = width2 - i18;
            i17++;
        }
    }

    private java.lang.String getInputText() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < this.mEditArray.size(); i17++) {
            stringBuffer.append(this.mEditArray.get(i17).getText().toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2 == null || stringBuffer2.length() == 0) {
            return null;
        }
        stringBuffer2.trim().replaceAll(" ", "");
        return stringBuffer2;
    }

    private void init() {
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setOrientation(0);
        setIsBankcardFormat(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaintSplit = paint;
        paint.setStrokeWidth(0.0f);
        this.mPaintSplit.setColor(-7829368);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.mPaintBg = paint2;
        paint2.setColor(-11615450);
        this.mPaintBg.setStyle(android.graphics.Paint.Style.FILL);
    }

    public static void setNoSystemInputOnEditText(android.widget.EditText editText) {
        try {
            try {
                java.lang.reflect.Method method = android.widget.EditText.class.getMethod("setShowSoftInputOnFocus", java.lang.Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, java.lang.Boolean.FALSE);
            } catch (java.lang.Exception unused) {
                editText.setInputType(0);
            }
        } catch (java.lang.NoSuchMethodException unused2) {
            java.lang.reflect.Method method2 = android.widget.EditText.class.getMethod("setSoftInputShownOnFocus", java.lang.Boolean.TYPE);
            method2.setAccessible(true);
            method2.invoke(editText, java.lang.Boolean.FALSE);
        } catch (java.lang.Exception unused3) {
        }
    }

    public static void setSalt(java.lang.String str) {
        mTimeStamp = str;
    }

    public void ClearInput() {
    }

    public java.lang.String get3DesEncrptData() {
        java.lang.String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        return encrypt.desedeEncode(inputText, encrypt.getRandomKey());
    }

    public java.lang.String getEncryptDataWithHash(boolean z17) {
        java.lang.String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        if (z17) {
            inputText = com.tenpay.android.wechat.TenpayUtil.md5HexDigest(inputText);
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        java.lang.String str = mTimeStamp;
        if (str != null) {
            encrypt.setTimeStamp(str);
        }
        com.tencent.mm.wallet_core.b.a().g();
        return encrypt.encryptPasswdWithRSA2048(inputText);
    }

    public int getInputLength() {
        java.lang.String inputText = getInputText();
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public boolean isMatchPattern(java.lang.String str) {
        if (str != null) {
            try {
                return java.util.regex.Pattern.compile(str).matcher(getInputText()).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        drawBackgroundLine(canvas);
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        com.tenpay.bankcard.LogUtil.d("MyTag", "setFocusable " + z17);
        for (int i17 = 0; i17 < this.mEditArray.size(); i17++) {
            android.widget.EditText editText = this.mEditArray.get(i17);
            editText.setFocusable(z17);
            editText.setFocusableInTouchMode(z17);
        }
    }

    public void setIsBankcardFormat(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.bankcard.TenpaySegmentEditText.EditState.BANKCARD;
        } else if (com.tenpay.bankcard.TenpaySegmentEditText.EditState.BANKCARD == this.mEditState) {
            this.mEditState = com.tenpay.bankcard.TenpaySegmentEditText.EditState.DEFAULT;
        }
    }

    public void setKeyboard(com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow) {
        this.mKeyboard = myKeyboardWindow;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setText(java.lang.String str) {
        setText(str, null);
    }

    public void setText(java.lang.String str, java.lang.String str2) {
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = encrypt.getRandomKey();
        }
        java.lang.String[] split = encrypt.desedeDecode(str, str2).split("-");
        removeAllViews();
        this.mNoFocus = true;
        this.mEditArray.clear();
        for (int i17 = 0; i17 < split.length; i17++) {
            final android.widget.EditText editText = new android.widget.EditText(this.mContext);
            editText.setText(split[i17]);
            editText.setMaxLines(1);
            editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(split[i17].length())});
            editText.setGravity(17);
            editText.setInputType(2);
            editText.setBackgroundColor(0);
            editText.setSelectAllOnFocus(true);
            editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tenpay.bankcard.TenpaySegmentEditText.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.tenpay.bankcard.TenpaySegmentEditText.this.mOnClickListener != null) {
                        com.tenpay.bankcard.TenpaySegmentEditText.this.mOnClickListener.onClick(view);
                    }
                    if (com.tenpay.bankcard.TenpaySegmentEditText.this.mNoFocus) {
                        com.tenpay.bankcard.TenpaySegmentEditText.this.setFocusable(true);
                        editText.requestFocus();
                        com.tenpay.bankcard.TenpaySegmentEditText.this.mNoFocus = false;
                    }
                }
            });
            setNoSystemInputOnEditText(editText);
            ((android.view.inputmethod.InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 2);
            editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.bankcard.TenpaySegmentEditText.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    com.tenpay.bankcard.LogUtil.d("MyTag", "edit onFocusChange hasFocus=" + z17);
                    if (z17) {
                        if (com.tenpay.bankcard.TenpaySegmentEditText.this.mOnClickListener != null) {
                            com.tenpay.bankcard.TenpaySegmentEditText.this.mOnClickListener.onClick(view);
                        }
                        if (com.tenpay.bankcard.TenpaySegmentEditText.this.mKeyboard != null) {
                            com.tenpay.bankcard.LogUtil.d("MyTag", "keyboard is not null");
                            com.tenpay.bankcard.TenpaySegmentEditText.this.mKeyboard.setXMode(0);
                            com.tenpay.bankcard.TenpaySegmentEditText.this.mKeyboard.setInputEditText(editText);
                        }
                    }
                }
            });
            addView(editText, new android.widget.LinearLayout.LayoutParams(-2, -1, split[i17].length()));
            this.mEditArray.add(editText);
        }
        setFocusable(false);
    }

    public TenpaySegmentEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "MyTag";
        this.BG_LINE_COLOR = -11615450;
        this.BG_LINE_SIZE = 4;
        this.BG_LINE_HEIGHT = 9;
        this.mOnClickListener = null;
        this.mNoFocus = true;
        this.mEditState = com.tenpay.bankcard.TenpaySegmentEditText.EditState.DEFAULT;
        this.mContext = null;
        this.mEditArray = new java.util.ArrayList();
        this.mKeyboard = null;
        this.mContext = context;
        init();
    }

    private boolean isMatchPattern(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            try {
                return java.util.regex.Pattern.compile(str2).matcher(str).matches();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }
}
