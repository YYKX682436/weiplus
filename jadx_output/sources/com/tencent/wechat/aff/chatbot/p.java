package com.tencent.wechat.aff.chatbot;

/* loaded from: classes11.dex */
public class p extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.p f216415b = new com.tencent.wechat.aff.chatbot.p();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.ZIDL_J9_6tNH0NK f216416a;

    public p() {
        com.tencent.wechat.aff.chatbot.ZIDL_J9_6tNH0NK zIDL_J9_6tNH0NK = new com.tencent.wechat.aff.chatbot.ZIDL_J9_6tNH0NK();
        this.f216416a = zIDL_J9_6tNH0NK;
        this.zidlCreateName = "chatbot.CBTStreamMDNativeToCppCaller@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_J9_6tNH0NK.ZIDL_J9_6tNH0NC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str) {
        this.f216416a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public java.util.Optional b(java.lang.String str, com.tencent.wechat.aff.chatbot.r rVar) {
        return com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2Optional(this.f216416a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(rVar)), new com.tencent.wechat.aff.chatbot.p$$a());
    }
}
