package pn4;

/* loaded from: classes12.dex */
public final class p extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final y21.h f357165d = new y21.h(false, true, 1, null);

    static {
        new pn4.m(null);
    }

    public final java.lang.String N6() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null || context.getCacheDir() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextToSpeechHelper", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        java.lang.String str = gm0.j1.u().h() + "imSpeech";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechHelper", "path is not exists, mkdir path: %s", str);
        }
        return str;
    }

    public final void O6(java.lang.CharSequence text, long j17, pn4.n nVar, boolean z17, r45.jy3 scene, r45.iy3 language) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(language, "language");
        y21.h hVar = this.f357165d;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i(hVar.f459056b, "setNeedRequestAudioFocus: " + z17);
        x21.c cVar = hVar.f459060f;
        if (!z17) {
            f25.m0 m0Var = cVar.f451522k;
            if (m0Var != null) {
                i95.m c17 = i95.n0.c(f25.n0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((f25.n0) c17).yg(m0Var);
            }
            cVar.f451522k = null;
        }
        cVar.f451513b = z17;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        pn4.q0 q0Var = new pn4.q0(j17, text.toString(), N6(), gm0.j1.b().f273245h.f273145e);
        q0Var.l(scene, language);
        hVar.b(q0Var);
        hVar.f(!c01.d9.b().p().n(26, false));
        hVar.c(new pn4.o(text, f0Var, j17, nVar));
        hVar.d();
    }

    public final void P6() {
        y21.h hVar = this.f357165d;
        if (hVar != null) {
            if (hVar.a()) {
                y21.h.e(hVar, false, false, 3, null);
            }
            hVar.c(null);
        }
    }
}
