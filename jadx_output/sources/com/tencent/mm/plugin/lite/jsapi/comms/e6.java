package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143567d;

    public e6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var) {
        this.f143567d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f143567d.f143443f.a("saveToPhotosAlbum fail:system permission denied");
    }
}
