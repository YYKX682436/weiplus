package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f210733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.y9 f210734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f210735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210736g;

    public s9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, android.os.Bundle bundle, com.tencent.mm.ui.tools.y9 y9Var, long j17) {
        this.f210736g = shareImgUI;
        this.f210733d = bundle;
        this.f210734e = y9Var;
        this.f210735f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        char c17;
        java.util.ArrayList arrayList;
        java.util.ArrayList parcelableArrayList = this.f210733d.getParcelableArrayList("android.intent.extra.STREAM");
        com.tencent.mm.ui.tools.y9 y9Var = this.f210734e;
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210736g;
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "getParcelableArrayList failed");
            com.tencent.mm.ui.tools.ShareImgUI.b7(shareImgUI, y9Var, null);
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(parcelableArrayList.size());
        boolean[] zArr = {false};
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable = (android.os.Parcelable) it.next();
            java.lang.String obj = parcelable != null ? parcelable.toString() : "null";
            s75.d.b(new com.tencent.mm.ui.tools.r9(this, concurrentLinkedQueue, parcelable, zArr, countDownLatch), "getMultiSendFilePathListItem" + obj);
        }
        try {
            countDownLatch.await();
            arrayList = null;
            c17 = 0;
        } catch (java.lang.InterruptedException e17) {
            c17 = 0;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareImgUI", e17, "hy: timeout when getmulti", new java.lang.Object[0]);
            arrayList = null;
            com.tencent.mm.ui.tools.ShareImgUI.b7(shareImgUI, y9Var, null);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(concurrentLinkedQueue);
        if (zArr[c17]) {
            com.tencent.mm.ui.tools.ShareImgUI.b7(shareImgUI, y9Var, arrayList);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "hy: getMultiSendFilePathList done. using: %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f210735f));
            com.tencent.mm.ui.tools.ShareImgUI.b7(shareImgUI, y9Var, arrayList2.size() > 0 ? arrayList2 : null);
        }
    }
}
