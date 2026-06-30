package qq0;

@j95.b
/* loaded from: classes7.dex */
public final class m extends i95.w implements qq0.i {

    /* renamed from: d, reason: collision with root package name */
    public final qq0.k f365899d = new qq0.k(this);

    /* renamed from: e, reason: collision with root package name */
    public final rq0.b f365900e = new rq0.b();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f365901f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f365902g = com.tencent.mm.sdk.platformtools.o4.M("sclStartUpCover");

    public boolean Ai(java.lang.String bizName, java.lang.String frameSetId) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(wi(bizName, frameSetId));
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public boolean Bi(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        jc3.u0 u0Var = jc3.u0.f298996a;
        return jc3.u0.f299005j.contains(vq0.b.c(bizName));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f365899d);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback(this.f365899d);
    }

    public java.lang.String wi(java.lang.String bizName, java.lang.String frameSetId) {
        com.tencent.mm.vfs.r6 s17;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f365900e.a(bizName));
        sb6.append('/');
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        android.content.res.Configuration configuration = resources.getConfiguration();
        jz5.l lVar = new jz5.l("uiMode", java.lang.Integer.valueOf(resources.getConfiguration().uiMode));
        jz5.l lVar2 = new jz5.l("fontScale", java.lang.Float.valueOf(configuration.fontScale));
        jz5.l lVar3 = new jz5.l("density", java.lang.Float.valueOf(resources.getDisplayMetrics().density));
        jz5.l lVar4 = new jz5.l("windowWidth", java.lang.Integer.valueOf(resources.getDisplayMetrics().widthPixels));
        android.os.LocaleList locales = configuration.getLocales();
        boolean z17 = false;
        java.util.Set entrySet = kz5.c1.i(lVar, lVar2, lVar3, lVar4, new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, locales.get(0).getLanguage())).entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.lang.String g07 = kz5.n0.g0(entrySet, "-", null, null, 0, null, qq0.l.f365898d, 30, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(vq0.b.c(bizName));
        sb7.append('/');
        java.lang.String b17 = vq0.a.b(frameSetId);
        java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
        sb7.append(r26.n0.s0(q07, "_", q07) + '_' + b17);
        sb7.append('/');
        sb7.append(g07);
        sb7.append(".png");
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MagicSclStartupCoverService", "coverLocalPath " + sb8);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb8);
        com.tencent.mm.vfs.r6 s18 = r6Var.s();
        if (s18 != null && !s18.m()) {
            z17 = true;
        }
        if (z17 && (s17 = r6Var.s()) != null) {
            s17.J();
        }
        return sb8;
    }
}
