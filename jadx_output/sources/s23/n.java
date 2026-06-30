package s23;

/* loaded from: classes4.dex */
public final class n implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.n f402309d = new s23.n();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f402310e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f402311f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static s23.o f402312g;

    /* renamed from: h, reason: collision with root package name */
    public static r45.ib6 f402313h;

    /* renamed from: i, reason: collision with root package name */
    public static int f402314i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f402315m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f402316n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f402317o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f402318p;

    /* renamed from: q, reason: collision with root package name */
    public static final androidx.lifecycle.i0 f402319q;

    /* renamed from: r, reason: collision with root package name */
    public static final androidx.lifecycle.i0 f402320r;

    /* renamed from: s, reason: collision with root package name */
    public static final androidx.lifecycle.k0 f402321s;

    /* renamed from: t, reason: collision with root package name */
    public static final androidx.lifecycle.k0 f402322t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f402323u;

    /* renamed from: v, reason: collision with root package name */
    public static int f402324v;

    /* renamed from: w, reason: collision with root package name */
    public static long f402325w;

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.ref.WeakReference f402326x;

    /* renamed from: y, reason: collision with root package name */
    public static final yz5.a f402327y;

    static {
        androidx.lifecycle.i0 i0Var = new androidx.lifecycle.i0();
        f402319q = i0Var;
        androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
        f402320r = i0Var2;
        f402321s = s23.l.f402307d;
        f402322t = s23.g.f402303d;
        f402324v = -1;
        f402327y = s23.m.f402308d;
        s23.a[] aVarArr = s23.a.f402297d;
        i0Var.setValue(0);
        i0Var2.setValue("");
    }

    public final void a(final s23.o templateView) {
        kotlin.jvm.internal.o.g(templateView, "templateView");
        java.util.ArrayList arrayList = f402311f;
        if (arrayList.contains(templateView)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " already bind ui:" + templateView.hashCode() + ", return]");
            return;
        }
        dx1.f fVar = dx1.g.f244489a;
        java.lang.String d17 = kotlin.jvm.internal.i0.a(com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct.class).d();
        kotlin.jvm.internal.o.d(d17);
        fVar.g("SnsTemplate", d17);
        f402317o = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " bind ui:" + templateView.hashCode() + ']');
        arrayList.add(templateView);
        f402312g = templateView;
        s23.x xVar = new s23.x(templateView, f402313h);
        xVar.f402353q = s23.d.f402300d;
        xVar.f402355s = s23.e.f402301d;
        xVar.f402356t = s23.f.f402302d;
        f402310e.put(templateView, xVar);
        androidx.lifecycle.i0 i0Var = f402319q;
        i0Var.observeForever(f402321s);
        i0Var.addSource(xVar.f402351o, s23.b.f402298d);
        androidx.lifecycle.i0 i0Var2 = f402320r;
        i0Var2.observeForever(f402322t);
        i0Var2.addSource(xVar.f402352p, s23.c.f402299d);
        templateView.getActivity().mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$bind$3
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                s23.n nVar = s23.n.f402309d;
                s23.n.f402312g = s23.o.this;
            }
        });
        k(templateView.c());
    }

    public final boolean b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (!f402323u) {
            return true;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_total_duration_seconds, 600);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Ni);
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem : null;
        int i17 = (galleryItem$VideoMediaItem != null ? galleryItem$VideoMediaItem.f138446x : 0) / 1000;
        if ((f402314i / 1000) + i17 <= Ni && i17 <= Ni) {
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f492180fi4, java.lang.Integer.valueOf(a06.d.b(Ni / 60.0f))));
        return false;
    }

    public final boolean c() {
        r45.ib6 ib6Var = f402313h;
        if (ib6Var == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(ib6Var);
        java.lang.String aIModelType = ib6Var.f376915m;
        kotlin.jvm.internal.o.f(aIModelType, "aIModelType");
        return aIModelType.length() > 0;
    }

    public final boolean d() {
        java.lang.Integer num = (java.lang.Integer) f402319q.getValue();
        s23.a[] aVarArr = s23.a.f402297d;
        return num == null || num.intValue() != 0;
    }

    public final boolean e(java.util.ArrayList mediaList, yz5.a onRequestResult) {
        java.lang.Object m521constructorimpl;
        s23.x xVar;
        s23.o oVar;
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(onRequestResult, "onRequestResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "ensureActivityTemplateTipsAllDead: ");
        java.util.Set entrySet = f402310e.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            s23.x xVar2 = (s23.x) entry.getValue();
            if (xVar2 != null && (oVar = xVar2.f402343d) != null && true == oVar.d()) {
                z17 = true;
            }
            if (z17 && (xVar = (s23.x) entry.getValue()) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "makeTipsPopupDead: ");
                k33.b bVar = xVar.f402357u;
                if (bVar != null) {
                    bVar.dismiss();
                }
            }
        }
        if (f402323u && (d() || f402316n)) {
            java.lang.ref.WeakReference weakReference = f402326x;
            if (weakReference == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            if (weakReference.get() != null) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                vy0.g gVar = vy0.g.f441414a;
                if (!gVar.a("scene_sns_v2")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick no permission, permissionRequesting: " + f402318p);
                    if (f402318p) {
                        return true;
                    }
                    f402318p = true;
                    dx1.g.f244489a.j("SnsPublishProcess", "permissionSheetCnt", 1, bx1.u.f36310e);
                    ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                    java.lang.ref.WeakReference weakReference2 = f402326x;
                    if (weakReference2 == null) {
                        kotlin.jvm.internal.o.o("context");
                        throw null;
                    }
                    android.content.Context context = (android.app.Activity) weakReference2.get();
                    if (context == null) {
                        context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    kotlin.jvm.internal.o.d(context);
                    gVar.c("scene_sns_v2", context, new s23.h(onRequestResult), s23.i.f402305d);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick has permission");
                java.lang.ref.WeakReference weakReference3 = f402326x;
                if (weakReference3 == null) {
                    kotlin.jvm.internal.o.o("context");
                    throw null;
                }
                android.app.Activity activity = (android.app.Activity) weakReference3.get();
                r45.ib6 ib6Var = f402313h;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToTemplatePage isUserClickTemplateView=");
                sb6.append(f402324v);
                sb6.append(", templateId=");
                sb6.append(ib6Var != null ? ib6Var.f376910e : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", sb6.toString());
                if (activity != null) {
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
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MJTemplateHandleNew", m524exceptionOrNullimpl, "to array error", new java.lang.Object[0]);
                        }
                        intent.putExtra("key_maas_entrance", 101);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "cut same");
                    } else {
                        intent.putExtra("key_maas_entrance", 100);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "post main");
                    }
                    intent.putExtra("key_entrance_event_type", f402325w);
                    intent.putExtra("key_is_user_manual_switch_template_view", f402324v);
                    ((ez0.i) hVar).getClass();
                    com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI.f69756g.a(activity, intent, 4384, sy0.b.f413826d, mediaList, null);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(android.content.Context context, java.util.ArrayList selectMediaList, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(selectMediaList, "selectMediaList");
        if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m5v);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            i(context, string);
            return false;
        }
        int h17 = h();
        if (selectMediaList.size() < h()) {
            return true;
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m5u, java.lang.Integer.valueOf(h17));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        i(context, string2);
        return false;
    }

    public final void g() {
        dx1.f fVar = dx1.g.f244489a;
        s23.x xVar = (s23.x) f402310e.get(f402312g);
        fVar.i("SnsTemplate", ya.b.SOURCE, java.lang.Integer.valueOf(xVar != null ? xVar.c() ? 3 : xVar.f402350n : 0));
        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        kotlin.jvm.internal.o.f(wi6, "checkSnsPostSessionId(...)");
        fVar.i("SnsTemplate", "sessionID", wi6);
        dx1.f.b(fVar, "SnsTemplate", false, false, 4, null);
        f402317o = true;
    }

    public final int h() {
        if (!f402323u) {
            return -1;
        }
        r45.ib6 ib6Var = f402313h;
        if (ib6Var != null) {
            kotlin.jvm.internal.o.d(ib6Var);
            java.lang.String aIModelType = ib6Var.f376915m;
            kotlin.jvm.internal.o.f(aIModelType, "aIModelType");
            if (aIModelType.length() > 0) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_publish_ai_template_image_litmit, 9);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishAITemplateImageLimit: " + Ni);
                return Ni;
            }
        }
        if (!f402316n && !d()) {
            return f402315m ? 1 : 9;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Ni2);
        return Ni2;
    }

    public final void i(android.content.Context context, java.lang.String str) {
        if (context != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.u(str);
            u1Var.n(context.getString(com.tencent.mm.R.string.fil));
            u1Var.l(s23.k.f402306a);
            u1Var.q(false);
        }
    }

    public final void j(s23.o templateView, boolean z17) {
        kotlin.jvm.internal.o.g(templateView, "templateView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "[" + hashCode() + " unbind ui:" + templateView.hashCode() + ", unbind release maas: " + z17 + ']');
        if (!f402317o && d()) {
            g();
        }
        if (z17) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
            az0.i5.x(az0.i5.f15557a, false, false, 3, null);
        }
        java.util.HashMap hashMap = f402310e;
        s23.x xVar = (s23.x) hashMap.get(templateView);
        androidx.lifecycle.i0 i0Var = f402320r;
        androidx.lifecycle.i0 i0Var2 = f402319q;
        if (xVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "onUnbind: ");
            kotlinx.coroutines.y0 y0Var = xVar.f402354r;
            if (kotlinx.coroutines.v2.h(((kotlinx.coroutines.internal.h) y0Var).f310496d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "asyncScope cancel: ");
                kotlinx.coroutines.z0.e(y0Var, null, 1, null);
            }
            i0Var2.removeSource(xVar.f402351o);
            i0Var.removeSource(xVar.f402352p);
        }
        java.util.ArrayList arrayList = f402311f;
        arrayList.remove(templateView);
        hashMap.remove(templateView);
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MJTemplateHandleNew", "viewList.size == 0", "update live data value");
            s23.a[] aVarArr = s23.a.f402297d;
            i0Var2.setValue(0);
            i0Var.setValue("");
            i0Var2.removeObserver(f402321s);
            i0Var.removeObserver(f402322t);
            f402312g = null;
            f402313h = null;
            f402324v = -1;
            f402325w = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s23.n.k(java.util.ArrayList):void");
    }

    @Override // androidx.lifecycle.k0
    public /* bridge */ /* synthetic */ void onChanged(java.lang.Object obj) {
    }
}
