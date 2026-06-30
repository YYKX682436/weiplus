package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ch1 f115589d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.util.m1 f115590e;

    /* renamed from: f, reason: collision with root package name */
    public long f115591f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cj1 f115592g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115593h;

    /* renamed from: i, reason: collision with root package name */
    public int f115594i;

    /* renamed from: m, reason: collision with root package name */
    public int f115595m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f115596n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f115597o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f115598p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f115599q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f115600r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f115601s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f115602t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.xv1 f115603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f115604v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.nv1 f115605w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f115606x;

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0067, code lost:
    
        if (kotlin.jvm.internal.o.b(r2, c01.z1.k()) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l1(r45.ch1 r14) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.l1.<init>(r45.ch1):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.util.l1 other = (com.tencent.mm.plugin.finder.live.util.l1) obj;
        kotlin.jvm.internal.o.g(other, "other");
        com.tencent.mm.plugin.finder.live.util.m1 m1Var = this.f115590e;
        com.tencent.mm.plugin.finder.live.util.m1 m1Var2 = other.f115590e;
        return m1Var != m1Var2 ? m1Var.compareTo(m1Var2) : kotlin.jvm.internal.o.j(this.f115591f, other.f115591f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.live.util.l1) && kotlin.jvm.internal.o.b(this.f115589d, ((com.tencent.mm.plugin.finder.live.util.l1) obj).f115589d);
    }

    public int hashCode() {
        return this.f115589d.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("giftId = " + this.f115600r);
        sb6.append(", ");
        sb6.append("giftType = " + this.f115590e);
        sb6.append(", ");
        sb6.append("queueMsgId = " + this.f115591f);
        sb6.append(", ");
        sb6.append("comboId = " + this.f115593h);
        sb6.append(", ");
        sb6.append("comboSumCount = " + this.f115594i);
        sb6.append(", ");
        sb6.append("rewardCount = " + this.f115595m);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f115601s);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
