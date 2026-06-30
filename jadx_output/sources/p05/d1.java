package p05;

/* loaded from: classes3.dex */
public final class d1 implements p05.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p05.z0 f350479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350480b;

    /* renamed from: c, reason: collision with root package name */
    public rh0.d0 f350481c;

    /* renamed from: d, reason: collision with root package name */
    public long f350482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f350483e;

    /* renamed from: f, reason: collision with root package name */
    public p05.r0 f350484f;

    /* renamed from: g, reason: collision with root package name */
    public final p05.c1 f350485g;

    public d1(p05.z0 weVisionJsonCallbackBucket) {
        kotlin.jvm.internal.o.g(weVisionJsonCallbackBucket, "weVisionJsonCallbackBucket");
        this.f350479a = weVisionJsonCallbackBucket;
        this.f350483e = new java.util.ArrayList();
        this.f350485g = new p05.c1(this);
    }

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f350480b && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350482d) {
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "Cannot attach twice!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        sb6.append(tq5.i.f421269a);
        com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", sb6.toString());
        rh0.d0 d0Var2 = this.f350481c;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350481c = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        p05.c1 c17 = this.f350485g;
        p05.z0 z0Var = this.f350479a;
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#destroy");
            z0Var.getClass();
            kotlin.jvm.internal.o.g(c17, "c");
            z0Var.f350739a.remove(c17);
            this.f350484f = null;
            this.f350482d = 0L;
            this.f350480b = false;
            return;
        }
        long j17 = ((p05.l4) d0Var).f350593f;
        this.f350482d = j17;
        if (j17 == 0) {
            return;
        }
        z0Var.getClass();
        kotlin.jvm.internal.o.g(c17, "c");
        z0Var.f350739a.add(c17);
        this.f350480b = true;
    }

    public void c(java.lang.String path, p05.r0 r0Var) {
        com.tencent.mm.vfs.x1 x1Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(path, "path");
        if (!this.f350480b) {
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "This effect is not attached!");
        }
        if (this.f350480b) {
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#change path=".concat(path));
            java.util.ArrayList arrayList = this.f350483e;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p05.a1 a1Var = (p05.a1) it.next();
                rh0.d0 d0Var = this.f350481c;
                if (d0Var != null) {
                    ((p05.l4) d0Var).t(a1Var.f350436a);
                }
                rh0.d0 d0Var2 = this.f350481c;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).z(a1Var.f350436a, null);
                }
            }
            arrayList.clear();
            if (path.length() == 0) {
                return;
            }
            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(path, false);
            if (s17 != null) {
                java.util.Iterator it6 = s17.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    com.tencent.mm.vfs.x1 x1Var2 = (com.tencent.mm.vfs.x1) obj;
                    if (x1Var2.f213236f && kotlin.jvm.internal.o.b(x1Var2.f213232b, "Lua")) {
                        break;
                    }
                }
                x1Var = (com.tencent.mm.vfs.x1) obj;
            } else {
                x1Var = null;
            }
            if (x1Var != null) {
                com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#change new way");
                rh0.d0 d0Var3 = this.f350481c;
                java.lang.Long valueOf = d0Var3 != null ? java.lang.Long.valueOf(((p05.l4) d0Var3).d(path.concat("/Lua"))) : null;
                if (valueOf != null) {
                    this.f350484f = r0Var;
                    arrayList.add(new p05.a1(valueOf.longValue(), path.concat("/Lua")));
                }
                com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#change ptr=" + valueOf);
                return;
            }
            com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#change old way");
            long[] nAddEffectMaterialsFolder = com.tencent.mm.xeffect.WeEffectRender.nAddEffectMaterialsFolder(this.f350482d, path);
            if (nAddEffectMaterialsFolder != null) {
                for (long j17 : nAddEffectMaterialsFolder) {
                    com.tencent.mars.xlog.Log.i("InteractiveGiftEffect", "#change ptr=" + j17);
                    if (j17 > 0) {
                        this.f350484f = r0Var;
                        arrayList.add(new p05.a1(j17, path));
                        rh0.d0 d0Var4 = this.f350481c;
                        if (d0Var4 != null) {
                            ((p05.l4) d0Var4).z(j17, new p05.b1(this));
                        }
                    }
                }
            }
        }
    }
}
