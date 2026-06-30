package com.tencent.mm.wallet_core.ui;

/* loaded from: classes11.dex */
public final class d2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.wallet_core.ui.d2 f214129d = new com.tencent.mm.wallet_core.ui.d2();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.wallet_core.ui.f2 f2Var = (com.tencent.mm.wallet_core.ui.f2) obj;
        com.tencent.mm.wallet_core.ui.f2 f2Var2 = (com.tencent.mm.wallet_core.ui.f2) obj2;
        int i17 = kotlin.jvm.internal.o.i(f2Var.f214141a.f408326a, f2Var2.f214141a.f408326a);
        return i17 != 0 ? i17 : f2Var.f214141a.f408327b.compareTo(f2Var2.f214141a.f408327b);
    }
}
