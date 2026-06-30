package lc4;

/* loaded from: classes4.dex */
public final class d0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mvvmlist.MvvmList f317955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f317956e;

    /* renamed from: f, reason: collision with root package name */
    public int f317957f;

    /* renamed from: g, reason: collision with root package name */
    public long f317958g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f317959h;

    public d0(com.tencent.mm.plugin.mvvmlist.MvvmList liveList) {
        kotlin.jvm.internal.o.g(liveList, "liveList");
        this.f317955d = liveList;
        this.f317956e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_unread_jump_preload_max_count_android, 3);
        this.f317958g = -1L;
        this.f317959h = new java.util.ArrayList();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doNetPreload", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadLoader", "preload retryCount:" + this.f317957f + " snsid:" + ca4.z0.t0(this.f317958g));
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.h3(this.f317958g, 0L, 2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNetPreload", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
    }

    public final java.util.ArrayList b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        java.util.ArrayList arrayList = this.f317959h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.ArrayList r8) {
        /*
            r7 = this;
            java.lang.String r0 = "preload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "feedList"
            kotlin.jvm.internal.o.g(r8, r0)
            java.util.ArrayList r0 = r7.f317959h
            r0.clear()
            java.util.Iterator r0 = r8.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class<zc4.h> r2 = zc4.h.class
            byte[] r3 = jm0.k.f300270i
            monitor-enter(r3)
            gm0.m r4 = gm0.j1.b()     // Catch: java.lang.Throwable -> L79
            r4.c()     // Catch: java.lang.Throwable -> L79
            java.lang.Class<jm0.k> r4 = jm0.k.class
            boolean r4 = r4.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L71
            androidx.lifecycle.j1 r4 = new androidx.lifecycle.j1     // Catch: java.lang.Throwable -> L79
            gm0.m r5 = gm0.j1.b()     // Catch: java.lang.Throwable -> L79
            gm0.b r5 = r5.f273245h     // Catch: java.lang.Throwable -> L79
            jm0.h r6 = new jm0.h     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L79
            androidx.lifecycle.c1 r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)
            zc4.h r2 = (zc4.h) r2
            java.lang.Class<zc4.g> r3 = zc4.g.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r2 = r2.P6(r3)
            zc4.g r2 = (zc4.g) r2
            long r3 = ca4.z0.F0(r1)
            xc4.p r1 = r2.Y6(r3)
            if (r1 != 0) goto L65
            java.util.ArrayList r0 = r7.f317959h
            r0.clear()
            goto L7c
        L65:
            java.util.ArrayList r2 = r7.f317959h
            zc4.b r3 = new zc4.b
            r4 = 1
            r3.<init>(r1, r4)
            r2.add(r3)
            goto L16
        L71:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "getLiveDB modelClass must extends BaseMvvmDB"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L79:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L7c:
            java.lang.Object r8 = kz5.n0.X(r8)
            java.lang.String r8 = (java.lang.String) r8
            long r0 = ca4.z0.F0(r8)
            r2 = 1
            long r0 = r0 + r2
            r7.f317958g = r0
            r7.a()
            java.lang.String r8 = "preload"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc4.d0.c(java.util.ArrayList):void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        if (m1Var instanceof com.tencent.mm.plugin.sns.model.h3) {
            com.tencent.mm.plugin.sns.model.h3 h3Var = (com.tencent.mm.plugin.sns.model.h3) m1Var;
            h3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            boolean z17 = h3Var.f164233t == 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            if (z17) {
                r45.ua6 I = h3Var.I();
                int size = I.f387170f.size();
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadLoader", "errType:" + i17 + ", errCode:" + i18 + " size:" + size);
                java.util.LinkedList ObjectList = I.f387170f;
                kotlin.jvm.internal.o.f(ObjectList, "ObjectList");
                if (!ObjectList.isEmpty()) {
                    ((ku5.t0) ku5.t0.f312615d).a(new lc4.c0(this, size, I));
                } else {
                    int i19 = this.f317957f;
                    if (i19 > this.f317956e) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadLoader", "drop preload unread fault, too many times!!");
                    } else {
                        this.f317957f = i19 + 1;
                        a();
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
    }
}
