package kk4;

/* loaded from: classes15.dex */
public class i implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308554d;

    public i(kk4.v vVar) {
        this.f308554d = vVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        kk4.v vVar = this.f308554d;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "onCompletion");
        yz5.l lVar = vVar.f308595t;
        if (lVar != null) {
            lVar.invoke(vVar);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        nk4.s sVar;
        kk4.v vVar = this.f308554d;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "onError errorType:" + i17 + " errorCode:" + i18 + ' ' + vVar.w());
        jk4.a aVar = vVar.L;
        aVar.f300140j = i17;
        aVar.f300141k = i18;
        vVar.r();
        dn.o oVar = vVar.f308581f;
        kk4.v.q(vVar, oVar instanceof ck4.b ? (ck4.b) oVar : null, false, 2, null);
        dn.o oVar2 = vVar.f308581f;
        ck4.b bVar = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
        if (bVar == null || (sVar = vVar.f308588m) == null) {
            return;
        }
        ((kw2.m0) sVar).u(new nk4.n(bVar.f42534d2, i18, android.os.SystemClock.uptimeMillis(), null));
    }

    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        nk4.s sVar;
        ck4.b bVar;
        yz5.l lVar;
        nk4.s sVar2;
        kk4.v vVar = this.f308554d;
        if (i17 == 105) {
            dn.o oVar = vVar.f308581f;
            if (!(oVar instanceof ck4.b) || (sVar = vVar.f308588m) == null) {
                return;
            }
            bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            ((kw2.m0) sVar).p(new nk4.j(bVar != null ? bVar.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            return;
        }
        if (i17 == 106) {
            vVar.T = true;
            jk4.a aVar = vVar.L;
            long j19 = aVar.f300131a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            aVar.f300132b = android.os.SystemClock.elapsedRealtime() - j19;
            if (iTPPlayer != null && (lVar = vVar.f308594s) != null) {
                lVar.invoke(iTPPlayer);
            }
            dn.o oVar2 = vVar.f308581f;
            if (oVar2 instanceof ck4.b) {
                nk4.s sVar3 = vVar.f308588m;
                if (sVar3 != null) {
                    ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                    long j27 = bVar2 != null ? bVar2.f42534d2 : 0L;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    int i18 = vVar.f308589n;
                    kk4.c cVar = vVar.f308577b;
                    ((kw2.m0) sVar3).q(new nk4.k(j27, uptimeMillis, i18, cVar != null ? ((kk4.f0) cVar).f308532h : 0L, null, 16, null));
                }
                nk4.s sVar4 = vVar.f308588m;
                if (sVar4 != null) {
                    dn.o oVar3 = vVar.f308581f;
                    bVar = oVar3 instanceof ck4.b ? (ck4.b) oVar3 : null;
                    long j28 = bVar != null ? bVar.f42534d2 : 0L;
                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                    int i19 = vVar.f308589n;
                    kk4.c cVar2 = vVar.f308577b;
                    ((kw2.m0) sVar4).r(new nk4.k(j28, uptimeMillis2, i19, cVar2 != null ? ((kk4.f0) cVar2).f308532h : 0L, null, 16, null));
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 151) {
            dn.o oVar4 = vVar.f308581f;
            if (!(oVar4 instanceof ck4.b) || (sVar2 = vVar.f308588m) == null) {
                return;
            }
            bVar = oVar4 instanceof ck4.b ? (ck4.b) oVar4 : null;
            ((kw2.m0) sVar2).z(new nk4.b(bVar != null ? bVar.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            return;
        }
        if (i17 == 204) {
            com.tencent.mars.xlog.Log.i(vVar.f308576a, "onInfo#videoDecodeType:" + j17);
            vVar.f308589n = (int) j17;
            return;
        }
        if (i17 != 200) {
            if (i17 != 201) {
                return;
            }
            yz5.l lVar2 = vVar.f308597v;
            if (lVar2 != null) {
                lVar2.invoke(vVar);
            }
            jk4.a aVar2 = vVar.L;
            long j29 = aVar2.f300136f;
            if (j29 > 0) {
                aVar2.f300134d++;
                long j37 = aVar2.f300135e;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                aVar2.f300135e = j37 + (android.os.SystemClock.elapsedRealtime() - j29);
            }
            aVar2.f300136f = 0L;
            dn.o oVar5 = vVar.f308581f;
            kk4.v.q(vVar, oVar5 instanceof ck4.b ? (ck4.b) oVar5 : null, false, 2, null);
            return;
        }
        yz5.l lVar3 = vVar.f308596u;
        if (lVar3 != null) {
            lVar3.invoke(vVar);
        }
        jk4.a aVar3 = vVar.L;
        aVar3.getClass();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar3.f300136f = android.os.SystemClock.elapsedRealtime();
        dn.o oVar6 = vVar.f308581f;
        ck4.b bVar3 = oVar6 instanceof ck4.b ? (ck4.b) oVar6 : null;
        if (bVar3 == null) {
            vVar.getClass();
            return;
        }
        java.lang.Runnable runnable = vVar.R;
        com.tencent.mm.sdk.platformtools.n3 n3Var = vVar.Q;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
            vVar.R = null;
        }
        kk4.l lVar4 = new kk4.l(vVar, bVar3, bVar3);
        vVar.R = lVar4;
        n3Var.postDelayed(lVar4, (!vVar.T || vVar.S) ? 1000L : 500L);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        nk4.s sVar;
        kk4.v vVar = this.f308554d;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "onPrepared");
        long j17 = vVar.P;
        if (j17 > 0) {
            if (j17 < (iTPPlayer != null ? iTPPlayer.getDurationMs() : 0L) - 1000) {
                kk4.b.f(vVar, (int) vVar.P, true, null, 4, null);
                com.tencent.mars.xlog.Log.i(vVar.f308576a, "seek to play " + vVar.P + ' ' + vVar.w());
                vVar.P = -1L;
            }
        }
        dn.o oVar = vVar.f308581f;
        boolean z17 = oVar instanceof ck4.b;
        if (z17 && (sVar = vVar.f308588m) != null) {
            ck4.b bVar = z17 ? (ck4.b) oVar : null;
            long j18 = bVar != null ? bVar.f42534d2 : 0L;
            kk4.c cVar = vVar.f308577b;
            ((kw2.m0) sVar).x(new nk4.q(j18, cVar != null ? ((kk4.f0) cVar).f308532h : 0L, android.os.SystemClock.uptimeMillis(), null));
        }
        if (vVar.f308586k) {
            vVar.x(0);
        }
        yz5.l lVar = vVar.f308592q;
        if (lVar != null) {
            lVar.invoke(iTPPlayer);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        kk4.v vVar = this.f308554d;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "onSeekComplete");
        yz5.l lVar = vVar.I;
        if (lVar != null) {
            lVar.invoke(iTPPlayer);
        }
        vVar.I = null;
        yz5.a aVar = vVar.f308575J;
        if (aVar != null) {
            aVar.invoke();
        }
        vVar.S = false;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        kk4.g0 g0Var;
        nk4.s sVar;
        kk4.g0 g0Var2;
        nk4.s sVar2;
        com.tencent.mars.xlog.Log.i(this.f308554d.f308576a, "onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + this.f308554d.w());
        this.f308554d.f308579d = i18;
        if (i18 == 1 || i18 == 9) {
            com.tencent.mars.xlog.Log.i(this.f308554d.f308576a, "onStateChange() player stop or idle " + this.f308554d.w());
            pk4.w wVar = this.f308554d.f308584i;
            if (wVar != null) {
                ((qk4.d) wVar).a();
            }
            this.f308554d.f308584i = null;
        }
        if (i18 == 5) {
            kk4.v vVar = this.f308554d;
            vVar.getClass();
            pm0.v.X(new kk4.m(vVar));
            kk4.v vVar2 = this.f308554d;
            dn.o oVar = vVar2.f308581f;
            boolean z17 = oVar instanceof ck4.b;
            if (z17 && (sVar2 = vVar2.f308588m) != null) {
                ck4.b bVar = z17 ? (ck4.b) oVar : null;
                ((kw2.m0) sVar2).A(new nk4.b(bVar != null ? bVar.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), null, 4, null));
            }
            kk4.v vVar3 = this.f308554d;
            if (vVar3.f308578c != null && (g0Var2 = vVar3.f308599x) != null) {
                ((ea2.c0) g0Var2).f250546a.t7();
            }
        }
        if (i18 == 6) {
            kk4.v vVar4 = this.f308554d;
            dn.o oVar2 = vVar4.f308581f;
            boolean z18 = oVar2 instanceof ck4.b;
            if (z18 && (sVar = vVar4.f308588m) != null) {
                ck4.b bVar2 = z18 ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).t(new nk4.m(bVar2 != null ? bVar2.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), null, null, 8, null));
            }
            kk4.v vVar5 = this.f308554d;
            if (vVar5.f308578c != null && (g0Var = vVar5.f308599x) != null) {
                ((ea2.c0) g0Var).f250546a.t7();
            }
        }
        if (this.f308554d.s()) {
            this.f308554d.N();
        } else {
            this.f308554d.R();
        }
        kk4.v vVar6 = this.f308554d;
        yz5.p pVar = vVar6.K;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(vVar6.v(i17)), java.lang.Integer.valueOf(this.f308554d.v(i18)));
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        yz5.p pVar = this.f308554d.f308593r;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }
}
