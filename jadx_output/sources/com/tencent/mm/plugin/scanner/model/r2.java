package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes11.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f159009b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f159010c;

    public r2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f159008a = str == null ? "" : str;
        this.f159009b = str2 == null ? "" : str2;
        this.f159010c = str3 == null ? "" : str3;
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f159008a;
        boolean A0 = com.tencent.mm.sdk.platformtools.t8.A0(str);
        java.lang.String str2 = this.f159009b;
        java.lang.String str3 = this.f159010c;
        if (A0 || com.tencent.mm.sdk.platformtools.t8.A0(str2) || com.tencent.mm.sdk.platformtools.t8.A0(str3)) {
            if (str3.trim().length() > 0) {
                sb6.append(str3);
            }
            if (str2.trim().length() > 0) {
                sb6.append(str2);
            }
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
        } else {
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
            if (str2.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str2);
            }
            if (str3.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str3);
            }
        }
        return sb6.toString();
    }
}
