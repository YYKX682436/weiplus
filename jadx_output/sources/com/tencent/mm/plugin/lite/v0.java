package com.tencent.mm.plugin.lite;

/* loaded from: classes8.dex */
public class v0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144510a;

    public v0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str) {
        this.f144510a = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "createStore appId: %s fail.", this.f144510a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "createStore appId: %s success.", this.f144510a);
    }
}
