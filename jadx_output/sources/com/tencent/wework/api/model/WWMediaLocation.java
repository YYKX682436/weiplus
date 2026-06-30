package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaLocation extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220158f;

    /* renamed from: g, reason: collision with root package name */
    public double f220159g;

    /* renamed from: h, reason: collision with root package name */
    public double f220160h;

    /* renamed from: i, reason: collision with root package name */
    public double f220161i;

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f220158f) != null && str.length() != 0 && this.f220158f.length() <= 10240;
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwlocobject_address", this.f220158f);
        bundle.putDouble("_wwlocobject_longitude", this.f220159g);
        bundle.putDouble("_wwlocobject_latitude", this.f220160h);
        bundle.putDouble("_wwlocobject_zoom", this.f220161i);
        super.f(bundle);
    }
}
