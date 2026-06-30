package com.tencent.mm.plugin.finder.report;

/* loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.k4 f124996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.finder.report.k4 k4Var) {
        super(1);
        this.f124996d = k4Var;
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (value instanceof org.json.JSONObject) {
            com.tencent.mm.plugin.finder.report.k4 k4Var = this.f124996d;
            k4Var.getClass();
            return d75.b.e((org.json.JSONObject) value, new com.tencent.mm.plugin.finder.report.d4(k4Var));
        }
        if (!(value instanceof org.json.JSONArray)) {
            return value;
        }
        com.tencent.mm.plugin.finder.report.c4 c4Var = com.tencent.mm.plugin.finder.report.c4.f124981d;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        cf.f.b((org.json.JSONArray) value, new cf.e(c4Var, linkedList));
        return linkedList;
    }
}
