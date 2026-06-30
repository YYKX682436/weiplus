package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class y implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175252a;

    public y(com.tencent.mm.plugin.topstory.ui.webview.l lVar) {
        this.f175252a = lVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doCallBack, callbackId:%s, ret:%s, retValue:%s", str, str2, map);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_msg", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f175252a.n(str, hashMap);
    }
}
