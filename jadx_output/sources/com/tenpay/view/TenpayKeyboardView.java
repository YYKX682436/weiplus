package com.tenpay.view;

/* loaded from: classes7.dex */
public class TenpayKeyboardView extends android.widget.LinearLayout {
    private static final int NUM_KEY_COUNT = 10;
    private static final int TOTAL_KEY_COUNT = 12;
    private android.widget.ImageView deleteImage;
    private android.view.View[] hSplitLines;
    private com.tenpay.view.TenpaySecureInputView inputView;
    private int[] keyCodes;
    private android.view.View keyDel;
    private android.view.View.OnClickListener keyListener;
    private int[] keyResIds;
    private android.widget.TextView keyX;
    private android.widget.TextView[] numKeys;
    private android.view.View[] vSplitLines;

    public TenpayKeyboardView(android.content.Context context) {
        super(context);
        this.numKeys = new android.widget.TextView[10];
        this.vSplitLines = new android.view.View[6];
        this.hSplitLines = new android.view.View[3];
        this.keyResIds = new int[12];
        this.keyCodes = new int[12];
        this.keyListener = new android.view.View.OnClickListener() { // from class: com.tenpay.view.TenpayKeyboardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.tenpay.view.TenpayKeyboardView.this.inputView == null) {
                    return;
                }
                view.getId();
                int id6 = view.getId();
                int i17 = 0;
                for (int i18 = 0; i18 < 12; i18++) {
                    if (id6 == com.tenpay.view.TenpayKeyboardView.this.keyResIds[i18]) {
                        i17 = com.tenpay.view.TenpayKeyboardView.this.keyCodes[i18];
                    }
                }
                com.tenpay.view.TenpayKeyboardView.this.inputView.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
                com.tenpay.view.TenpayKeyboardView.this.inputView.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            }
        };
        init(context);
    }

    private void init(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(context.getResources().getIdentifier("tenpay_sc_keyboard", "layout", context.getPackageName()), (android.view.ViewGroup) this, true);
        char[] charArray = "0123456789".toCharArray();
        for (int i17 = 0; i17 < 10; i17++) {
            this.keyResIds[i17] = getId("tenpay_sc_keyboard_" + charArray[i17]);
            this.numKeys[i17] = (android.widget.TextView) inflate.findViewById(this.keyResIds[i17]);
            this.numKeys[i17].setOnClickListener(this.keyListener);
        }
        this.keyResIds[10] = getId("tenpay_sc_keyboard_x");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(this.keyResIds[10]);
        this.keyX = textView;
        textView.setOnClickListener(this.keyListener);
        this.keyResIds[11] = getId("tenpay_sc_keyboard_del");
        android.view.View findViewById = inflate.findViewById(this.keyResIds[11]);
        this.keyDel = findViewById;
        findViewById.setOnClickListener(this.keyListener);
        this.deleteImage = (android.widget.ImageView) inflate.findViewById(getId("tenpay_sc_keyboard_del_icon"));
        int i18 = 0;
        while (i18 < this.vSplitLines.length) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tenpay_sc_keyboard_split_v");
            int i19 = i18 + 1;
            sb6.append(i19);
            this.vSplitLines[i18] = inflate.findViewById(getId(sb6.toString()));
            i18 = i19;
        }
        int i27 = 0;
        while (i27 < this.hSplitLines.length) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tenpay_sc_keyboard_split_h");
            int i28 = i27 + 1;
            sb7.append(i28);
            this.hSplitLines[i27] = inflate.findViewById(getId(sb7.toString()));
            i27 = i28;
        }
        for (int i29 = 0; i29 <= 9; i29++) {
            this.keyCodes[i29] = i29 + 7;
        }
        int[] iArr = this.keyCodes;
        iArr[10] = 52;
        iArr[11] = 67;
    }

    public void bindInputView(com.tenpay.view.TenpaySecureInputView tenpaySecureInputView) {
        this.inputView = tenpaySecureInputView;
    }

    public int getDrawableId(java.lang.String str) {
        return getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public int getId(java.lang.String str) {
        return getContext().getResources().getIdentifier(str, dm.i4.COL_ID, getContext().getPackageName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDeleteBackground(android.graphics.drawable.Drawable drawable) {
        this.keyDel.setBackground(drawable);
    }

    public void setDeleteBackgroundColor(int i17) {
        this.keyDel.setBackgroundColor(i17);
    }

    public void setDeleteImage(android.graphics.drawable.Drawable drawable) {
        this.deleteImage.setImageDrawable(drawable);
    }

    public void setExtendBackground(android.graphics.drawable.Drawable drawable) {
        this.keyX.setBackground(drawable);
    }

    public void setExtendBackgroundColor(int i17) {
        this.keyX.setBackgroundColor(i17);
    }

    public void setExtendChar(java.lang.Character ch6) {
        if (ch6 == null) {
            this.keyX.setText("");
            this.keyCodes[10] = 0;
            return;
        }
        this.keyX.setText(ch6.toString());
        if (ch6.equals('.')) {
            this.keyCodes[10] = 56;
        } else if (ch6.equals('X') || ch6.equals('x')) {
            this.keyCodes[10] = 52;
        }
    }

    public void setLineColor(int i17) {
        int i18 = 0;
        int i19 = 0;
        while (true) {
            android.view.View[] viewArr = this.vSplitLines;
            if (i19 >= viewArr.length) {
                break;
            }
            viewArr[i19].setBackgroundColor(i17);
            i19++;
        }
        while (true) {
            android.view.View[] viewArr2 = this.hSplitLines;
            if (i18 >= viewArr2.length) {
                return;
            }
            viewArr2[i18].setBackgroundColor(i17);
            i18++;
        }
    }

    public void setLineWidth(float f17) {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            android.view.View[] viewArr = this.vSplitLines;
            if (i18 >= viewArr.length) {
                break;
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) viewArr[i18].getLayoutParams();
            layoutParams.width = (int) (0.5f + f17);
            this.vSplitLines[i18].setLayoutParams(layoutParams);
            i18++;
        }
        while (true) {
            android.view.View[] viewArr2 = this.hSplitLines;
            if (i17 >= viewArr2.length) {
                return;
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) viewArr2[i17].getLayoutParams();
            layoutParams2.height = (int) (f17 + 0.5f);
            this.hSplitLines[i17].setLayoutParams(layoutParams2);
            i17++;
        }
    }

    public void setNumberBackground(android.graphics.drawable.Drawable drawable) {
        for (int i17 = 0; i17 < 10; i17++) {
            this.numKeys[i17].setBackground(drawable);
        }
    }

    public void setNumberBackgroundColor(int i17) {
        for (int i18 = 0; i18 < 10; i18++) {
            this.numKeys[i18].setBackgroundColor(i17);
        }
    }

    public void setTextColor(int i17) {
        for (int i18 = 0; i18 < 10; i18++) {
            this.numKeys[i18].setTextColor(i17);
            this.keyX.setTextColor(i17);
        }
    }

    public void setTextSize(float f17) {
        for (int i17 = 0; i17 < 10; i17++) {
            this.numKeys[i17].setTextSize(f17);
            this.keyX.setTextSize(f17);
        }
    }

    public TenpayKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.numKeys = new android.widget.TextView[10];
        this.vSplitLines = new android.view.View[6];
        this.hSplitLines = new android.view.View[3];
        this.keyResIds = new int[12];
        this.keyCodes = new int[12];
        this.keyListener = new android.view.View.OnClickListener() { // from class: com.tenpay.view.TenpayKeyboardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.tenpay.view.TenpayKeyboardView.this.inputView == null) {
                    return;
                }
                view.getId();
                int id6 = view.getId();
                int i17 = 0;
                for (int i18 = 0; i18 < 12; i18++) {
                    if (id6 == com.tenpay.view.TenpayKeyboardView.this.keyResIds[i18]) {
                        i17 = com.tenpay.view.TenpayKeyboardView.this.keyCodes[i18];
                    }
                }
                com.tenpay.view.TenpayKeyboardView.this.inputView.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
                com.tenpay.view.TenpayKeyboardView.this.inputView.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            }
        };
        init(context);
    }
}
