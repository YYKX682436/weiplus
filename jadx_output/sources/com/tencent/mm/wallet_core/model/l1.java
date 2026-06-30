package com.tencent.mm.wallet_core.model;

/* loaded from: classes11.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f213932a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213933b;

    public l1(int i17, java.lang.String str) {
        this.f213932a = i17;
        this.f213933b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.wallet_core.model.l1)) {
            return false;
        }
        com.tencent.mm.wallet_core.model.l1 l1Var = (com.tencent.mm.wallet_core.model.l1) obj;
        if (this.f213932a != l1Var.f213932a) {
            return false;
        }
        java.lang.String str = l1Var.f213933b;
        java.lang.String str2 = this.f213933b;
        return str2 == null ? str == null : str2.equals(str);
    }
}
