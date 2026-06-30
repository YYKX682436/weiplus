package com.tencent.xweb;

/* loaded from: classes8.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.x0 f220603a;

    public v0(com.tencent.xweb.x0 x0Var) {
        this.f220603a = x0Var;
    }

    public android.os.Bundle a() {
        java.lang.String str;
        com.tencent.xweb.x0 x0Var = this.f220603a;
        if (!((x0Var == null || x0Var.getRequestHeaders() == null || x0Var.isForMainFrame() || !x0Var.getRequestHeaders().containsKey("Accept") || (str = (java.lang.String) x0Var.getRequestHeaders().get("Accept")) == null || !str.startsWith("text/html")) ? false : true)) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("resourceType", 1);
        return bundle;
    }
}
