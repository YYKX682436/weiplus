package sc3;

/* loaded from: classes7.dex */
public final class q1 extends sc3.k1 {
    public final java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public je3.o f406523l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f406524p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashMap f406525x0;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.Set f406526y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.content.Context context, java.lang.String serviceName, com.tencent.magicbrush.biz.MBBizManager bizManager) {
        super(context, serviceName, bizManager, null, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        kotlin.jvm.internal.o.g(bizManager, "bizManager");
        this.Z = serviceName;
        this.f406525x0 = new java.util.HashMap();
        this.f406526y0 = new java.util.LinkedHashSet();
    }

    public final void A1() {
        java.util.HashMap hashMap = this.f406525x0;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            kz5.q qVar = (kz5.q) entry.getValue();
            x1(str);
            java.util.Iterator it = qVar.iterator();
            while (it.hasNext()) {
                M0().post(new sc3.p1(this, str, (java.lang.String) it.next()));
            }
        }
        hashMap.clear();
    }

    public final void B1() {
        java.util.Set set = this.f406526y0;
        boolean z17 = true;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((sc3.l1) it.next()).f406498b) {
                    z17 = false;
                    break;
                }
            }
        }
        java.lang.String str = this.Q;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "all paused! public service will trigger pause!");
            z3();
        } else {
            com.tencent.mars.xlog.Log.i(str, "resume public service");
            uc();
        }
    }

    @Override // sc3.k1, qc3.f
    public void Oc(int i17) {
        je3.o oVar = this.f406523l1;
        if (oVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            oVar.f299313i = android.os.SystemClock.elapsedRealtime();
        }
        super.Oc(i17);
    }

    @Override // sc3.k1
    public void Y0() {
        super.Y0();
        je3.o oVar = this.f406523l1;
        if (oVar != null) {
            oVar.c();
        }
        synchronized (this) {
            this.f406524p0 = true;
            A1();
        }
    }

    @Override // sc3.k1
    public void onCreated() {
        super.onCreated();
        je3.o oVar = this.f406523l1;
        if (oVar != null) {
            oVar.b();
        }
        je3.o oVar2 = this.f406523l1;
        if (oVar2 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            oVar2.f299311g = android.os.SystemClock.elapsedRealtime();
        }
        D1();
    }

    @Override // sc3.k1
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        je3.o oVar = this.f406523l1;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // sc3.k1, qc3.f
    public void setMute(boolean z17) {
    }

    @Override // sc3.k1
    public boolean t1(int i17) {
        return true;
    }

    public final synchronized void w1(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        this.f406526y0.add(new sc3.l1(from, false));
        B1();
        if (this.f406524p0) {
            x1(from);
        } else {
            this.f406525x0.put(from, new kz5.q());
        }
    }

    @Override // sc3.k1, qc3.f
    public void w3(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        if (config.f147832v) {
            je3.o oVar = new je3.o(this.Z, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null);
            java.lang.String str = oVar.f299306b;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            config.f147819f = str;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            oVar.f299309e = android.os.SystemClock.elapsedRealtime();
            this.f406523l1 = oVar;
        }
        super.w3(config);
    }

    public final void x1(java.lang.String instanceName) {
        java.lang.String str = this.Z;
        java.lang.String str2 = this.Q;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        r26.n0.s0(instanceName, "-", instanceName);
        try {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            jc3.x T9 = com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, str, null, 2, null);
            if (T9 instanceof lc3.q) {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "Failed to check supportsDynamicBiz: " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.w(str2, "Public service '" + str + "' does not support dynamic biz connection, skip permission registration");
        com.tencent.mars.xlog.Log.i(str2, "biz connect by ".concat(instanceName));
        M0().post(new sc3.m1(this, instanceName));
    }

    public final synchronized void y1(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        pm0.v.c0(this.f406526y0, new sc3.n1(from));
        if (this.f406524p0) {
            com.tencent.mars.xlog.Log.i(this.Q, "biz disconnect by ".concat(from));
            M0().post(new sc3.o1(this, from));
        }
        this.f406525x0.remove(from);
        B1();
    }
}
