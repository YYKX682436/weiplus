package yi4;

/* loaded from: classes11.dex */
public final class l implements com.tencent.pigeon.sns.PlatformPoiApi {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f462619a;

    /* renamed from: b, reason: collision with root package name */
    public yi4.i f462620b;

    /* renamed from: c, reason: collision with root package name */
    public xj4.b f462621c;

    public final void a(android.app.Activity activity) {
        if (activity == null) {
            b("activity detached");
            c();
        }
        this.f462619a = activity != null ? new java.lang.ref.WeakReference(activity) : null;
    }

    public final void b(java.lang.String str) {
        yi4.i iVar = this.f462620b;
        if (iVar == null) {
            return;
        }
        this.f462620b = null;
        com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "cancelPending: reason=" + str);
        try {
            iVar.f462615b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusPublishPoiApiImpl", "cancelPending: callback throw, err=" + th6.getMessage());
        }
    }

    public final void c() {
        java.lang.ref.WeakReference weakReference = this.f462619a;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity ? (com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity) activity : null;
        xj4.b bVar = this.f462621c;
        if (bVar != null && statusFlutterPublishActivity != null) {
            statusFlutterPublishActivity.C.remove(bVar);
        }
        this.f462621c = null;
    }

    public final void d(com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity, byte[] bArr, yz5.l lVar) {
        java.lang.Object m521constructorimpl;
        android.content.Intent intent = new android.content.Intent();
        if (bArr != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.c64 c64Var = new r45.c64();
                c64Var.parseFrom(bArr);
                m521constructorimpl = kotlin.Result.m521constructorimpl(c64Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m528isSuccessimpl(m521constructorimpl)) {
                r45.c64 c64Var2 = (r45.c64) m521constructorimpl;
                java.lang.String str = c64Var2.f371310d;
                if (!(str == null || str.length() == 0)) {
                    intent.putExtra("get_poi_classify_id", c64Var2.f371310d);
                }
                intent.putExtra("get_lat", (float) c64Var2.f371329z);
                intent.putExtra("get_lng", (float) c64Var2.f371328y);
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "launchCheckInLifeUI: parse current LbsLife failed, err=" + m524exceptionOrNullimpl.getMessage());
            }
            kotlin.Result.m520boximpl(m521constructorimpl);
        }
        intent.putExtra("show_distance", true);
        intent.putExtra("near_life_scene", 1);
        yi4.k kVar = new yi4.k(this, lVar);
        statusFlutterPublishActivity.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity.E;
        int incrementAndGet = (com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity.E.incrementAndGet() & 65535) + com.tencent.mm.R.anim.f477713a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(incrementAndGet);
        java.util.HashMap hashMap = statusFlutterPublishActivity.B;
        hashMap.put(valueOf, kVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "launchPluginForResult: reqCode=" + incrementAndGet + ", plugin=nearlife, cls=com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI");
        try {
            j45.l.n(statusFlutterPublishActivity, "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, incrementAndGet);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusFlutterPublishActivity", "launchPluginForResult: failed, err=" + th7.getMessage());
            hashMap.remove(java.lang.Integer.valueOf(incrementAndGet));
            try {
                kVar.invoke(0, null);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformPoiApi
    public void jumpPoiMapPage(double d17, double d18, long j17, java.lang.String label, java.lang.String mapType, java.lang.String poiName, java.lang.String poiId, yz5.l callback) {
        kotlin.jvm.internal.o.g(label, "label");
        kotlin.jvm.internal.o.g(mapType, "mapType");
        kotlin.jvm.internal.o.g(poiName, "poiName");
        kotlin.jvm.internal.o.g(poiId, "poiId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "jumpPoiMapPage: not implemented for status publish flow");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.UnsupportedOperationException("jumpPoiMapPage not implemented for status")))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.tencent.pigeon.sns.PlatformPoiApi
    public void selectPoi(byte[] bArr, yz5.l callback) {
        boolean z17;
        int i17;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.ref.WeakReference weakReference = this.f462619a;
        com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (!(statusFlutterPublishActivity instanceof com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: activity not bound");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            z17 = u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: check EU country failed, err=" + th6.getMessage());
            z17 = false;
        }
        java.lang.String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        boolean z18 = true;
        if (z17) {
            ((sb0.f) jVar).getClass();
            if (j35.u.d(statusFlutterPublishActivity, "android.permission.ACCESS_FINE_LOCATION", true) && j35.u.d(statusFlutterPublishActivity, "android.permission.ACCESS_COARSE_LOCATION", true)) {
                i17 = 1;
            } else {
                i17 = 1;
                z18 = false;
            }
        } else {
            i17 = 1;
            z18 = ((sb0.f) jVar).Di(statusFlutterPublishActivity, strArr, 64, null, null);
        }
        if (z18) {
            d(statusFlutterPublishActivity, bArr, callback);
            return;
        }
        if (z17) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (kotlin.jvm.internal.o.b(c17.m(u3Var, bool), bool)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: EU user, jump GDPR page");
                try {
                    java.lang.Object[] objArr = new java.lang.Object[i17];
                    objArr[0] = com.tencent.mm.sdk.platformtools.m2.d();
                    c71.b.c(statusFlutterPublishActivity, statusFlutterPublishActivity.getString(com.tencent.mm.R.string.f492399gh2, objArr), 30764, i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: jump GDPR page failed, err=" + th7.getMessage());
                }
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
                return;
            }
        }
        b("superseded by new selectPoi");
        this.f462620b = new yi4.i(bArr, callback);
        com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity2 = statusFlutterPublishActivity;
        if (this.f462621c == null) {
            yi4.j jVar2 = new yi4.j(this);
            this.f462621c = jVar2;
            statusFlutterPublishActivity2.getClass();
            statusFlutterPublishActivity2.C.addIfAbsent(jVar2);
        }
        try {
            ((sb0.f) jVar).getClass();
            j35.u.l(statusFlutterPublishActivity, strArr, 64);
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: requestPermissions failed, err=" + th8.getMessage());
            b("requestPermissions failed");
            c();
        }
    }
}
