package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaLink extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220156f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220157g;

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f220156f) != null && str.length() != 0 && this.f220156f.length() <= 10240;
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwwebpageobject_thumbUrl", this.f220157g);
        bundle.putString("_wwwebpageobject_webpageUrl", this.f220156f);
        bundle.putBoolean("_withshareticket", false);
        bundle.putString("_state", null);
        super.f(bundle);
    }
}
