package iu0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294828d = str;
        this.f294829e = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iu0.j(this.f294828d, this.f294829e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = this.f294829e;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preparePublishResourceWithoutMusic: templateId=");
        java.lang.String str2 = this.f294828d;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MJCC.ResMgr", sb6.toString());
        iu0.k kVar = iu0.k.f294830a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        sb7.append(az0.i5.f15565i);
        sb7.append("/MJPublisher/ComposingCreation");
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.vfs.w6.u(sb8);
        java.lang.String str3 = sb8 + "/download_" + java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.w6.u(str3);
        try {
            java.lang.String a17 = iu0.k.a(kVar, "http://dldir1v6.qq.com/weixin/checkresupdate/TemplateScript_10df1f6f5e9040289295af14c8b93d5a.lua", str3 + "/TemplateScript.lua");
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: lua script download failed");
                return null;
            }
            java.lang.String str4 = sb8 + "/composing_creation_" + str2;
            com.tencent.mm.vfs.w6.f(str4);
            java.lang.String str5 = str4 + '/' + str2;
            com.tencent.mm.vfs.w6.u(str5);
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: templateJsonFilePath not exist");
                return null;
            }
            com.tencent.mm.vfs.w6.c(str, str5 + "/config.json");
            com.tencent.mm.vfs.w6.c(a17, str5 + "/TemplateScript.lua");
            java.lang.String str6 = sb8 + '/' + str2 + ".zip";
            boolean b17 = iu0.k.b(kVar, str4, str6);
            com.tencent.mm.vfs.w6.f(str4);
            com.tencent.mm.vfs.w6.f(str3);
            if (b17) {
                return str6;
            }
            com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: zip failed");
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.ResMgr", "preparePublishResourceWithoutMusic: exception: " + e17.getMessage());
            return null;
        }
    }
}
