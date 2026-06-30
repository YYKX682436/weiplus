package pc3;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f353382a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f353383b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f353384c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.magicbrush.n4 f353385d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f353386e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f353387f;

    /* renamed from: g, reason: collision with root package name */
    public final pc3.l f353388g;

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f353382a = context;
        this.f353383b = new java.util.HashMap();
        this.f353387f = jz5.h.b(pc3.f.f353376d);
        this.f353388g = new pc3.l(this);
    }

    public static final void a(pc3.m mVar, boolean z17) {
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onServerMgrLost " + z17);
        if (z17 || mVar.f353385d != null) {
            mVar.f353385d = null;
            mVar.f353386e = null;
            mVar.f353384c = 0L;
            com.tencent.mm.plugin.magicbrush.a5.f147838c = false;
            try {
                mVar.f353382a.unbindService(mVar.f353388g);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MagicBrushClientMgr", "unbind error: " + e17);
            }
        }
    }

    public final synchronized void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start bind service?");
        sb6.append(this.f353384c == 0);
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f353384c;
        if (this.f353384c == 0 || currentTimeMillis < 0 || currentTimeMillis > 300000) {
            this.f353384c = java.lang.System.currentTimeMillis();
            jz5.l lVar = !bf3.w0.f19672a.a(bf3.v0.f19670d) ? new jz5.l(com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase.class, com.tencent.mm.sdk.platformtools.w9.f193059g) : new jz5.l(com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextMainProcess.class, com.tencent.mm.sdk.platformtools.w9.f193053a);
            java.lang.Class cls = (java.lang.Class) lVar.f302833d;
            java.lang.String str = (java.lang.String) lVar.f302834e;
            this.f353382a.bindService(new android.content.Intent(this.f353382a, (java.lang.Class<?>) cls), this.f353388g, 65);
            com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
            com.tencent.mm.plugin.magicbrush.a5.f147843h = str;
        }
    }
}
