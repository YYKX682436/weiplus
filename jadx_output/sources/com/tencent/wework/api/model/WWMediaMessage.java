package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public abstract class WWMediaMessage extends com.tencent.wework.api.model.WWBaseMessage {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f220165c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220166d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f220167e;

    /* loaded from: classes9.dex */
    public static abstract class WWMediaObject extends com.tencent.wework.api.model.WWMediaMessage {
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        byte[] bArr = this.f220167e;
        if (bArr != null && bArr.length > 327680) {
            return false;
        }
        java.lang.String str = this.f220165c;
        if (str != null && str.length() > 512) {
            return false;
        }
        java.lang.String str2 = this.f220166d;
        return str2 == null || str2.length() <= 1024;
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwapi_basereq_transaction", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis()));
        bundle.putString("_wwapi_basereq_openid", null);
        bundle.putString("_wwapi_basereq_agentid", null);
        bundle.putString("_schema", null);
        try {
            bundle.putString("_wwapi_basereq_appbundle", this.f220145a.getPackageName());
            android.content.Context context = this.f220145a;
            bundle.putString("_wwapi_basereq_appname", context.getString(context.getApplicationInfo().labelRes));
        } catch (java.lang.Throwable unused) {
        }
        bundle.putInt("_wwobject_sdkVer", jx5.a.f302449a.intValue());
        bundle.putString("_wwobject_sdkVername", "3.0.1.2");
        bundle.putBoolean("needUpdateSession", false);
        bundle.putString("_wwobject_title", this.f220165c);
        bundle.putString("_wwobject_description", this.f220166d);
        bundle.putByteArray("_wwobject_thumbdata", this.f220167e);
    }
}
