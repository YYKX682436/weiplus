package jt3;

/* loaded from: classes10.dex */
public final class h implements it3.y {

    /* renamed from: l, reason: collision with root package name */
    public static final jt3.b f301628l = new jt3.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f301629a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f301630b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f301631c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f301632d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f301633e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f301634f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout f301635g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f301636h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f301637i;

    /* renamed from: j, reason: collision with root package name */
    public int f301638j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f301639k;

    public h(android.content.Context context, android.view.ViewGroup root, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f301629a = context;
        this.f301630b = root;
        this.f301631c = provider;
        this.f301632d = bundle;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f301633e = sparseArray;
        this.f301634f = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f301638j = -2;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        sparseArray.put(0, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.class);
        if (provider.S) {
            sparseArray.put(1, com.tencent.mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout.class);
        } else {
            sparseArray.put(1, com.tencent.mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout.class);
        }
        sparseArray.put(2, com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew.class);
        sparseArray.put(5, com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout.class);
        java.util.HashMap hashMap = provider.P;
        kotlin.jvm.internal.o.d(hashMap);
        if (!hashMap.isEmpty()) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add route key:");
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type kotlin.Int");
                sb6.append(((java.lang.Integer) key).intValue());
                sb6.append(" value:");
                sb6.append(entry.getValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", sb6.toString());
                android.util.SparseArray sparseArray2 = this.f301633e;
                java.lang.Object key2 = entry.getKey();
                kotlin.jvm.internal.o.e(key2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) key2).intValue();
                java.lang.Object value = entry.getValue();
                kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                sparseArray2.put(intValue, java.lang.Class.forName((java.lang.String) value));
            }
        }
        nu3.m.f340229a.k(android.os.SystemClock.elapsedRealtime());
        android.util.SparseArray routeMap = this.f301633e;
        kotlin.jvm.internal.o.g(routeMap, "routeMap");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRouterMap");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{");
        int size = routeMap.size();
        for (int i18 = 0; i18 < size; i18++) {
            sb7.append(((java.lang.Class) routeMap.valueAt(i18)).getSimpleName());
            sb7.append("#");
        }
        sb7.append("}");
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = nu3.m.f340230b;
        sightVideoLogStruct.f60389f = sightVideoLogStruct.b("RouterMap", sb7.toString(), true);
        if (i17 == 0) {
            this.f301636h = true;
            java.lang.Object obj = this.f301633e.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            c(0, (java.lang.Class) obj, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "setEnableRecordPage " + this.f301636h);
    }

    public final void b() {
        java.util.Map viewMap = this.f301634f;
        kotlin.jvm.internal.o.f(viewMap, "viewMap");
        java.util.Iterator it = viewMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) ((java.util.Map.Entry) it.next()).getValue()).v();
        }
    }

    public final synchronized void c(int i17, java.lang.Class cls, boolean z17) {
        try {
            java.lang.Object newInstance = cls.getConstructor(android.content.Context.class, android.util.AttributeSet.class).newInstance(this.f301629a, null);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout");
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = (com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) newInstance;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "loadViewFromClass key:" + i17 + " name:" + basePluginLayout.getClass().getName());
            basePluginLayout.p(this, this.f301631c, this.f301632d);
            this.f301634f.put(java.lang.Integer.valueOf(i17), basePluginLayout);
            this.f301630b.addView(basePluginLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (!z17) {
                basePluginLayout.setVisibility(8);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordUIRouter", e17, "", new java.lang.Object[0]);
        }
    }

    public final void d() {
        java.util.Map viewMap = this.f301634f;
        kotlin.jvm.internal.o.f(viewMap, "viewMap");
        java.util.Iterator it = viewMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) ((java.util.Map.Entry) it.next()).getValue()).q();
        }
    }

    public void e(int i17, ct0.b bVar) {
        if (this.f301637i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "isFinishing toWhere:" + i17 + "  MediaCaptureInfo:" + bVar);
            return;
        }
        int a17 = f301628l.a(i17, bVar != null ? bVar.f222214k : null, bVar != null ? bVar.f222215l : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "toWhere:" + i17 + " real:" + a17 + " current:" + this.f301638j + " MediaCaptureInfo:" + bVar);
        if (a17 == this.f301638j) {
            return;
        }
        this.f301638j = a17;
        this.f301639k = true;
        ((ku5.t0) ku5.t0.f312615d).B(new jt3.g(a17, this, bVar, i17));
    }
}
