package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.voipmp.support.history.g f213765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.voipmp.support.history.g gVar) {
        super(1);
        this.f213765d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String optString = it.optString("talker");
        java.lang.String optString2 = it.optString("invite");
        java.lang.Long valueOf = java.lang.Long.valueOf(it.optLong("roomId"));
        com.tencent.mm.voipmp.support.history.g gVar = this.f213765d;
        gVar.f213768f = valueOf;
        if (!kotlin.jvm.internal.o.b(optString, "")) {
            java.util.ArrayList arrayList = gVar.f213766d;
            kotlin.jvm.internal.o.d(optString);
            arrayList.add(new com.tencent.mm.voipmp.support.history.b(optString, optString2));
        }
        return jz5.f0.f302826a;
    }
}
