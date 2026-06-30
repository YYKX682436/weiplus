package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public class j implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr f137824d;

    public j(com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr wCSearchGroupTrainMgr) {
        this.f137824d = wCSearchGroupTrainMgr;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.fts.train.f fVar;
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (str.endsWith("@chatroom") || str.endsWith("@im.chatroom")) {
                if (i17 != 5) {
                    ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.fts.train.i(this, str), "fts.GroupTrainIncr");
                    return;
                }
                fVar = this.f137824d.cache;
                java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f137818d;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ((java.util.HashMap) fVar.f137815a).remove(str);
                    ((java.util.HashMap) fVar.f137816b).remove(str);
                    ((java.util.HashMap) fVar.f137817c).remove(str);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
        }
    }
}
