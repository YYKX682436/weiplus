package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.p8 f143705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f143706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.o f143709h;

    public o8(com.tencent.mm.plugin.lite.jsapi.comms.p8 p8Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.api.o oVar) {
        this.f143705d = p8Var;
        this.f143706e = h0Var;
        this.f143707f = str;
        this.f143708g = str2;
        this.f143709h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f143706e;
        this.f143705d.a((java.lang.String) h0Var.f310123d, this.f143707f);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, h0Var.f310123d);
        hashMap.put(dm.i4.COL_LOCALID, this.f143708g);
        hashMap.put("err_msg", "sendFileMessage:ok");
        this.f143709h.b(hashMap);
    }
}
