package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public final class p2 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182432a;

    public p2(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182432a = q5Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (num != null && num.intValue() == 1) {
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "创建成功");
            jSONObject.put("code", 100);
            jSONObject.put("err_msg", "openFinderCreateAcctView:ok");
        } else if (num != null && num.intValue() == 2) {
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "用户取消");
            jSONObject.put("code", 200);
            jSONObject.put("err_msg", "openFinderCreateAcctView:cancel");
        } else if (num != null && num.intValue() == 3) {
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "参数为空");
            jSONObject.put("code", 300);
            jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
        } else if (num != null && num.intValue() == 4) {
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "账号已存在");
            jSONObject.put("code", 301);
            jSONObject.put("err_msg", "openFinderCreateAcctView:fail");
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182432a;
        if (q5Var != null) {
            q5Var.a(null, jSONObject);
        }
    }
}
