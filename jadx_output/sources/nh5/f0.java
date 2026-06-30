package nh5;

/* loaded from: classes12.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f337140d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference f337141e;

    public f0(com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference matrixSettingHeaderPreference) {
        this.f337141e = matrixSettingHeaderPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f337140d;
        if (j17 > currentTimeMillis || currentTimeMillis - j17 > 300) {
            this.f337140d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f337140d = currentTimeMillis;
        android.content.Context context = view.getContext();
        final java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("[ver  ] ");
        sb6.append(java.lang.String.format(java.util.Locale.ENGLISH, "%s %08X", com.tencent.mm.sdk.platformtools.a0.b(context, o45.wf.f343029g, true), java.lang.Integer.valueOf(o45.wf.f343029g)));
        sb6.append("\n");
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i17 = 0;
        objArr[0] = com.tencent.mm.sdk.platformtools.z.f193115k ? "arm64-v8a" : "armeabi-v7a";
        sb6.append(java.lang.String.format("[eabi ] %s\n", objArr));
        tp3.a aVar = tp3.a.INSTANCE;
        com.tencent.mm.plugin.performance.diagnostic.d dVar = (com.tencent.mm.plugin.performance.diagnostic.d) aVar.a(vp3.c.class);
        if (dVar != null && dVar.h().e()) {
            i17 = 1;
        }
        com.tencent.mm.plugin.performance.diagnostic.d dVar2 = (com.tencent.mm.plugin.performance.diagnostic.d) aVar.a(wp3.b.class);
        if (dVar2 != null && dVar2.h().e()) {
            i17 |= 2;
        }
        sb6.append("[diag ] ");
        sb6.append(i17);
        sb6.append("\n");
        ph.a.b(rh.w.class, new wh.t0() { // from class: nh5.f0$$a
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                rh.w wVar = (rh.w) obj;
                nh5.f0 f0Var = nh5.f0.this;
                f0Var.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(android.os.Process.myPid()));
                com.tencent.mm.ui.matrix.MatrixSettingHeaderPreference matrixSettingHeaderPreference = f0Var.f337141e;
                android.app.ActivityManager activityManager = (android.app.ActivityManager) matrixSettingHeaderPreference.f197770d.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                if (activityManager != null) {
                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.processName.contains(matrixSettingHeaderPreference.f197770d.getPackageName()) && !sb7.toString().contains(java.lang.String.valueOf(runningAppProcessInfo.pid))) {
                            sb7.append("|");
                            sb7.append(runningAppProcessInfo.pid);
                        }
                    }
                }
                java.lang.StringBuilder sb8 = sb6;
                sb8.append("[bat.pids  ] ");
                sb8.append((java.lang.CharSequence) sb7);
                sb8.append("\n");
                rh.v k17 = wVar.k(0L);
                sb8.append("[bat.dice  ] ");
                sb8.append(mm.o.c() ? 1 : 0);
                sb8.append("\n");
                sb8.append("[bat.uptime] ");
                sb8.append(k17.f395518d.f395552a);
                sb8.append("\n");
                sb8.append("[bat.fg    ] ");
                sb8.append(k17.f395519e.f395552a);
                sb8.append("\n");
                sb8.append("[bat.bg    ] ");
                sb8.append(k17.f395520f.f395552a);
                sb8.append("\n");
                sb8.append("[bat.fgSrv ] ");
                sb8.append(k17.f395521g.f395552a);
                sb8.append("\n");
                java.util.List list = wVar.l(0L).f445803b;
                int i18 = 0;
                java.util.List subList = list.subList(0, java.lang.Math.min(list.size(), 3));
                while (i18 < subList.size()) {
                    wh.h2 h2Var = (wh.h2) subList.get(i18);
                    sb8.append("[bat.uiTop");
                    i18++;
                    sb8.append(i18);
                    sb8.append("] ");
                    sb8.append(h2Var.f445796a);
                    sb8.append("/");
                    sb8.append(h2Var.f445797b);
                    sb8.append("\n");
                }
            }
        });
        ph.a.b(rh.d2.class, new wh.t0() { // from class: nh5.f0$$b
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                rh.a2 m17 = ((rh.d2) obj).m(0L);
                java.lang.StringBuilder sb7 = sb6;
                sb7.append("[bat.charge] ");
                sb7.append(m17.f395300e.f395552a);
                sb7.append("\n");
                sb7.append("[bat.dim   ] ");
                sb7.append(m17.f395302g.f395552a);
                sb7.append("\n");
            }
        });
        ph.a.b(uh.h.class, new wh.t0() { // from class: nh5.f0$$c
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                uh.g k17 = ((uh.h) obj).k();
                final java.lang.StringBuilder sb7 = sb6;
                sb7.append("\n");
                nh5.f0$$d f0__d = new nh5.f0$$d();
                ((com.tencent.mm.feature.performance.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
                long Ri = ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
                if (Ri > 0) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.getDefault());
                    java.util.Date date = new java.util.Date(Ri);
                    sb7.append("[bat.chargeLast] ");
                    sb7.append(simpleDateFormat.format(date));
                    sb7.append("\n");
                    sb7.append("[bat.chargeLast] ");
                    sb7.append((java.lang.String) f0__d.apply(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - Ri)));
                    sb7.append(" ago\n");
                }
                ph.a.b(rh.k1.class, new wh.t0() { // from class: nh5.f0$$e
                    @Override // wh.t0
                    public final void accept(java.lang.Object obj2) {
                        wh.n1 n1Var = ((rh.k1) obj2).f395435k;
                        java.lang.StringBuilder sb8 = sb7;
                        sb8.append("[power.prof] ");
                        sb8.append(n1Var != null && n1Var.l());
                        sb8.append("\n");
                        sb8.append("[power.type] ");
                        sb8.append(wh.n1.f445841f);
                        sb8.append("\n");
                    }
                });
                sb7.append("");
                sb7.append("[power.cpu] ");
                sb7.append(k17.f427683g.f395552a);
                sb7.append("\n");
                sb7.append("[power.wakelocks] ");
                sb7.append(k17.f427685h.f395552a);
                sb7.append("\n");
                sb7.append("[power.mobile] ");
                sb7.append(k17.f427687i.f395552a);
                sb7.append("\n");
                sb7.append("[power.wifi] ");
                sb7.append(k17.f427689j.f395552a);
                sb7.append("\n");
                sb7.append("[power.blueTooth] ");
                sb7.append(k17.f427691k.f395552a);
                sb7.append("\n");
                sb7.append("[power.gps] ");
                sb7.append(k17.f427693l.f395552a);
                sb7.append("\n");
                sb7.append("[power.sensors] ");
                sb7.append(k17.f427695m.f395552a);
                sb7.append("\n");
                sb7.append("[power.camera] ");
                sb7.append(k17.f427697n.f395552a);
                sb7.append("\n");
                sb7.append("[power.flashLight] ");
                sb7.append(k17.f427699o.f395552a);
                sb7.append("\n");
                sb7.append("[power.audio] ");
                sb7.append(k17.f427701p.f395552a);
                sb7.append("\n");
                sb7.append("[power.video] ");
                sb7.append(k17.f427703q.f395552a);
                sb7.append("\n");
                sb7.append("[power.screen] ");
                sb7.append(k17.f427705r.f395552a);
                sb7.append("\n");
                sb7.append("[power.systemService] ");
                sb7.append(k17.f427707s.f395552a);
                sb7.append("\n");
                sb7.append("[power.idle] ");
                sb7.append(k17.f427709t.f395552a);
                sb7.append("\n");
                sb7.append("[power.total] ");
                sb7.append(k17.d());
                sb7.append("\n");
                sb7.append("");
                sb7.append("\n");
                sb7.append("[cpuPowerMams] ");
                sb7.append(k17.f427711u.f395552a);
                sb7.append("\n");
                sb7.append("[cpuUsrTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427713v.f395552a));
                sb7.append("\n");
                sb7.append("[cpuSysTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427715w.f395552a));
                sb7.append("\n");
                sb7.append("[realTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427717x.f395552a));
                sb7.append("\n");
                sb7.append("[upTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427719y.f395552a));
                sb7.append("\n");
                sb7.append("[offRealTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427721z.f395552a));
                sb7.append("\n");
                sb7.append("[offUpTimeMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.A.f395552a));
                sb7.append("\n");
                sb7.append("[mobilePowerMams] ");
                sb7.append(k17.B.f395552a);
                sb7.append("\n");
                sb7.append("[mobileRadioActiveMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.C.f395552a));
                sb7.append("\n");
                sb7.append("[mobileIdleMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.D.f395552a));
                sb7.append("\n");
                sb7.append("[mobileRxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.E.f395552a));
                sb7.append("\n");
                sb7.append("[mobileTxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.F.f395552a));
                sb7.append("\n");
                sb7.append("[mobileRxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.G.f395552a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[mobileTxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.H.f395552a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[mobileRxPackets] ");
                sb7.append(k17.I.f395552a);
                sb7.append("\n");
                sb7.append("[mobileTxPackets] ");
                sb7.append(k17.f427673J.f395552a);
                sb7.append("\n");
                sb7.append("[wifiPowerMams] ");
                sb7.append(k17.K.f395552a);
                sb7.append("\n");
                sb7.append("[wifiIdleMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.L.f395552a));
                sb7.append("\n");
                sb7.append("[wifiRxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.M.f395552a));
                sb7.append("\n");
                sb7.append("[wifiTxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.N.f395552a));
                sb7.append("\n");
                sb7.append("[wifiRunningMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.O.f395552a));
                sb7.append("\n");
                sb7.append("[wifiLockMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.P.f395552a));
                sb7.append("\n");
                sb7.append("[wifiScanMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.Q.f395552a));
                sb7.append("\n");
                sb7.append("[wifiMulticastMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.R.f395552a));
                sb7.append("\n");
                sb7.append("[wifiRxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.S.f395552a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[wifiTxBytes] ");
                sb7.append(java.lang.Long.valueOf(((java.lang.Long) k17.T.f395552a).longValue() / 1000000));
                sb7.append("\n");
                sb7.append("[wifiRxPackets] ");
                sb7.append(k17.U.f395552a);
                sb7.append("\n");
                sb7.append("[wifiTxPackets] ");
                sb7.append(k17.V.f395552a);
                sb7.append("\n");
                sb7.append("[blueToothPowerMams] ");
                sb7.append(k17.W.f395552a);
                sb7.append("\n");
                sb7.append("[blueToothIdleMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.X.f395552a));
                sb7.append("\n");
                sb7.append("[blueToothRxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.Y.f395552a));
                sb7.append("\n");
                sb7.append("[blueToothTxMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.Z.f395552a));
                sb7.append("\n");
                sb7.append("[wakelocksPartialMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427674a0.f395552a));
                sb7.append("\n");
                sb7.append("[wakelocksFullMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427675b0.f395552a));
                sb7.append("\n");
                sb7.append("[wakelocksWindowMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427676c0.f395552a));
                sb7.append("\n");
                sb7.append("[wakelocksDrawMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427678d0.f395552a));
                sb7.append("\n");
                sb7.append("[wakelocksPidSum] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427680e0.f395552a));
                sb7.append("\n");
                sb7.append("[gpsMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427682f0.f395552a));
                sb7.append("\n");
                sb7.append("[sensorsPowerMams] ");
                sb7.append(k17.f427684g0.f395552a);
                sb7.append("\n");
                sb7.append("[cameraMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427686h0.f395552a));
                sb7.append("\n");
                sb7.append("[flashLightMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427688i0.f395552a));
                sb7.append("\n");
                sb7.append("[audioMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427690j0.f395552a));
                sb7.append("\n");
                sb7.append("[videoMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427692k0.f395552a));
                sb7.append("\n");
                sb7.append("[jobsMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427694l0.f395552a));
                sb7.append("\n");
                sb7.append("[syncMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427696m0.f395552a));
                sb7.append("\n");
                sb7.append("[fgActMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427698n0.f395552a));
                sb7.append("\n");
                sb7.append("[procTopAppMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427700o0.f395552a));
                sb7.append("\n");
                sb7.append("[procTopSleepMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427702p0.f395552a));
                sb7.append("\n");
                sb7.append("[procFgMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427704q0.f395552a));
                sb7.append("\n");
                sb7.append("[procFgSrvMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427706r0.f395552a));
                sb7.append("\n");
                sb7.append("[procBgMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427708s0.f395552a));
                sb7.append("\n");
                sb7.append("[procCacheMs] ");
                sb7.append((java.lang.String) f0__d.apply((java.lang.Long) k17.f427710t0.f395552a));
                sb7.append("\n");
                sb7.append("");
            }
        });
        java.lang.String Bi = ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Bi();
        if (android.text.TextUtils.isEmpty(Bi)) {
            Bi = "";
        }
        sb6.append(Bi);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        textView.setTextColor(this.f337141e.f197770d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setVerticalScrollBarEnabled(true);
        textView.setVerticalFadingEdgeEnabled(true);
        db5.e1.q(context, null, textView, null);
        yj0.a.h(this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
