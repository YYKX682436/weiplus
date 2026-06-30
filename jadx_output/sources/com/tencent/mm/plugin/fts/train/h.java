package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr f137821d;

    public h(com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr wCSearchGroupTrainMgr) {
        this.f137821d = wCSearchGroupTrainMgr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr wCSearchGroupTrainMgr = this.f137821d;
        try {
            wCSearchGroupTrainMgr.prewarmAllGroups();
        } finally {
            atomicBoolean = wCSearchGroupTrainMgr.prewarming;
            atomicBoolean.set(false);
            wCSearchGroupTrainMgr.prewarmFinished = true;
        }
    }
}
