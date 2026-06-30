package com.tenpay.wphk;

/* loaded from: classes7.dex */
public final class HkWxSecureEditText extends androidx.appcompat.widget.AppCompatEditText {
    private static final int DEFAULT_PASSWD_LENGTH = 6;
    private static final int MAX_PASSWD_LENGTH = 32;
    private static final int PASSWD_BLACK_DOT_SIZE = 7;
    private static final int PASSWD_LEFT_PADDING = -1500000;
    private boolean isFixedInputLength;
    private char[] mBlackListChar;
    private android.graphics.drawable.Drawable mClearBtnImg;
    private float mDensity;
    private android.graphics.Paint mPaintBackground;
    private com.tenpay.wphk.HkWxSecureEditText.OnPasswdInputListener mPasswdListener;
    private char[] mWhiteListChar;
    private int maxInputLength;
    private int minInputLength;
    private boolean noUpdate;
    private byte[] randomKey;
    private byte[] realContent;
    private int realLength;

    /* renamed from: com.tenpay.wphk.HkWxSecureEditText$2, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode;

        static {
            int[] iArr = new int[com.tenpay.wphk.HkWxSecureEditText.EncryptMode.values().length];
            $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode = iArr;
            try {
                iArr[com.tenpay.wphk.HkWxSecureEditText.EncryptMode.RSA2048_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode[com.tenpay.wphk.HkWxSecureEditText.EncryptMode.RSA2048_WITH_PBKDF2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum EncryptMode {
        RSA2048_WITH_MD5,
        RSA2048_WITH_PBKDF2
    }

    /* loaded from: classes7.dex */
    public interface OnPasswdInputListener {
        void onDone();
    }

    public HkWxSecureEditText(android.content.Context context) {
        super(context, null);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
        this.randomKey = new byte[32];
        this.realContent = new byte[32];
        this.realLength = 0;
        this.noUpdate = false;
    }

    private void drawPasswdDot(android.graphics.Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.maxInputLength;
        int length = getInputText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, this.mDensity * 7.0f, this.mPaintBackground);
        }
    }

    private java.lang.String getInputText() {
        return super.getText().toString().trim();
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.mDensity = getResources().getDisplayMetrics().density;
        setIsPasswordFormat(true);
        setAccessibilityDelegate(new com.tenpay.wphk.TenpayAccessibilityDelegate());
    }

    private void setClearBtnDrawableId(int i17) {
        try {
            this.mClearBtnImg = getResources().getDrawable(i17);
        } catch (java.lang.Exception unused) {
            this.mClearBtnImg = null;
        }
        android.graphics.drawable.Drawable drawable = this.mClearBtnImg;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mClearBtnImg.getIntrinsicHeight());
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.wphk.HkWxSecureEditText.1
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (z17) {
                        return;
                    }
                    com.tenpay.wphk.HkWxSecureEditText hkWxSecureEditText = com.tenpay.wphk.HkWxSecureEditText.this;
                    hkWxSecureEditText.setCompoundDrawables(hkWxSecureEditText.getCompoundDrawables()[0], hkWxSecureEditText.getCompoundDrawables()[1], null, hkWxSecureEditText.getCompoundDrawables()[3]);
                }
            });
        }
    }

    private void setIsPasswordFormat(boolean z17) {
        if (!z17) {
            this.mPaintBackground = null;
            return;
        }
        setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaintBackground = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mPaintBackground.setColor(-16777216);
        setInputType(2);
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.maxInputLength)});
    }

    private void updateText(java.lang.String str) {
        com.tenpay.wphk.HkWxSecureEditText.OnPasswdInputListener onPasswdInputListener;
        if (this.noUpdate) {
            this.noUpdate = false;
            return;
        }
        int length = str.length();
        if (this.randomKey == null || length > this.maxInputLength) {
            return;
        }
        if (length == 0) {
            new java.security.SecureRandom().nextBytes(this.randomKey);
            this.realLength = 0;
            return;
        }
        int i17 = this.realLength;
        if (length < i17) {
            this.realLength = i17 - 1;
            return;
        }
        int i18 = length - 1;
        this.realContent[i18] = (byte) (str.charAt(i18) ^ this.randomKey[i18]);
        this.realLength = length;
        this.noUpdate = true;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < this.realLength; i19++) {
            stringBuffer.append('*');
        }
        setText(stringBuffer.toString());
        setSelection(this.realLength);
        if (this.isFixedInputLength && str.length() == this.maxInputLength && (onPasswdInputListener = this.mPasswdListener) != null) {
            onPasswdInputListener.onDone();
        }
    }

    public java.lang.String getEncryptData(com.tenpay.wphk.HkWxSecureEditText.EncryptMode encryptMode, long j17, java.lang.String str, java.lang.String str2) {
        int i17 = this.realLength;
        if (i17 >= this.minInputLength && i17 <= this.maxInputLength) {
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < this.realLength; i18++) {
                bArr[i18] = (byte) (this.realContent[i18] ^ this.randomKey[i18]);
            }
            if (i17 >= this.minInputLength && str != null && j17 != 0) {
                return com.tenpay.ndk.HkWxCryptoUtil.encryptPassword(bArr, str.getBytes(), j17, str2, com.tenpay.wphk.HkWxSecureEditText.AnonymousClass2.$SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode[encryptMode.ordinal()] != 1 ? 2 : 1);
            }
        }
        return null;
    }

    public int getLastError() {
        return com.tenpay.ndk.HkWxCryptoUtil.getError();
    }

    public java.lang.String getVersion() {
        return com.tenpay.ndk.HkWxCryptoUtil.getVersion();
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) > 0) {
            return;
        }
        super.onCreateContextMenu(contextMenu);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        drawPasswdDot(canvas);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        updateText(charSequence.toString());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    public void setInputLength(int i17, int i18) {
        this.minInputLength = i17;
        this.maxInputLength = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
        this.isFixedInputLength = i17 == i18;
    }

    public void setOnPasswdInputListener(com.tenpay.wphk.HkWxSecureEditText.OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public HkWxSecureEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
        this.randomKey = new byte[32];
        this.realContent = new byte[32];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }

    public HkWxSecureEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
        this.randomKey = new byte[32];
        this.realContent = new byte[32];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }
}
