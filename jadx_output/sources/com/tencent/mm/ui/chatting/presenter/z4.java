package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class z4 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f202586j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f202587k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f202588l;

    public z4(com.tencent.mm.ui.chatting.presenter.m5 m5Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198410c)) {
            java.lang.String str2 = this.f198410c;
            kotlin.jvm.internal.o.d(str2);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase2 = str2.toLowerCase(locale2);
            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
            if (r26.n0.B(lowerCase2, lowerCase, false)) {
                return true;
            }
        }
        return super.d(lowerCase);
    }
}
