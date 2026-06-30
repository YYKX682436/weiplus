package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaText extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220176f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220177g;

    public WWMediaText() {
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f220176f) != null && str.length() != 0 && this.f220176f.length() <= 10240;
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwtextobject_text", this.f220176f);
        bundle.putString("_ww_msg_info_id", this.f220177g);
        super.f(bundle);
    }

    public WWMediaText(java.lang.String str) {
        this.f220176f = str;
    }
}
