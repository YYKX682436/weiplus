package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class a implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175177b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f175176a = str;
        this.f175177b = str2;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryJsEventNotifier", "notifyJsEvent received value %s %s", this.f175176a, this.f175177b);
    }
}
