package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class j1 implements ob0.w2 {
    public j1(com.tencent.mm.plugin.performance.watchdogs.i1 i1Var) {
    }

    @Override // ob0.w2
    public java.lang.String a() {
        return null;
    }

    @Override // ob0.w2
    public java.lang.String b() {
        return java.lang.String.valueOf(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE);
    }

    @Override // ob0.w2
    public java.lang.String c() {
        return null;
    }

    @Override // ob0.w2
    public java.lang.String d() {
        return java.lang.String.valueOf(0);
    }

    @Override // ob0.w2
    public java.lang.String extra() {
        return null;
    }

    @Override // ob0.v2
    public java.util.Map getExtra() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("TbsVersion", java.lang.String.valueOf(0));
        hashMap.put("XWalkSdkVersion", b());
        return hashMap;
    }

    @Override // ob0.v2
    public java.lang.String getTag() {
        return "WebViewVer";
    }
}
