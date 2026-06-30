package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes12.dex */
public class o3 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f190914i = new com.tencent.mm.sdk.platformtools.r2(50);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.StringBuilder f190915a;

    /* renamed from: c, reason: collision with root package name */
    public android.text.SpannableString f190917c;

    /* renamed from: f, reason: collision with root package name */
    public int f190920f;

    /* renamed from: g, reason: collision with root package name */
    public int f190921g;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f190916b = new android.text.SpannableStringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f190918d = new android.text.SpannableStringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public final android.text.style.CharacterStyle f190919e = new android.text.style.ForegroundColorSpan(-5066062);

    /* renamed from: h, reason: collision with root package name */
    public int f190922h = 3;

    public o3(android.content.Context context) {
    }

    public final void a() {
        try {
            for (java.lang.String str : ((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, "")).split(";")) {
                java.lang.String[] split = str.split(":");
                if (split.length == 2) {
                    f190914i.put(split[0], java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(split[1], 0)));
                }
            }
        } catch (java.lang.Error unused) {
        }
    }

    public synchronized void b(java.lang.String str, int i17) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = f190914i;
        r2Var.put(str, java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object[] array = r2Var.keySet().toArray();
        java.lang.Object[] array2 = r2Var.values().toArray();
        for (int i18 = 0; i18 < array.length; i18++) {
            sb6.append(array[i18]);
            sb6.append(":");
            sb6.append(array2[i18]);
            sb6.append(";");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINOF_VOICE_INPUT_DEF_LANG_HISTORY_STRING, sb6.toString());
    }

    public void c(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        if (mMEditText == null) {
            return;
        }
        this.f190920f = mMEditText.getSelectionStart();
        this.f190921g = mMEditText.getSelectionEnd();
        this.f190915a = new java.lang.StringBuilder(mMEditText.getText());
        if (mMEditText.getText().toString().equalsIgnoreCase("")) {
            this.f190916b.clear();
        }
        if (this.f190920f < 0) {
            this.f190920f = 0;
        }
        if (this.f190921g < 0) {
            this.f190921g = 0;
        }
    }

    public void d(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        if (mMEditText == null) {
            return;
        }
        this.f190922h = 0;
        android.text.SpannableString Ri = com.tencent.mm.smiley.x1.Di().Ri(mMEditText.getText().toString(), true);
        this.f190917c = Ri;
        mMEditText.setText(Ri);
        mMEditText.setSelection(this.f190917c.length());
    }

    public void e(com.tencent.mm.ui.widget.MMEditText mMEditText, java.lang.String str, boolean z17) {
        int length;
        if (mMEditText == null) {
            return;
        }
        if (this.f190915a == null) {
            throw new java.lang.IllegalStateException("You should saveHistory before setText");
        }
        int length2 = this.f190920f + str.length();
        android.text.SpannableStringBuilder spannableStringBuilder = this.f190916b;
        spannableStringBuilder.clear();
        android.text.SpannableStringBuilder spannableStringBuilder2 = this.f190918d;
        spannableStringBuilder2.clear();
        if (z17) {
            int i17 = 0;
            android.text.SpannableString Ri = com.tencent.mm.smiley.x1.Di().Ri(this.f190915a.subSequence(0, this.f190920f), true);
            this.f190917c = Ri;
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) Ri);
            if (spannableStringBuilder2 != null && str.length() != 0) {
                if (str.length() < this.f190922h) {
                    length = str.length();
                } else {
                    length = str.length();
                    i17 = length - this.f190922h;
                }
                spannableStringBuilder2.append((java.lang.CharSequence) str).setSpan(this.f190919e, i17, length, 33);
            }
            android.text.SpannableStringBuilder append2 = append.append((java.lang.CharSequence) spannableStringBuilder2);
            java.lang.StringBuilder sb6 = this.f190915a;
            append2.append(sb6.subSequence(this.f190921g, sb6.length()));
        } else {
            android.text.SpannableString Ri2 = com.tencent.mm.smiley.x1.Di().Ri(str, true);
            this.f190917c = Ri2;
            spannableStringBuilder.append((java.lang.CharSequence) Ri2);
        }
        spannableStringBuilder.length();
        mMEditText.setText(spannableStringBuilder);
        if (length2 <= spannableStringBuilder.length()) {
            if (length2 == 0) {
                mMEditText.setSelection(spannableStringBuilder.length());
            } else {
                mMEditText.setSelection(length2);
            }
        }
    }
}
