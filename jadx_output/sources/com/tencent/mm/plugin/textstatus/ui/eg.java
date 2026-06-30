package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class eg extends zd4.o {

    /* renamed from: b, reason: collision with root package name */
    public final int f173851b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f173852c;

    public eg(int i17, java.lang.CharSequence lastRangeDesc) {
        kotlin.jvm.internal.o.g(lastRangeDesc, "lastRangeDesc");
        this.f173851b = i17;
        this.f173852c = lastRangeDesc;
    }

    @Override // zd4.o
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zd4.q(2, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.f493216jc1));
        arrayList.add(new zd4.q(2, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.jbk));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new zd4.q(3, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.f493215jc0));
        arrayList2.add(new zd4.q(3, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.jbb));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kz5.p0 p0Var = kz5.p0.f313996d;
        arrayList3.add(new zd4.r(0, com.tencent.mm.R.string.jbq, com.tencent.mm.R.string.jbr, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(1, com.tencent.mm.R.string.jbo, com.tencent.mm.R.string.jbp, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(2, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jbk, arrayList, null, null, 48, null));
        java.lang.CharSequence charSequence = this.f173852c;
        int i17 = this.f173851b;
        if (i17 == 2 && !kotlin.jvm.internal.o.b(charSequence, "")) {
            arrayList3.add(new zd4.r(5, 0, 0, p0Var, charSequence, null, 32, null));
        }
        arrayList3.add(new zd4.r(3, com.tencent.mm.R.string.jba, com.tencent.mm.R.string.jbb, arrayList2, null, null, 48, null));
        if (i17 == 3 && !kotlin.jvm.internal.o.b(charSequence, "")) {
            arrayList3.add(new zd4.r(5, 0, 0, p0Var, charSequence, null, 32, null));
        }
        return arrayList3;
    }

    @Override // zd4.o
    public int f(int i17) {
        return i17 == 5 ? i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478734fp) : super.f(i17);
    }

    @Override // zd4.o
    public int j(int i17) {
        if (i17 == 5) {
            return 8;
        }
        super.j(i17);
        return 0;
    }

    @Override // zd4.o
    public int k(int i17) {
        return i17 == 5 ? i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479727dj) : super.k(i17);
    }

    @Override // zd4.o
    public int m(int i17) {
        if (i17 == 0 || i17 == 1) {
            return 0;
        }
        return i17 != 2 ? 8 : 8;
    }
}
