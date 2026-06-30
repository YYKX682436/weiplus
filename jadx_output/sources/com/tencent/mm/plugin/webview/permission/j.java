package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f183420a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.GeneralControlWrapper f183421b;

    public j(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        this.f183420a = jsapiPermissionWrapper;
        this.f183421b = generalControlWrapper;
    }

    public java.lang.String toString() {
        return "Permission: jsPerm = " + this.f183420a + ", genCtrl = " + this.f183421b;
    }
}
