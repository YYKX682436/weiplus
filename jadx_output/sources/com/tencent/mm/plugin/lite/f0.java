package com.tencent.mm.plugin.lite;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143465d;

    public f0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str) {
        this.f143465d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        java.lang.String str = this.f143465d;
        synchronized (s17.f143960n) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("liteapp_schedule_data");
            if (((java.util.concurrent.ConcurrentHashMap) s17.f143959m).containsKey(str)) {
                ((com.tencent.mm.sdk.platformtools.b4) ((java.util.concurrent.ConcurrentHashMap) s17.f143959m).get(str)).d();
            }
            ((java.util.concurrent.ConcurrentHashMap) s17.f143959m).remove(str);
            M.remove(str);
        }
    }
}
