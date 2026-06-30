package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class XWebDebugPreference extends androidx.preference.Preference implements qx5.m {
    public final java.lang.String R;

    public XWebDebugPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.xwebsdk.R.styleable.XWebDebugPreference);
        this.R = obtainStyledAttributes.getString(com.tencent.xwebsdk.R.styleable.XWebDebugPreference_debug_key);
        obtainStyledAttributes.recycle();
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        return null;
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.SOURCE, 3);
        bundle.putString("command", "http://debugxweb.qq.com/?" + this.R);
        return by5.d1.b(bundle, lVar);
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.R;
    }
}
