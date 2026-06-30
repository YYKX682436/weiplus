package cx;

/* loaded from: classes7.dex */
public abstract class w0 extends hq0.i0 {
    public final java.util.HashMap A;
    public yz5.a B;
    public boolean C;
    public final cx.p0 D;

    /* renamed from: x, reason: collision with root package name */
    public final ax.t f224479x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f224480y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.ref.WeakReference f224481z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ax.t flutterPlugin) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
        this.f224479x = flutterPlugin;
        this.f224480y = new java.util.concurrent.CopyOnWriteArrayList();
        this.A = new java.util.HashMap(2);
        flutterPlugin.f14959r = new java.lang.ref.WeakReference(this);
        ((ku5.t0) ku5.t0.f312615d).q(new cx.h0(this));
        this.D = new cx.p0(this);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f224481z;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new cx.o0(this);
    }

    @Override // hq0.i0
    public void G1(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        super.G1(key, value);
    }

    @Override // hq0.i0
    public void I1(com.tencent.mm.plugin.magicbrush.MBBuildConfig buildConfig) {
        kotlin.jvm.internal.o.g(buildConfig, "buildConfig");
        buildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        buildConfig.a(kz5.p1.d(new sp0.g(), new sp0.e(), new sp0.f()));
        super.I1(buildConfig);
    }

    public void J1(java.lang.String testJs, yz5.l lVar) {
        kotlin.jvm.internal.o.g(testJs, "testJs");
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrandBaseBiz", "hy: not permitted env to eval test js!!!");
            if (lVar != null) {
                lVar.invoke(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                return;
            }
            return;
        }
        jc3.j0 j0Var = this.f282995g;
        kotlin.jvm.internal.o.d(j0Var);
        synchronized (j0Var) {
            if (this.f282997i) {
                jc3.j0 j0Var2 = this.f282995g;
                if (j0Var2 != null) {
                    ((rc3.w0) j0Var2).l(testJs, lVar);
                }
            } else {
                this.f224480y.add(new cx.j0(testJs, lVar));
            }
        }
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hq0.e0 H0 = H0(this, context, O0(), "frames", "", true);
        ax.t tVar = this.f224479x;
        tVar.getClass();
        tVar.f242289e.put(H0.f282984e, H0);
        this.A.put("frames", H0);
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        this.f282998m.f283028a.clear();
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner processUIResumedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE;
        boolean isForeground = processUIResumedStateOwner.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", "onConnException foreground: " + isForeground + ", bizName:" + O0());
        super.b1();
        if (z65.c.a() && (weakReference = this.f224481z) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            pm0.v.X(new cx.t0(activity));
        }
        if (!isForeground) {
            cx.p0 p0Var = this.D;
            processUIResumedStateOwner.removeLifecycleCallback(p0Var);
            processUIResumedStateOwner.addLifecycleCallback(p0Var);
        } else {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandDisconnectWhenAttach", 1, O0(), 1.0f);
            yz5.a aVar = this.B;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // hq0.i0
    public void destroy() {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MagicBrandBaseBiz", "destroy", new java.lang.Object[0]);
        ax.t tVar = this.f224479x;
        tVar.getClass();
        d75.b.g(new dq0.v(tVar));
        java.util.HashMap hashMap = this.A;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            hq0.e0 e0Var = (hq0.e0) ((java.util.Map.Entry) it.next()).getValue();
            if (e0Var != null && (str = e0Var.f282984e) != null) {
                tVar.i(str);
            }
        }
        hashMap.clear();
        super.destroy();
        if (z65.c.a()) {
            this.f224480y.clear();
        }
    }

    @Override // hq0.i0
    public boolean g1() {
        java.lang.ref.WeakReference weakReference = this.f224481z;
        if (weakReference != null) {
            kotlin.jvm.internal.o.d(weakReference);
            if (weakReference.get() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        jc3.j0 j0Var;
        if (z65.c.a() && (j0Var = this.f282995g) != null) {
            kotlin.jvm.internal.o.d(j0Var);
            synchronized (j0Var) {
                for (cx.j0 j0Var2 : this.f224480y) {
                    jc3.j0 j0Var3 = this.f282995g;
                    kotlin.jvm.internal.o.d(j0Var3);
                    ((rc3.w0) j0Var3).l(j0Var2.f224419a, j0Var2.f224420b);
                }
            }
        }
        super.n();
    }

    @Override // hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        super.w1(root);
        java.util.concurrent.CopyOnWriteArrayList<hq0.f0> copyOnWriteArrayList = this.f282996h;
        if (!copyOnWriteArrayList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
            for (hq0.f0 f0Var : copyOnWriteArrayList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f0Var.f282989a);
                sb6.append('|');
                java.lang.String str = f0Var.f282990b;
                int length = str.length();
                if (length > 50) {
                    length = 50;
                }
                java.lang.String substring = str.substring(0, length);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb6.append(substring);
                arrayList.add(sb6.toString());
            }
            java.util.List S0 = kz5.n0.S0(arrayList);
            mq0.d1 d1Var = mq0.d1.f330546a;
            java.lang.String bizName = O0();
            kotlin.jvm.internal.o.g(bizName, "bizName");
            cl0.e eVar = new cl0.e();
            java.util.Iterator it = S0.iterator();
            while (it.hasNext()) {
                eVar.q((java.lang.String) it.next());
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bizName", bizName);
            jSONObject.put("event", S0);
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            je3.i.x2((je3.i) c17, "MagicBrandNotSendPendingEvents", 0, r26.i0.u(jSONObject2, ',', ';', false, 4, null), 0.0f, 8, null);
        }
    }
}
