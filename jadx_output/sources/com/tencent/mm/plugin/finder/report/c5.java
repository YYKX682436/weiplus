package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.d5 f124982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.finder.report.d5 d5Var, java.lang.String str) {
        super(0);
        this.f124982d = d5Var;
        this.f124983e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap;
        java.lang.String str;
        com.tencent.mm.plugin.finder.report.d5 d5Var = this.f124982d;
        java.util.Iterator it = d5Var.f124998v.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = d5Var.f124997u;
            str = this.f124983e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!kotlin.jvm.internal.o.b(str, "onRelease")) {
                d5Var.V0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
            } else if (((com.tencent.mm.plugin.finder.report.f5) hashMap.get(entry.getKey())) == null) {
                d5Var.V0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
            }
        }
        if (kotlin.jvm.internal.o.b(str, "onInvisible")) {
            hashMap.putAll(d5Var.f124998v);
        }
        d5Var.f124998v = new java.util.HashMap();
        return jz5.f0.f302826a;
    }
}
