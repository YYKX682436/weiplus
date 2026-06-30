package s22;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f402289a;

    /* renamed from: b, reason: collision with root package name */
    public int f402290b;

    /* renamed from: c, reason: collision with root package name */
    public int f402291c;

    /* renamed from: d, reason: collision with root package name */
    public int f402292d;

    /* renamed from: e, reason: collision with root package name */
    public p05.l4 f402293e;

    /* renamed from: f, reason: collision with root package name */
    public int f402294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f402295g = com.tencent.mm.sdk.platformtools.o4.M("xlab_effect_config").getBoolean("effect", true);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f402296h;

    public final void a(t85.j jVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeSticker: ");
        sb6.append(this.f402296h);
        sb6.append(", ");
        sb6.append(jVar != null ? jVar.f416474a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", sb6.toString());
        if (kotlin.jvm.internal.o.b(this.f402296h, jVar != null ? jVar.f416474a : null)) {
            return;
        }
        this.f402296h = jVar != null ? jVar.f416474a : null;
        p05.l4 l4Var = this.f402293e;
        if (l4Var != null) {
            l4Var.i(jVar);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFilterProcess", "clear %s %d", this, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{this.f402294f}, 0);
            p05.l4 l4Var = this.f402293e;
            if (l4Var != null) {
                l4Var.o();
            }
            this.f402293e = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e17, "clear error: %s", e17.getMessage());
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkReleaseFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 15L, 1L);
        }
    }
}
