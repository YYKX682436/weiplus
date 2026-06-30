package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f181580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f181581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.List list, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f181580d = list;
        this.f181581e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f181580d.add(it);
        if (kotlin.jvm.internal.o.b(it.get("key"), "parentSearchID")) {
            java.lang.Object obj2 = it.get("textValue");
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str == null) {
                str = "";
            }
            this.f181581e.f310123d = str;
        }
        return jz5.f0.f302826a;
    }
}
