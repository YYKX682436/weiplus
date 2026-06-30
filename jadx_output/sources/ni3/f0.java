package ni3;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337579d;

    public f0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337579d = finderStreamMonitorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView;
        java.lang.String sb6;
        java.lang.String sb7;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView2 = this.f337579d;
        boolean z17 = finderStreamMonitorView2.f149458g;
        pf5.u uVar = pf5.u.f353936a;
        if (z17) {
            finderStreamMonitorView2.getClass();
            com.tencent.mars.cdn.CdnManager.DownloadInfo recentDownloadInfo = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentDownloadInfo(0, 0, 5);
            long j17 = recentDownloadInfo.transforMS;
            float f17 = j17 > 0 ? ((((float) recentDownloadInfo.recvedBytes) * 1.0f) / 1024) / ((float) (j17 / 1000)) : 0.0f;
            com.tencent.mars.cdn.CdnManager.DownloadInfo recentDownloadInfo2 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentDownloadInfo(251, 20302, 5);
            long j18 = recentDownloadInfo2.transforMS;
            float f18 = j18 > 0 ? ((((float) recentDownloadInfo2.recvedBytes) * 1.0f) / 1024) / ((float) (j18 / 1000)) : 0.0f;
            androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) a17;
            int V6 = finderVideoRecycler.V6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.class);
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            Uj.getClass();
            long j19 = com.tencent.mm.sdk.platformtools.j8.f192789t;
            long e17 = Uj.e();
            long j27 = Uj.f313118d;
            int i17 = ek6.f464708y;
            int i18 = ek6.f464709z;
            int i19 = ek6.A;
            boolean z18 = ek6.B;
            int i27 = ek6.f464686c;
            int i28 = ek6.C;
            int i29 = ek6.f464687d;
            int i37 = ek6.F;
            int i38 = ek6.G;
            int i39 = ek6.H;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("微信:" + f17 + "KBps  ");
            stringBuffer.append("视频号:" + f18 + "KBps  ");
            stringBuffer.append("tp=" + V6 + " ?=" + (finderVideoRecycler.V6(null) - V6));
            stringBuffer.append("\n");
            stringBuffer.append("globalRx:" + com.tencent.mm.sdk.platformtools.t8.f0(j19) + "  ");
            stringBuffer.append("cdnRx:" + com.tencent.mm.sdk.platformtools.t8.f0(e17) + " gap:" + com.tencent.mm.sdk.platformtools.t8.f0(j19 - e17));
            stringBuffer.append("\n");
            stringBuffer.append("finderRx:" + com.tencent.mm.sdk.platformtools.t8.f0(j27) + " gap:" + com.tencent.mm.sdk.platformtools.t8.f0(e17 - j27) + "  ");
            stringBuffer.append("reportRx:" + com.tencent.mm.sdk.platformtools.t8.f0(j27) + " gap:" + com.tencent.mm.sdk.platformtools.t8.f0(j27 - j27) + "  ");
            stringBuffer.append("\n");
            stringBuffer.append("minBuffer:" + i17 + " maxBuffer:" + i18 + " minCurrentBuffer:" + i19 + " fileTimeMs:" + i28 + ' ');
            stringBuffer.append("\n");
            stringBuffer.append("preCreate:" + z18 + " nextCount:" + i27 + " minCurrentBuffer:" + i19 + " fileSizePercent:" + i29 + "  ");
            stringBuffer.append("\n");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("lsBuf:");
            sb8.append(i37);
            sb8.append(" lsSendBuf:");
            sb8.append(i38);
            sb8.append(" playerRecvBuf:");
            sb8.append(i39);
            sb8.append("  ");
            stringBuffer.append(sb8.toString());
            stringBuffer.append("\n");
            finderStreamMonitorView = finderStreamMonitorView2;
            ni3.p g17 = finderStreamMonitorView.g(finderStreamMonitorView.f149464p);
            if (g17.f337667b > 0) {
                long a18 = c01.id.a();
                long j28 = g17.f337667b;
                long j29 = a18 - j28;
                if (j28 < g17.f337668c) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("加载完成 耗时:");
                    sb9.append(g17.f337668c - g17.f337667b);
                    sb9.append(" itemSize:");
                    sb9.append(g17.f337669d);
                    sb9.append("  ");
                    sb9.append(finderStreamMonitorView.f149462n);
                    sb9.append('/');
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView.f149459h;
                    if (dataBuffer == null) {
                        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                        throw null;
                    }
                    sb9.append(dataBuffer.size());
                    sb9.append("  离上次：");
                    sb9.append(j29);
                    sb9.append("MS");
                    sb7 = sb9.toString();
                } else {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("加载中 ");
                    sb10.append(finderStreamMonitorView.f149462n);
                    sb10.append('/');
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = finderStreamMonitorView.f149459h;
                    if (dataBuffer2 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                        throw null;
                    }
                    sb10.append(dataBuffer2.size());
                    sb10.append(" 离上次：");
                    sb10.append(j29);
                    sb10.append("MS");
                    sb7 = sb10.toString();
                }
                stringBuffer.append("FinderStream:" + sb7);
            }
            sb6 = stringBuffer.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
        } else {
            finderStreamMonitorView = finderStreamMonitorView2;
            finderStreamMonitorView.getClass();
            int recentAverageSpeed = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2);
            yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            androidx.lifecycle.c1 a19 = uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) a19;
            int V62 = finderVideoRecycler2.V6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.class);
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, 3);
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(recentAverageSpeed);
            sb11.append("kb/s | ");
            sb11.append(ek7.f464685b);
            sb11.append(':');
            sb11.append(ek7.f464686c);
            sb11.append(':');
            sb11.append(ek7.f464689f);
            sb11.append(" | tp=");
            sb11.append(V62);
            sb11.append(" ?=");
            sb11.append(finderVideoRecycler2.V6(null) - V62);
            sb11.append(" | autoPage=");
            sb11.append(r17);
            sb11.append(':');
            sb11.append(finderStreamMonitorView.f149473y);
            sb11.append(':');
            sb11.append(finderStreamMonitorView.f149472x);
            sb11.append(finderStreamMonitorView.f149474z == 1 ? "..." : "");
            sb6 = sb11.toString();
        }
        pm0.v.X(new ni3.e0(finderStreamMonitorView, sb6));
    }
}
