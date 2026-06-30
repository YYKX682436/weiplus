package r23;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final r23.j f368827a = new r23.j();

    /* renamed from: b, reason: collision with root package name */
    public static r23.c f368828b;

    /* renamed from: c, reason: collision with root package name */
    public static r23.n f368829c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f368830d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f368831e;

    /* renamed from: f, reason: collision with root package name */
    public static r45.ib6 f368832f;

    /* renamed from: g, reason: collision with root package name */
    public static int f368833g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f368834h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f368835i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f368836j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f368837k;

    public final void a(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        r45.ib6 ib6Var;
        byte[] byteArrayExtra;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append(" bind ui:");
        sb6.append(albumPreviewUI != null ? java.lang.Integer.valueOf(albumPreviewUI.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", sb6.toString());
        if (albumPreviewUI == null) {
            return;
        }
        f368830d = new java.lang.ref.WeakReference(albumPreviewUI);
        r23.c cVar = f368828b;
        if (cVar != null) {
            cVar.f368810d = null;
        }
        java.lang.Integer num = cVar != null ? (java.lang.Integer) cVar.f368814h.getValue() : null;
        f368828b = null;
        android.content.Intent intent = albumPreviewUI.getIntent();
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("album_template_info")) == null) {
            ib6Var = null;
        } else {
            ib6Var = new r45.ib6();
            try {
                ib6Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        f368832f = ib6Var;
        r23.c cVar2 = new r23.c(new java.lang.ref.WeakReference(albumPreviewUI), f368832f);
        cVar2.f368821r = r23.e.f368822d;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTemplateUI", "setSelectStateValue: " + intValue);
            cVar2.f368813g.setValue(java.lang.Integer.valueOf(intValue));
        }
        f368828b = cVar2;
        androidx.lifecycle.g0 g0Var = cVar2.f368814h;
        if (g0Var != null) {
            g0Var.observe(albumPreviewUI, r23.f.f368823d);
        }
        e33.b0 b0Var = albumPreviewUI.f138528m;
        java.util.ArrayList arrayList = b0Var != null ? b0Var.f247131g : null;
        if (arrayList != null) {
            d(arrayList);
        }
    }

    public final boolean b(java.util.ArrayList mediaList, yz5.a onRequestResult) {
        android.content.Context context;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(onRequestResult, "onRequestResult");
        java.lang.ref.WeakReference weakReference = f368830d;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI2 = weakReference != null ? (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference.get() : null;
        r23.c cVar = f368828b;
        if (cVar != null && cVar.f368812f) {
            if (((cVar != null && cVar.a()) || f368835i) && albumPreviewUI2 != null) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                vy0.g gVar = vy0.g.f441414a;
                if (!gVar.a("scene_sns_v2")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick no permission, permissionRequesting: " + f368837k);
                    if (f368837k) {
                        return true;
                    }
                    f368837k = true;
                    dx1.g.f244489a.j("SnsPublishProcess", "permissionSheetCnt", 1, bx1.u.f36310e);
                    ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                    java.lang.ref.WeakReference weakReference2 = f368830d;
                    if (weakReference2 == null || (albumPreviewUI = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference2.get()) == null || (context = albumPreviewUI.getContext()) == null) {
                        context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    kotlin.jvm.internal.o.d(context);
                    gVar.c("scene_sns_v2", context, new r23.g(onRequestResult), r23.h.f368825d);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "onSendItemClick has permission");
                r45.ib6 ib6Var = f368832f;
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "jumpToTemplatePage");
                dx1.g.f244489a.j("SnsPublishProcess", "egsessionCnt", 1, bx1.u.f36310e);
                uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                android.content.Intent intent = new android.content.Intent();
                if (ib6Var != null) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(intent.putExtra("key_video_template_info", ib6Var.toByteArray()));
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MJTemplateHandle", m524exceptionOrNullimpl, "to array error", new java.lang.Object[0]);
                    }
                    intent.putExtra("key_maas_entrance", 101);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "cut same");
                } else {
                    intent.putExtra("key_maas_entrance", 100);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "post main");
                }
                ((ez0.i) hVar).getClass();
                com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI.f69756g.a(albumPreviewUI2, intent, 4384, sy0.b.f413826d, mediaList, null);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        f368836j = true;
        dx1.f fVar = dx1.g.f244489a;
        r23.c cVar = f368828b;
        int i17 = 0;
        if (cVar != null) {
            r45.ib6 ib6Var = cVar.f368811e;
            i17 = (ib6Var != null ? ib6Var.f376910e : null) != null ? 3 : cVar.f368820q;
        }
        fVar.i("SnsTemplate", ya.b.SOURCE, java.lang.Integer.valueOf(i17));
        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        kotlin.jvm.internal.o.f(wi6, "checkSnsPostSessionId(...)");
        fVar.i("SnsTemplate", "sessionID", wi6);
        dx1.f.b(fVar, "SnsTemplate", false, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r9) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r23.j.d(java.util.ArrayList):void");
    }
}
