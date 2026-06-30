package dz4;

/* loaded from: classes12.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245430a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f245431b;

    /* renamed from: c, reason: collision with root package name */
    public final dz4.r3 f245432c;

    public u3(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245430a = holder;
        this.f245431b = java.util.Collections.synchronizedSet(new fz4.p());
        this.f245432c = new dz4.r3(this);
    }

    public final void a() {
        java.util.List S0;
        java.lang.ref.WeakReference weakReference;
        com.tencent.wechat.aff.wenote.l lVar = new com.tencent.wechat.aff.wenote.l();
        lVar.f217698e = (int) hz4.b0.a().f286384c;
        lVar.f217700g[2] = true;
        hz4.b0 a17 = hz4.b0.a();
        lVar.f217697d = com.tencent.mm.vfs.w6.j(a17.f286392k) ? a17.f286392k : "";
        boolean[] zArr = lVar.f217700g;
        zArr[1] = true;
        lVar.f217699f = "speex";
        zArr[3] = true;
        java.util.Set callbackSet = this.f245431b;
        kotlin.jvm.internal.o.f(callbackSet, "callbackSet");
        synchronized (callbackSet) {
            java.util.Set callbackSet2 = this.f245431b;
            kotlin.jvm.internal.o.f(callbackSet2, "callbackSet");
            S0 = kz5.n0.S0(callbackSet2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterRecordHelper", "stopRecordingAndSave: send callback " + S0.size());
        java.util.Iterator it = S0.iterator();
        while (true) {
            r4 = null;
            android.app.Activity activity = null;
            if (!it.hasNext()) {
                break;
            }
            dz4.g0 g0Var = (dz4.g0) ((dz4.p0) it.next());
            g0Var.getClass();
            ih0.p pVar = g0Var.f245251a.f245309a;
            if (pVar != null && (weakReference = ((ez4.u) pVar).f257944c) != null) {
                activity = (android.app.Activity) weakReference.get();
            }
            if (activity == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onRecordingEndEvent: activity null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onRecordingEndEvent: ready");
                ((ku5.t0) ku5.t0.f312615d).g(new dz4.e0(lVar, g0Var.f245251a));
            }
        }
        java.lang.ref.WeakReference weakReference2 = ((ez4.u) this.f245430a).f257944c;
        android.content.Context context = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null) {
            vASActivity.enableSwipeBackGesture(true);
        }
    }
}
