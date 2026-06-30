package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public vr4.l0 f180259a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f180260b;

    /* renamed from: c, reason: collision with root package name */
    public double f180261c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180262d;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (this.f180259a != null) {
            stringBuffer.append("|faovrComposeId: " + this.f180259a.f439773d);
        }
        stringBuffer.append("|bankName: " + this.f180260b);
        stringBuffer.append("|bankFavorAmount: " + this.f180261c);
        stringBuffer.append("|bankType: " + this.f180262d);
        return stringBuffer.toString();
    }
}
