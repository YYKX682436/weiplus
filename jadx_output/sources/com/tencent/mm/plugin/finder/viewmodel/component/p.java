package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f135494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, r45.qt2 qt2Var, java.lang.String str2) {
        super(0);
        this.f135493d = str;
        this.f135494e = qt2Var;
        this.f135495f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = this.f135493d;
        ya2.b2 b17 = gVar.b(str);
        boolean z17 = b17 != null && b17.field_follow_Flag == ya2.b2.Q2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", str);
        jSONObject.put("follow_button_type", z17 ? 1 : 2);
        jSONObject.put("recommend_source_finder_username", this.f135495f);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, this.f135494e, "frifollow_page_follow_button", 0, jSONObject, false, null, 48, null);
        return jz5.f0.f302826a;
    }
}
