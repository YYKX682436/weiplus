package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.r2 f125263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.finder.report.r2 r2Var, java.lang.String str) {
        super(0);
        this.f125263d = r2Var;
        this.f125264e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap;
        java.lang.String str;
        com.tencent.mm.plugin.finder.report.r2 r2Var = this.f125263d;
        java.util.Iterator it = r2Var.f125333v.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = r2Var.f125332u;
            str = this.f125264e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!kotlin.jvm.internal.o.b(str, "onRelease")) {
                r2Var.S0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
            } else if (((com.tencent.mm.plugin.finder.report.f5) hashMap.get(entry.getKey())) == null) {
                r2Var.S0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
            }
        }
        if (kotlin.jvm.internal.o.b(str, "onInvisible")) {
            hashMap.putAll(r2Var.f125333v);
        }
        r2Var.f125333v = new java.util.HashMap();
        return jz5.f0.f302826a;
    }
}
