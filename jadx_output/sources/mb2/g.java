package mb2;

/* loaded from: classes5.dex */
public final class g extends mb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f325341e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f325342f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.Object obj, java.lang.String expname, yz5.a onConfigChanged) {
        super(obj, "SVR", onConfigChanged);
        kotlin.jvm.internal.o.g(expname, "expname");
        kotlin.jvm.internal.o.g(onConfigChanged, "onConfigChanged");
        this.f325341e = expname;
        this.f325342f = jz5.h.b(mb2.f.f325340d);
        try {
            a();
            this.f325343g = true;
        } catch (c01.c e17) {
            com.tencent.mars.xlog.Log.i("ConfigItem", "[updateValueFromSvr2] catch AccountNotReadyException, ".concat(jz5.a.b(e17)));
            this.f325343g = false;
        }
        com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor finderDynConfigMonitor = com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor.f102817d;
        java.lang.String key = this.f325341e;
        finderDynConfigMonitor.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor.f102818e;
        if (concurrentHashMap.containsKey(key)) {
            return;
        }
        concurrentHashMap.put(key, new java.lang.ref.WeakReference(this));
    }

    @Override // mb2.a, mb2.e
    public void a() {
        lm0.a s17 = gm0.j1.s(c25.e.class);
        java.lang.String str = this.f325341e;
        java.lang.Object obj = this.f325333a;
        if (s17 == null || ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b() == null) {
            this.f325336d = obj;
            com.tencent.mars.xlog.Log.i("ConfigItem", "[updateValueFromSvr2] keyName:" + str + ", has update to " + this.f325336d);
        } else {
            if (obj instanceof java.lang.Integer) {
                ip.j b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                obj = java.lang.Integer.valueOf(b17.b(str, ((java.lang.Integer) obj).intValue()));
            } else if (obj instanceof java.lang.Long) {
                ip.j b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                obj = (java.lang.Long) java.lang.Integer.valueOf(b18.b(str, ((java.lang.Integer) obj).intValue()));
            } else if (obj instanceof java.lang.String) {
                java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                obj = (java.lang.String) obj;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (d17 != null) {
                    obj = d17;
                }
            }
            this.f325336d = obj;
        }
        com.tencent.mars.xlog.Log.i("ConfigItem", "[updateValueFromSvr] keyName:" + str + ", has update to " + this.f325336d);
    }

    @Override // mb2.a
    public java.lang.Object c() {
        if (((java.lang.Number) this.f325342f.getValue()).intValue() == 1 || !this.f325343g) {
            a();
            this.f325343g = true;
        }
        java.lang.Object obj = this.f325336d;
        return obj == null ? this.f325333a : obj;
    }
}
