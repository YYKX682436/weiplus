package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class k0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.k0 f216317b = new com.tencent.wechat.aff.chatbot.k0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.ZIDL_vlJnB1a4HK f216318a;

    public k0() {
        com.tencent.wechat.aff.chatbot.ZIDL_vlJnB1a4HK zIDL_vlJnB1a4HK = new com.tencent.wechat.aff.chatbot.ZIDL_vlJnB1a4HK();
        this.f216318a = zIDL_vlJnB1a4HK;
        this.zidlCreateName = "chatbot.ChatbotDeviceNative2CPPCaller@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_vlJnB1a4HK.ZIDL_vlJnB1a4HC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str, boolean z17, com.tencent.wechat.aff.chatbot.n0 n0Var, int i17, boolean z18, boolean z19, byte[] bArr, boolean z27, int i18, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.lang.String str2, com.tencent.wechat.aff.chatbot.j0 j0Var) {
        this.f216318a.ZIDL_BV(this.nativeHandler, j0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17, n0Var.f216395d, i17, z18, z19, bArr, z27, i18, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList2), com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList3), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
