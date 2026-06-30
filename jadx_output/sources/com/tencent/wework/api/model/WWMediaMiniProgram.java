package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaMiniProgram extends com.tencent.wework.api.model.WWMediaMessage.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220168f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220169g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f220170h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220171i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f220172j;

    /* renamed from: k, reason: collision with root package name */
    public int f220173k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f220174l = false;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f220175m = new android.os.Bundle();

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        java.lang.String str;
        byte[] bArr;
        return super.b() && (str = this.f220168f) != null && str.length() >= 1 && (bArr = this.f220170h) != null && bArr.length >= 1 && bArr.length <= 134217728;
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwwxaobject_userName", this.f220168f);
        java.lang.String str = this.f220169g;
        if (str == null) {
            str = "";
        }
        bundle.putString("_wwwxaobject_path", str);
        java.lang.String str2 = this.f220171i;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("_wwwxaobject_iconUrl", str2);
        java.lang.String str3 = this.f220172j;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("_wwwxaobject_name", str3);
        bundle.putByteArray("_wwwxaobject_hdImageData", this.f220170h);
        bundle.putInt("_wwwxaobject_type", this.f220173k);
        bundle.putString("_wwwxaobject_webpageurl", "");
        bundle.putInt("_wwwxaobject_programtype", 0);
        bundle.putBoolean("_wwwxminiprogram_issecretmsg", this.f220174l);
        bundle.putBundle("_wwwxminiprogram_ext", this.f220175m);
        super.f(bundle);
    }
}
