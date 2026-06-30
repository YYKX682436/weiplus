package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaConversation extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220148f;

    /* renamed from: g, reason: collision with root package name */
    public long f220149g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f220150h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wework.api.model.WWMediaMessage.WWMediaObject f220151i;

    @Override // com.tencent.wework.api.model.BaseMessage
    public void a(android.content.Intent intent, java.lang.String str) {
        try {
            this.f220151i.a(intent, str);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        com.tencent.wework.api.model.WWMediaMessage.WWMediaObject wWMediaObject;
        if (!super.b()) {
            return false;
        }
        byte[] bArr = this.f220150h;
        return (bArr == null || bArr.length <= 10485760) && (wWMediaObject = this.f220151i) != null && wWMediaObject.b();
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public void d(android.content.Context context) {
        this.f220145a = context;
        try {
            this.f220151i.d(context);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.tencent.wework.api.model.BaseMessage
    public void e(java.lang.String str) {
        this.f220146b = str;
        try {
            this.f220151i.e(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        super.f(bundle);
        bundle.putString("_wwconvobject_name", this.f220148f);
        bundle.putLong("_wwconvobject_date", this.f220149g);
        bundle.putByteArray("_wwconvobject_avatarData", this.f220150h);
        bundle.putString("_wwconvobject_avatarPath", null);
        bundle.putBundle("_wwconvobject_message", com.tencent.wework.api.model.BaseMessage.c(this.f220151i));
    }
}
