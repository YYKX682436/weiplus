package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
public class i extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.function_call.i f216896b = new com.tencent.wechat.aff.function_call.i();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.function_call.ZIDL_YprQQP7kK f216897a;

    public i() {
        com.tencent.wechat.aff.function_call.ZIDL_YprQQP7kK zIDL_YprQQP7kK = new com.tencent.wechat.aff.function_call.ZIDL_YprQQP7kK();
        this.f216897a = zIDL_YprQQP7kK;
        this.zidlCreateName = "function_call.FunctionCallNative2CPPCaller@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_function_call", "aff_biz");
        zIDL_YprQQP7kK.ZIDL_YprQQP7kC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.function_call.b bVar, com.tencent.wechat.aff.function_call.f fVar) {
        this.f216897a.ZIDL_AV(this.nativeHandler, fVar, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(bVar));
    }

    public void b(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, com.tencent.wechat.aff.function_call.k kVar, com.tencent.wechat.aff.function_call.g gVar) {
        this.f216897a.ZIDL_CV(this.nativeHandler, gVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), com.tencent.wechat.zidl2.ZidlUtil.mmpbEnumListToBasicValueArray(arrayList), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(kVar));
    }

    public void c(java.util.ArrayList arrayList, java.lang.String str, com.tencent.wechat.aff.function_call.h hVar) {
        this.f216897a.ZIDL_DV(this.nativeHandler, hVar, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
