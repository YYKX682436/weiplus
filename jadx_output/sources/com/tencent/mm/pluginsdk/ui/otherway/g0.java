package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class g0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f190942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f190943e;

    public g0(java.util.Comparator comparator, java.util.HashMap hashMap) {
        this.f190942d = comparator;
        this.f190943e = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f190942d.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        com.tencent.mm.pluginsdk.ui.otherway.h0 h0Var = com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a;
        java.util.HashMap hashMap = this.f190943e;
        return mz5.a.b(java.lang.Long.valueOf(h0Var.d((com.tencent.mm.pluginsdk.ui.otherway.w) obj2, hashMap)), java.lang.Long.valueOf(h0Var.d((com.tencent.mm.pluginsdk.ui.otherway.w) obj, hashMap)));
    }
}
