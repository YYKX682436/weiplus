package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletTextView extends android.widget.TextView {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f214096g = "MicroMsg." + new java.lang.StringBuilder("weiVtxeTtellaW").reverse().toString();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f214097d;

    /* renamed from: e, reason: collision with root package name */
    public int f214098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f214099f;

    public WalletTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public java.lang.CharSequence a() {
        return super.getText();
    }

    public void b() {
        setPrefix(com.tencent.mm.wallet_core.model.c2.b());
    }

    @Override // android.widget.TextView
    @java.lang.Deprecated
    public java.lang.CharSequence getText() {
        pp5.b bVar;
        boolean z17;
        synchronized (pp5.b.class) {
            bVar = pp5.a.f357549a;
        }
        bVar.getClass();
        if (fo3.s.INSTANCE.Vg(this)) {
            java.util.WeakHashMap weakHashMap = bVar.f357550a;
            if (!weakHashMap.containsKey(this)) {
                weakHashMap.put(this, java.lang.Boolean.TRUE);
                jx3.f.INSTANCE.idkeyStat(715L, 0L, 1L, false);
                if (pp5.c.a() || fp.m.d()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8);
                    try {
                        sb6.append(tp3.b.a("\u0086\u008a\u008e\u0083\u0087\u0085¼¬¯±«\u0087©»\u0084±»·µ¼´\u008d°«¤\u0091½\u00ad¹¥¹°\u009a¤¦®¯§±"));
                    } catch (java.lang.Throwable unused) {
                    }
                    java.lang.String sb7 = sb6.toString();
                    sb6.delete(0, sb6.length());
                    sb6.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
                    if (!sb6.toString().equals(pp5.c.b(sb7, sb6.toString()))) {
                        w04.l.INSTANCE.Nf(Integer.MIN_VALUE);
                    }
                }
            }
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            return super.getText();
        }
        com.tencent.mars.xlog.Log.printErrStackTrace(f214096g, new java.lang.Throwable(), "check point 0.", new java.lang.Object[0]);
        if (!pp5.c.a() && !fp.m.d()) {
            return super.getText();
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(8);
        try {
            sb8.append(tp3.b.a("»µ³¸²²\u0089§¢¾¦\u008c¼¬\u0091\u00ad¤¦© \u009b££³£©§±"));
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String sb9 = sb8.toString();
        sb8.delete(0, sb8.length());
        sb8.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
        return (java.lang.CharSequence) (sb8.toString().equals(pp5.c.b(sb9, sb8.toString())) ^ true ? this.f214097d : super.getText());
    }

    public void setPrefix(java.lang.String str) {
        this.f214099f = str;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String str;
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2 == null || charSequence2.length() == 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            for (int i17 = 0; i17 < 7; i17++) {
                sb6.append((char) ((6222620280936476253 >> ((6 - i17) * 8)) & 255));
            }
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            str = charSequence2.replaceAll(sb7, sb6.toString());
        }
        this.f214097d = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f214099f) && !charSequence.toString().startsWith(this.f214099f)) {
            charSequence = this.f214099f + ((java.lang.Object) charSequence);
        }
        if (this.f214098e < 4 && !com.tencent.mm.sdk.platformtools.t8.J0(charSequence) && java.util.regex.Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            com.tencent.mars.xlog.Log.i(f214096g, "force use std font");
            if (charSequence instanceof java.lang.String) {
                charSequence = ((java.lang.String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    public void setTypeface(int i17) {
        this.f214098e = i17;
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(f214096g, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public WalletTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f214097d = "";
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188588k, i17, 0);
        this.f214098e = obtainStyledAttributes.getInteger(1, 4);
        this.f214099f = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), com.tencent.mm.wallet_core.ui.r1.E(this.f214098e)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(f214096g, "updateWalletTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
