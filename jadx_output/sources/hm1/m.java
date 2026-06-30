package hm1;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f282204b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f282205c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f282206d;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f282213k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f282214l;

    /* renamed from: a, reason: collision with root package name */
    public static final hm1.m f282203a = new hm1.m();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f282207e = jz5.h.b(hm1.g.f282197d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f282208f = jz5.h.b(hm1.j.f282200d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f282209g = jz5.h.b(hm1.f.f282196d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f282210h = jz5.h.b(hm1.i.f282199d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f282211i = jz5.h.b(hm1.e.f282195d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f282212j = jz5.h.b(hm1.h.f282198d);

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f282215m = true;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f282216n = jz5.h.b(hm1.l.f282202d);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f282217o = jz5.h.b(hm1.k.f282201d);

    public static final boolean d() {
        java.lang.Boolean bool = f282206d;
        if (bool != null) {
            kotlin.jvm.internal.o.d(bool);
            return bool.booleanValue();
        }
        boolean m17 = com.tencent.xweb.a3.m();
        boolean y07 = com.tencent.xweb.WebView.y0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebMap: " + m17 + ", " + y07);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m17 && y07);
        f282206d = valueOf;
        kotlin.jvm.internal.o.d(valueOf);
        return valueOf.booleanValue();
    }

    public static final boolean e() {
        java.lang.Boolean bool = f282214l;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z17 = false;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wxa_use_xweb_voip, 0) == 1;
        boolean m17 = com.tencent.xweb.a3.m();
        boolean y07 = com.tencent.xweb.WebView.y0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebVoipRoom: " + z18 + ", " + m17 + ", " + y07);
        if (z18 && m17 && y07) {
            z17 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        f282214l = valueOf;
        kotlin.jvm.internal.o.d(valueOf);
        return valueOf.booleanValue();
    }

    public static final boolean f() {
        java.lang.Boolean bool = f282213k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z17 = false;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wxa_use_xweb_webgl_canvas, 0) == 1;
        boolean m17 = com.tencent.xweb.a3.m();
        boolean y07 = com.tencent.xweb.WebView.y0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebWebGLCanvas: " + z18 + ", " + m17 + ", " + y07);
        if (z18 && m17 && y07) {
            z17 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        f282213k = valueOf;
        kotlin.jvm.internal.o.d(valueOf);
        return valueOf.booleanValue();
    }

    public static final boolean g() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.Boolean bool = f282205c;
        if (bool != null) {
            kotlin.jvm.internal.o.d(bool);
            return bool.booleanValue();
        }
        f282205c = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wxa_canvas_to_temp_file_path_use_new, 0) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useNewXWebCanvasToTFP:" + f282205c);
        java.lang.Boolean bool2 = f282205c;
        kotlin.jvm.internal.o.d(bool2);
        return bool2.booleanValue();
    }

    public static final boolean h() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.Boolean bool = f282204b;
        if (bool != null) {
            kotlin.jvm.internal.o.d(bool);
            return bool.booleanValue();
        }
        f282204b = java.lang.Boolean.TRUE;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "useXWebCanvasRaf:" + f282204b);
        java.lang.Boolean bool2 = f282204b;
        kotlin.jvm.internal.o.d(bool2);
        return bool2.booleanValue();
    }

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f282211i).getValue()).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f282209g).getValue()).booleanValue();
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f282207e).getValue()).booleanValue();
    }
}
