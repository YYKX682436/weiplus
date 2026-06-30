package jt3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f301624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt3.h f301625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ct0.b f301626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f301627g;

    public g(int i17, jt3.h hVar, ct0.b bVar, int i18) {
        this.f301624d = i17;
        this.f301625e = hVar;
        this.f301626f = bVar;
        this.f301627g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jt3.h hVar = this.f301625e;
        int i17 = this.f301624d;
        if (i17 == 0 && !hVar.f301636h) {
            hVar.f301639k = false;
            android.content.Context context = hVar.f301629a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).finish();
            return;
        }
        if (hVar.f301634f.get(java.lang.Integer.valueOf(i17)) == null) {
            if (hVar.f301633e.get(i17) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordUIRouter", "No corresponding " + i17);
                hVar.f301639k = false;
                return;
            }
            java.lang.Object obj = hVar.f301633e.get(i17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            java.lang.Class cls = (java.lang.Class) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "create BasePluginLayout :".concat(cls.getSimpleName()));
            hVar.c(i17, cls, false);
        }
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = hVar.f301635g;
        hVar.f301635g = (com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) hVar.f301634f.get(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout2 = hVar.f301635g;
        if (basePluginLayout2 != null) {
            basePluginLayout2.r(this.f301626f);
        }
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout3 = hVar.f301635g;
        if (basePluginLayout3 != null) {
            basePluginLayout3.bringToFront();
        }
        if (basePluginLayout != null) {
            basePluginLayout.onPause();
        }
        if (basePluginLayout != null) {
            basePluginLayout.onDetach();
        }
        if (i17 == 1) {
            nu3.i.f340218a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else if (i17 == 2) {
            nu3.i.f340218a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else if (i17 == 3) {
            nu3.i iVar = nu3.i.f340218a;
            iVar.d(19);
            iVar.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        nu3.m mVar = nu3.m.f340229a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String simpleName = ((java.lang.Class) hVar.f301633e.get(this.f301627g)).getSimpleName();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRouterLog >> time: " + elapsedRealtime + ", clazzName: " + simpleName);
        cl0.g gVar = new cl0.g();
        gVar.p("time", elapsedRealtime - nu3.m.f340231c);
        gVar.h("clazz", simpleName);
        nu3.m.f340232d.add(gVar.toString());
        hVar.f301639k = false;
    }
}
