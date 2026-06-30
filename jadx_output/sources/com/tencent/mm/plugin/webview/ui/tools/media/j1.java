package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.util.HashMap hashMap, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        super(2);
        this.f185787d = hashMap;
        this.f185788e = c1Var;
        this.f185789f = y2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        java.util.HashMap hashMap = this.f185787d;
        hashMap.put("err_code", valueOf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f185789f;
        sb6.append(y2Var.f341019i);
        sb6.append(':');
        if (str == null) {
            str = "fail";
        }
        sb6.append(str);
        this.f185788e.i5(y2Var, sb6.toString(), hashMap);
        return jz5.f0.f302826a;
    }
}
