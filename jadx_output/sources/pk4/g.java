package pk4;

/* loaded from: classes10.dex */
public final class g implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356483d;

    public g(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout) {
        this.f356483d = mMMvVideoLayout;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        dk4.a aVar;
        dk4.a aVar2;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == this.f356483d.getCOMPLETE()) {
            com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356483d;
            kk4.v currentPlayer = mMMvVideoLayout.getCurrentPlayer();
            com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "onCompletion " + currentPlayer + ' ' + mMMvVideoLayout.c());
            java.lang.String str = mMMvVideoLayout.f174512d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToNext ");
            sb6.append(mMMvVideoLayout.c());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayer currentPlayer:");
            sb7.append(mMMvVideoLayout.currentPlayer);
            sb7.append(", playerSurface:");
            android.view.Surface surface = mMMvVideoLayout.f174525t;
            sb7.append(surface != null ? surface.hashCode() : 0);
            java.lang.String sb8 = sb7.toString();
            java.lang.String str2 = mMMvVideoLayout.f174512d;
            com.tencent.mars.xlog.Log.i(str2, sb8);
            kk4.v vVar = mMMvVideoLayout.currentPlayer;
            if (vVar != null) {
                vVar.F(null);
                vVar.R();
                kk4.b.e(vVar, null, 1, null);
                vVar.P();
                vVar.recycle();
                mMMvVideoLayout.reportInfo.a(mMMvVideoLayout.currentPlayIndex, vVar.L);
            }
            com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "removeCompleteTimer");
            kk4.v vVar2 = mMMvVideoLayout.currentPlayer;
            if (vVar2 != null) {
                kk4.b.g(vVar2, null, 0L, 2, null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = mMMvVideoLayout.playTimer;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            android.content.Context context = mMMvVideoLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kk4.v vVar3 = new kk4.v(context);
            gk4.h0 h0Var = mMMvVideoLayout.effector;
            h0Var.getClass();
            vVar3.F(new gk4.w(h0Var));
            mMMvVideoLayout.currentPlayer = vVar3;
            com.tencent.mars.xlog.Log.i(str2, "recreatePlayer finished, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            mMMvVideoLayout.currentPlayIndex = mMMvVideoLayout.currentPlayIndex + 1;
            java.util.List list = mMMvVideoLayout.mediaInfoList;
            if ((list != null ? list.size() : 0) <= mMMvVideoLayout.currentPlayIndex) {
                mMMvVideoLayout.currentPlayIndex = 0;
            }
            java.util.List list2 = mMMvVideoLayout.mediaInfoList;
            if (list2 != null && (aVar = (dk4.a) list2.get(mMMvVideoLayout.currentPlayIndex)) != null) {
                kk4.v vVar4 = mMMvVideoLayout.currentPlayer;
                if (vVar4 != null) {
                    vVar4.B(aVar);
                }
                kk4.v vVar5 = mMMvVideoLayout.currentPlayer;
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                java.lang.String str3 = mMMvVideoLayout.f174512d;
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("initPlayer ");
                sb9.append(mMMvVideoLayout.c());
                sb9.append(", playerSurface:");
                android.view.Surface surface2 = mMMvVideoLayout.f174525t;
                sb9.append(surface2 != null ? surface2.hashCode() : 0);
                sb9.append(", player:");
                sb9.append(vVar5 != null ? vVar5.hashCode() : 0);
                com.tencent.mars.xlog.Log.i(str3, sb9.toString());
                if (vVar5 != null) {
                    vVar5.f308585j = true;
                }
                if (vVar5 != null) {
                    vVar5.C(true);
                }
                if (vVar5 != null) {
                    dk4.a aVar3 = vVar5.f308578c;
                    vVar5.A(aVar3 != null ? aVar3.f234475l : false);
                }
                if (vVar5 != null && (aVar2 = vVar5.f308578c) != null) {
                    vVar5.P = aVar2.f234479p;
                    pk4.u uVar = mMMvVideoLayout.mediaChangeListener;
                    if (uVar != null) {
                        uVar.a(mMMvVideoLayout.currentPlayIndex, aVar2);
                    }
                }
                if (vVar5 != null) {
                    vVar5.I(new pk4.k(mMMvVideoLayout, vVar5), mMMvVideoLayout.f174526u);
                }
                com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "start recreatePlayerSurface");
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                android.view.Surface surface3 = mMMvVideoLayout.f174525t;
                if (surface3 != null) {
                    surface3.release();
                }
                mMMvVideoLayout.f174525t = null;
                mMMvVideoLayout.f174524s = null;
                gk4.h0 h0Var2 = mMMvVideoLayout.effector;
                pk4.l lVar = new pk4.l(mMMvVideoLayout, vVar5, elapsedRealtime3);
                h0Var2.getClass();
                h0Var2.e(new gk4.b0(h0Var2, lVar));
                mMMvVideoLayout.logFrameRender = false;
                if (vVar5 != null) {
                    vVar5.f308599x = mMMvVideoLayout.playerActionListener;
                }
                java.lang.String str4 = mMMvVideoLayout.f174512d;
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("initPlayer ");
                sb10.append(vVar5 != null ? vVar5.w() : null);
                sb10.append(", currentPlayIndex:");
                sb10.append(mMMvVideoLayout.currentPlayIndex);
                sb10.append(", cost:");
                sb10.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2);
                com.tencent.mars.xlog.Log.i(str4, sb10.toString());
                mMMvVideoLayout.A = android.os.SystemClock.elapsedRealtime();
                kk4.v vVar6 = mMMvVideoLayout.currentPlayer;
                if (vVar6 != null) {
                    vVar6.O();
                }
                com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout.d(mMMvVideoLayout, false, false, 2, null);
                com.tencent.mars.xlog.Log.i(mMMvVideoLayout.f174512d, "start play " + mMMvVideoLayout.c());
                jk4.e eVar = mMMvVideoLayout.reportInfo;
                eVar.getClass();
                eVar.f300151b = android.os.SystemClock.elapsedRealtime();
            }
        }
        return false;
    }
}
