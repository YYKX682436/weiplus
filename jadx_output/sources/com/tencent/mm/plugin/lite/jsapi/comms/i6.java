package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143615d;

    public i6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var) {
        this.f143615d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f143615d.f143443f.a("saveToPhotosAlbum fail:system permission denied");
    }
}
