package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class a2 extends com.tencent.mm.ui.chatting.adapter.f0 {

    /* renamed from: j, reason: collision with root package name */
    public int f202104j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f202105k;

    public a2(com.tencent.mm.ui.chatting.presenter.l2 l2Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f202105k = "";
    }

    @Override // com.tencent.mm.ui.chatting.adapter.f0
    public boolean d(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return false;
        }
        boolean d17 = super.d(str);
        if (d17) {
            return d17;
        }
        if (b(str)) {
            java.lang.String str3 = this.f202105k;
            return str3 != null ? r26.n0.B(str3, str, false) : false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f202105k)) {
            return d17;
        }
        java.lang.String str4 = this.f202105k;
        if (str4 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            str2 = str4.toLowerCase(locale);
            kotlin.jvm.internal.o.f(str2, "toLowerCase(...)");
        } else {
            str2 = null;
        }
        if (c(str, str2)) {
            return true;
        }
        return d17;
    }
}
