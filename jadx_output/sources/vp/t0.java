package vp;

/* loaded from: classes13.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f438835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(vp.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438835d = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp.t0(this.f438835d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vp.t0 t0Var = (vp.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List S0;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f438835d.f438842d.writeLock().lock();
        try {
            vp.v0 v0Var = this.f438835d;
            synchronized (v0Var.f438840b) {
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: starting recalculation with " + v0Var.f438840b.size() + " danmaku");
                S0 = kz5.n0.S0(v0Var.f438840b);
            }
            int i17 = this.f438835d.f438839a;
            java.util.ArrayList arrayList = new java.util.ArrayList(i17);
            int i18 = 0;
            for (int i19 = 0; i19 < i17; i19++) {
                arrayList.add(new java.util.ArrayList());
            }
            java.util.Iterator it = S0.iterator();
            while (it.hasNext()) {
                vp.v0.a(this.f438835d, (wp.a) it.next(), arrayList);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("recalculateDrawList: completed calculation, new structure has ");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                i18 += ((java.util.List) it6.next()).size();
            }
            sb6.append(i18);
            sb6.append(" danmaku");
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", sb6.toString());
            ((java.util.ArrayList) this.f438835d.f438841c).clear();
            ((java.util.ArrayList) this.f438835d.f438841c).addAll(arrayList);
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: successfully replaced structure with new layout");
            this.f438835d.f438842d.writeLock().unlock();
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: resumed task processing");
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            this.f438835d.f438842d.writeLock().unlock();
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: resumed task processing");
            throw th6;
        }
    }
}
