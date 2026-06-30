package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class XWebDebugListPreference extends androidx.preference.ListPreference implements qx5.m {

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.String f220255y0;

    public XWebDebugListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.xwebsdk.R.styleable.XWebDebugPreference);
        this.f220255y0 = obtainStyledAttributes.getString(com.tencent.xwebsdk.R.styleable.XWebDebugPreference_debug_key);
        obtainStyledAttributes.recycle();
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.SOURCE, 3);
        bundle.putString("command", "http://debugxweb.qq.com/?" + this.f220255y0 + "=" + obj);
        return by5.d1.b(bundle, lVar);
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        return null;
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.f220255y0;
    }
}
