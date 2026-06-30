package vp;

/* loaded from: classes13.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f438838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vp.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438838d = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp.u0(this.f438838d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vp.u0 u0Var = (vp.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vp.v0 v0Var = this.f438838d;
        v0Var.f438844f.writeLock().lock();
        try {
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: clearing follow danmaku (fake insert danmaku)");
            java.util.Iterator it = v0Var.f438843e.iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).clear();
            }
            ((java.util.ArrayList) v0Var.f438843e).clear();
            int i17 = v0Var.f438839a;
            if (i17 > 0) {
                java.util.List list = v0Var.f438843e;
                java.util.ArrayList arrayList = new java.util.ArrayList(i17);
                for (int i18 = 0; i18 < i17; i18++) {
                    arrayList.add(new java.util.ArrayList());
                }
                ((java.util.ArrayList) list).addAll(arrayList);
            }
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: successfully cleared and reinitialized follow structure");
            v0Var.f438844f.writeLock().unlock();
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: resumed task processing");
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            v0Var.f438844f.writeLock().unlock();
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: resumed task processing");
            throw th6;
        }
    }
}
