package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.c7 f143516d;

    public b7(com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var) {
        this.f143516d = c7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var = this.f143516d;
        if (com.tencent.mm.vfs.w6.j(c7Var.f143531n)) {
            com.tencent.mm.vfs.w6.h(c7Var.f143531n);
        }
    }
}
