package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f183456a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.GeneralControlWrapper f183457b;

    public u(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        this.f183456a = jsapiPermissionWrapper;
        this.f183457b = generalControlWrapper;
    }

    public java.lang.String toString() {
        return "Permission: jsPerm = " + this.f183456a + ", genCtrl = " + this.f183457b;
    }
}
