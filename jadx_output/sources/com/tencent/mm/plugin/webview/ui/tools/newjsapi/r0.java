package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(2);
        this.f186471d = hashMap;
        this.f186472e = kVar;
        this.f186473f = y2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        java.util.HashMap hashMap = this.f186471d;
        hashMap.put("err_code", valueOf);
        nw4.g gVar = this.f186472e.f340863d;
        nw4.y2 y2Var = this.f186473f;
        java.lang.String str2 = y2Var.f341013c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f341019i);
        sb6.append(':');
        if (str == null) {
            str = "fail";
        }
        sb6.append(str);
        gVar.e(str2, sb6.toString(), hashMap);
        return jz5.f0.f302826a;
    }
}
