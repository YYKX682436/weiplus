package com.tencent.mm.toolkit.frontia.core;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f196420b = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f196419a = new java.lang.StringBuffer(java.lang.String.valueOf(-1));

    public b() {
        new android.os.Bundle();
    }

    public com.tencent.mm.toolkit.frontia.core.b a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.StringBuffer stringBuffer = this.f196419a;
            stringBuffer.append(" --> ");
            stringBuffer.append(str);
        }
        return this;
    }

    public com.tencent.mm.toolkit.frontia.core.b b(int i17) {
        synchronized (this.f196420b) {
        }
        a(java.lang.String.valueOf(i17));
        return this;
    }
}
