package com.tenpay.miniapp;

/* loaded from: classes7.dex */
public final class MiniAppSecureEditText extends androidx.appcompat.widget.AppCompatEditText {
    private static final int DEFAULT_PASSWD_LENGTH = 6;
    private static final int MAX_PASSWD_LENGTH = 32;
    private static final int PASSWD_BLACK_DOT_SIZE = 7;
    private static final int PASSWD_LEFT_PADDING = -1500000;
    private java.lang.String certPem;
    private byte[] customHash;
    private com.tenpay.ndk.FitScUtil fitScUtil;
    private boolean isFixedInputLength;
    private char[] mBlackListChar;
    private android.graphics.drawable.Drawable mClearBtnImg;
    private float mDensity;
    private android.graphics.Paint mPaintBackground;
    private com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener mPasswdListener;
    private char[] mWhiteListChar;
    private int maxInputLength;
    private int minInputLength;
    private long nonce;
    private java.lang.String salt;
    private long timeStamp;

    /* renamed from: com.tenpay.miniapp.MiniAppSecureEditText$5, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType;

        static {
            int[] iArr = new int[com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.values().length];
            $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType = iArr;
            try {
                iArr[com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.TBase64.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType[com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.THexLowerCase.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType[com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.THexUpperCase.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum EEncodeType {
        THexLowerCase,
        THexUpperCase,
        TBase64
    }

    /* loaded from: classes7.dex */
    public interface OnPasswdInputListener {
        void onDone();
    }

    public MiniAppSecureEditText(android.content.Context context) {
        super(context, null);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
    }

    private static java.lang.String bytesToHex(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString.toLowerCase());
        }
        return sb6.toString();
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
        setAccessibilityDelegate(new com.tenpay.miniapp.TenpayAccessibilityDelegate());
    }

    private boolean isValidChar(char c17) {
        boolean z17;
        char[] cArr = this.mWhiteListChar;
        if (cArr != null) {
            int length = cArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = true;
                    break;
                }
                if (cArr[i17] == c17) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                return false;
            }
        }
        if (this.mBlackListChar != null) {
            for (char c18 : this.mWhiteListChar) {
                if (c18 == c17) {
                    return false;
                }
            }
        }
        return true;
    }

    private void setBlackListChar(char[] cArr) {
        this.mBlackListChar = cArr;
    }

    private void setClearBtnDrawableId(int i17) {
        try {
            this.mClearBtnImg = getResources().getDrawable(i17);
        } catch (java.lang.Exception unused) {
            this.mClearBtnImg = null;
        }
        android.graphics.drawable.Drawable drawable = this.mClearBtnImg;
        if (drawable == null) {
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.3
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return false;
                }
            });
        } else {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mClearBtnImg.getIntrinsicHeight());
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.1
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (z17) {
                        return;
                    }
                    com.tenpay.miniapp.MiniAppSecureEditText miniAppSecureEditText = com.tenpay.miniapp.MiniAppSecureEditText.this;
                    miniAppSecureEditText.setCompoundDrawables(miniAppSecureEditText.getCompoundDrawables()[0], com.tenpay.miniapp.MiniAppSecureEditText.this.getCompoundDrawables()[1], null, com.tenpay.miniapp.MiniAppSecureEditText.this.getCompoundDrawables()[3]);
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.miniapp.MiniAppSecureEditText.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return false;
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

    private void setWhiteListChar(char[] cArr) {
        this.mWhiteListChar = cArr;
    }

    public void beginCustomHash() {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        this.customHash = getInputText().getBytes();
    }

    public void customAppendSalt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        byte[] bArr = new byte[this.customHash.length + str.length()];
        byte[] bArr2 = this.customHash;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        java.lang.System.arraycopy(str.getBytes(), 0, bArr, this.customHash.length, str.length());
        this.customHash = bArr;
    }

    public void customInsertSalt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        byte[] bArr = new byte[this.customHash.length + str.length()];
        java.lang.System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
        java.lang.System.arraycopy(this.customHash, 0, bArr, str.length(), this.customHash.length);
        this.customHash = bArr;
    }

    public void customPasswdEncode(com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType eEncodeType) {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        int i17 = com.tenpay.miniapp.MiniAppSecureEditText.AnonymousClass5.$SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType[eEncodeType.ordinal()];
        if (i17 == 1) {
            this.customHash = android.util.Base64.encodeToString(this.customHash, 0).trim().getBytes();
        } else if (i17 == 2) {
            this.customHash = bytesToHex(this.customHash).getBytes();
        } else {
            if (i17 != 3) {
                return;
            }
            this.customHash = bytesToHex(this.customHash).toUpperCase().getBytes();
        }
    }

    public void customPasswdMd5() {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        this.customHash = this.fitScUtil.md5(this.customHash);
    }

    public void customPasswdSha1() {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        this.customHash = this.fitScUtil.sha1(this.customHash);
    }

    public void customPasswdSha256() {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        this.customHash = this.fitScUtil.sha256(this.customHash);
    }

    public void customPasswdSm3() {
        if (android.text.TextUtils.isEmpty(getInputText())) {
            return;
        }
        this.customHash = this.fitScUtil.sm3(this.customHash);
    }

    public java.lang.String endCustomHashAndEncrypt(long j17, long j18) {
        byte[] bArr;
        java.lang.String encryptPassWithCert;
        java.lang.String inputText = getInputText();
        if (android.text.TextUtils.isEmpty(inputText) || inputText.length() < this.minInputLength || this.fitScUtil == null || (bArr = this.customHash) == null || j17 == 0 || j18 == 0) {
            return null;
        }
        java.lang.String bytesToHex = bytesToHex(bArr);
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            encryptPassWithCert = this.fitScUtil.encryptPassWithCert(this.certPem, bytesToHex.getBytes(), null, j17, java.lang.String.valueOf(j18), 0, false);
            this.customHash = null;
        }
        return encryptPassWithCert;
    }

    public java.lang.String getEncryptedData() {
        java.lang.String encryptPassWithCert;
        java.lang.String inputText = getInputText();
        if (android.text.TextUtils.isEmpty(inputText) || inputText.length() < this.minInputLength || this.salt == null || this.timeStamp == 0 || this.nonce == 0) {
            return null;
        }
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            encryptPassWithCert = this.fitScUtil.encryptPassWithCert(this.certPem, inputText.getBytes(), this.salt.getBytes(), this.timeStamp, java.lang.String.valueOf(this.nonce), 7, false);
        }
        return encryptPassWithCert;
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public java.lang.String getVersion() {
        return this.fitScUtil.getVersion();
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) > 0) {
            return;
        }
        super.onCreateContextMenu(contextMenu);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            com.tenpay.ndk.FitScUtil fitScUtil = this.fitScUtil;
            if (fitScUtil != null) {
                fitScUtil.release();
                this.fitScUtil = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        drawPasswdDot(canvas);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener onPasswdInputListener;
        super.onTextChanged(charSequence, i17, i18, i19);
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        for (int i27 = i17; i27 < i17 + i19; i27++) {
            if (!isValidChar(charSequence.charAt(i27))) {
                java.lang.String charSequence2 = charSequence.toString();
                setText(charSequence2.substring(0, i27) + charSequence2.substring(i27 + 1));
                setSelection(i27);
                return;
            }
        }
        if (this.isFixedInputLength && charSequence.length() == this.maxInputLength && (onPasswdInputListener = this.mPasswdListener) != null) {
            onPasswdInputListener.onDone();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    public boolean setCertContext(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean init;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            com.tenpay.ndk.FitScUtil fitScUtil = new com.tenpay.ndk.FitScUtil();
            this.fitScUtil = fitScUtil;
            this.certPem = str;
            init = fitScUtil.init(str2, str3, null, null);
        }
        return init;
    }

    public void setInputLength(int i17, int i18) {
        this.minInputLength = i17;
        this.maxInputLength = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
        this.isFixedInputLength = i17 == i18;
    }

    public void setNonce(long j17) {
        this.nonce = j17;
    }

    public void setOnPasswdInputListener(com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public void setSalt(java.lang.String str) {
        this.salt = str;
    }

    public void setTimeStamp(long j17) {
        this.timeStamp = j17;
    }

    public MiniAppSecureEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
        init(context, attributeSet);
    }

    public MiniAppSecureEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.minInputLength = 6;
        this.maxInputLength = 6;
        this.isFixedInputLength = true;
        init(context, attributeSet);
    }
}
