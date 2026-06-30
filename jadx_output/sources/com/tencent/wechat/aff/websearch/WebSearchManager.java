package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
public class WebSearchManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.wechat.aff.websearch.WebSearchManager instance = new com.tencent.wechat.aff.websearch.WebSearchManager();
    com.tencent.wechat.aff.websearch.ZIDL_YZ4qH7TgzK jniCaller = new com.tencent.wechat.aff.websearch.ZIDL_YZ4qH7TgzK();

    /* loaded from: classes16.dex */
    public interface NetSceneMMSearchReportCallback {
        void complete(bw5.ui0 ui0Var);
    }

    /* loaded from: classes16.dex */
    public interface NetSceneMMWebQueryCallback {
        void complete(bw5.fj0 fj0Var);
    }

    /* loaded from: classes10.dex */
    public interface NetSceneMMWebSearchCallback {
        void complete(bw5.gs0 gs0Var);
    }

    /* loaded from: classes10.dex */
    public interface NetSceneMMWebSuggestCallback {
        void complete(bw5.gs0 gs0Var);
    }

    private WebSearchManager() {
        this.zidlCreateName = "websearch.WebSearchManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_websearch", "aff_biz");
        this.jniCaller.ZIDL_YZ4qH7TgzC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.websearch.WebSearchManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.wechat.aff.websearch.WebSearchManager getInstance() {
        return instance;
    }

    public boolean init() {
        return this.jniCaller.ZIDL_A(this.nativeHandler);
    }

    public void netSceneMMSearchReportAsync(bw5.ti0 ti0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMSearchReportCallback netSceneMMSearchReportCallback) {
        this.jniCaller.ZIDL_EV(this.nativeHandler, netSceneMMSearchReportCallback, ti0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }

    public void netSceneMMWebQueryAsync(bw5.ej0 ej0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebQueryCallback netSceneMMWebQueryCallback) {
        this.jniCaller.ZIDL_DV(this.nativeHandler, netSceneMMWebQueryCallback, ej0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }

    public void netSceneMMWebSearchAsync(bw5.fs0 fs0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebSearchCallback netSceneMMWebSearchCallback) {
        this.jniCaller.ZIDL_BV(this.nativeHandler, netSceneMMWebSearchCallback, fs0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }

    public void netSceneMMWebSuggestAsync(bw5.fs0 fs0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.WebSearchManager.NetSceneMMWebSuggestCallback netSceneMMWebSuggestCallback) {
        this.jniCaller.ZIDL_CV(this.nativeHandler, netSceneMMWebSuggestCallback, fs0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }

    public void netSceneSearchGuideAsync(bw5.pc0 pc0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.a aVar) {
        this.jniCaller.ZIDL_FV(this.nativeHandler, aVar, pc0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }

    public void netSceneWebSearchConfigAsync(bw5.cs0 cs0Var, com.tencent.wechat.aff.websearch.RequestContext requestContext, com.tencent.wechat.aff.websearch.b bVar) {
        this.jniCaller.ZIDL_GV(this.nativeHandler, bVar, cs0Var.toByteArrayOrNull(), requestContext.toByteArrayOrNull());
    }
}
