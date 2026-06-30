package com.tencent.wechat.aff.affroam;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_esFfkZCzKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215748a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215749b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215750c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215751d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215752e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215753f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215754g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215755h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215756i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215757j = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_JI(float f17) {
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onProgressEvent size: " + this.f215748a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f215748a.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            qo1.m mVar = (qo1.m) ((com.tencent.wechat.aff.affroam.u1) entry.getValue());
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] Received a progress event(" + (100 * f17) + "/100)");
            ku5.u0 u0Var = ku5.t0.f312615d;
            qo1.f0 f0Var = mVar.f365529a;
            ((ku5.t0) u0Var).h(new qo1.l(f17, f0Var), f0Var.n());
        }
    }

    private void ZIDL_KI(int i17) {
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onStateChangedEvent size: " + this.f215749b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f215749b.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onStateChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.affroam.x1 x1Var = (com.tencent.wechat.aff.affroam.x1) entry.getValue();
            com.tencent.wechat.aff.affroam.n0 a17 = com.tencent.wechat.aff.affroam.n0.a(i17);
            qo1.p pVar = (qo1.p) x1Var;
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] Received a state changed event. state=" + a17 + ", pkgId=" + pVar.f365539a.f365483i);
            qo1.f0 f0Var = pVar.f365539a;
            kotlin.jvm.internal.o.d(a17);
            if (f0Var.f365479e != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new qo1.w(f0Var, a17), "ROAM_TASK_REPORT_THREAD");
            }
            qo1.f0 f0Var2 = pVar.f365539a;
            if (f0Var2.f365476b != com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_RESTORE && a17 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED) {
                ((ku5.t0) ku5.t0.f312615d).r(new fo1.j(f0Var2.f365483i), "RoamBackup.MediaPullObserver");
            }
            if (a17 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED || a17 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED) {
                pVar.f365539a.f365478d = -1L;
            }
            if (a17 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING) {
                qo1.f0 f0Var3 = pVar.f365539a;
                f0Var3.f365481g = -1L;
                f0Var3.f365482h = false;
                if (!f0Var3.f365494t) {
                    f0Var3.q(0);
                }
            }
            po1.g a18 = po1.g.f357306d.a(pVar.f365539a.f365475a.f215832g.f215988d);
            if (a17 != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED || a18 == po1.g.f357310h) {
                if (a17 == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING) {
                    qo1.f0 f0Var4 = pVar.f365539a;
                    synchronized (f0Var4.f365484j) {
                        if (f0Var4.f365485k == a17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Target state is preparing state already.");
                        }
                    }
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                qo1.f0 f0Var5 = pVar.f365539a;
                ((ku5.t0) u0Var).h(new qo1.o(f0Var5, a17), f0Var5.n());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "Pause(disconnect) for the first time and try to resume the task. pkgId=" + pVar.f365539a.f365483i);
                ku5.u0 u0Var2 = ku5.t0.f312615d;
                qo1.f0 f0Var6 = pVar.f365539a;
                ((ku5.t0) u0Var2).h(new qo1.n(f0Var6), f0Var6.n());
            }
        }
    }

    private void ZIDL_LI(long j17, int i17, int i18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215750c;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onStateChangedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onStateChangedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_MI(byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onConversationCompletedEvent size: " + this.f215751d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f215751d.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onConversationCompletedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.affroam.r1 r1Var = (com.tencent.wechat.aff.affroam.r1) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            qo1.t tVar = (qo1.t) r1Var;
            tVar.f365548a.f365477c++;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "ConversationCompleted convId=" + str + ", convCount=" + tVar.f365548a.f365477c);
        }
    }

    private void ZIDL_NI(long j17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215752e;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onConversationCompletedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onConversationCompletedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_OI(int i17, byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onTaskCompletedEvent size: " + this.f215753f.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f215753f.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onTaskCompletedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.affroam.z1 z1Var = (com.tencent.wechat.aff.affroam.z1) entry.getValue();
            com.tencent.wechat.aff.affroam.z a17 = com.tencent.wechat.aff.affroam.z.a(i17);
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            qo1.s sVar = (qo1.s) z1Var;
            sVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] Received a task completed event. error=" + a17 + ", msg=" + str + ", pkgId=" + sVar.f365547a.f365483i);
            if (sVar.f365547a.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_RESTORE) {
                ((ku5.t0) ku5.t0.f312615d).h(qo1.q.f365541d, "endRecover");
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            qo1.f0 f0Var = sVar.f365547a;
            ((ku5.t0) u0Var).h(new qo1.r(f0Var, a17, str), f0Var.n());
        }
    }

    private void ZIDL_PI(boolean z17, boolean z18) {
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onDowngradeScheduledEvent size: " + this.f215754g.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f215754g.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onDowngradeScheduledEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            qo1.v vVar = (qo1.v) ((com.tencent.wechat.aff.affroam.t1) entry.getValue());
            vVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "[+] on downgrade scheduled event: is downgrade? " + z17 + " is stop? " + z18 + " pkgId " + vVar.f365554a.f365483i);
            if (z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseRoamTask", "[-] downgrade: on scheduled to STOP");
                vVar.f365554a.stop();
            }
            ((ku5.t0) ku5.t0.f312615d).g(new qo1.u(z18, z17));
        }
    }

    private void ZIDL_QI(long j17, boolean z17, boolean z18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215755h;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onDowngradeScheduledByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onDowngradeScheduledByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_SI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215756i;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onTransferStatsChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onTransferStatsChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_TI(long j17, float f17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215757j;
        com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onProgressAndTransferStatsChangedByPackageIdEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("RoamTaskKE", "onProgressAndTransferStatsChangedByPackageIdEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
