package zl2;

/* loaded from: classes10.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.w4 f474017a = new zl2.w4();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f474018b;

    static {
        com.tencent.mars.xlog.Log.i("LiveLayoutInflater", "initMemoryTrim");
        ki.i.f308101c.c(new zl2.t4());
        f474018b = jz5.h.b(zl2.v4.f474005d);
    }

    public static final void a(zl2.w4 w4Var, java.lang.String str) {
        w4Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("LiveLayoutInflater", str + " lruDarkInflaterInfo cache Size:0,lruLightInflaterInfo cache Size:0!");
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveLayoutInflater-memoryTrim");
        }
    }

    public final android.view.View b(int i17, android.view.ViewGroup viewGroup, boolean z17, zl2.u4 mode, android.content.Context context, android.view.LayoutInflater layoutInflater) {
        android.view.View inflate;
        android.content.Context context2;
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(layoutInflater, "layoutInflater");
        try {
            jz5.g gVar = f474018b;
            if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
                int ordinal = mode.ordinal();
                if (ordinal == 0) {
                    context2 = context;
                } else if (ordinal == 1) {
                    android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
                    j65.m.c(configuration, true);
                    context2 = context.createConfigurationContext(configuration);
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    android.content.res.Configuration configuration2 = new android.content.res.Configuration(context.getResources().getConfiguration());
                    j65.m.c(configuration2, false);
                    context2 = context.createConfigurationContext(configuration2);
                }
                kotlin.jvm.internal.o.d(context2);
                c("inflate", context, context2);
                inflate = com.tencent.mm.ui.id.a(layoutInflater, context2).inflate(i17, viewGroup, z17);
            } else {
                com.tencent.mars.xlog.Log.i("LiveLayoutInflater", "inflate but enableChangeSkin:" + ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() + '!');
                inflate = layoutInflater.inflate(i17, viewGroup, z17);
            }
            kotlin.jvm.internal.o.d(inflate);
            return inflate;
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveLayoutInflater-inflate-" + mode);
            android.view.View inflate2 = layoutInflater.inflate(i17, viewGroup, z17);
            kotlin.jvm.internal.o.d(inflate2);
            return inflate2;
        }
    }

    public final void c(java.lang.String str, android.content.Context context, android.content.Context context2) {
        com.tencent.mars.xlog.Log.i("LiveLayoutInflater", str + " context:" + context + ",context resources:" + context.getResources() + ",context resources config:" + context.getResources().getConfiguration() + "\napplication context:" + com.tencent.mm.sdk.platformtools.x2.f193071a + ",app resources:" + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources() + ",app resources config:" + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration() + "\ncopyContext:" + context2 + ",copy resources:" + context2.getResources() + ",copy resources config:" + context2.getResources().getConfiguration() + '!');
    }
}
