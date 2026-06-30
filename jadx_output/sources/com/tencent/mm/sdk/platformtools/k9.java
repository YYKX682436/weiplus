package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class k9 extends com.tencent.mm.sdk.platformtools.l9 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.h9 f192815b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f192816c;

    public java.lang.String toString() {
        com.tencent.mm.sdk.platformtools.h9 h9Var = this.f192815b;
        java.lang.String str = this.f192843a;
        if (h9Var == null) {
            return java.lang.String.valueOf(str);
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        java.lang.String str2 = (java.lang.String) this.f192815b.a(str, pInt);
        this.f192816c = pInt.value == 1;
        return str2;
    }
}
