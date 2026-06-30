package jh4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f299851b;

    /* renamed from: a, reason: collision with root package name */
    public static final jh4.d f299850a = new jh4.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f299852c = kz5.c0.i("scene_shaderf.glsl", "scene_shaderv.glsl", "frag_framebuffer_plane.glsl", "vertex_framebuffer_plane.glsl", "texture_vertex_shader.glsl", "texture_fragment_shader.glsl", "bg_gradient_vertex_shader.glsl", "bg_gradient_fragment_shader.glsl");

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        mq.h.f330511a = jh4.f.f299857a;
        if (b(context)) {
            f299851b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundManager", "all exist, return");
            return;
        }
        mq.e eVar = mq.e.f330510a;
        java.io.File file = new java.io.File(eVar.b(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        eVar.a(context, "scene_shaderf.glsl", eVar.b(context) + "scene_shaderf.glsl");
        eVar.a(context, "scene_shaderv.glsl", eVar.b(context) + "scene_shaderv.glsl");
        eVar.a(context, "frag_framebuffer_plane.glsl", eVar.b(context) + "frag_framebuffer_plane.glsl");
        eVar.a(context, "vertex_framebuffer_plane.glsl", eVar.b(context) + "vertex_framebuffer_plane.glsl");
        eVar.a(context, "texture_vertex_shader.glsl", eVar.b(context) + "texture_vertex_shader.glsl");
        eVar.a(context, "texture_fragment_shader.glsl", eVar.b(context) + "texture_fragment_shader.glsl");
        eVar.a(context, "bg_gradient_vertex_shader.glsl", eVar.b(context) + "bg_gradient_vertex_shader.glsl");
        eVar.a(context, "bg_gradient_fragment_shader.glsl", eVar.b(context) + "bg_gradient_fragment_shader.glsl");
        f299851b = b(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundManager", "init done, ready[" + f299851b + ']');
    }

    public final boolean b(android.content.Context context) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String parent = context.getFilesDir().getParent();
        if (parent == null || (str = parent.concat("/")) == null) {
            str = "";
        }
        java.lang.String concat = str.concat("appbrand/glsl/");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(concat);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundManager", "dir not exist");
            return false;
        }
        for (java.lang.String str3 : f299852c) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(concat + str3);
            java.lang.String str4 = a18.f213279f;
            if (str4 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBackgroundManager", str3 + " not exist");
                return false;
            }
        }
        return true;
    }
}
