package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class j1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.k1 f206954d;

    public j1(com.tencent.mm.ui.contact.k1 k1Var) {
        this.f206954d = k1Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        com.tencent.mm.ui.contact.k1 k1Var = this.f206954d;
        return (((java.util.HashMap) k1Var.f206987e).get(str) != null ? ((java.lang.Integer) ((java.util.HashMap) k1Var.f206987e).get(str)).intValue() : Integer.MAX_VALUE) - (((java.util.HashMap) k1Var.f206987e).get(str2) != null ? ((java.lang.Integer) ((java.util.HashMap) k1Var.f206987e).get(str2)).intValue() : Integer.MAX_VALUE);
    }
}
