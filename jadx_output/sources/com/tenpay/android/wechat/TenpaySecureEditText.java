package com.tenpay.android.wechat;

/* loaded from: classes9.dex */
public final class TenpaySecureEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {
    public static final int AREA_ID_CARD_TYPE_HUIXIANG = 5;
    public static final int AREA_ID_CARD_TYPE_SHENFEN = 1;
    public static final int AREA_ID_CARD_TYPE_TAIBAO = 9;
    private static int PASSWD_BLACK_DOT_SIZE = 7;
    private static int PASSWD_LEFT_PADDING = -1500000;
    private static java.lang.String mTimeStamp;
    private int BANK_CARD_LENGTH_LIMIT;
    private int CARD_TAIL_SPACE;
    private int CVV_4_PAYMENT_LENGTH;
    private int CVV_PAYMENT_LENGTH;
    private int PASSWD_LENGTH;
    private int VALID_THRU_LEN;
    private java.util.ArrayList<android.text.TextWatcher> mBackupListeners;
    private java.lang.String mCardTailNum;
    private android.graphics.drawable.Drawable mClearBtnImg;
    private float mDensity;
    com.tenpay.android.wechat.TenpaySecureEditText.EditState mEditState;
    private char[] mFilterChar;
    private java.lang.String mFixedHeaderText;
    private android.graphics.Paint mIDCardPaint;
    private com.tenpay.android.wechat.ISecureEncrypt mIEncrypt;
    private boolean mIgnoreTextChange;
    private boolean mIsCardTailNumCanDisplay;
    private boolean mIsSelfSet;
    private boolean mIsUseOfKinda;
    private com.tenpay.android.wechat.TenpaySecureEditText.IKindaEditTextCallBackListener mKindaEditTextCallBackListener;
    private boolean mNewPwdStyle;
    private android.graphics.Paint mPaintBackground;
    private android.graphics.Paint mPasswdBgPaint;
    private com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener mPasswdInputChangeListener;
    private com.tenpay.android.wechat.OnPasswdInputListener mPasswdListener;
    private android.graphics.Paint mPasswdSeparedPaint;
    private android.graphics.Paint mTitlePaint;
    private com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener m_envCallBackListener;
    private boolean noUpdate;
    private byte[] randomKey;
    private byte[] realContent;
    private int realLength;
    private java.lang.String regExFilterInput;

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$6, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState;
        static final /* synthetic */ int[] $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode;
        static final /* synthetic */ int[] $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode;

        static {
            int[] iArr = new int[com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.values().length];
            $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode = iArr;
            try {
                iArr[com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode[com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.values().length];
            $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode = iArr2;
            try {
                iArr2[com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.RSA1024_WITH_MD5.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode[com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.RSA2048_WITH_MD5.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode[com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_MD5.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode[com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_PBKDF2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.tenpay.android.wechat.TenpaySecureEditText.EditState.values().length];
            $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState = iArr3;
            try {
                iArr3[com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD_WITH_TAILNUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.VALID_THRU.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.SECURITY_ANSWER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.COMMON_TEXT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum EditState {
        DEFAULT,
        PASSWORD,
        BANKCARD,
        BANKCARD_WITH_TAILNUM,
        VALID_THRU,
        MONEY_AMOUNT,
        CVV_PAYMENT,
        CVV_4_PAYMENT,
        SECURITY_ANSWER,
        IDCARD_TAIL,
        COMMON_TEXT
    }

    /* loaded from: classes9.dex */
    public enum EncryptMode {
        RSA1024_WITH_MD5,
        RSA2048_WITH_MD5,
        SM2_WITH_MD5,
        SM2_WITH_PBKDF2
    }

    /* loaded from: classes9.dex */
    public static class EventLogger implements com.tenpay.ndk.FitNativeEvent.Logger {
        private EventLogger() {
        }

        @Override // com.tenpay.ndk.FitNativeEvent.Logger
        public void onLog(int i17, java.lang.String str) {
            com.tencent.mars.xlog.Log.i("TenpaySMLogger", "native event: [" + i17 + "], [" + str + "]");
        }
    }

    /* loaded from: classes9.dex */
    public enum HKSoftEncryMode {
        HKSOFT_RSA2048_WITH_MD5,
        HKSOFT_RSA2048_WITH_PBKDF2
    }

    /* loaded from: classes9.dex */
    public interface I993EnvListener {
        boolean is993Env();
    }

    /* loaded from: classes9.dex */
    public interface IKindaEditTextCallBackListener {
        void onCallBackKinda();
    }

    /* loaded from: classes9.dex */
    public interface IPasswdInputChangeListener {
        void onInputChanged();
    }

    public TenpaySecureEditText(android.content.Context context) {
        this(context, null);
    }

    private void drawCardTailNum(android.graphics.Canvas canvas) {
        if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD_WITH_TAILNUM == this.mEditState && this.mIsCardTailNumCanDisplay) {
            int baseline = getBaseline();
            if (baseline == -1) {
                baseline = 44;
            }
            canvas.drawText(this.mCardTailNum, (this.CARD_TAIL_SPACE * this.mDensity) + getPaint().measureText(getText().toString()), baseline, this.mTitlePaint);
        }
    }

    private void drawCvv4PaymentDot(android.graphics.Canvas canvas) {
        if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT != this.mEditState || this.mPaintBackground == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.CVV_4_PAYMENT_LENGTH;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, PASSWD_BLACK_DOT_SIZE * this.mDensity, this.mPaintBackground);
        }
    }

    private void drawCvvPaymentDot(android.graphics.Canvas canvas) {
        if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT != this.mEditState || this.mPaintBackground == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.CVV_PAYMENT_LENGTH;
        int length = getText().length();
        for (int i18 = 0; i18 < length; i18++) {
            canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, PASSWD_BLACK_DOT_SIZE * this.mDensity, this.mPaintBackground);
        }
    }

    private void drawIdCardTail(android.graphics.Canvas canvas) {
        if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.IDCARD_TAIL != this.mEditState || this.mIDCardPaint == null) {
            return;
        }
        int width = getWidth() / 4;
        java.lang.String obj = getText().toString();
        int length = obj.length();
        this.mIDCardPaint.setTextSize(getTextSize());
        int i17 = 0;
        while (i17 < length) {
            int i18 = i17 + 1;
            canvas.drawText(obj.substring(i17, i18), (width / 2) + (i17 * width), getBaseline(), this.mIDCardPaint);
            i17 = i18;
        }
    }

    private void drawPasswdDot(android.graphics.Canvas canvas) {
        if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD != this.mEditState || this.mPaintBackground == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i17 = width / this.PASSWD_LENGTH;
        int length = getText().length();
        int i18 = 0;
        if (!this.mNewPwdStyle) {
            while (i18 < length) {
                canvas.drawCircle((i17 / 2) + (i18 * i17), height / 2, PASSWD_BLACK_DOT_SIZE * this.mDensity, this.mPaintBackground);
                i18++;
            }
            for (int i19 = 1; i19 < this.PASSWD_LENGTH; i19++) {
                float f17 = i17 * i19;
                canvas.drawLine(f17, 0.0f, f17, height, this.mPasswdSeparedPaint);
            }
            return;
        }
        int b17 = i65.a.b(getContext(), 8);
        int i27 = this.PASSWD_LENGTH;
        int i28 = (width - ((i27 - 1) * b17)) / i27;
        int i29 = height - i28;
        while (i18 < this.PASSWD_LENGTH) {
            float f18 = (i28 + b17) * i18;
            float f19 = i28;
            float f27 = f18 + f19;
            float f28 = i29;
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f28, f27, i28 + i29);
            float b18 = i65.a.b(getContext(), 4);
            canvas.drawRoundRect(rectF, b18, b18, this.mPasswdBgPaint);
            if (i18 < length) {
                canvas.drawCircle((f18 + f27) / 2.0f, (f19 / 2.0f) + f28, i65.a.b(getContext(), 4), this.mPaintBackground);
            }
            i18++;
        }
    }

    private void eventLog(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "err:%d %s" + i17, str);
        com.tenpay.ndk.FitNativeEvent.Logger listener = com.tenpay.ndk.FitNativeEvent.getListener();
        if (listener != null) {
            listener.onLog(i17, str);
        }
    }

    private java.lang.String getInputStringFromKeyCode(int i17) {
        return i17 == 7 ? "0" : i17 == 8 ? "1" : i17 == 9 ? "2" : i17 == 10 ? "3" : i17 == 11 ? "4" : i17 == 12 ? "5" : i17 == 13 ? "6" : i17 == 14 ? "7" : i17 == 15 ? "8" : i17 == 16 ? "9" : "";
    }

    private java.lang.String getInputText() {
        java.lang.String obj = this.mEditState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.SECURITY_ANSWER ? getText().toString() : getText().toString().trim();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        int i17 = com.tenpay.android.wechat.TenpaySecureEditText.AnonymousClass6.$SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[this.mEditState.ordinal()];
        if (i17 == 1) {
            obj = obj.replaceAll(" ", "");
        } else if (i17 == 2) {
            obj = obj.replaceAll(" ", "");
            java.lang.String str = this.mCardTailNum;
            if (str != null && str.length() > 0) {
                obj = obj + this.mCardTailNum;
            }
        } else if (i17 == 3) {
            obj = obj.replaceAll("/", "");
            if (obj != null && obj.length() == this.VALID_THRU_LEN) {
                java.lang.String substring = obj.substring(0, 2);
                obj = obj.substring(2) + substring;
            }
        } else if (i17 != 4 && i17 != 5) {
            obj = obj.replaceAll(" ", "").replaceAll("x", "X");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.regExFilterInput)) {
            return obj;
        }
        java.lang.String trim = java.util.regex.Pattern.compile(this.regExFilterInput).matcher(obj).replaceAll("").trim();
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "use filter");
        return trim;
    }

    private boolean handleDelPwdEvent() {
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "handleDelPwdEvent");
        int i17 = this.realLength;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "handleDelPwdEvent real len is 0");
            return false;
        }
        this.realLength = i17 - 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i18 = 0; i18 < this.realLength; i18++) {
            stringBuffer.append('*');
        }
        removeAllListeners();
        setText(stringBuffer.toString());
        setSelection(this.realLength);
        restoreAllListeners();
        return true;
    }

    private boolean handleInputPwdEvent(int i17) {
        com.tenpay.android.wechat.OnPasswdInputListener onPasswdInputListener;
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "handleInputPwdEvent");
        if (this.realLength >= this.PASSWD_LENGTH) {
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "handleInputPwdEvent real len >= pwd len");
            return false;
        }
        java.lang.String inputStringFromKeyCode = getInputStringFromKeyCode(i17);
        int i18 = this.realLength;
        this.realContent[i18] = (byte) (inputStringFromKeyCode.charAt(0) ^ this.randomKey[i18]);
        this.realLength++;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i19 = 0; i19 < this.realLength; i19++) {
            stringBuffer.append('*');
        }
        removeAllListeners();
        setText(stringBuffer.toString());
        setSelection(this.realLength);
        restoreAllListeners();
        if (this.realLength == this.PASSWD_LENGTH && (onPasswdInputListener = this.mPasswdListener) != null) {
            onPasswdInputListener.onDone();
        }
        return true;
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        int[] resourceDeclareStyleableIntArray;
        android.content.res.TypedArray obtainStyledAttributes;
        this.mDensity = getResources().getDisplayMetrics().density;
        initLogger();
        if (attributeSet != null && (resourceDeclareStyleableIntArray = com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIntArray(context, "TenpaySecureEditText")) != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resourceDeclareStyleableIntArray)) != null) {
            setIsPasswordFormat(obtainStyledAttributes.getBoolean(com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isPassword"), false), true);
            setIsBankcardFormat(obtainStyledAttributes.getBoolean(com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isBankcard"), false));
            setIsValidThru(obtainStyledAttributes.getBoolean(com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isValidThru"), false));
            setBankcardTailNum(obtainStyledAttributes.getString(com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_bankcardTailNum")));
            int resourceId = obtainStyledAttributes.getResourceId(com.tenpay.android.wechat.TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_rightClearDrawable"), 0);
            if (resourceId != 0) {
                setClearBtnDrawableId(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        addTextChangedListener(new android.text.TextWatcher() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }
        });
    }

    private void initLogger() {
        com.tenpay.ndk.FitNativeEvent.setListener(new com.tenpay.android.wechat.TenpaySecureEditText.EventLogger());
    }

    private boolean is993Abtest() {
        com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener i993EnvListener = this.m_envCallBackListener;
        if (i993EnvListener != null) {
            return i993EnvListener.is993Env();
        }
        return false;
    }

    private void removeAllListeners() {
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                super.removeTextChangedListener(arrayList.get(i17));
            }
        }
    }

    private void restoreAllListeners() {
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                super.addTextChangedListener(arrayList.get(i17));
            }
        }
    }

    public static void setSalt(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "check salt: %s", str);
        if ((java.lang.Integer.decode(com.tencent.mm.sdk.platformtools.z.f193111g).intValue() & 255) < 48) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "check salt stack: %s", new com.tencent.mm.sdk.platformtools.z3());
        }
        mTimeStamp = str;
    }

    private void updateText(java.lang.String str) {
        if (this.noUpdate) {
            this.noUpdate = false;
            return;
        }
        int length = str.length();
        if (this.randomKey == null || length > this.PASSWD_LENGTH) {
            return;
        }
        if (this.realLength == 0) {
            new java.security.SecureRandom().nextBytes(this.randomKey);
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
        removeAllListeners();
        setText(stringBuffer.toString());
        setSelection(this.realLength);
        restoreAllListeners();
    }

    public void ClearInput() {
        setText("");
        this.realLength = 0;
        for (int i17 = 0; i17 < this.PASSWD_LENGTH; i17++) {
            this.realContent[i17] = 0;
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        if (this.mBackupListeners == null) {
            this.mBackupListeners = new java.util.ArrayList<>();
        }
        this.mBackupListeners.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public java.lang.String get3DesEncrptData() {
        java.lang.String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        com.tenpay.android.wechat.ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt != null) {
            return iSecureEncrypt.desedeEncode(inputText, mTimeStamp);
        }
        return new com.tenpay.ndk.Encrypt().desedeEncode(inputText);
    }

    public java.lang.String get3DesVerifyCode() {
        java.lang.String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        com.tenpay.android.wechat.ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        return iSecureEncrypt != null ? iSecureEncrypt.desedeVerifyCode(inputText, mTimeStamp) : new com.tenpay.ndk.Encrypt().desedeVerifyCode(inputText);
    }

    public java.lang.String get993EncryptPassword(long j17, java.lang.String str, java.lang.String str2, int i17) {
        com.tenpay.ndk.FitScUtil fitScUtil = new com.tenpay.ndk.FitScUtil();
        fitScUtil.initTsm();
        return fitScUtil.encryptPassWithCert("-----BEGIN CERTIFICATE-----\nMIICcTCCAhigAwIBAgIKMTIzNDU2Nzg5MDAKBggqgRzPVQGDdTB5MRMwEQYDVQQD\nDAp0ZW5wYXkuY29tMQswCQYDVQQGEwJDTjESMBAGA1UECAwJR3VhbmdEb25nMREw\nDwYDVQQHDAhTaGVuWmhlbjEUMBIGA1UECgwLVGVucGF5IEluYy4xGDAWBgkqhkiG\n9w0BCQEWCWNhQHFxLmNvbTAiGA8yMDIyMDYxMzExNDAyN1oYDzIwMjcwNjEyMTE0\nMDI3WjCBoTETMBEGA1UEAwwKdGVucGF5LmNvbTELMAkGA1UEBhMCQ04xEDAOBgNV\nBAgMB0JlaWppbmcxEDAOBgNVBAcMB0JlaWppbmcxHjAcBgkqhkiG9w0BCQEWDzM0\nNTM4NDU2QHFxLmNvbTEQMA4GA1UECwwHT1UtRklUMTEQMA4GA1UECwwHT1UtRklU\nMjEVMBMGA1UECgwMQ3J5b3RvZ3JhcGh5MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0D\nQgAE1JmRUm1KUMdQHqSZuQu+5VreMmgzKsAIiMMltBxV9ofXvB/P7PGm+ih3ZaFl\nmT7KYaRm38p2CcuIhDiCiaSd8KNbMFkwHwYDVR0jBBgwFoAUV8nOG6rZPfnCPMWW\nMYZERrLJgGgwHQYDVR0OBBYEFPDKv4y/f8TYo2yPaa/ZnrbYg/V6MAkGA1UdEwQC\nMAAwDAYDVR0PBAUDAwc4ADAKBggqgRzPVQGDdQNHADBEAiASVMWU+SxnJdLppc11\nup7KAgFrCV/CJFYclN+OEb7chAIgGMV7ihaSfnEkRz3GInIWTVDhHubW3JXdNhXj\nCKObm4k=\n-----END CERTIFICATE-----", str2.getBytes(), "wxpay-pbkdf2".getBytes(), j17, str, i17, false);
    }

    public android.graphics.drawable.Drawable getClearBtnDrawable() {
        return this.mClearBtnImg;
    }

    public com.tenpay.android.wechat.TenpaySecureEditText.EditState getEditState() {
        return this.mEditState;
    }

    public java.lang.String getEncryptDataWithHash(boolean z17) {
        return getEncryptDataWithHash(z17, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode r17, long r18, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TenpaySecureEditText.getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode, long, java.lang.String):java.lang.String");
    }

    public java.lang.String getHKSoftEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode hKSoftEncryMode, long j17, java.lang.String str, java.lang.String str2) {
        int i17 = this.realLength;
        if (i17 != this.PASSWD_LENGTH) {
            return null;
        }
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < this.realLength; i18++) {
            bArr[i18] = (byte) (this.realContent[i18] ^ this.randomKey[i18]);
        }
        if (str2 == null || j17 == 0) {
            return null;
        }
        return com.tenpay.ndk.HkWxCryptoUtil.encryptPassword(bArr, str2.getBytes(), j17, str, com.tenpay.android.wechat.TenpaySecureEditText.AnonymousClass6.$SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode[hKSoftEncryMode.ordinal()] != 1 ? 2 : 1);
    }

    public int getInputLength() {
        if (this.mEditState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD) {
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "pwd scene, len is %s", java.lang.Integer.valueOf(this.realLength));
            return this.realLength;
        }
        java.lang.String inputText = getInputText();
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public java.lang.String getPasswordHash() {
        if (this.mEditState != com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD) {
            return null;
        }
        byte[] bArr = new byte[this.realLength];
        for (int i17 = 0; i17 < this.realLength; i17++) {
            bArr[i17] = (byte) (this.realContent[i17] ^ this.randomKey[i17]);
        }
        return new com.tenpay.ndk.MessageDigestUtil().getSHA256Hex(bArr);
    }

    public void handlePwdKeyBoardEvent(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener iPasswdInputChangeListener;
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "handlePwdKeyBoardEvent");
        if (this.randomKey == null) {
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "random key is null");
            return;
        }
        if (this.realLength == 0) {
            new java.security.SecureRandom().nextBytes(this.randomKey);
        }
        if (!(i17 == 67 ? handleDelPwdEvent() : handleInputPwdEvent(i17)) || (iPasswdInputChangeListener = this.mPasswdInputChangeListener) == null) {
            return;
        }
        iPasswdInputChangeListener.onInputChanged();
    }

    public boolean isAreaIDCardNum(int i17) {
        java.lang.String trim = getText().toString().trim();
        if (trim == null || trim.length() == 0) {
            return false;
        }
        trim.replaceAll(" ", "");
        if (i17 != 1) {
            return true;
        }
        return isUserIdNum();
    }

    public boolean isBankcardNum() {
        return getInputLength() >= this.BANK_CARD_LENGTH_LIMIT || getText().toString().contains("**");
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

    public boolean isMoneyAmount() {
        return isMatchPattern("^\\d+(\\.\\d{0,2})?$");
    }

    public boolean isPhoneNum() {
        return getText().toString().trim().length() == 11 || getText().toString().contains("**");
    }

    public boolean isUserIdNum() {
        return getInputLength() == 15 ? isMatchPattern("^\\d{15}$") : com.tenpay.android.wechat.TenpayUtil.invalidateID(getText().toString().trim());
    }

    public boolean isValidThru() {
        return isMatchPattern("[1-9][0-9]0[1-9]$|[1-9][0-9]1[0-2]$");
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if ((getInputType() & 128) <= 0) {
            com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
            com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = this.mEditState;
            if (editState == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT == editState2) {
                return;
            }
            super.onCreateContextMenu(contextMenu);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = this.mEditState;
        if (editState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.IDCARD_TAIL) {
            drawIdCardTail(canvas);
        } else if (editState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD || editState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT || editState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT) {
            drawPasswdDot(canvas);
            drawCvvPaymentDot(canvas);
            drawCvv4PaymentDot(canvas);
        } else {
            super.onDraw(canvas);
            drawCardTailNum(canvas);
        }
        if (android.text.TextUtils.isEmpty(this.mFixedHeaderText) || getText().length() <= 0) {
            return;
        }
        canvas.drawText(this.mFixedHeaderText, getWidth() - getPaint().measureText(this.mFixedHeaderText + getText().toString()), getBaseline(), getPaint());
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27;
        int length;
        int length2;
        com.tenpay.android.wechat.OnPasswdInputListener onPasswdInputListener;
        com.tenpay.android.wechat.OnPasswdInputListener onPasswdInputListener2;
        com.tenpay.android.wechat.OnPasswdInputListener onPasswdInputListener3;
        super.onTextChanged(charSequence, i17, i18, i19);
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = this.mEditState;
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
        if (editState == editState2 && this.mIgnoreTextChange) {
            com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "pwd scene, ignore textchange");
            return;
        }
        if (this.mFilterChar != null && !android.text.TextUtils.isEmpty(charSequence) && this.mEditState != editState2) {
            for (int i28 = i17; i28 < i17 + i19; i28++) {
                for (char c17 : this.mFilterChar) {
                    if (c17 == charSequence.charAt(i28)) {
                        java.lang.String charSequence2 = charSequence.toString();
                        setText(charSequence2.substring(0, i28) + charSequence2.substring(i28 + 1));
                        setSelection(i28);
                        return;
                    }
                }
            }
        }
        java.lang.String obj = getText().toString();
        this.mIsCardTailNumCanDisplay = obj != null && obj.length() > 0;
        int i29 = 3;
        if (isFocused() && this.mClearBtnImg != null) {
            com.tenpay.android.wechat.TenpaySecureEditText.EditState editState3 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
            com.tenpay.android.wechat.TenpaySecureEditText.EditState editState4 = this.mEditState;
            if (editState3 != editState4 && com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT != editState4 && com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT != editState4) {
                if (getText().toString().equals("")) {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
                } else {
                    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.mClearBtnImg, getCompoundDrawables()[3]);
                }
            }
        }
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState5 = this.mEditState;
        if (editState5 != null) {
            try {
                int i37 = com.tenpay.android.wechat.TenpaySecureEditText.AnonymousClass6.$SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState[editState5.ordinal()];
                if (i37 == 1 || i37 == 2) {
                    if (this.mIsSelfSet) {
                        this.mIsSelfSet = false;
                        return;
                    }
                    int i38 = i17 + i19;
                    if (obj.length() > 0) {
                        if (i38 <= obj.length()) {
                            java.lang.String substring = obj.substring(0, i38);
                            i27 = substring.length() - substring.replaceAll(" ", "").length();
                        } else {
                            i27 = 0;
                        }
                        java.lang.String replaceAll = obj.replaceAll(" ", "");
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        int length3 = replaceAll.length();
                        int i39 = 0;
                        while (true) {
                            int i47 = i39 + 4;
                            if (i47 >= length3) {
                                break;
                            }
                            stringBuffer.append(replaceAll.substring(i39, i47));
                            stringBuffer.append(" ");
                            i39 = i47;
                        }
                        stringBuffer.append(replaceAll.substring(i39));
                        java.lang.String stringBuffer2 = stringBuffer.toString();
                        if (i38 <= stringBuffer2.length()) {
                            java.lang.String substring2 = stringBuffer2.substring(0, i38);
                            java.lang.String replaceAll2 = substring2.replaceAll(" ", "");
                            length = substring2.length();
                            length2 = replaceAll2.length();
                        } else {
                            java.lang.String replaceAll3 = stringBuffer2.replaceAll(" ", "");
                            length = stringBuffer2.length();
                            length2 = replaceAll3.length();
                        }
                        this.mIsSelfSet = true;
                        setText(stringBuffer2);
                        setSelection((i38 + (length - length2)) - i27);
                        return;
                    }
                    return;
                }
                if (i37 != 3) {
                    if (i37 == 6) {
                        updateText(obj);
                        if (obj.length() != this.PASSWD_LENGTH || (onPasswdInputListener = this.mPasswdListener) == null) {
                            return;
                        }
                        onPasswdInputListener.onDone();
                        return;
                    }
                    if (i37 == 7) {
                        if (obj.length() != this.CVV_PAYMENT_LENGTH || (onPasswdInputListener2 = this.mPasswdListener) == null) {
                            return;
                        }
                        onPasswdInputListener2.onDone();
                        return;
                    }
                    if (i37 == 8 && obj.length() == this.CVV_4_PAYMENT_LENGTH && (onPasswdInputListener3 = this.mPasswdListener) != null) {
                        onPasswdInputListener3.onDone();
                        return;
                    }
                    return;
                }
                if (this.mIsSelfSet) {
                    this.mIsSelfSet = false;
                    return;
                }
                int length4 = obj.length();
                if (length4 != 0 && length4 != 1) {
                    java.lang.String replace = obj.replace("/", "");
                    if (length4 != 2 || !obj.contains("/")) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(replace.substring(0, 2));
                        sb6.append("/");
                        if (replace.length() > 2) {
                            sb6.append(replace.substring(2));
                        }
                        replace = sb6.toString();
                    }
                    int selectionStart = getSelectionStart();
                    this.mIsSelfSet = true;
                    setText(replace);
                    if (length4 != 2) {
                        setSelection(selectionStart);
                        return;
                    }
                    if (obj.contains("/")) {
                        setSelection(1);
                    } else if (selectionStart == 2) {
                        if (i19 <= i18) {
                            i29 = 2;
                        }
                        setSelection(i29);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = this.mEditState;
        if (editState == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT == editState2 || editState2 == com.tenpay.android.wechat.TenpaySecureEditText.EditState.IDCARD_TAIL) {
            return true;
        }
        return super.onTextContextMenuItem(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.mIsUseOfKinda) {
            clearFocus();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        int indexOf;
        java.util.ArrayList<android.text.TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null && (indexOf = arrayList.indexOf(textWatcher)) >= 0) {
            this.mBackupListeners.remove(indexOf);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public void set3DesEncrptData(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        setText(encrypt.desedeDecode(str, encrypt.getRandomKey()));
    }

    public void set993EnvCallBackListener(com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener i993EnvListener) {
        this.m_envCallBackListener = i993EnvListener;
    }

    public void setBankcardTailNum(java.lang.String str) {
        this.mCardTailNum = str;
        if (str == null || str.length() <= 0) {
            return;
        }
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD_WITH_TAILNUM;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mTitlePaint = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.mTitlePaint.setAntiAlias(true);
        this.mTitlePaint.setTextSize(getTextSize());
        this.mIDCardPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
    }

    public void setClearBtnDrawableId(int i17) {
        setClearBtnDrawableId(i17, 0);
    }

    public void setCursorStyle(int i17) {
        if (i17 == -1) {
            return;
        }
        if (fp.h.c(29)) {
            android.graphics.drawable.Drawable drawable = getContext().getDrawable(i17);
            if (drawable != null) {
                setCursorStyle(drawable);
                return;
            }
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Exception unused) {
        }
    }

    public void setFilterChar(char[] cArr) {
        this.mFilterChar = cArr;
    }

    public void setFixedHeaderText(java.lang.String str) {
        this.mFixedHeaderText = str;
        setPadding(((int) getPaint().measureText(this.mFixedHeaderText)) + getPaddingLeft(), getPaddingTop(), getPaddingBottom(), getPaddingRight());
        invalidate();
    }

    public void setIgnoreTextChangeEvent(boolean z17) {
        this.mIgnoreTextChange = z17;
    }

    public void setIsBankcardFormat(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD;
        } else if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD == this.mEditState) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        }
    }

    public void setIsCommonTextFormat(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.COMMON_TEXT;
        } else {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        }
    }

    public void setIsCvv4PaymentFormat(boolean z17) {
        if (!z17) {
            this.mPaintBackground = null;
            if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT == this.mEditState) {
                this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaintBackground = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mIDCardPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT;
    }

    public void setIsCvvPaymentFormat(boolean z17) {
        if (!z17) {
            this.mPaintBackground = null;
            if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT == this.mEditState) {
                this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
                return;
            }
            return;
        }
        setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaintBackground = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mIDCardPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT;
    }

    public void setIsIdCardTailFormat(boolean z17) {
        if (!z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
            return;
        }
        setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.IDCARD_TAIL;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mIDCardPaint = paint;
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0));
        this.mIDCardPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mIDCardPaint.setAntiAlias(true);
        this.mIDCardPaint.setTextSize(getTextSize());
        this.mIDCardPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f478714f5));
    }

    public void setIsMoneyAmountFormat(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.MONEY_AMOUNT;
        } else if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.MONEY_AMOUNT == this.mEditState) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        }
    }

    public void setIsPasswordFormat(boolean z17, boolean z18) {
        if (!z17) {
            this.mPaintBackground = null;
            if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD == this.mEditState) {
                this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
                return;
            }
            return;
        }
        this.mNewPwdStyle = z18;
        setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mPaintBackground = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        if (com.tencent.mm.ui.bk.C()) {
            this.mPaintBackground.setColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        } else {
            this.mPaintBackground.setColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        }
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mPasswdSeparedPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.mPasswdSeparedPaint.setStrokeWidth(1.5f);
        if (com.tencent.mm.ui.bk.C()) {
            this.mPasswdSeparedPaint.setColor(getResources().getColor(com.tencent.mm.R.color.FG_4));
        } else {
            this.mPasswdSeparedPaint.setColor(getResources().getColor(com.tencent.mm.R.color.FG_3));
        }
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.mPasswdBgPaint = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        if (com.tencent.mm.ui.bk.C()) {
            this.mPasswdBgPaint.setColor(218103807);
        } else {
            this.mPasswdBgPaint.setColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        }
    }

    public void setIsSecurityAnswerFormat(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.SECURITY_ANSWER;
        } else {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        }
    }

    public void setIsValidThru(boolean z17) {
        if (z17) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.VALID_THRU;
        } else if (com.tenpay.android.wechat.TenpaySecureEditText.EditState.VALID_THRU == this.mEditState) {
            this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        }
    }

    public void setKindaEditTextCallBackListener(com.tenpay.android.wechat.TenpaySecureEditText.IKindaEditTextCallBackListener iKindaEditTextCallBackListener) {
        this.mKindaEditTextCallBackListener = iKindaEditTextCallBackListener;
    }

    public void setOnPasswdInputListener(com.tenpay.android.wechat.OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public void setPasswdInputChangeListener(com.tenpay.android.wechat.TenpaySecureEditText.IPasswdInputChangeListener iPasswdInputChangeListener) {
        this.mPasswdInputChangeListener = iPasswdInputChangeListener;
    }

    public void setPwdLength(int i17) {
        this.PASSWD_LENGTH = i17;
    }

    public void setSecureEncrypt(com.tenpay.android.wechat.ISecureEncrypt iSecureEncrypt) {
        this.mIEncrypt = iSecureEncrypt;
    }

    public void setUseOfKinda(boolean z17) {
        this.mIsUseOfKinda = z17;
    }

    public void setValidThru(java.lang.String str) {
        if (str == null || str.length() != this.VALID_THRU_LEN) {
            return;
        }
        setText(str);
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.VALID_THRU;
    }

    public void setregExFilterInput(java.lang.String str) {
        this.regExFilterInput = str;
    }

    public TenpaySecureEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.CVV_PAYMENT_LENGTH = 3;
        this.CVV_4_PAYMENT_LENGTH = 4;
        this.BANK_CARD_LENGTH_LIMIT = 14;
        this.CARD_TAIL_SPACE = 15;
        this.VALID_THRU_LEN = 4;
        this.mIEncrypt = new com.tenpay.android.wechat.TenpaySecureEncrypt();
        this.mIgnoreTextChange = false;
        int i17 = this.PASSWD_LENGTH;
        this.randomKey = new byte[i17];
        this.realContent = new byte[i17];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }

    public java.lang.String getEncryptDataWithHash(boolean z17, boolean z18) {
        java.lang.String inputText;
        if (this.mEditState == com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD) {
            int i17 = this.realLength;
            if (i17 != this.PASSWD_LENGTH) {
                return null;
            }
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < this.realLength; i18++) {
                bArr[i18] = (byte) (this.realContent[i18] ^ this.randomKey[i18]);
            }
            inputText = new java.lang.String(bArr);
        } else {
            inputText = getInputText();
            if (inputText == null || inputText.length() == 0) {
                return null;
            }
        }
        com.tencent.mars.xlog.Log.i("TenpaySecureEditText", "timestamp: %s, 2048: %s", mTimeStamp, java.lang.Boolean.valueOf(z18));
        com.tenpay.android.wechat.ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt == null) {
            if (z17) {
                inputText = com.tenpay.android.wechat.TenpayUtil.md5HexDigest(inputText);
            }
            com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
            java.lang.String str = mTimeStamp;
            if (str != null) {
                encrypt.setTimeStamp(str);
            }
            if (z18) {
                return encrypt.encryptPasswdWithRSA2048(inputText);
            }
            return encrypt.encryptPasswd(inputText);
        }
        if (z18) {
            java.lang.String encryptPasswdWithRSA2048 = iSecureEncrypt.encryptPasswdWithRSA2048(z17, inputText, mTimeStamp);
            if (encryptPasswdWithRSA2048 == null || encryptPasswdWithRSA2048.length() == 0) {
                jx3.f.INSTANCE.d(25425, 1, 1, 1);
            }
            return encryptPasswdWithRSA2048;
        }
        java.lang.String encryptPasswd = iSecureEncrypt.encryptPasswd(z17, inputText, mTimeStamp);
        if (encryptPasswd == null || encryptPasswd.length() == 0) {
            jx3.f.INSTANCE.d(25425, 0, 1, 1);
        }
        return encryptPasswd;
    }

    public void setClearBtnDrawableId(int i17, int i18) {
        setClearBtnDrawableId(i17, i18, 0, 0);
    }

    public void setClearBtnDrawableId(int i17, int i18, int i19, int i27) {
        try {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
            this.mClearBtnImg = drawable;
            if (i18 != 0) {
                drawable.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        } catch (java.lang.Exception unused) {
            this.mClearBtnImg = null;
        }
        android.graphics.drawable.Drawable drawable2 = this.mClearBtnImg;
        if (drawable2 != null) {
            if (i19 != 0 && i27 != 0) {
                drawable2.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), i19), com.tencent.mm.ui.zk.a(getContext(), i27));
            } else {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mClearBtnImg.getIntrinsicHeight());
            }
            setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(android.view.View view, boolean z17) {
                    if (!z17) {
                        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = com.tenpay.android.wechat.TenpaySecureEditText.this;
                        tenpaySecureEditText.setCompoundDrawables(tenpaySecureEditText.getCompoundDrawables()[0], com.tenpay.android.wechat.TenpaySecureEditText.this.getCompoundDrawables()[1], null, com.tenpay.android.wechat.TenpaySecureEditText.this.getCompoundDrawables()[3]);
                    } else {
                        if (com.tenpay.android.wechat.TenpaySecureEditText.this.getText().toString().equals("")) {
                            return;
                        }
                        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
                        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = com.tenpay.android.wechat.TenpaySecureEditText.this;
                        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = tenpaySecureEditText2.mEditState;
                        if (editState == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT == editState2 || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT == editState2) {
                            return;
                        }
                        tenpaySecureEditText2.setCompoundDrawables(tenpaySecureEditText2.getCompoundDrawables()[0], com.tenpay.android.wechat.TenpaySecureEditText.this.getCompoundDrawables()[1], com.tenpay.android.wechat.TenpaySecureEditText.this.mClearBtnImg, com.tenpay.android.wechat.TenpaySecureEditText.this.getCompoundDrawables()[3]);
                    }
                }
            });
            setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
                    com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = com.tenpay.android.wechat.TenpaySecureEditText.this;
                    com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = tenpaySecureEditText.mEditState;
                    if (editState != editState2 && com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT != editState2 && com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT != editState2) {
                        if (motionEvent.getAction() == 1 && !tenpaySecureEditText.isFocused() && com.tenpay.android.wechat.TenpaySecureEditText.this.mKindaEditTextCallBackListener != null) {
                            com.tenpay.android.wechat.TenpaySecureEditText.this.mKindaEditTextCallBackListener.onCallBackKinda();
                        }
                        if (tenpaySecureEditText.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > (tenpaySecureEditText.getWidth() - tenpaySecureEditText.getPaddingRight()) - com.tenpay.android.wechat.TenpaySecureEditText.this.mClearBtnImg.getIntrinsicWidth()) {
                            tenpaySecureEditText.setText("");
                        }
                    }
                    return false;
                }
            });
            return;
        }
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
            }
        });
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tenpay.android.wechat.TenpaySecureEditText.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return false;
            }
        });
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

    public java.lang.String get3DesEncrptData(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.tenpay.android.wechat.ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt != null) {
            return iSecureEncrypt.desedeEncode(str, mTimeStamp);
        }
        return new com.tenpay.ndk.Encrypt().desedeEncode(str);
    }

    public void setCursorStyle(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable textCursorDrawable = getTextCursorDrawable();
        if (textCursorDrawable == null) {
            setTextCursorDrawable(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable}));
        } else if (textCursorDrawable instanceof android.graphics.drawable.LayerDrawable) {
            ((android.graphics.drawable.LayerDrawable) textCursorDrawable).setDrawable(0, drawable);
        } else {
            com.tencent.mars.xlog.Log.w("TenpaySecureEditText", "can't change cursor drawable, check if you have set cursor on xml");
        }
    }

    public TenpaySecureEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.mEditState = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.CVV_PAYMENT_LENGTH = 3;
        this.CVV_4_PAYMENT_LENGTH = 4;
        this.BANK_CARD_LENGTH_LIMIT = 14;
        this.CARD_TAIL_SPACE = 15;
        this.VALID_THRU_LEN = 4;
        this.mIEncrypt = new com.tenpay.android.wechat.TenpaySecureEncrypt();
        this.mIgnoreTextChange = false;
        int i18 = this.PASSWD_LENGTH;
        this.randomKey = new byte[i18];
        this.realContent = new byte[i18];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }
}
