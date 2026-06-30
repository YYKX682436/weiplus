package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class j9 implements r.a {
    public j9(com.tencent.mm.sdk.platformtools.m9 m9Var) {
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            sb6.append(it.next().toString());
        }
        return sb6.toString();
    }
}
