package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.RfxPagView f192229d;

    public g(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f192229d = rfxPagView;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        synchronized (this.f192229d) {
            arrayList2 = this.f192229d.mPagFlushListeners;
            arrayList = new java.util.ArrayList(arrayList2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ym5.c2) ((com.tencent.mm.rfx.h) it.next())).f463230a.onFlush();
        }
    }
}
