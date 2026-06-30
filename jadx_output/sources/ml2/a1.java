package ml2;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f327194a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct f327195b;

    /* renamed from: c, reason: collision with root package name */
    public long f327196c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f327197d;

    public a1(java.lang.String hashCode, java.lang.String pagId, java.lang.String commentScene, java.lang.String contextId, org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2;
        kotlin.jvm.internal.o.g(hashCode, "hashCode");
        kotlin.jvm.internal.o.g(pagId, "pagId");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        this.f327194a = hashCode;
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
        finderBroadcastPageInStruct.r(pagId);
        finderBroadcastPageInStruct.p(commentScene);
        finderBroadcastPageInStruct.q(contextId);
        finderBroadcastPageInStruct.s((jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) ? "" : r26.i0.t(jSONObject2, ",", ";", false));
        this.f327195b = finderBroadcastPageInStruct;
    }

    public java.lang.String toString() {
        return "hashCode:" + this.f327194a + ", exposeTime:" + this.f327196c + ", pageInStruct:" + this.f327195b.n();
    }

    public a1(java.lang.String hashCode, com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct struct) {
        kotlin.jvm.internal.o.g(hashCode, "hashCode");
        kotlin.jvm.internal.o.g(struct, "struct");
        this.f327194a = hashCode;
        this.f327195b = struct;
    }
}
