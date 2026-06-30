package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class w0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.w0 f216518b = new com.tencent.wechat.aff.chatbot.w0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.ZIDL_OtOYwmlmK f216519a;

    public w0() {
        com.tencent.wechat.aff.chatbot.ZIDL_OtOYwmlmK zIDL_OtOYwmlmK = new com.tencent.wechat.aff.chatbot.ZIDL_OtOYwmlmK();
        this.f216519a = zIDL_OtOYwmlmK;
        this.zidlCreateName = "chatbot.ChatbotUINative2CPPCaller@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_OtOYwmlmK.ZIDL_OtOYwmlmC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.chatbot.p0 p0Var, com.tencent.wechat.aff.chatbot.r0 r0Var) {
        this.f216519a.ZIDL_AV(this.nativeHandler, r0Var, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(p0Var));
    }

    public void b(com.tencent.wechat.aff.chatbot.d3 d3Var, com.tencent.wechat.aff.chatbot.w wVar, java.lang.String str, com.tencent.wechat.aff.chatbot.s0 s0Var) {
        this.f216519a.ZIDL_CV(this.nativeHandler, s0Var, d3Var.f216157d, wVar.f216517d, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void c(com.tencent.wechat.aff.chatbot.t0 t0Var) {
        this.f216519a.ZIDL_QV(this.nativeHandler, t0Var);
    }

    public int d(java.nio.ByteBuffer byteBuffer, int i17) {
        return this.f216519a.ZIDL_D(this.nativeHandler, byteBuffer, i17);
    }

    public void e(com.tencent.wechat.aff.chatbot.k kVar, com.tencent.wechat.aff.chatbot.u0 u0Var) {
        this.f216519a.ZIDL_ZBV(this.nativeHandler, u0Var, kVar.toByteArrayOrNull());
    }

    public void f(com.tencent.wechat.aff.chatbot.v0 v0Var) {
        this.f216519a.ZIDL_KV(this.nativeHandler, v0Var);
    }

    public void g(java.lang.String str) {
        this.f216519a.ZIDL_FC(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public int h(java.nio.ByteBuffer byteBuffer, int i17) {
        return this.f216519a.ZIDL_E(this.nativeHandler, byteBuffer, i17);
    }

    public int i(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.lang.String str) {
        return this.f216519a.ZIDL_F(this.nativeHandler, byteBuffer, i17, i18, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void j(java.lang.String str, int i17, java.lang.String str2) {
        this.f216519a.ZIDL_PB(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public com.tencent.wechat.aff.chatbot.v k(java.lang.String str, java.util.Optional optional, java.util.Optional optional2, int i17, java.lang.String str2, java.lang.String str3, com.tencent.wechat.aff.chatbot.w wVar, java.util.Optional optional3) {
        return (com.tencent.wechat.aff.chatbot.v) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.chatbot.v.f216485g, this.f216519a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJavaToJniOptional(optional), com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJavaToJniOptional(optional2), i17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), wVar.f216517d, com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJavaToJniOptional(optional3)));
    }
}
