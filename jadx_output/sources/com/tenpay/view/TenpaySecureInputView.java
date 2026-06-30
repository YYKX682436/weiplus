package com.tenpay.view;

/* loaded from: classes7.dex */
public final class TenpaySecureInputView extends androidx.appcompat.widget.AppCompatEditText {
    private static final int DEFAULT_MAX_LENGTH = 32;
    private com.tenpay.view.TenpaySecureInputView.DataType inputDataType;
    private boolean isSelfSet;
    private char[] mBlackListChar;
    private char[] mWhiteListChar;
    private int maxInputLength;
    private int minInputLength;
    private com.tenpay.view.TenpaySecureInputView.OnInputListener onInputListener;

    /* loaded from: classes7.dex */
    public enum DataType {
        Text,
        ID,
        BankCard,
        PhoneNum,
        Digits
    }

    /* loaded from: classes7.dex */
    public interface OnInputListener {
        void onInputChanged(int i17);
    }

    public TenpaySecureInputView(android.content.Context context) {
        super(context, null);
        this.inputDataType = com.tenpay.view.TenpaySecureInputView.DataType.Text;
        this.minInputLength = 0;
        this.maxInputLength = 32;
    }

    private java.lang.String getInputText() {
        return super.getText().toString().replaceAll(" ", "");
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        setInputType(0);
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.maxInputLength)});
    }

    private boolean isValidChar(char c17) {
        boolean z17;
        if (this.inputDataType == com.tenpay.view.TenpaySecureInputView.DataType.BankCard && c17 == ' ') {
            return true;
        }
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

    public boolean checkInputData(java.lang.String str) {
        java.lang.String inputText = getInputText();
        if (inputText.length() < this.minInputLength) {
            return false;
        }
        return java.util.regex.Pattern.compile(str).matcher(inputText).matches();
    }

    public void clearInput() {
        setText("");
    }

    public java.lang.String getDataHash(java.lang.String str) {
        return com.tenpay.ndk.WxSmCryptoUtil.getInstance().getGenericDataHash(getInputText(), str);
    }

    public java.lang.String getEncryptData(java.lang.String str, java.lang.String str2) {
        return com.tenpay.ndk.WxSmCryptoUtil.getInstance().encryptGenericDataWithCert(str, getInputText(), str2);
    }

    public int getInputLength() {
        return getText().length();
    }

    public int getLastError() {
        return com.tenpay.ndk.WxSmCryptoUtil.getInstance().getLastError();
    }

    public java.lang.String getVersion() {
        return com.tenpay.ndk.WxSmCryptoUtil.getInstance().getVersion();
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            for (int i27 = i17; i27 < i17 + i19; i27++) {
                if (!isValidChar(charSequence.charAt(i27))) {
                    java.lang.String charSequence2 = charSequence.toString();
                    setText(charSequence2.substring(0, i27) + charSequence2.substring(i27 + 1));
                    setSelection(i27);
                    return;
                }
            }
        }
        java.util.Objects.toString(this.inputDataType);
        if (this.inputDataType == com.tenpay.view.TenpaySecureInputView.DataType.BankCard) {
            if (this.isSelfSet) {
                this.isSelfSet = false;
            } else {
                java.lang.String inputText = getInputText();
                int length = inputText.length();
                if (length > 0) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    for (int i28 = 0; i28 < length; i28++) {
                        stringBuffer.append(inputText.charAt(i28));
                        if (i28 % 4 == 3 && stringBuffer.length() < this.maxInputLength) {
                            stringBuffer.append(' ');
                        }
                    }
                    this.isSelfSet = true;
                    setText(stringBuffer.toString());
                    setSelection(stringBuffer.length());
                }
            }
        }
        com.tenpay.view.TenpaySecureInputView.OnInputListener onInputListener = this.onInputListener;
        if (onInputListener != null) {
            onInputListener.onInputChanged(getInputText().length());
        }
    }

    public void setDataType(com.tenpay.view.TenpaySecureInputView.DataType dataType) {
        this.inputDataType = dataType;
        if (dataType == com.tenpay.view.TenpaySecureInputView.DataType.Text) {
            setInputType(1);
            return;
        }
        setInputType(0);
        if (dataType == com.tenpay.view.TenpaySecureInputView.DataType.ID) {
            setInputRange(18, 18);
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'x'});
        } else if (dataType == com.tenpay.view.TenpaySecureInputView.DataType.BankCard) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == com.tenpay.view.TenpaySecureInputView.DataType.PhoneNum) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == com.tenpay.view.TenpaySecureInputView.DataType.Digits) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'});
        }
    }

    public void setInputRange(int i17, int i18) {
        this.minInputLength = i17;
        this.maxInputLength = i18;
        setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i18)});
    }

    public void setOnInputListener(com.tenpay.view.TenpaySecureInputView.OnInputListener onInputListener) {
        this.onInputListener = onInputListener;
    }

    public void setWhiteListChar(char[] cArr) {
        this.mWhiteListChar = cArr;
    }

    public TenpaySecureInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.inputDataType = com.tenpay.view.TenpaySecureInputView.DataType.Text;
        this.minInputLength = 0;
        this.maxInputLength = 32;
        init(context, attributeSet);
    }

    public TenpaySecureInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.inputDataType = com.tenpay.view.TenpaySecureInputView.DataType.Text;
        this.minInputLength = 0;
        this.maxInputLength = 32;
        init(context, attributeSet);
    }
}
