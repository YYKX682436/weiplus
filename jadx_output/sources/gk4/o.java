package gk4;

/* loaded from: classes10.dex */
public final class o extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272592d;

    public o(gk4.r rVar) {
        this.f272592d = rVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        long j17;
        hk4.a aVar;
        gk4.s sVar;
        dk4.a aVar2;
        hk4.a aVar3;
        gk4.s sVar2;
        jk4.a aVar4;
        gk4.t tVar;
        java.util.ArrayList arrayList;
        int indexOf;
        if (this.f272592d.f272606k.isEmpty() && this.f272592d.f272607l.isEmpty()) {
            com.tencent.mars.xlog.Log.i(this.f272592d.f272602g, "finished play all player");
            this.f272592d.m();
        }
        if (this.f272592d.f272619x >= 0) {
            gk4.r rVar = this.f272592d;
            rVar.f272612q = rVar.f272619x;
            com.tencent.mars.xlog.Log.i(this.f272592d.f272602g, "onProgressUpdate set renderPts to seekTime:" + this.f272592d.f272619x);
            this.f272592d.f272619x = -1L;
        } else {
            gk4.r rVar2 = this.f272592d;
            long j18 = rVar2.f272612q;
            if (this.f272592d.f272616u > 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j17 = android.os.SystemClock.elapsedRealtime() - this.f272592d.f272616u;
            } else {
                j17 = gk4.r.E;
            }
            rVar2.f272612q = j18 + j17;
        }
        gk4.r rVar3 = this.f272592d;
        um5.i0 i0Var = rVar3.f272603h;
        long j19 = rVar3.f272612q;
        i0Var.getClass();
        i0Var.f(new um5.t(i0Var, j19));
        gk4.r rVar4 = this.f272592d;
        long j27 = rVar4.f272612q;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = rVar4.f272606k;
        java.lang.String str = null;
        if ((!concurrentLinkedDeque.isEmpty()) && (sVar2 = (aVar3 = (hk4.a) concurrentLinkedDeque.getFirst()).f281929h) != null && j27 >= (sVar2.f272624c + sVar2.f272628g.f397531c) - gk4.r.E) {
            rVar4.f272603h.k(aVar3.f281930i);
            aVar3.o();
            aVar3.g();
            hk4.x xVar = aVar3 instanceof hk4.x ? (hk4.x) aVar3 : null;
            if (xVar != null && (aVar4 = xVar.f281986l.L) != null && (tVar = rVar4.f272609n) != null && (arrayList = tVar.f272630a) != null && (indexOf = arrayList.indexOf(sVar2)) >= 0) {
                rVar4.B.a(indexOf, aVar4);
            }
            yz5.l lVar = aVar3.f281926e;
            if (lVar != null) {
                lVar.invoke(aVar3);
            }
            concurrentLinkedDeque.remove(aVar3);
            com.tencent.mars.xlog.Log.i(rVar4.f272602g, "checkRemovePlayerTexture pts:" + j27 + ", remove player texture:" + aVar3.f281930i + ", type:" + aVar3.d() + ", playingPlayers.size:" + concurrentLinkedDeque.size());
        }
        gk4.r rVar5 = this.f272592d;
        long j28 = rVar5.f272612q;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = rVar5.f272607l;
        if ((!concurrentLinkedDeque2.isEmpty()) && (sVar = (aVar = (hk4.a) concurrentLinkedDeque2.getFirst()).f281929h) != null && j28 >= sVar.f272623b && !aVar.c()) {
            concurrentLinkedDeque2.removeFirst();
            aVar.n();
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque3 = rVar5.f272606k;
            concurrentLinkedDeque3.add(aVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkToPlayNext, now can play next media, pts:");
            sb6.append(j28);
            sb6.append(", key:");
            gk4.s sVar3 = aVar.f281929h;
            if (sVar3 != null && (aVar2 = sVar3.f272629h) != null) {
                str = aVar2.f234482s;
            }
            sb6.append(str);
            sb6.append(", type:");
            sb6.append(aVar.d());
            sb6.append(", track.startTime:");
            sb6.append(sVar.f272623b);
            sb6.append(", playingPlayers.size:");
            sb6.append(concurrentLinkedDeque3.size());
            com.tencent.mars.xlog.Log.i(rVar5.f272602g, sb6.toString());
        }
        long j29 = this.f272592d.f272612q;
        long j37 = this.f272592d.f272618w;
        if ((1 <= j37 && j37 <= j29) && this.f272592d.f272617v >= 0) {
            pm0.v.X(new gk4.p(this.f272592d));
        }
        gk4.r rVar6 = this.f272592d;
        rVar6.getClass();
        pm0.v.X(new gk4.f(rVar6));
        gk4.r rVar7 = this.f272592d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        rVar7.f272616u = android.os.SystemClock.elapsedRealtime();
    }
}
